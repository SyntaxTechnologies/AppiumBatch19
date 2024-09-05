package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static AppiumDriver driver;

    public static void launchingTheApplication() throws MalformedURLException {
        //to locate the application from the directory
        File appDir = new File("apk");
        File app = new File(appDir, "TestApp.apk");

        //desired capabilities - to specify phone, OS, application, URL
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
        desiredCapabilities.setCapability("noReset","true");
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("automatorName","UIAutomator2");
        desiredCapabilities.setCapability("noSign","true");
        desiredCapabilities.setCapability("appPackage",ConfigReader.read("appPackage"));
        desiredCapabilities.setCapability("appActivity",ConfigReader.read("appActivity"));

        //appium server address
        URL u = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(u, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("application launched");
    }


}
