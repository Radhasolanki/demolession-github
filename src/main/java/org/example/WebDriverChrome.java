package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {


    private static ChromeDriver driver;

    public static void main(String[] args) {

          System.setProperty("webdriver.ie.driver" ,"C:\\Users\\Keyash\\IdeaProjects\\Software\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

    }





















}
