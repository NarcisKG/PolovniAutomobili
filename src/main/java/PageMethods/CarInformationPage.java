package PageMethods;

import Core.BasePage;
import Core.Locators;

public class CarInformationPage extends BasePage {

    public CarInformationPage selectSearchResult(int searchResultSelect){
        clickOnElement(Locators.setSearchResult(Integer.toString(searchResultSelect)));
        return new CarInformationPage();}
}
