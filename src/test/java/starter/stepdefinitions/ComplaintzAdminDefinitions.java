package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

public class ComplaintzAdminDefinitions {

    @Given("{actor} on the login page")
    public void onTheLoginPage(Actor actor){actor.wasAbleTo(NavigateTo.LoginPage());}

    @When("{actor} input valid username {string}")
    public void inputValidUsername(Actor actor, String username){actor.attemptsTo(DoAnAction.FieldUsername(username));}

    @And("{actor} input valid password {string}")
    public void inputValidPassword(Actor actor, String password){actor.attemptsTo(DoAnAction.FieldPassword(password));}

    @Then("{actor} click login button")
    public void clickButtonLogin(Actor actor){actor.attemptsTo(DoAnAction.clickLOgin());}

    @When("{actor} input invalid username {string}")
    public void inputInvalidUsername(Actor actor, String InvUsername){actor.attemptsTo(DoAnAction.invalidUsername(InvUsername));}

    @And("{actor} input invalid password {string}")
    public void inputInvalidPassword(Actor actor, String InvPassword){actor.attemptsTo(DoAnAction.invalidPassword(InvPassword));}


}
