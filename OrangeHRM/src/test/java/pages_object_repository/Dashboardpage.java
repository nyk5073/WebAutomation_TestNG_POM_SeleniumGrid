package pages_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	
WebDriver driver;
	
	public Dashboardpage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="welcome") static WebElement WelcomeLink;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]") static WebElement LogoutLink;
	
	public void userLogsOut() throws InterruptedException {
		WelcomeLink.click();
		Thread.sleep(2000);
		LogoutLink.click();
	}

}
