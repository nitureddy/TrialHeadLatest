package com.apexit.basepage;

import org.openqa.selenium.By;

import com.apexit.Excel.ExcelApiFile;

/**Abstraction is the methodology of hiding the implementation of internal details , we write locators (such as id, name, xpath etc.,) and the methods Step definitions 
 * Literally we hide the implementations of the locators from the tests.
  Created on 06-May-2020
 *
 */
public class LocatorsPath {


	//SF
	public static final String TH_Login=".button.button--neutral.button--animated";

	public static final String TH_SFSignIn="//button[@id='signup_or_signin_with_salesforce']";//div[@id='detect_card-trailblazerid']/following-sibling::div//button";
	public static final String TH_SFUserName="//input[@id='username']";

	public static final String TH_SFPsWD="//input[@id='password']";
	
	public static final String TH_SFLogin="//button[normalize-space()='Sign in']";//input[@id='Login']";
	public static final String TH_launch="(//a[contains(.,'Launch')])[1]";
	public static final String SF_AppLaunch="//div[@class='slds-icon-waffle']";
	public static final String SF_Form="//form[@id='loginPage:social-card-form']";
	public static final String Accounts="//a[@title='Accounts']";
	public static final String New="//a[@title='New']";
	
	public static final String Gmail="//a[contains(text(),'Gmail')]";
	public static final String SFDevMail="(//span[@name='Salesforce Develope.'][normalize-space()='Salesforce Develope.'])[2]";
	public static final String bodyMail="//div[contains(text(),'You recently logged in to Your Developer Edition f')]";
	public static final String linedinLogin="(//button[@id='signup_or_signin_with_linkedin'])[2]";
	public static final String AccName="//input[@name='Name']";
	public static final String Rating="//button[@aria-label='Rating, --None--']";
	
	public static final String ParentAcc="//input[@placeholder='Search Accounts...']";
	public static final String Type="//button[@aria-label='Type, --None--']";
	public static final String Industry="//button[@aria-label='Industry, --None--']";
	public static final String Ownership="//button[@aria-label='Ownership, --None--']";
	public static final String CustomerPri="//button[@aria-label='Customer Priority, --None--']";
	public static final String SLA="//button[@aria-label='SLA, --None--']";
	public static final String Save="//button[@name='SaveEdit']";
	public static final String AccRec="//lightning-formatted-text[@class='custom-truncate']";	
	public static final String ListviewControls="//button[@title='List View Controls']";
	public static final String SelectListview="//button[@title='Select a List View']";
	public static final String AllAccsListview="//span[contains(@class,'virtualAutocompleteOptionText')][normalize-space()='All Accounts']";
	
	public static final String LVNewBtn="//li[@class='slds-dropdown__item listViewSettingsMenuNew']//a[@role='menuitem']";
	public static final String LVName="//input[@name='title']";
	public static final String LVAPIName="//input[@name='developerName']";
	public static final String LVAllUsersRdo="(//span[@class='slds-radio_faux'])[2]";
	public static final String LVASave="(//span[contains(@class,'label bBody')][normalize-space()='Save'])[2]";
	public static final String LVFilter="//div[@class='forceFilterPanelScope']";
	public static final String LVAllAccsRdo="(//span[@class='slds-radio_faux'])[1]";
	public static final String LVAllAccsDone="//span[normalize-space()='Done']";
	public static final String LVAllAccsave="//button[contains(text(),'Save')]";
	
	public static final String leads="//a[@title='Leads']";
	
	//public static final String Salutation="//button[@name='salutation']";
	
	public static final String FirstName="//input[@placeholder='First Name']";
	public static final String LastName="//input[@placeholder='Last Name']";
	public static final String SearchAccount="//input[@placeholder='Search Accounts...']";
	public static final String SelAccount="//li[@role='presentation']//lightning-base-combobox-item[@role='option']";//(//lightning-base-combobox-item[contains(@id,'combobox')])[3]";
	public static final String Contacts="//span[@class='slds-truncate'][normalize-space()='Contacts']";

	public static final String Salutation="(//button[@aria-label='Salutation, --None--'])[1]";
	public static final String company="//input[@name='Company']";
	public static final String title="//input[@name='Title']";
//	public static final String Salutation="(//li[@role='presentation'])[5]";
	
	public static final String selSalutation="//span[@title='Mr.']";
	public static final String contact="//span[@class='custom-truncate uiOutputText']";
	
	public static final String leadSource="//button[@aria-label='Lead Source, --None--']";
	public static final String leadStatus="//button[@aria-label='Lead Status, Open - Not Contacted']";
	public static final String revenue="//input[@name='AnnualRevenue']";
	public static final String rating="//button[@aria-label='Rating, --None--']";
	public static final String employes="//input[@name='NumberOfEmployees']";
	public static final String industry="//button[@aria-label='Industry, --None--']";
	public static final String street="//textarea[@name='street']";
	public static final String city="//input[@name='city']";
	public static final String state="//input[@name='province']";
	public static final String postalCode="//input[@name='postalCode']";
	public static final String country="//input[@name='country']";
	public static final String lead="//lightning-formatted-name[@slot='primaryField']";		
	public static final String convert="//button[normalize-space()='Convert']";
	public static final String convertLead="//span[@data-target-selection-internal='true']//button[@type='button'][normalize-space()='Convert']";
	public static final String leadCon="//lightning-formatted-text[normalize-space()='Your lead has been converted']";
	public static final String gotoLeads="//button[normalize-space()='Go to Leads']";
	public static final String opps="//a[@title='Opportunities']//span[contains(text(),'Opportunities')]";
	public static final String prospext="//a[@title='Prospecting']//span[contains(text(),'Prospecting')]";
	//public static final String details="((//ul[@role='tablist'])[5]/child::li)[2]";//"(//a[@id='detailTab__item'])[3]";//"(//li[@title='Details'])[3]";//"(//a[@data-label='Details'][normalize-space()='Details'])[3]";
	//public static final String details="div[class='windowViewMode-normal oneContent active lafPageHost'] li[title='Details']";//(//flexipage-tabset2[1]/div[1]/lightning-tabset[1]/div[1]/lightning-tab-bar[1]/ul[1]/li[2]/a[1])[3]";
	public static final String oppAcc="//span[@id='window']";
	public static final String act="(//a[@id='activityTab__item'])[3]";
	public static final String refresh="(//a[@role='button'][normalize-space()='Refresh'])[3]";
	public static final String details="//flexipage-component2[@data-component-id='flexipage_tabset']//ul[@role='tablist']/child::li[2]";
	public static final String quali="//span[contains(@class,'title slds-path__title')][normalize-space()='Qualification']";
}