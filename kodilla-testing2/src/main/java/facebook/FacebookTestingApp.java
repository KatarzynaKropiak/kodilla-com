package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "/html/body/div/div/div/div/div/div/div/button[1]";
    public static final String XPATH_REGISTRATION = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_REGISTRATION_WINDOW = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]";
    public static final String XPATH_SELECT_DAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "/div[contains(@class, _5k_5)]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//*[@id=\"year\"]";
//    public static final String XPATH_INPUT = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_REGISTRATION)).click();

        while (!driver.findElement(By.xpath(XPATH_REGISTRATION_WINDOW)).isDisplayed());

//        WebElement searchField = driver.findElement(By.xpath(XPATH_INPUT));
//        searchField.wait(5000);
//        searchField.sendKeys("James");

        Thread.sleep(7000);

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectDayCombo);
    //    selectDay.wait(5000);
        selectDay.selectByValue("2");

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByIndex(2);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1988");
    }


    }
