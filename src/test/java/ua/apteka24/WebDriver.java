package ua.apteka24;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {

    public ChromeDriver driver;

    @Before
    public void UpDriver () { //Запустить и открыть браузер
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //Путь к драйверу
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 500); //Ожидание элемента

        driver.manage().window().maximize();
        System.out.println("- Test Start"); //Выводим в консоль строку что двайвер поднялся

        System.out.println("- Screen Resolution:");
        System.out.println(driver.manage().window().getSize()); //Размеры экрана

        System.out.println("- Browser Version:"); //Версия браузера
        Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();
        String browserName = caps.getBrowserName();
        String browserVersion = caps.getVersion();
        System.out.println(browserName+ "" +browserVersion);

    }

    @After
    public void KillDriver () { //Закрыть браузер, драйвер
        if (driver != null)
            driver.close();
        driver.quit();
        System.out.println("- Kill Draiver"); //Выводим в консоль строку что двайвер убит
    }

}