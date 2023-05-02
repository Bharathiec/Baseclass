package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStepdefinition {
	
	
public static WebDriver driver;
	
	
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("---remote--allow--origins=*");
		   driver=new ChromeDriver(ops);
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();

	}
	@When("User Enters Valid UserName and Password")
	public void user_enters_valid_user_name_and_password() {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("gokulkannan");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Gokul12#");
	}
	@When("User Clicks On Login Button")
	public void user_clicks_on_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Then("User Verifies HomePage is Displayed")
	public void user_verifies_home_page_is_displayed() {
		System.out.println("Success");
	  	}
	@When("User Select Prefered Location")
	public void user_select_prefered_location() {
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Sydney");
	}
	@When("User Select Prefered Hotel")
	public void user_select_prefered_hotel() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys("Hotel Creek");
	}
	@When("User Select Prefered Room_Type")
	public void user_select_prefered_room_type() {
		WebElement roomType = driver.findElement(By.id("room_type"));
		roomType.sendKeys("Standard");
	}
	@When("User Select No of Rooms")
	public void user_select_no_of_rooms() {
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		roomNos.sendKeys("1 - One");
	   	}
	@When("User Select Check in Date")
	public void user_select_check_in_date() {
	    WebElement inDate = driver.findElement(By.id("datepick_in"));
	    inDate.sendKeys("28/03/22");
	}
	@When("User Select Check Out Date")
	public void user_select_check_out_date() {
	    WebElement outDate = driver.findElement(By.id("datepick_out"));
	    outDate.sendKeys("29/03/22");
	}
	@When("User Select No of Adults Per Room")
	public void user_select_no_of_adults_per_room() {
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		adultRoom.sendKeys("1 - One");    
	}
	@When("User Select No of Children Per Room")
	public void user_select_no_of_children_per_room() {
		WebElement childRoom = driver.findElement(By.id("child_room"));
		childRoom.sendKeys("1 - One");
	}
	@Then("User Clicks Search Button")
	public void user_clicks_search_button() {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}
	@Then("User Click the Radio Button")
	public void user_click_the_radio_button() {
		WebElement radiooBtn = driver.findElement(By.id("radiobutton_0"));
		radiooBtn.click();
	}
	@Then("User Click the Continue Button")
	public void user_click_the_continue_button() {
		WebElement search = driver.findElement(By.id("continue"));
		search.click();
	}
	@When("User Enters the First Name")
	public void user_enters_the_first_name() {
		 WebElement firstName = driver.findElement(By.id("first_name"));
         firstName.sendKeys("Bharathi");
	}
	@When("User Enters the Last Name")
	public void user_enters_the_last_name() {
		WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("V");

	   	}
	@When("User Enters the Address")
	public void user_enters_the_address() {
		 WebElement addrs = driver.findElement(By.id("address"));
         addrs.sendKeys("Saidapet");
	    	}
	@When("User Enters the Card Number")
	public void user_enters_the_card_number() {
		 WebElement cardNum = driver.findElement(By.id("cc_num"));
         cardNum.sendKeys("9500777950950077");
	   
	}
	@When("User Select the Card Type")
	public void user_select_the_card_type() {
		WebElement cardTyp = driver.findElement(By.id("cc_type"));
        cardTyp.sendKeys("VISA");
	    
	}
	@When("User Enters the Exp Month")
	public void user_enters_the_exp_month() {
		 WebElement expMnth = driver.findElement(By.id("cc_exp_month"));
         expMnth.sendKeys("March");
	   
	}
	@When("User Enters the Exp Year")
	public void user_enters_the_exp_year() {
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
        expYear.sendKeys("2023");
	    
	}
	@When("User Enters the Cvv Number")
	public void user_enters_the_cvv_number() {
		 WebElement cvvNum = driver.findElement(By.id("cc_cvv"));
         cvvNum.sendKeys("234");
	    
	}
	@Then("User Click the BookNow Button")
	public void user_click_the_book_now_button() {
		 WebElement bookBtn = driver.findElement(By.id("book_now"));
         bookBtn.click();
	   
	}
	@Then("User Prints the Order Id")
	public void user_prints_the_order_id() {
		
		 WebElement ordrNo = driver.findElement(By.id("order_no"));
         String attribute = ordrNo.getAttribute("value");
         System.out.println(attribute);

	   
	}




}
