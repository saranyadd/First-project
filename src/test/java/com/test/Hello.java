package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("saranya");
	WebElement element2 = driver.findElement(By.id("pass"));
	element2.sendKeys("123");
	WebElement element3 = driver.findElement(By.name("login"));
	element3.click();
	
	}

}
