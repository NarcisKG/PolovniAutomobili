import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolovniAutomobiliTest extends HomePage {

    public static final String CAR_BRAND = "Mercedes Benz";
    public static final String CAR_MODEL = "E 220";
    public static final String FUEL_TYPE = "Dizel";

    public static final String REGION_SELECT = "Šumadijski";
    public static final int YEAR_FROM = 2010;
    public static final int YEAR_TO = 2015;

    @BeforeEach
    public void setup(){
    createDriver();
    getDriver().navigate().to("https://www.polovniautomobili.com/");}

    @Test
    public void test(){
        HomePage test = new HomePage();
        test.openBrandMenu().selectBrand(CAR_BRAND).openModelMenu().selectModel(CAR_MODEL).
        selectYearFrom(YEAR_FROM).selectYearTo(YEAR_TO).selectFuelType(FUEL_TYPE).
        selectRegionMenu(REGION_SELECT).searchButtonClick();}

    @AfterEach
    public void close(){quitDriver();}

}
