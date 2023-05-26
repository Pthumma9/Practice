package StepDefinations;

import SeleniumCode.AT01_NavigateNassert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateNassert {
    @Given("user can navigate to GG website from any browser")
    public void user_can_navigate_to_gg_website_from_any_browser() throws IOException {
        AT01_NavigateNassert obj= new AT01_NavigateNassert();
        obj.NavToGghome();

    }


    @Then("user is on the correct page")
    public void user_is_on_the_correct_page() {
        AT01_NavigateNassert obj= new AT01_NavigateNassert();
        obj.AssertTitle();
    }


}
