package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class CarInformationPage extends BasePage {

    public CarInformationPage selectSearchResult (int searchResultSelect){
        clickOnElement(Locators.setSearchResult(Integer.toString(searchResultSelect)));
        return new CarInformationPage();}

    public CarInformationPage verifyCarBrand (String carBrand){
        String realCarBrand = getElementText(Locators.getCarInformation("Marka"));
        Assertions.assertEquals(carBrand, realCarBrand, "Car brand is not as expected");
        return this;}

    public CarInformationPage verifyFuelType (String fuelType){
        String realFuelType = getElementText(Locators.getCarInformation("Gorivo"));
        Assertions.assertEquals(fuelType,realFuelType, "Fuel Type is not as expected");
        return this;}

    public CarInformationPage verifyCarModel (String carModel){
        String realCarModel = getElementText(Locators.getCarInformation("Model"));
        Assertions.assertEquals(carModel,realCarModel,"Car Model is not as expexted");
    return this;}

    public CarInformationPage verifyProductionYear (int yearFrom, int yearTo){
        String realProductionYear = getElementText(Locators.getCarInformation("Godište"));
        realProductionYear.replace(".","");
        int realProductionYear =
        return this}
}
