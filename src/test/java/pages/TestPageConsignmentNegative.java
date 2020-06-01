package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.commonmodule.Loader;

import java.util.ArrayList;
import java.util.Map;

public class TestPageConsignmentNegative extends TestBase  {

    PageDashBoard pageDashBoard;
    PageConsinment pageConsinment;
    Loader loader;

    @Test(dataProviderClass = DataProviderList.class, dataProvider = "consignment1",priority = 0)
    public void doStarted(Map<String, String> testDataSet) throws InterruptedException {

        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
        waitForLoad(eventFiringWebDriver);
        pageDashBoard.clickOnNavBar();
        pageDashBoard.clickOnConsignViaAccordion();

        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));

        pageConsinment = new PageConsinment(eventFiringWebDriver);

        pageConsinment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
        Thread.sleep(8000);

        pageConsinment.enterTxtBilledTo(testDataSet.get("BilledTo"));
        pageConsinment.selectMenuBilledTo();
        Thread.sleep(20000);

    }





}
