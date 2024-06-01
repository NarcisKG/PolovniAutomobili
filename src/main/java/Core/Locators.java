package Core;

import org.openqa.selenium.By;

public class Locators {

    public static By brandSearchField = By.xpath("//div[@class='SumoSelect sumo_brand']//input");
    public static By  setBrand (String brandName){
        String brandSearchLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        brandSearchLocator.replace("****", brandName);
        return By.xpath(brandSearchLocator);}

    public static By modelSearchField = By.xpath("//div[@class='SumoSelect sumo_model']//input");
    public static By setModel (String model){
        String modelSearchLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        modelSearchLocator.replace("****", model);
        return By.xpath(modelSearchLocator);}

    public static By yearFromField = By.xpath("//div[@class = 'SumoSelect sumo_year_from']");

    public static By yearToField = By.xpath("//div[@class = 'SumoSelect sumo_year_to']");

    public static By selectYear = By.xpath("//div[contains(@class, 'open')]//li//label[text()='**** god.']");
    public static By setYearInLocator(String year){
        String yearLocator = "//div[contains(@class, 'open')]//li//label[text()='**** god.']";
        yearLocator.replace("****", year);
        return By.xpath(yearLocator);}

    public static By fuelTypeMenu = By.xpath("//div[@class='SumoSelect sumo_fuel']");
    public static By setFuelType(String fuelType){
        String fuelLocator = "//div[@class='SumoSelect sumo_fuel open']//li//label[text()='****']";
        fuelLocator.replace("****", fuelType);
        return By.xpath(fuelLocator);}

    //public static By fuelTypeDizel = By.xpath("//div[@class='SumoSelect sumo_fuel open']//li//label[text()='Dizel']");


    public static By regionMenu = By.xpath("//div[@class='SumoSelect sumo_region']");
    public static By setRegion(String region){
        String regionLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        regionLocator.replace("****", region);
        return By.xpath(regionLocator);}

    public static By searchButton = By.xpath("//button[@name='submit_1']");

    //public static By searchSecondPage = By.xpath();

    public static By sortOrderMenu = By.xpath("(//div[@class='SumoSelect sumo_sortOrder'])[1]");
    //public static By priceDescendingSort = By.xpath("//div[contains(@class, 'open')]//li//label[text()='ceni silazno']");
    public static By setSortType(String sortType){
        String sortTypeLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        sortTypeLocator.replace("****", sortType);
        return By.xpath(sortTypeLocator);}


    public static By setSearchResultPage (String resultPage){
        String resultPageLocator = "(//a[text()='2'])[****]";
        resultPageLocator.replace("****", resultPage);
        return By.xpath(resultPageLocator);}

    public static By setSearchResult (String searchResult){
        String searchResultLocator = "(//article)[****]";
        searchResultLocator.replace("****",searchResult);
        return By.xpath(searchResultLocator);}

    public static By carInfo = By.xpath("//div[text()='****']//following-sibling::div");
    public static By getCarInformation(String carInformation){
        String carInformationLocator = "//div[text()='****']//following-sibling::div";
        carInformationLocator.replace("****", carInformation);
        return By.xpath(carInformationLocator);}

}
