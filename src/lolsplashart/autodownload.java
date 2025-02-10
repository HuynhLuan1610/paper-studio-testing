package lolsplashart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;


public class autodownload {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver (Ensure you have the correct WebDriver for your browser)
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        driver.manage().window().maximize(); //phóng to trình duyệt
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking")); //tắt quảng cáo
        driver.get("https://paperstudio.vn/"); //Link web
        Thread.sleep(5000); // Chờ 5 giây
        
        driver.quit(); //Tắt trình duyệt
    }
}
