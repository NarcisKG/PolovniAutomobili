package PageMethods;

import Core.BasePage;
import Core.Locators;

public class SearchResultPage extends BasePage {

    public SearchResultPage selectSortType (String sortType){
        clickOnElement(Locators.sortOrderMenu);
        clickOnElement(Locators.setSortType(sortType));
        return this;}

    public SearchResultPage selectSearchResultPage(int searchResultPage){
        clickOnElement(Locators.setSearchResultPage(Integer.toString(searchResultPage)));
        return this;}



}
