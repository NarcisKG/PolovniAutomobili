package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public HomePage openBrendMenu(){
        clickOnElement(Locators.brandSearchField);
        return this;}

    public HomePage selectBrand(String brandName){
        typeText(brandName, Locators.brandSearchField);
        clickOnElement(Locators.setBrand(brandName));
    return this;}

    public HomePage openModelMenu(){
        clickOnElement(Locators.modelSearchField);
        return this;}

    public HomePage selectModel(String modelSelect){
        typeText(modelSelect, Locators.modelSearchField);
        clickOnElement(Locators.setModel(modelSelect));
        return this;}

    public HomePage selectYearFrom(int yearFrom){
        clickOnElement(Locators.yearFromField);
        clickOnElement(Locators.setYearInLocator(Integer.toString(yearFrom)));
    return this;}

    public HomePage selectYearTo (int yearTo){
        clickOnElement(Locators.yearToField);
        clickOnElement(Locators.setYearInLocator(Integer.toString(yearTo)));
        return this;}

   public HomePage selectFuelType (String fuelTypeSelect){
        clickOnElement(Locators.fuelTypeMenu);
        clickOnElement(Locators.setFuelType(fuelTypeSelect));
        return this;}

   public HomePage selectRegionMenu (String regionSelect){
        clickOnElement(Locators.regionMenu);
        clickOnElement(Locators.setRegion(regionSelect));
        return this;}

   public SearchResultPage searchButton (){
        clickOnElement(Locators.searchButton);
        return new SearchResultPage();}
}
