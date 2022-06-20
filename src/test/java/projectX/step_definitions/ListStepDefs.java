package projectX.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projectX.pages.SearchPage;
import projectX.pages.findPage;
import projectX.pages.mainpage;
import projectX.utilities.BrowserUtils;
import projectX.utilities.ConfigurationReader;
import projectX.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ListStepDefs {
    @Given("The user is on the main page with empty ToDo list")
    public void the_user_is_on_the_main_page_with_empty_ToDo_list() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user writes buy some milk to text box and click to add button")
    public void the_user_writes_buy_some_milk_to_text_box_and_click_to_add_button() {

        BrowserUtils.waitForClickability(new SearchPage().textBox,10);
        new SearchPage().textBox.click();
        new SearchPage().textBox.sendKeys("buy some milk");
        new SearchPage().textBox.sendKeys(Keys.ENTER);

    }
    @Then("The user should see buy some milk item in ToDo list")
    public void the_user_should_see_buy_some_milk_item_in_ToDo_list() {

        BrowserUtils.waitForVisibility(new SearchPage().itemInTheList,10);
        String expected = "buy some milk";
        String actual = new SearchPage().itemInTheList.getText();

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected,actual);

    }

    @Then("ashuiahpudsa")
    public void ashuiahpudsa() {
        System.out.println("asdas");
    }

    @When("User clicks on magnifier button")
    public void userClicksOnMagnifierButton() {

        new mainpage().accept.click();

        new mainpage().searchButton.click();

    }

    @Then("User is able too see search box and enter {string}")
    public void userIsAbleTooSeeSearchBoxAndEnter(String item) {

        new findPage().searchBox.sendKeys(item);
        new findPage().searchBox.sendKeys(Keys.ENTER);
    }

    @Then("User selects first result")
    public void userSelectsFirstResult() {

        new findPage().searchResult.click();

    }

    @And("User verifies page title")
    public void userVerifiesPageTitle() {

        String expectedTitle = "Testing & Automation";
        String actualTitle = new findPage().pageTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("User is on main page")
    public void userIsOnMainPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
}
