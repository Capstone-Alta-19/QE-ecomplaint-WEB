package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.utilities.AltaShopPage;
import starter.utilities.DoAnAction;
import starter.utilities.NavigateTo;

public class MyStepdefs {
    @Given("{actor} is on Alta Shop Web landing page")
    public void userIsOnAltaShopWebLandingPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopLandingPage());
    }

    @When("{actor} click on the account icon")
    public void userClickOnTheAccountIcon(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopAccountIcon());
    }

    @And("{actor} click on the register button")
    public void userClickOnTheRegisterButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopRegisterButton());
    }

    @And("{actor} input valid register full name {string}")
    public void userInputValidFullName(Actor actor, String fullNameRegister) {
        actor.attemptsTo(DoAnAction.fillValidFullNameRegisterField(fullNameRegister));
    }

    @And("{actor} input valid register email {string}")
    public void userInputValidEmail(Actor actor, String emailRegister) {
        actor.attemptsTo(DoAnAction.fillValidEmailRegisterField(emailRegister));
    }

    @And("{actor} input valid register password {string}")
    public void userInputValidPassword(Actor actor, String passwordRegister) {
        actor.attemptsTo(DoAnAction.fillValidPasswordRegisterField(passwordRegister));
    }

    @And("{actor} click on the submit button")
    public void userClickOnTheSubmitButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopSubmitButton());
    }

    @Then("{actor} redirected to Alta Shop login page and see {string} text")
    public void userRedirectedToAltaShopLoginPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.LOGIN_PAGE).hasText(text));
    }

    @Then("{actor} see register error alert box and see {string} text")
    public void userSeeRegisterErrorAlertBoxAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.ERROR_REGISTER).hasText(text));
    }

    @And("{actor} click on the login button")
    public void userClickOnTheLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopLoginButton());
    }

    @Then("{actor} redirected to Alta Shop main page and see {string} text")
    public void userRedirectedToAltaShopMainPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.MAIN_PAGE).hasText(text));
    }

    @Then("{actor} see login error alert box wrong {string}")
    public void userSeeLoginErrorAlertBoxWrong(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.ERROR_LOGIN_WRONG).hasText(text));
    }
    @Then("{actor} see login error alert box email {string}")
    public void userSeeLoginErrorAlertBoxEmail(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.ERROR_LOGIN_EMPTY_EMAIL).hasText(text));
    }
    @Then("{actor} see login error alert box password {string}")
    public void userSeeLoginErrorAlertBoxPassword(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.ERROR_LOGIN_EMPTY_PASSWORD).hasText(text));
    }

    @And("{actor} click on the buy button")
    public void userClickOnTheBuyButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopBuyButton());
    }

    @And("{actor} click on the cart icon")
    public void userClickOnTheCartIcon(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopCartIcon());
    }

    @And("{actor} click on the pay button")
    public void userClickOnThePayButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopPayButton());
    }

    @Then("{actor} redirected to Alta Shop transaction page and see {string} text")
    public void userRedirectedToAltaShopTransactionPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.TRANSACTION_PAGE).hasText(text));
    }

    @Then("{actor} see {string} text in order page increase")
    public void userSeeTextInOrderPageIncrease(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.INCREASE_ORDER_PAGE).hasText(text));
    }

    @When("{actor} click on the transaction button")
    public void userClickOnTheTransactionButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopTransactionButton());
    }

    @And("{actor} click on the detail button")
    public void userClickOnTheDetailButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopDetailButton());
    }

    @Then("{actor} redirected to Alta Shop product page and see {string} text")
    public void userRedirectedToAltaShopProductPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.DETAIL_PAGE).hasText(text));
    }

    @And("{actor} click on the increase button")
    public void userClickOnTheIncreaseButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopIncreaseButton());
    }

    @And("{actor} click on the decrease button")
    public void userClickOnTheDecreaseButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAltaShopDecreaseButton());
    }

    @Then("{actor} see {string} text in order page decrease")
    public void userSeeTextInOrderPageDecrease(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(AltaShopPage.DECREASE_ORDER_PAGE).hasText(text));
    }

    @And("{actor} input invalid register email {string}")
    public void userInputInvalidEmail(Actor actor, String invEmailRegister) {
        actor.attemptsTo(DoAnAction.fillInvalidEmailRegisterField(invEmailRegister));
    }

    @And("{actor} input invalid register password {string}")
    public void userInputInvalidPassword(Actor actor, String invPasswordRegister) {
        actor.attemptsTo(DoAnAction.fillInvalidPasswordRegisterField(invPasswordRegister));
    }

    @And("{actor} input invalid register full name {string}")
    public void userInputInvalidFullName(Actor actor, String invFullNameRegister) {
        actor.attemptsTo(DoAnAction.fillInvalidFullNameRegisterField(invFullNameRegister));
    }

    @And("{actor} input valid login email {string}")
    public void userInputValidLoginEmail(Actor actor, String emailLogin) {
        actor.attemptsTo(DoAnAction.fillValidEmailLoginField(emailLogin));
    }

    @And("{actor} input valid login password {string}")
    public void userInputValidLoginPassword(Actor actor, String passwordLogin) {
        actor.attemptsTo(DoAnAction.fillValidPasswordLoginField(passwordLogin));
    }

    @And("{actor} input invalid login email {string}")
    public void userInputInvalidLoginEmail(Actor actor, String invEmailLogin) {
        actor.attemptsTo(DoAnAction.fillInvalidEmailLoginField(invEmailLogin));
    }

    @And("{actor} input invalid login password {string}")
    public void userInputInvalidLoginPassword(Actor actor, String invPasswordLogin) {
        actor.attemptsTo(DoAnAction.fillInvalidPasswordLoginField(invPasswordLogin));
    }
}