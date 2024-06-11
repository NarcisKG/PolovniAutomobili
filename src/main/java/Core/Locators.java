package Core;

import org.openqa.selenium.By;

public class Locators {

    public static By brandSearchField = By.xpath("//div[@class='SumoSelect sumo_brand']");
    public static By brandSearch = By.xpath("//div[@class='SumoSelect sumo_brand open']//input");
    public static By  setBrand (String brandName){
        String brandSearchLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        return By.xpath(brandSearchLocator.replace("****", brandName));}

    public static By modelSearchField = By.xpath("//div[@class='SumoSelect sumo_model']");
    public static By modelSearch = By.xpath("//div[@class='SumoSelect sumo_model open']//input");
    public static By setModel (String model){
        String modelSearchLocator = "//div[contains(@class, 'open')]//li[normalize-space(text()='****')][not(contains(@class, 'hidden'))]";
        return By.xpath(modelSearchLocator.replace("****", model));}

    public static By yearFromField = By.xpath("//div[@class = 'SumoSelect sumo_year_from']");

    public static By yearToField = By.xpath("//div[@class = 'SumoSelect sumo_year_to']");

    public static By setYearInLocator(String year){
        String yearLocator = "//div[contains(@class, 'open')]//li//label[text()='**** god.']";
        return By.xpath(yearLocator.replace("****", year));}
    //public static By selectYear = By.xpath("//div[contains(@class, 'open')]//li//label[text()='**** god.']");

    public static By fuelTypeMenu = By.xpath("//div[@class='SumoSelect sumo_fuel']");
    public static By setFuelType(String fuelType){
        String fuelLocator = "//div[@class='SumoSelect sumo_fuel open']//li//label[text()='****']";
                return By.xpath(fuelLocator.replace("****", fuelType));}

    //public static By fuelTypeDizel = By.xpath("//div[@class='SumoSelect sumo_fuel open']//li//label[text()='Dizel']");


    public static By regionMenu = By.xpath("//div[@class='SumoSelect sumo_region']");
    public static By setRegion(String region){
        String regionLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        return By.xpath(regionLocator.replace("****", region));}

    public static By searchButton = By.xpath("//button[@name='submit_1']");



    public static By sortOrderMenu = By.xpath("(//div[@class='SumoSelect sumo_sortOrder'])[1]");
    public static By setSortType(String sortType){
        String sortTypeLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        return By.xpath(sortTypeLocator.replace("****", sortType));}
    //public static By priceDescendingSort = By.xpath("//div[contains(@class, 'open')]//li//label[text()='ceni silazno']");


    public static By setSearchResultPage (String resultPage){
        String resultPageLocator = "(//a[text()='****'])[1]";

        return By.xpath(resultPageLocator.replace("****", resultPage));}
    //public static By searchSecondPage = By.xpath();

    public static By setSearchResult (String searchResult){
        String searchResultLocator = "(//article)[****]";
        searchResultLocator.replace("****",searchResult);
        return By.xpath(searchResultLocator);}

    public static By getCarInformation(String carInformation){
        String carInformationLocator = "//div[text()='****']//following-sibling::div";
        carInformationLocator.replace("****", carInformation);
        return By.xpath(carInformationLocator);}

    //public static By carInfo = By.xpath("//div[text()='****']//following-sibling::div");
}
