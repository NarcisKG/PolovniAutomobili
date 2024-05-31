package PageMethods;

import Core.BasePage;
import Core.Locators;

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

   public HomePage selectFuelMenu (String fuelSelect){
        clickOnElement(Locators.fuelTypeMenu);
        clickOnElement(Locators.setFuelType(fuelSelect));
        return this;}

   public HomePage selectRegionMenu (String regionSelect){
        clickOnElement(Locators.regionMenu);
        clickOnElement(Locators.setRegion(regionSelect));
        return this;}

   public HomePage clickSearchButton(){
        clickOnElement(Locators.searchButton);
        return this;}

   public HomePage selectSortType (String sortType){
        clickOnElement(Locators.sortOrderMenu);
        clickOnElement(Locators.setSortType(sortType));
        return this;}
}
