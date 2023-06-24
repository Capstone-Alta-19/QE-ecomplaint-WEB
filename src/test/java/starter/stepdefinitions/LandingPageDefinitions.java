package starter.stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

public class LandingPageDefinitions {

    @Given("{actor} on the landing page")
    public void userOnTheLandingPage(Actor actor){actor.wasAbleTo(NavigateTo.LandingPage());}

    @Then("{actor} click button download now")
    public void clickButtonDownload(Actor actor){actor.attemptsTo(DoAnAction.clickDownloadNow());}

//    @When("{actor} click button language")
//    public void clickButtonLanguage(Actor actor){actor.attemptsTo((DoAnAction.clickLanguage()));}
//
//    @Then("{actor} click button English")
//    public void clickButtonEnglish(Actor actor){}

    @And("{actor} click button help")
    public void clickButtonHelp(Actor actor){actor.attemptsTo(DoAnAction.clickHelp());}

//    @Then("{actor} click button read more article about help")
//    public void clickButtonMoreArticle(Actor actor){}

    @Then("{actor} click button whatsApp to help")
    public void clickButtonWhatsApp(Actor actor){actor.attemptsTo(DoAnAction.clickWhatsappHelp());}



}
