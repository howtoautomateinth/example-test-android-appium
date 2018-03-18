package helper;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumHelper {

    private DesiredCapabilities capabilities;
    private AppiumDriver wd;
    private URL url;

    public AppiumHelper() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("alias", "Nexus5XAPI24");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appActivity", "MainActivity");
        capabilities.setCapability("appPackage", "th.in.howtoautomate.helloworld");
        capabilities.setCapability("platformVersion","7.0");
        url = new URL("http://localhost:4723/wd/hub");
    }

    public void Connect(){
        wd = new AppiumDriver(url,capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public AppiumDriver getDriver(){
        return wd;
    }

}
