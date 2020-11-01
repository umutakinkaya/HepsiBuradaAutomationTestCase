package bindings;

import base.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Bindings extends Base {



    /*@Before
    public void Initialize(Scenario scenario) {

        //geturl();
        geturlFirefox();


    }*/

    @Given("^i go to website with chrome$")
    public void geturlchrome()
    {
        geturl();

    }

    @Given("^i go to website with firefox$")
    public void geturlFirefox()
    {
        geturlFirefox();

    }

    @When("^i click signin button$")
    public void clicksigninbutton()
    {

        findElementClick(".login", Pather.cssSelector);

        Assert.assertEquals("CREATE AN ACCOUNT", findElement("//*[@id='create-account_form']/h3", Pather.xPath, "").getText());
        System.out.println("Sucessfull SignIn!");

    }

    @Then("^i click emailspan$")
    public void i_click_emailspan()  {

        findElement("email_create",Pather.id,"").sendKeys(getSaltString() + "@hotmail.com");
    }

    @Then("^i click create an account button$")
    public void i_click_create_an_account_button()  {

        //*[@id="noSlide"]/h1
        findElementClick("#SubmitCreate > span", Pather.cssSelector);
        Assert.assertEquals("YOUR PERSONAL INFORMATION", findElement("//*[@id='account-creation_form']/div[1]/h3", Pather.xPath, "").getText());
        System.out.println("Sucessfull Land on Register Page!");

    }

    @Then("^i fill the mandatory fields of the register form$")
    public void i_fill_form()  {

        findElement("customer_firstname",Pather.id,"").sendKeys("User");
        findElement("customer_lastname",Pather.id,"").sendKeys("Test");
        findElement("passwd",Pather.id,"").sendKeys("12345");
        findElement("address1",Pather.id,"").sendKeys("Test address test addresss");
        findElement("city",Pather.id,"").sendKeys("DeathStar");

        findElementClick("id_state", Pather.id);
        Select state = new Select(findElement("id_state",Pather.id,""));
        state.selectByValue("1");

        findElement("postcode",Pather.id,"").sendKeys("55555");
        findElement("phone_mobile",Pather.id,"").sendKeys("55555555555");
    }

    @Then("^i click register$")
    public void i_click_register_button()  {

        findElementClick("#submitAccount > span", Pather.cssSelector);
        //*[@id="center_column"]/h1
        Assert.assertEquals("MY ACCOUNT", findElement("//*[@id='center_column']/h1", Pather.xPath, "").getText());
        System.out.println("My Account Page Appeared!");

    }

    @Then("^i click home button and assert username$")
    public void i_click_home_button()  {

        findElementClick("li > .btn > span", Pather.cssSelector);
        Assert.assertEquals("User Test", findElement(".account > span", Pather.cssSelector, "").getText());
        System.out.println("Username Assertion is true!");


    }

    @Then("^i click dresses > summer dresses$")
    public void i_click_summmer_dresses()  {
        Actions act = new Actions(driver);
        act.moveToElement(findElement("//div[@id='block_top_menu']/ul/li[2]/a",Pather.xPath,"")).perform();
        findElementClick("//div[@id='block_top_menu']/ul/li[2]/ul/li[3]/a", Pather.xPath);
//*[@id="center_column"]/h1/span[1]
        Assert.assertEquals("SUMMER DRESSES ", findElement("//*[@id='center_column']/h1/span[1]", Pather.xPath, "").getText());
        System.out.println("Summer Dresses Page Appeared!");

    }

    @Then("^i add a summer dress product in basket$")
    public void i_add_summer_dress_basket()  {

        Actions act = new Actions(driver);
        act.moveToElement(findElement(".ajax_block_product:nth-child(1) .replace-2x",Pather.cssSelector,"")).perform();
        findElementClick(".ajax_block_product:nth-child(1) .button:nth-child(1) > span",Pather.cssSelector);
        findElementClick(".continue > span", Pather.cssSelector);

        //*[@id="layer_cart"]/div[1]/div[1]/h2/text()

       // Assert.assertEquals("Product successfully added to your shopping cart", findElement("//*[@id='layer_cart']/div[1]/div[1]/h2/text()", Pather.xPath, "").getText());
       // System.out.println("Product successfully added to your shopping cart!!!");


    }

    @Then("^i search summer on the searchbar$")
    public void si_search_summer_on_seachbar()  {

        findElement("search_query_top",Pather.id,"").sendKeys("summer");
        findElementClick(".button-search", Pather.cssSelector);

        //*[@id="center_column"]/h1/span[1]

        Assert.assertEquals("\"SUMMER\"", findElement("//*[@id='center_column']/h1/span[1]", Pather.xPath, "").getText());
        System.out.println("Summer Search Page Appeard!");


    }



    @Then("^i click card > checkout$")
    public void i_click_checkout()  {

        Actions act = new Actions(driver);
        act.moveToElement(findElement("//header[@id='header']/div[3]/div/div/div[3]/div/a",Pather.xPath,"")).perform();
        findElementClick("#button_order_cart > span",Pather.cssSelector);

        //*[@id="cart_title"]/text()

        Assert.assertEquals("Your shopping cart", findElement("//*[@id='columns']/div[1]/span[2]", Pather.xPath, "").getText());
        System.out.println("Shopping - Card Summary Page Appeared!");

    }

    @Then("^i click proceed checkout$")
    public void i_click_proceed_checkout()  {

        findElementClick(".standard-checkout > span",Pather.cssSelector);


    }


    @Then("^i click proceed checkout for shipping address$")
    public void i_click_proceed_checkout_for_shipping_address()  {

        findElementClick(".button:nth-child(4) > span",Pather.cssSelector);

        //*[@id="carrier_area"]/h1
        Assert.assertEquals("SHIPPING", findElement("//*[@id='carrier_area']/h1", Pather.xPath, "").getText());
        System.out.println("Shipping Page Appeared!");


    }
    @Then("^i click terms of signing of shipping$")
    public void i_click_terms_of_signing_shipping()  {

        findElementClick("//form[@id='form']/div/p[2]/label",Pather.xPath);
    }

    @Then("^i choose bankwire payment method$")
    public void i_choose_bankwire_payment_method()  {

        findElementClick(".bankwire",Pather.cssSelector);

        //*[@id="center_column"]/form/div/h3
        Assert.assertEquals("BANK-WIRE PAYMENT.", findElement("//*[@id='center_column']/form/div/h3", Pather.xPath, "").getText());
        System.out.println("Bankwire Payment Method Successfully Selected!");
    }

    @Then("^i click order confirmation$")
    public void i_click_order_confirmation()  {

        findElementClick("#cart_navigation span",Pather.cssSelector);
//*[@id="center_column"]/h1
        Assert.assertEquals("ORDER CONFIRMATION", findElement("//*[@id='center_column']/h1", Pather.xPath, "").getText());
        System.out.println("Order Confirmation Successful!");
    }

    @Then("^i click user account$")
    public void i_click_user_account()  {

        findElementClick(".account > span",Pather.cssSelector);
        Assert.assertEquals("MY ACCOUNT", findElement("//*[@id='center_column']/h1", Pather.xPath, "").getText());
        System.out.println("My Account Page Appeared!");
    }

    @Then("^i click order history and detail$")
    public void i_click_user_history_and_detail()  {

        findElementClick(".col-xs-12:nth-child(1) > .myaccount-link-list > li:nth-child(1) span",Pather.cssSelector);


        //*[@id="center_column"]/h1
        Assert.assertEquals("ORDER HISTORY", findElement("//*[@id='center_column']/h1", Pather.xPath, "").getText());
        System.out.println("Order History Page Appeared!");
// TO DO : assertion should be maximized

        Assert.assertEquals("On backorder", findElement("//*[@id='order-list']/tbody/tr[1]/td[5]/span", Pather.xPath, "").getText());
        System.out.println("Product is On Backorder Confirmed!!!");
    }



    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
        DriverQuit();
    }









}
