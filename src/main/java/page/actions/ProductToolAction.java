package page.actions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import page.locators.ProductToolLocators;
import utils.SeleniumDriver;

public class ProductToolAction {

	ProductToolLocators productToolLocators = null;	
	public ProductToolAction() {
			
			this.productToolLocators= new ProductToolLocators();
			PageFactory.initElements(SeleniumDriver.getDriver(), productToolLocators);
			
		}
		
		public void clickOnOperations() {
			System.out.print("Parkstreettttt");
			productToolLocators.Operations.click();
		}
		
		public void clickOnProductManagement() {
			  Actions actions = new Actions(SeleniumDriver.getDriver());
			  actions.moveToElement(productToolLocators.btnProductManagement).perform();
			//productToolLocators.btnProductManagement.click();
		}
		
		public void clickOnProductTool() throws InterruptedException {
			
			productToolLocators.btnProductTool.click();
			Thread.sleep(5000);
			
		}
		
		public void clickOnFilterBtn() throws InterruptedException {
			
			productToolLocators.filterbtn.click();
			if(productToolLocators.expandfilterbtn.isDisplayed()) {
				System.out.println("Filter is openend");	
				
			}
		}
				
		
		public void selectProductStatus(String productStatus) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("dropdown_wrapper_product_state")).click();
			Thread.sleep(5000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_product_state']//ul[contains(@class,'dropdown-menu dropdown-menu-form')]"));
			
			List<WebElement> statusList= ee.findElements(By.tagName("li"));
			for (WebElement li : statusList) {
			if (li.getText().equals(productStatus)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("dropdown_wrapper_product_state")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			String status = SeleniumDriver.getDriver().findElement(By.xpath("(//span[@class='typography-caption-dark-medium u-bg-light-green status-label'][normalize-space()='Approved'])[1]")).getText();
			System.out.println(status);
			assertEquals("Approved", status);
			System.out.println("Test is passed for status");
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
		}
		
		
		
		public void selectProductType(String productType) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("dropdown_wrapper_product_type")).click();
			Thread.sleep(5000);
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_product_type']//div[contains(@class,'options-overflow')]"));
			
			List<WebElement> statusList= ee.findElements(By.tagName("li"));
			for (WebElement li : statusList) {
			if (li.getText().equals(productType)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("dropdown_wrapper_product_type")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			String producttype = SeleniumDriver.getDriver().findElement(By.xpath("//body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[2]/div[1]/table-grid[1]/div[1]/psi-ag-grid[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[7]/span[1]/div[1]/span[1]")).getText();
			System.out.println(producttype);
			assertEquals("Wine", producttype);
			System.out.println("Test is passed for product type");
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
			
		}
		
		
		public void selectProductSubType(String productsubtype) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_product_sub_type")).click();
			Thread.sleep(5000);
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_product_sub_type']//div[contains(@class,'options-overflow')]"));
			
			List<WebElement> productsubtypelist = ee.findElements(By.tagName("li"));
			for (WebElement li : productsubtypelist) {
			if (li.getText().equals(productsubtype)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_product_sub_type")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			String productSubType = SeleniumDriver.getDriver().findElement(By.xpath("//body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[2]/div[1]/table-grid[1]/div[1]/psi-ag-grid[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[8]/span[1]/div[1]/span[1]")).getText();
			System.out.println(productSubType);
			assertEquals("Spirits", productSubType);
			System.out.println("Test is passed for product sub type");
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
		}
		
		
		public void selectSourceFilter(String source) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_source")).click();
			Thread.sleep(5000);
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_source']//div[contains(@class,'options-overflow')]"));
			
			List<WebElement> sourcelist = ee.findElements(By.tagName("li"));
			for (WebElement li : sourcelist) {
			if (li.getText().equals(source)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_source")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			
			String sourcefilter = SeleniumDriver.getDriver().findElement(By.xpath("//body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[2]/div[1]/table-grid[1]/div[1]/psi-ag-grid[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[9]/span[1]/div[1]/span[1]")).getText();
			System.out.println(sourcefilter);
			assertEquals("Domestic", sourcefilter);
			System.out.println("Test is passed for source filter");
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
			
		}
		
		public void selectBrandFilter(String Brand) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_brand")).click();
			Thread.sleep(2000);
			 
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[5]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[5]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Brand);
			
			Thread.sleep(5000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_brand']//div[contains(@class,'options-overflow')]"));
			List<WebElement> brandNameList = ee.findElements(By.tagName("li"));
			for (WebElement li : brandNameList) {
			if (li.getText().equals(Brand)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_brand")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			
			
			String selectedBrand = SeleniumDriver.getDriver().findElement(By.xpath("//body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[2]/div[1]/table-grid[1]/div[1]/psi-ag-grid[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]/span[1]")).getText();
			System.out.println(selectedBrand);
			assertEquals("Shottys", selectedBrand);
			System.out.println("Test is passed for Brand filter");
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
			
		}
		
		
		public void selectSubBrandFilter(String subbrand) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_sub_brand")).click();
			Thread.sleep(2000);
			 
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[6]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[6]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(subbrand);
			
			Thread.sleep(5000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_sub_brand']//div[contains(@class,'options-overflow')]"));
			List<WebElement> subbrandNameList = ee.findElements(By.tagName("li"));
			for (WebElement li : subbrandNameList) {
			if (li.getText().equals(subbrand)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_sub_brand")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
		}	
		
		public void selectSubBrandProductFilter(String subbrandproduct) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_sub_brand_product")).click();
			Thread.sleep(2000);
			 
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[7]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[2]/div[1]/filter-content[1]/div[1]/div[7]/div[1]/cmp-input-dropdown[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(subbrandproduct);
			
			Thread.sleep(5000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//div[@id='multi_select_dropdown_sub_brand_product']//div[contains(@class,'options-overflow')]"));
			List<WebElement> subbrandProductNameList = ee.findElements(By.tagName("li"));
			for (WebElement li : subbrandProductNameList) {
			if (li.getText().equals(subbrandproduct)) {
			     li.click();
			     break;
			   }
			}
			SeleniumDriver.getDriver().findElement(By.id("multi_select_dropdown_sub_brand_product")).click();
			productToolLocators.applyBtn.click();
			Thread.sleep(5000);
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
		}
		
		
		
		public void searchForProductCode(String productcode) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).sendKeys(productcode);
			Thread.sleep(2000);
			productToolLocators.searchsummary.click();
			Thread.sleep(2000);
			productToolLocators.clearSearch.click();
		}
		
		public void searchForProductDescription(String productdescription) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).sendKeys(productdescription);
			Thread.sleep(2000);
			productToolLocators.searchsummary.click();
			Thread.sleep(2000);
			productToolLocators.clearSearch.click();
		}
		
		public void searchForProductTTbId(String producttbid) throws InterruptedException {
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).click();
			SeleniumDriver.getDriver().findElement(By.xpath("/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/input[1]")).sendKeys(producttbid);
			Thread.sleep(2000);
			productToolLocators.searchsummary.click();
			Thread.sleep(2000);
			productToolLocators.clearFilter.click();
			Thread.sleep(2000);
		}
		
		public void clickExportButton() throws InterruptedException {
			
			productToolLocators.exportbtn.click();
		}

		//Completed.
		
		
		
		public void ClickAddNew() throws InterruptedException {
			Thread.sleep(5000);
			productToolLocators.buttonClick.click();
		}
		public boolean verifyProductPage() throws InterruptedException {
			Thread.sleep(5000);
		return productToolLocators.productText.isDisplayed();
		
		}
		
	public void selectSubBrandProduct(String string) throws InterruptedException {
			
			Thread.sleep(5000);
			boolean ans = string.isEmpty();
			System.out.print(ans);
			if(ans == false) {	
			
			SeleniumDriver.getDriver().findElement(By.name("sub_brand_product_id")).click();
			Thread.sleep(5000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			
			}
			}
			
		}
		
		
		public void addDescription(String string) throws InterruptedException {
			
			Thread.sleep(3000);
			productToolLocators.desc.click();
			String prodDescription = productToolLocators.desc.getAttribute("value");
			System.out.println(prodDescription);
			if(prodDescription.isEmpty()) {
				System.out.println("In Desc regular flow");
				productToolLocators.desc.sendKeys(string);
			}
			else {
				System.out.println("Yes In Edit Desc");
				Thread.sleep(3000);
				productToolLocators.desc.clear();
				productToolLocators.desc.sendKeys(string);
			}
		}
		
		public void addGroup(String string) throws InterruptedException {
			
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("group")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			
			}
		}
		
		
		public void addUOM(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("case_unit_of_measure")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void addProductType(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("prod_type")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void addProductSubType(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("sub_type")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void selectCategory(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("category")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void selectSource(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("source")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void selectCountry(String string) throws InterruptedException {
			Thread.sleep(2000);
			SeleniumDriver.getDriver().findElement(By.name("country")).click();
			Thread.sleep(2000);
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
			Thread.sleep(2000);
		}
		
		public void selectVintage(String string) throws InterruptedException {
			Thread.sleep(5000);
			SeleniumDriver.getDriver().findElement(By.name("vintage")).click();
			
			WebElement ee = SeleniumDriver.getDriver().findElement(By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-form ng-scope')]"));
			
			List<WebElement> countriesList= ee.findElements(By.tagName("li"));
			for (WebElement li : countriesList) {
			if (li.getText().equals(string)) {
			     li.click();
			     break;
			   }
			}
		}
		
		public void addABV(String string) throws InterruptedException {
			Thread.sleep(1000);
			productToolLocators.ABV.click();
			productToolLocators.ABV.sendKeys(string);
		}
		
		
		
		public void addTTBID(String string) {
			productToolLocators.ttbId.click();
			productToolLocators.ttbId.sendKeys(string);
		}
		
		public void clickReviewBtn() throws InterruptedException {
			productToolLocators.reviewBtn.click();
			//boolean validationerror = productToolLocators.validationError.isDisplayed();
			
			//if(validationerror) {
				//System.out.print("Please fill all mandatory information");
			//}
						
		}
		
		
		public void clickSubmitBtn() throws InterruptedException {
			Thread.sleep(5000);
			productToolLocators.submitBtn.click();
		}
		
		//Edit the Product
		
		public void clickEditButton() throws InterruptedException {
			Thread.sleep(10000);
			productToolLocators.editbtn.click();
		}
		
		//Duplicate the Product
		
		public void clickDuplicateButton() throws InterruptedException {
			Thread.sleep(10000);
			productToolLocators.duplicatebtn.click();
		}

}
