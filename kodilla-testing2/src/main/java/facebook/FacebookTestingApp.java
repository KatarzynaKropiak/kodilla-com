package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div/button[contains(@class,\"_42ft 4jy0 9xo6 4jy3 4jy1 selected _51sy\")]";
    public static final String XPATH_REGISTRATION = "//div/a[contains(@class,\"_42ft 4jy0 6lti 4jy6 4jy2 selected _51sy\")]";
    public static final String XPATH_REGISTRATION_WINDOW = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_58mq _5dbb\")]/div[2]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_REGISTRATION)).click();

        while (!driver.findElement(By.xpath(XPATH_REGISTRATION_WINDOW)).isDisplayed());


        Thread.sleep(7000);

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByIndex(0);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByValue("2");

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1988");
    }


    }
