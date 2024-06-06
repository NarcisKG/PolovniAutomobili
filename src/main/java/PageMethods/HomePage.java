package PageMethods;

import Core.BasePage;
import Core.Locators;

public class HomePage extends BasePage {
    public HomePage openBrandMenu(){
        clickOnElement(Locators.brandSearchField);
        return this;}

    public HomePage selectBrand(String brandName){
        typeText(brandName, Locators.brandSearch);
        clickOnElement(Locators.setBrand(brandName));
    return this;}

    public HomePage openModelMenu(){
        clickOnElement(Locators.modelSearchField);
        return this;}

    public HomePage selectModel(String modelSelect){
        typeText(modelSelect, Locators.modelSearch);
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

   public SearchResultPage searchButtonClick(){
        clickOnElement(Locators.searchButton);
        return new SearchResultPage();}
}
