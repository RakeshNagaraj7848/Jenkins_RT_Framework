package com.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IncognitoModelTest {
	
@Test
	public void incognitoModelTest() {

		WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		// WebDriver driver = new ChromeDriver(new
		// ChromeOptions().addArguments("--incognito"));
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		System.out.println(" tile of page is " + driver.getTitle());
		driver.quit();
	}

}
