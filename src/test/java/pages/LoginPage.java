package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @AndroidFindBy(xpath="//*[@text='Username']")
    public MobileElement usernamefield;

    @AndroidFindBy(xpath="//*[@content-desc='test-Password']")
    public MobileElement passwordfield;

    @AndroidFindBy(xpath="//*[@text='LOGIN']")
    public MobileElement loginButton;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
