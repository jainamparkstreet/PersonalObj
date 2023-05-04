Feature: Navigate to the Product Tool page

  
  Scenario: User will be landed on the Product Tool summary page
    Given User is on the dashboard page
    And select the menu option "Operations"
    And select sub-menu "Product Management"
    And select "Product Tool"
    And click on the "Filter"
    And select value from Product Status "Approved"
    And select value from Product Type Filter "Wine"
    And select value from Product Sub Type Filter "Spirits"
    And select value from Source Filter "Domestic"
    And select value from Brand Filter "Shottys"
		And select value from SubBrand Filter "Apple Cider"
		And select value from SubBrand Product Filter "Candy Cane 50mL/64"
   
   Scenario: Applying the Search filter
   Given User is on the Product Tool page
   And User will search for the Product Code "SHT-WORAN-50"
   And User will search for Product description "Shottys Wine Based Gelatin Shots Strawberry 64x50ml 12.5%"
   And User will search for TTBId "19108001000312"

   Scenario: Exporting the Product Tool Summary
   Given User is on the Product Tool page
   And User will click on the Export button
   Then User will see the downloaded file
   
   
    Scenario: Creating of the new product
 		Given User is on create product page
 		And click on Add New Product
    And Create Product Page is displayed
 		And select value from Sub Brand Product "Shottys Lemon 400mL/12"
 		And user will add description "Desc Product"
 		And select value from Group "Discount"
 		And select value from UOM "0/CS"
 		And select value from Product Type "Malt"
 		And select Product Sub Type "Malt"
 		And select category "Beer"
 		And select source "Domestic"
 		And select country "BAHRAIN"
 		And select vintage "1920"
 		And add ABV % "15"
 		And add TTB ID "54698"
 		And click on the Review Button
 		Then click on the Submit Button
 		
 		Scenario: Edit of the product
 		Given User is on the Product Details page
 		And User will click on the Edit button
 		And add description as "Edit Desc Product"
 		And select group as "Service"
 		And click on the Review Button
 		Then click on the Submit Button
 		
 		Scenario: Duplicate of the product
 		Given User is on the Product Details page
 		And User will click on the Duplicate button
 		
 	
 		
 