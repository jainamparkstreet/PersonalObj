package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.actions.ProductToolAction;

public class ProductTool {
	
	ProductToolAction productToolAction = new ProductToolAction();
	
	@Given("User is on the dashboard page")
	public void user_is_on_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@And("select the menu option {string}")
	public void select_the_menu_option(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		productToolAction.clickOnOperations();
		
	}

	@And("select sub-menu {string}")
	public void select_sub_menu(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		productToolAction.clickOnProductManagement();
		
	}

	@And("select {string}")
	public void select(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
		productToolAction.clickOnProductTool();
		
	}
	
	@And("click on the {string}")
	public void click_on_the(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.clickOnFilterBtn();
	}
	
	@And("select value from Product Status {string}")
	public void select_value_from_product_status(String productStatus) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectProductStatus(productStatus);
	}
	
	@And("select value from Product Type Filter {string}")
	public void select_value_from_product_type_filter(String productType) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    productToolAction.selectProductType(productType);
	}
	
	@And("select value from Product Sub Type Filter {string}")
	public void select_value_from_product_sub_type_filter(String productsubtype) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectProductSubType(productsubtype);
	}
	
	
	@And("select value from Source Filter {string}")
	public void select_value_from_source_filter(String source) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectSourceFilter(source);
	}
	
	@And("select value from Brand Filter {string}")
	public void select_value_from_brand_filter(String brand) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectBrandFilter(brand);
	}
	
	@And("select value from SubBrand Filter {string}")
	public void select_value_from_sub_brand_filter(String subbrand) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectSubBrandFilter(subbrand);
	}
	
	
	@And("select value from SubBrand Product Filter {string}")
	public void select_value_from_sub_brand_product_filter(String subbrandproduct) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.selectSubBrandProductFilter(subbrandproduct);
	}
	
	
	
	
	
	
	
	
	@Given("User is on the Product Tool page")
	public void user_is_on_the_product_tool_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("User will search for the Product Code {string}")
	public void user_will_search_for_the_product_code(String productcode) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.searchForProductCode(productcode);
	}

	@And("User will search for Product description {string}")
	public void user_will_search_for_product_description(String productdescription) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.searchForProductDescription(productdescription);
	}

	@And("User will search for TTBId {string}")
	public void user_will_search_for_ttb_id(String producttbid) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.searchForProductTTbId(producttbid);
	}
	
	
	@And("User will click on the Export button")
	public void user_will_click_on_the_export_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.clickExportButton();
	}

	@Then("User will see the downloaded file")
	public void user_will_see_the_downloaded_file() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//@And("click on Add New Product")
	//public void click_on_add_new_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	    //productToolAction.ClickAddNew();
	//}

	//@Then("Create Product Page is displayed")
	//public void create_product_page_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		//System.out.println("User is on"+productToolAction.verifyProductPage());
		//assertEquals(productToolAction.verifyProductPage(), "true");
	//}
	
	
	@Given("User is on create product page")
	public void user_is_on_create_product_page() throws InterruptedException {
		
	}
	
	@And("click on Add New Product")
	public void click_on_add_new_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	    productToolAction.ClickAddNew();
	}

	@Then("Create Product Page is displayed")
	public void create_product_page_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("User is on"+productToolAction.verifyProductPage());
		//assertEquals(productToolAction.verifyProductPage(), "true");
	}
	
	@And("select value from Sub Brand Product {string}")
	public void select_value_from_sub_brand_product(String string) throws InterruptedException {
		productToolAction.selectSubBrandProduct(string);
	}
	@And("user will add description {string}")
	public void user_will_add_description(String string) throws InterruptedException {
		productToolAction.addDescription(string);
	}
	
	@And("select value from Group {string}")
	public void select_value_from_group(String string) throws InterruptedException {
		productToolAction.addGroup(string);
	}
	
	
	
	@And("select value from UOM {string}")
	public void select_value_from_uom(String string) throws InterruptedException {
	   
		productToolAction.addUOM(string);
	}

	@And("select value from Product Type {string}")
	public void select_value_from_product_type(String string) throws InterruptedException {
		productToolAction.addProductType(string);
	}

	@And("select Product Sub Type {string}")
	public void select_product_sub_type(String string) throws InterruptedException {
		productToolAction.addProductSubType(string);
	}

	@And("select category {string}")
	public void select_category(String string) throws InterruptedException {
		productToolAction.selectCategory(string);
	}

	@And("select source {string}")
	public void select_source(String string) throws InterruptedException {
		productToolAction.selectSource(string);
	}

	@And("select country {string}")
	public void select_country(String string) throws InterruptedException {
		productToolAction.selectCountry(string);
	}

	@And("select vintage {string}")
	public void select_vintage(String string) throws InterruptedException {
		productToolAction.selectVintage(string);
	}

	@And("add ABV % {string}")
	public void add_abv(String string) throws InterruptedException {
		productToolAction.addABV(string);
	}
	
	
	@And("add TTB ID {string}")
	public void add_ttb_id(String string) {
		productToolAction.addTTBID(string);
	}
	
	@And("click on the Review Button")
	public void click_on_the_review_button() throws InterruptedException {
		productToolAction.clickReviewBtn();
	}
	
	@Then("click on the Submit Button")
	public void click_on_the_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		productToolAction.clickSubmitBtn();
	}
	
	//Edit Product
	
	@Given("User is on the Product Details page")
	public void user_is_on_the_product_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("User will click on the Edit button")
	public void user_will_click_on_the_edit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.clickEditButton();
	}

	@And("add description as {string}")
	public void add_description_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.addDescription(string);
	}

	@And("select group as {string}")
	public void select_group_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.addGroup(string);
	}
	
	
	//Duplicate Product
	
	@And("User will click on the Duplicate button")
	public void user_will_click_on_the_duplicate_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		productToolAction.clickDuplicateButton();
	}

	
//	@Then("click on the Edit Button")
//	public void click_on_the_edit_button() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		productToolAction.clickEditBtn();
//	}
	
}
