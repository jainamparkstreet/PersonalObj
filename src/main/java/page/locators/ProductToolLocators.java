package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductToolLocators {

	
	@FindBy(xpath = "//span[normalize-space()='Product Tool']")
	public WebElement productText;
	
	@FindBy(xpath = "//span[normalize-space()='Operations']")
	public WebElement Operations;
	
	@FindBy(xpath = "//a[contains(text(),'Product Management')]")
	public WebElement btnProductManagement;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu ng-scope']//a[@class='ng-binding'][normalize-space()='Product Tool']")
	public WebElement btnProductTool;
	
	
	@FindBy(className = "secondary")
	public WebElement filterbtn;
	
	@FindBy(className = "expanded-filter")
	public WebElement expandfilterbtn;
	
	@FindBy(className = "export-icon")
	public WebElement exportbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/product-tool-details[1]/div[1]/div[1]/div[1]/cmp-button-round[1]/div[1]/span[3]/i[1]")
	public WebElement editbtn;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/product-tool-details[1]/div[1]/div[1]/div[1]/cmp-button-round[1]/div[1]/span[2]/i[1]")
	public WebElement duplicatebtn;
	
	@FindBy(id = "dropdown_wrapper_product_state")
	public WebElement productstatus;
	
	@FindBy(className = "small")
	public WebElement applyBtn;
	
	
	@FindBy(className = "reset")
	public WebElement clearFilter;
	
	@FindBy(xpath = "/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/button[1]/i[1]")
	public WebElement searchsummary;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app[1]/div[1]/application[1]/div[1]/div[2]/div[1]/product-tool[1]/div[1]/div[1]/div[1]/div[1]/summary-top-bar[1]/div[1]/div[1]/cmp-search-bar[1]/div[1]/i[1]")
	public WebElement clearSearch;
	
	@FindBy(className = "css-1o6lkht")
	public WebElement crossIcon;
	
	@FindBy(xpath = "//button[@class='btn psi-button primary large']")
	public WebElement buttonAdd;
	
	@FindBy(xpath = "//button[@class='btn psi-button primary large']")
	public WebElement buttonClick;
	
	@FindBy(css = "input#description")
	public WebElement desc;
	
	@FindBy(css = "input#abv")
	public WebElement ABV;
	
	@FindBy(css = "input#cola_ttb_id")
	public WebElement ttbId;
	
	
	@FindBy(className =  "c-btn--primary")
	public WebElement reviewBtn;
	
	
	@FindBy(className =  "psi-primary")
	public WebElement submitBtn;
	
	@FindBy(className =  "has-error")
	public WebElement validationError;
	
	
	@FindBy(xpath = "//div[@class='click_outside ng-scope']//span[3]")
	public WebElement editBtn;
	
}
