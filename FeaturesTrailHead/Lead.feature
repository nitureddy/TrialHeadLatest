@CreateConvertLead
Feature: Create Lead

  @CreateLead
  Scenario: Create Lead
  Given Log in to SalesForce TrailHead
  Then Click on Lead
  And Click on New Button in Leads view
  Then Populate all mandatory fields in Leads view
  And Click on Save button in Leads view
  Then verify whether contact is created in Leads view
  
  @ConvertLead
  Scenario: Convert Lead
  Given Click on the Convert button
  Then Convert Lead window is displayed
  Then Click on Convert button in Convert Lead window
  Then Your Lead has been converted window is displayed
  Then Click on Go to Leads in Your Lead has been converted window
  Then Click on opportunities
  Then Opportunity created from lead should be displayed
  Then click on the opportunity created from Lead
  Then Verify the Account created while converting lead to opportunity
  Then Verify the Contact craeted after converting lead to opportunity  