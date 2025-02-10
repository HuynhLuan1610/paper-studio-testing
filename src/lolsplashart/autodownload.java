package lolsplashart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;


public class autodownload {
    public static void main(String[] args) {
        // Set up WebDriver (Ensure you have the correct WebDriver for your browser)
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver.manage().window().maximize();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        
        driver.get("https://www.uhdpaper.com/search?q=Splash+Art&by-date=true"); // Replace with the target website URL
     
        try {
            // Wait for the page to load (Consider using WebDriverWait for better handling)
            Thread.sleep(2000);
            options.addArguments("start-maximize");
            // Find all div elements by class name
            List<WebElement> postOuters = driver.findElements(By.className("post-outer"));
            
            for (int i = 0; i < postOuters.size(); i++) {
                List<WebElement> currentDivs = driver.findElements(By.className("post-outer"));
                if (i >= currentDivs.size()) break;
                WebElement postOuter = currentDivs.get(i);
                
                // Open new tab by clicking the div
                postOuter.click();
                System.out.println("Successfully clicked on div " + (i + 1));
                
                
                
                // Wait for new tab to open
                Thread.sleep(2000);
                
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Optional: Close the browser after execution
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
