package ua.apteka24;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Random;

/**
 * Open url
 * @author Ma3auka
 * @version 1.0
 */

public class FirstTest extends WebDriver{

    private String count;
    private Object args;

 //  public static void main(String[] args) {

 //  }
    @Test
    public void FirstTest() {
//       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//       ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.apteka24.ua");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет аптека: купить лекарства онлайн в Аптека24 по низкой цене. Заказ мед препаратов с доставкой по Украине | apteka24.ua"));



    }


}
