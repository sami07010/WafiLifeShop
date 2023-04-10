package pages;

import org.openqa.selenium.By;

public class WasiLifeAutorPage extends BasePage{
	
	public By NEXT_PAGE_BUTTON = By.xpath("//a[contains(text(),'→')]");
	public By AUTHOR_NAME = By.xpath("//h3[normalize-space()='Diponkor Chandra Datta']");

}
