package com.eddiebauer.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverScript {

	public static WebDriver driver;
	public static Properties prop;
	public static Actions actions;

	public DriverScript() {
		
		try {
			File file = new File("./src/test/resources/config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/browsers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Driver");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/browsers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Driver");
			// System.out.println(driver.switchTo().alert().getText());
		} else {
			System.out.println("Unsupported browser name");
		}
		actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void launchApplication() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.eddiebauer.com/");
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		System.out.println("webpage open");
	}

	public static void closeApplication() {

		driver.close();
		System.out.println("Application closed");
	}
}
