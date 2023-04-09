package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.DewanNasirUddinBook;
import pages.WasiLifeAutorPage;
import pages.WasiLifeBookDetails;
import pages.WasiLifeCheckOut;
import pages.WasiLifeHomePage;
import utilities.BaseDriverSetup;

public class WasiLifeTest extends BaseDriverSetup{
	
	//JavaClass      Object              = new JavaClass();
	WasiLifeHomePage wasiLifeHomePageObj = new WasiLifeHomePage();
	WasiLifeAutorPage wasiLifeAutorPageCousin = new WasiLifeAutorPage();
	DewanNasirUddinBook ObjdewanNasirUddinBook = new DewanNasirUddinBook();
	WasiLifeBookDetails objWasiLifeBookDetails = new WasiLifeBookDetails();
	WasiLifeCheckOut objWasiLifeCheckOut = new WasiLifeCheckOut();
	@Test
	public void visitWafiLife() throws InterruptedException {
//		Visit this site
		getDriver().get(wasiLifeHomePageObj.WASILIFE_URL);
		wasiLifeHomePageObj.takeScreenShot("Sami");
		Thread.sleep(5000);
		
//		Click  লেখক from the menu
		wasiLifeHomePageObj.clickOnElement(wasiLifeHomePageObj.LEKHOK_BUTTON);
		Thread.sleep(5000);
		
//		Scroll Down and go to the Next Page
		wasiLifeAutorPageCousin.scrollToElemnt(wasiLifeAutorPageCousin.NEXT_PAGE_BUTTON);
		Thread.sleep(5000);
		
//		Click on the Next Page
		wasiLifeAutorPageCousin.clickOnElement(wasiLifeAutorPageCousin.NEXT_PAGE_BUTTON);
		Thread.sleep(5000);
		
//		Click  লেখক from the menu
//		wasiLifeHomePageObj.clickOnElement(wasiLifeHomePageObj.LEKHOK_BUTTON);
//		Thread.sleep(5000);		
		
//		Back And Scroll Up
		getDriver().navigate().back();
		Thread.sleep(5000);
		wasiLifeAutorPageCousin.moveOnElement(wasiLifeAutorPageCousin.AUTHOR_NAME);
		Thread.sleep(5000);
		
//		Click On Author Name
		wasiLifeAutorPageCousin.clickOnElement(wasiLifeAutorPageCousin.AUTHOR_NAME);
		Thread.sleep(5000);
		
//		View any Book Details
		ObjdewanNasirUddinBook.clickOnElement(ObjdewanNasirUddinBook.PHYSICS_1ST_PAPER);
		Thread.sleep(5000);
		
//		Click অর্ডার করুন
		objWasiLifeBookDetails.clickOnElement(objWasiLifeBookDetails.ORDER_BOOK);
		Thread.sleep(5000);
		
//		Click অর্ডার সম্পন্ন করুন
		objWasiLifeBookDetails.clickOnElement(objWasiLifeBookDetails.PLACE_ORDER);
		Thread.sleep(5000);


		checkoutTest();
	

	}
	
	public void checkoutTest() throws InterruptedException {
		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.CHECKBOX_CREATE_ACCOUNT);
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.PASSWORD, "password");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.NAME, "Samiul Islam");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.PHONE_NUMBER, "01823244452");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.EMERGENCY_PHONE_NUMBER, "01823123456");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.EMAIL, "sami.cuetpme13@gmail.com");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.DIVISION_DROPDOWN);
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.selectElementWithText(objWasiLifeCheckOut.DIVISION_TEXT_FIELD, "Dhaka");
		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.DHAKA_DIVISION);
//		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.AREA, "Bashundhara");
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.scrollToElemnt(objWasiLifeCheckOut.BASHUNDHARA);
        Thread.sleep(5000);
		
		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.BASHUNDHARA);
		Thread.sleep(5000);
		
	//	Select select = new Select(getDriver().findElement(By.xpath("//select[@id='billing_area']")));
		//select.selectByVisibleText("কিশোরগঞ্জ সদর");
		//Thread.sleep(3000);
		
		
		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.ADDRESS);
		Thread.sleep(5000);
		
		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.PRODUCT_COMMENT, "Send me safely, handle with care");

		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.PLACE_ORDER);
//		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.writeText(objWasiLifeCheckOut.SHIP_TO_DIFFERENT_PLACE,);
//		Thread.sleep(5000);
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.NAME_SHIPPING);
//		Thread.sleep(5000);
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.PHONE_SHIPPING);
//		Thread.sleep(5000);
		
		
	}
	
	

}
