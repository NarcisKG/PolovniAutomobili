package Tests;

import PageMethods.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolovniAutomobiliTest extends HomePage {

    @BeforeEach
    public void setup(){
    createDriver();
    getDriver().navigate().to("https://www.polovniautomobili.com/");}

    @Test
    public void test(){
        HomePage test = new HomePage();
        test.openBrendMenu().selectBrand("Mercedes").openModelMenu().selectModel("E220").
        selectYearFrom(2014).selectYearTo(2024).selectFuelType("Dizel").selectRegionMenu("Šumadijski").searchButtonClick();
    }

    @AfterEach
    public void close(){quitDriver();}

}
