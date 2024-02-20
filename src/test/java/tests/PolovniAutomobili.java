package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePagePF;

import java.time.Duration;

public class PolovniAutomobili extends BaseTest{

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) throws Exception {
        init(browser);
    }

    @AfterMethod
    @Parameters({"quit"})
    public void tearDown(String quit){
        if(quit.equalsIgnoreCase("Yes")){
            quit();
        }
    }

    @Test
    @Parameters({"env"})
    public void test() throws Exception {
        openApp("PROD");
        HomePagePF homePagePF = new HomePagePF(driver);
        homePagePF.searchVehicle("Alfa Romeo","145");
    }
}
