package com.wyattdavies.getEmails;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchDirectory {
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		String list = "list.csv";
		File csvFile = new File(list);
		Scanner in = new Scanner(csvFile);
		
		while(in.hasNextLine()) {
			String currentLine = in.nextLine();
			String[] values = currentLine.split(",");
			String fName = values[0];
			String lName = values[1];
			String email = getEmail(fName,lName);
			System.out.print(email);
			
		}
		driver.close();
		in.close();
	}
	
	private static String getEmail(String fName,String lName) {
		/*
		 * 1) Navigate to webpage
		 * 2) Enter search term in search bar
		 * 3) Loop through pre/post options
		 * 4) Filter logic if needed
		 * 5) Add error checking
		 */
		driver.get("example.com");
		driver.findElement(By.id("search-bar")).sendKeys("First Last");
		
		String[] preOptions = null;
		String[] postOptions = null;
		
		for(String option : preOptions)
		{
			//sanity check comment
		}
		
		
		driver.findElement(By.xpath("")).click();
		String emailText = driver.findElement(By.className("")).getText();
		return emailText;
	}
}