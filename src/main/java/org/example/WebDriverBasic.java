package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {
    public static void main(String[]args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Keyash\\IdeaProjects\\Software\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");

    }


}
