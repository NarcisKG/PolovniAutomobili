import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolovniAutomobiliTest extends HomePage {

    public static final String CAR_BRAND = "Fiat";
    public static final String CAR_MODEL = "Grande Punto";
    public static final String FUEL_TYPE = "Dizel";
    public static final String REGION_SELECT = "Centralna Srbija";
    public static final int YEAR_FROM = 1995;
    public static final int YEAR_TO = 2025;
    public static final String SEARCH = "ceni silazno";
    public static final int SEARCH_PAGE = 2;
    public static final int SEARCH_RESULT = 1;



    @BeforeEach
    public void setup(){
    createDriver();
    getDriver().navigate().to("https://www.polovniautomobili.com/");}

    @Test
    public void test(){
        HomePage test = new HomePage();
        test.openBrandMenu().
                selectBrand(CAR_BRAND).
                openModelMenu().selectModel(CAR_MODEL).
                selectYearFrom(YEAR_FROM).selectYearTo(YEAR_TO).
                selectFuelType(FUEL_TYPE).
                selectRegionMenu(REGION_SELECT).
                searchButtonClick().
                selectSortType(SEARCH).
                selectSearchResultPage(SEARCH_PAGE).
                selectSearchResult(SEARCH_RESULT).
                verifyCarBrand(CAR_BRAND).
                verifyCarModel(CAR_MODEL).
                verifyFuelType(FUEL_TYPE).
                verifyProductionYear(YEAR_FROM,YEAR_TO);}

    @AfterEach
    public void close(){quitDriver();}

}
