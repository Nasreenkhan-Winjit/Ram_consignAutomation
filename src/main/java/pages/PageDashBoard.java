package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.commonmodule.Loader;

public class PageDashBoard extends BasePage{

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-right']")
    private WebElement elementNavBar;

    @CacheLookup
    @FindBy(how = How.XPATH, using="//ul[contains(@class,'v-expansion-panel')]/li[5]")
    private WebElement elementAvailableAccordion;

    @FindBy(how = How.XPATH,using = "//ul[contains(@class,'v-expansion-panel')]/li[5]/../..//label[normalize-space(text())='Consign']")
    private WebElement elementConsignAccordion;

    public PageDashBoard(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnNavBar() throws InterruptedException {
        actions.moveToElement(elementNavBar).build().perform();
        elementNavBar.click();
    }

    public void clickOnConsignViaAccordion() throws InterruptedException {
        elementAvailableAccordion.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementConsignAccordion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementConsignAccordion);
    }
}
