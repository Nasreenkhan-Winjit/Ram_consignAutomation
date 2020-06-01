package pages;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.commonmodule.Loader;

import java.util.ArrayList;
import java.util.Map;

public class TestPageConsinment extends TestBase {

    PageDashBoard pageDashBoard;
    PageConsinment pageConsinment;
    Loader loader;

    @Test(dataProviderClass = DataProviderList.class, dataProvider = "consignment",priority = 0)
    public void doStarted(Map<String, String> testDataSet) throws InterruptedException {

        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
        waitForLoad(eventFiringWebDriver);
        pageDashBoard.clickOnNavBar();
        pageDashBoard.clickOnConsignViaAccordion();

        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));

        pageConsinment = new PageConsinment(eventFiringWebDriver);

//        pageConsinment.enterTxtConsignmentID("UAT31230911");
//        Thread.sleep(10000);

        pageConsinment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
        Thread.sleep(8000);

        pageConsinment.enterTxtBilledTo(testDataSet.get("BilledTo"));
        pageConsinment.selectMenuBilledTo();
        Thread.sleep(20000);

    }


    @Test(priority = 1)
    public void commudityValidation() throws InterruptedException {

        pageConsinment.clickoncommudity();
        Thread.sleep(8000);
        pageConsinment.clickOnCommudityContinuePopup();
        Thread.sleep(5000);

    }
    @Test(priority = 2)
    public void selectCommudityJwellery() throws InterruptedException {

        pageConsinment.clickOnCommudityJwellery();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void thirdStepReciever() throws InterruptedException {
            //(Map<String, String> testDataSet) throws InterruptedException {

        pageConsinment.clickOnStepReciever();

     Thread.sleep(20000);
        //pageConsinment.entertxtRecieverName(testDataSet.get("Receivers Name"));
        pageConsinment.entertxtRecieverName("Surekha");
        Thread.sleep(8000);
        pageConsinment.selectMenuRecieverName();

        Thread.sleep(10000);
    }

    @Test(priority = 4)
    public void clickOnStepValue() throws InterruptedException {
      pageConsinment.clickOnStepValue();
        Thread.sleep(10000);
        pageConsinment.entertxtStepValue("123");
       Thread.sleep(5000);
        pageConsinment.clickOnCheckBox();
        Thread.sleep(10000);

    }

      @Test(priority = 5)
    public  void clickOnStepRequirement() throws InterruptedException {
        pageConsinment.clickOnStepRequirement();

         pageConsinment.entertxtShipperReference("qqqqqqq");
//Thread.sleep(10000);
         pageConsinment.clickOnDropdownProofOfDelivery(Keys.TAB);

         pageConsinment.ClickonDropDownStandardInstructionType();
          Thread.sleep(5000);
          pageConsinment.clickonDropdownNonDeliverablesDays();

          Thread.sleep(8000);

      }

        @Test(priority = 6)
    public void clickOnStepServices() throws InterruptedException {
        pageConsinment.clickonstepServices();

        Thread.sleep(6000);
        }
      @Test(priority = 7)
    public void clickonstepParcel() throws InterruptedException {
    //Thread.sleep(6000);
        pageConsinment.clickonStepParcel();
    Thread.sleep(6000);
}
     @Test(priority = 8)
    public void entertxtNumberOfParcel() throws InterruptedException {
        pageConsinment.entertxtNumberOfParcel("1");
         Thread.sleep(8000);

     }

        @Test(priority = 9)
    public void entertxtSecuritypack() throws InterruptedException {
       pageConsinment.clickOnSecurityPack("SP12345678");

       pageConsinment.entertxtweight("0.1");


        //pageConsinment.clickOnPackageType();
            Thread.sleep(8000);

        }

        @Test(priority = 10 )
    public void clickONFinaliseButton() throws InterruptedException {
        pageConsinment.clickOnFinaliseConsignment();
            Thread.sleep(8000);
            waitForLoad(eventFiringWebDriver);

        }

//git change



    //Second scenerio Negative Test Cases.


//    @Test(dataProviderClass = DataProviderList.class, dataProvider = "consignment",priority = 9 )
//        public void validateConsignmentAlreadyexist(Map<String, String> testDataSet) throws InterruptedException {
//
//
//        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
//        waitForLoad(eventFiringWebDriver);
//        pageDashBoard.clickOnNavBar();
//        pageDashBoard.clickOnConsignViaAccordion();
//
//        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
//
//        pageConsinment = new PageConsinment(eventFiringWebDriver);
//
//        pageConsinment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
//        Thread.sleep(8000);
//       //pageConsinment.validateToasterlreadyCosigned();
//
//
//
//        }
//
//        @Test(dataProviderClass = DataProviderList.class, dataProvider = "ConsignmentNegData",priority = 10)
//        public void multipleCommudityTest(Map<String, String> testDataSet) throws InterruptedException {
//            ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//            eventFiringWebDriver.switchTo().window(tabsCount.get(1));
//
//            pageConsinment.enterTxtConsignmentID(testDataSet.get("ConsignmentID"));
//            Thread.sleep(8000);
//
//            pageConsinment.enterTxtBilledTo(testDataSet.get("BilledTo"));
//            pageConsinment.selectMenuBilledTo();
//            Thread.sleep(20000);
//
//
//
//        }

}

