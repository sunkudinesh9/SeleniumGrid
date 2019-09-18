package com.accenture.seleniumGrid.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	@Test
	public void node1() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);

		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);

		String hubUrl = " http://192.168.0.118:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		driver.get("https://facebook.com");

	}
}
