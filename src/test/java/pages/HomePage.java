package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    WebElement brands = driver.findElement(By.cssSelector("[title=' Sve marke']"));

    public void selectBrand (){
        brands.sendKeys("Alfa Romeo");
    }
}
