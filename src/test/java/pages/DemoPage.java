package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends BasePage {

    //------------------------------------------Find selectors---------------------------------------//

    @FindBy(xpath = "xxxxxxx")
    private WebElement firstDemoElement;



    //-----------------------Constructor-----------------------//
    public DemoPage(WebDriver driver) {
        super(driver);
    }


    //-----------------------Actions Methods-----------------------//

    public WebElement firstDemoElement() {
        firstDemoElement.getText();
        return firstDemoElement;
    }

}