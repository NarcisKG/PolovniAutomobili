package Core;

import org.openqa.selenium.By;

public class Locators {

    public static String DEMO_QA_SECTION = "//h5[text()='%ARG%']//parent::div";

    public static String SPAN_ELEMENT_BY_TEXT = "//span[text()='%ARG%']";

    public static String ELEMENT_LIST_SHOW = "//div[@class='element-list collapse show']";

    public static String INPUT_BY_ID = "//input[@id='%ARG%']";

    public static String HEADER_SAMPLE_PAGE = "//h1[@id='sampleHeading']";

    public static String ALERT = "//button[@id='alertButton']";

    public static String ALERT_TIMER = "//button[@id='timerAlertButton']";

    public static String CONFIRM_BUTTON = "//button[@id='confirmButton']";

    public static String PROMT_BUTTON = "//button[@id='promtButton']";

    public static String NEW_TAB_BUTTON = "//button[@id='tabButton']";

    public static String NEW_WINDOW_BUTTON = "//button[@id='windowButton']";

    public static By brandSearchField = By.xpath("//div[@class='SumoSelect sumo_brand']//input");

    public static By modelSearchField = By.xpath("//div[@class='SumoSelect sumo_model']//input");

    public static By yearFromField = By.xpath("//div[@class = 'SumoSelect sumo_year_from']");

    public static By yearToField = By.xpath("//div[@class = 'SumoSelect sumo_year_to']");

    public static By selectYear = By.xpath("//div[contains(@class, 'open')]//li//label[text()='**** god.']");
    public void setYearInLocator(String year){
        String yearLocator = "//div[contains(@class, 'open')]//li//label[text()='**** god.']";
        yearLocator.replace("****", year);
    }

    public static By fuelTypeMenu = By.xpath("//div[@class='SumoSelect sumo_fuel']");

    public static By fuelTypeDizel = By.xpath("//div[@class='SumoSelect sumo_fuel open']//li//label[text()='Dizel']");

    public void setFuelType(String fuelType){
        String fuelLocator = "//div[@class='SumoSelect sumo_fuel open']//li//label[text()='****']";
        fuelLocator.replace("****", fuelType);}


    public static By regionMenu = By.xpath("//div[@class='SumoSelect sumo_region']");
    public void setRegion(String region){
        String regionLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        regionLocator.replace("****", region);}

    public static By searchButton = By.xpath("//button[@name='submit_1']");

    public static By searchSecondPage = By.xpath("(//a[text()='2'])[1]");
    public static By sortOrderMenu = By.xpath("(//div[@class='SumoSelect sumo_sortOrder'])[1]");
    public static By priceDescendingSort = By.xpath("//div[contains(@class, 'open')]//li//label[text()='ceni silazno']");
    public static By secondSearchResult = By.xpath("(//article)[2]");
    public static By getCarInfo = By.xpath("//div[text()='****']//following-sibling::div");

}
