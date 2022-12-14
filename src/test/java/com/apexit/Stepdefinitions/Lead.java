package com.apexit.Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.apexit.Excel.ExcelApiFile;
import com.apexit.basepage.CallObject;
import com.apexit.basepage.LocatorsPath;
import com.apexit.basepage.NavigatorsLocPath;
import com.apexit.basepage.PageObjects;
import com.apexit.testrunner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Lead extends TestRunner{
	public Lead() throws Exception{
		super();
	}
	Actions action = new Actions(driver); 
	ExcelApiFile file1=new ExcelApiFile("SalesForce.xlsx");
	SoftAssert softAssert = new SoftAssert();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	protected static String xpath;
	protected static String company;

	@Then("Click on Lead")
	public void click_on_lead() throws Exception {

		 WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.leads,NavigatorsLocPath.MAX_TIME);
			action.moveToElement(Element1).click().perform();   
	}

	@Then("Click on New Button in Leads view")
	public void click_on_new_button_in_leads_view() throws Exception {
		  PageObjects.SelectByXpath(driver,LocatorsPath.New,NavigatorsLocPath.MAX_TIME);

	}

	@Then("Populate all mandatory fields in Leads view")
	public void populate_all_mandatory_fields_in_leads_view() throws Exception {
	    System.out.println("Populate_all_mandatory_fields");
    	String company= file1.getCellData("Lead", "COMPANY",2)+CallObject.timestamp();
    	file1.setCellData("Lead", "COMPANY", 2, company);
	    String Salutation=file1.getCellData("Lead", "SALUTATION",2);
	    String selSalutation="//span[@title='"+Salutation+"']";
	    String leadSource=file1.getCellData("Lead", "LEADSOURCE",2);
	    String selleadSource="//span[@title='"+leadSource+"']";
	    String industry=file1.getCellData("Lead", "INDUSTRY",2);
	    String selIndustry="//span[@title='"+industry+"']";
	    String rating=file1.getCellData("Lead", "RATING",2);
	    String selrating="//span[@title='"+rating+"']";
	    String title=file1.getCellData("Lead", "TITLE",2);
		PageObjects.SelectByXpath(driver,LocatorsPath.Salutation,NavigatorsLocPath.MAX_TIME);
		PageObjects.SelectByXpath(driver,selSalutation,NavigatorsLocPath.MAX_TIME);
    	String fname= file1.getCellData("Lead", "FIRSTNAME",2)+CallObject.timestamp();
    	file1.setCellData("Lead", "FIRSTNAME", 2, fname);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.FirstName, NavigatorsLocPath.MAX_TIME, fname);
		String lname	= file1.getCellData("Lead", "LASTNAME",2)+CallObject.timestamp();
    	file1.setCellData("Lead", "LASTNAME", 2, lname);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.LastName, NavigatorsLocPath.MAX_TIME, lname);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.company, NavigatorsLocPath.MAX_TIME, company);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.title, NavigatorsLocPath.MAX_TIME, title);

		PageObjects.SelectByXpath(driver,LocatorsPath.leadSource,NavigatorsLocPath.MAX_TIME);
		PageObjects.SelectByXpath(driver,selleadSource,NavigatorsLocPath.MAX_TIME);

		//PageObjects.SelectByXpath(driver,LocatorsPath.industry,NavigatorsLocPath.MAX_TIME);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.industry)));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.industry)));

		PageObjects.SelectByXpath(driver,selIndustry,NavigatorsLocPath.MAX_TIME);

		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.revenue, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "ANNUALREVENUE",2));
		PageObjects.SelectByXpath(driver,LocatorsPath.rating,NavigatorsLocPath.MAX_TIME);
		PageObjects.SelectByXpath(driver,selrating,NavigatorsLocPath.MAX_TIME);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.employes, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "NOOFEMP",2));
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.street, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "STREET",2));
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.city, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "CITY",2));
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.state, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "STATE",2));
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.postalCode, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "POSTALCODE",2));
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.country, NavigatorsLocPath.MAX_TIME, file1.getCellData("Lead", "COUNTRY",2));

	}

	@Then("Click on Save button in Leads view")
	public void click_on_save_button_in_leads_view() throws Exception {
	    PageObjects.SelectByXpath(driver,LocatorsPath.Save,NavigatorsLocPath.MAX_TIME);

	}

	@Then("verify whether contact is created in Leads view")
	public void verify_whether_contact_is_created_in_leads_view() throws Exception {
		String exlead=file1.getCellData("Lead", "SALUTATION",2)+" "+file1.getCellData("Lead", "FIRSTNAME",2)+" "+file1.getCellData("Lead", "LASTNAME",2);
		System.out.println("The lead created is "+exlead);

		WebElement acLead= PageObjects.GetWebElement(driver, LocatorsPath.lead, NavigatorsLocPath.MAX_TIME);
		    String leadRec1 = acLead.getText();
	 	if(leadRec1.equals(exlead)){
				System.out.println("The contact is created  "+leadRec1);
			} else {
				System.out.println("The contact is not created "+leadRec1);
			}	
		}

	
	@Given("Click on the Convert button")
	public void click_on_the_convert_button() throws Exception {
		PageObjects.SelectByXpath(driver,LocatorsPath.convert,NavigatorsLocPath.MAX_TIME);

	}
	
	@Then("Convert Lead window is displayed")
	public void convert_lead_window_is_displayed() throws Exception {
		boolean conleadWin = PageObjects.SelectByXpathWithoutClick(driver, LocatorsPath.convertLead,
				NavigatorsLocPath.MAX_TIME);
		softAssert.assertEquals(conleadWin, true, "Convert Lead window is displayed");
	
	}
	
	@Then("Click on Convert button in Convert Lead window")
	public void click_on_convert_button_in_convert_lead_window() throws Exception {
		PageObjects.SelectByXpath(driver,LocatorsPath.convertLead,NavigatorsLocPath.MAX_TIME);

	}
	
	@Then("Your Lead has been converted window is displayed")
	public void your_lead_has_been_converted_window_is_displayed() throws Exception {
		boolean conleadWin = PageObjects.SelectByXpathWithoutClick(driver, LocatorsPath.leadCon,
				NavigatorsLocPath.MAX_TIME);
		softAssert.assertEquals(conleadWin, true, "Your Lead has been converted window is displayed");
	}
	
	@Then("Click on Go to Leads in Your Lead has been converted window")
	public void click_on_go_to_leads_in_your_lead_has_been_converted_window() throws Exception {
		PageObjects.SelectByXpath(driver,LocatorsPath.gotoLeads,NavigatorsLocPath.MAX_TIME);

	}
	
	@Then("Click on opportunities")
	public void click_on_opportunities() throws Exception {
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", 
				driver.findElement(By.xpath(LocatorsPath.opps)));
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.opps)));
	}
	
	@Then("Opportunity created from lead should be displayed")
	public void opportunity_created_from_lead_should_be_displayed() throws Exception {
		String company= file1.getCellData("Lead", "COMPANY",2)+"-";
		String xpath="(//a[@title='"+company+"'][normalize-space()='"+company+"'])[1]";
		boolean conleadWin = PageObjects.SelectByXpathWithoutClick(driver, xpath,
				NavigatorsLocPath.MAX_TIME);
		softAssert.assertEquals(conleadWin, true, "Opportunity created from lead should be displayed");	
		PageObjects.SelectByXpath(driver,xpath,NavigatorsLocPath.MAX_TIME);

	}
	
	@Then("click on the opportunity created from Lead")
	public void click_on_the_opportunity_created_from_lead() throws Exception {
		//PageObjects.SelectByXpath(driver,LocatorsPath.act,NavigatorsLocPath.MAX_TIME);
		//PageObjects.SelectByXpath(driver,LocatorsPath.quali,NavigatorsLocPath.MAX_TIME);

		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement details = PageObjects.GetWebElement(driver, LocatorsPath.details, NavigatorsLocPath.MAX_TIME);
		action.moveToElement(details).build().perform();
		js.executeScript("arguments[0].scrollIntoView();", 
		driver.findElement(By.xpath(LocatorsPath.details)));
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.details)));
	
	}
	
	@Then("Verify the Account created while converting lead to opportunity")
	public void verify_the_account_created_while_converting_lead_to_opportunity() throws Exception {
		String exAccount= file1.getCellData("Lead", "COMPANY",2);
		String accXpath="(//span[contains(text(),'"+exAccount+"')])[3]";
		WebElement acContact = PageObjects.GetWebElement(driver, accXpath, NavigatorsLocPath.MAX_TIME);
	    String conRec1 = acContact.getText();
 	if(conRec1.equals(exAccount)){
			System.out.println("The Account is created  "+conRec1);
		} else {
			System.out.println("The Account is not created "+conRec1);
		}
	//Assert.assertEquals(exAccount+"-", exAccount);

	}
	@Then("Verify the Contact craeted after converting lead to opportunity")
	public void verify_the_contact_craeted_after_converting_lead_to_opportunity() throws Exception {
		String exContact=file1.getCellData("Lead", "FIRSTNAME",2)+" "+file1.getCellData("Lead", "LASTNAME",2);
		String accxpath="(//a[@data-refid='recordId'][normalize-space()='"+exContact+"'])[1]";
		boolean conleadWin = PageObjects.SelectByXpathWithoutClick(driver, accxpath,
				NavigatorsLocPath.MAX_TIME);
		softAssert.assertEquals(conleadWin, true, "Verify the Contact created while converting lead to opportunity");	

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
