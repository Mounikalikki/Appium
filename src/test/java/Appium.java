import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Appium {
	
	static AndroidDriver driver;

	public static void main(String[] args) {
		
	

	}

	private static void openCaluculator() throws MalformedURLException {
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("udid","62d6db51");
		des.setCapability("platformName","Andriod");
		des.setCapability("platformVersion","11");
		des.setCapability("appPackage","com.andriod.bbkcalculator");
		des.setCapability("appActivity","com.andriod.bbkcalculator.Calculator");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url,des);
		
	}

}
