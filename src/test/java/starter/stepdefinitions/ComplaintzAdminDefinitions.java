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

    @Given("{actor} login on the website Complaint with valid username {string} and valid password {string}")
    public void loginWebsiteAdmin(Actor actor, String username, String password){
        onTheLoginPage(actor);
        inputValidUsername(actor, username);
        inputValidPassword(actor, password);
        clickButtonLogin(actor);
    }
    @When("{actor} click button report")
    public void clickButtonReport(Actor actor){actor.attemptsTo(DoAnAction.clickReport());}

    @Then("{actor} click button view details")
    public void clickButtonViewDetails(Actor actor){actor.attemptsTo(DoAnAction.clickViewDetailsReport());

    }
//    @And("{actor} input feedback {string}")
//    public void inputFeedback(Actor actor, String feedback){actor.attemptsTo(DoAnAction.FieldFeedback(feedback));}
//
//    @Then("{actor} click send button")
//    public void clickSendButton(Actor actor){actor.attemptsTo(DoAnAction.clickSend());}

    @When("{actor} click button news")
    public void clickButtonNews(Actor actor){actor.attemptsTo(DoAnAction.clickNews());}

    @Then("{actor} click view details button on news")
    public void clickViewDetailsNews(Actor actor){actor.attemptsTo(DoAnAction.ViewDetailsNews());}

    @When("{actor} click button add news")
    public void clickAddNews(Actor actor){actor.attemptsTo(DoAnAction.AddNews());}

    @And("{actor} input title news {string}")
    public void inputTitleNews(Actor actor, String title){actor.attemptsTo(DoAnAction.InputNewsTitle(title));}

    @And("{actor} choose button mahasiswa")
    public void chooseButtonMahasiswa(Actor actor){actor.attemptsTo(DoAnAction.ChooseStatus());}

    @And("{actor} input details news {string}")
    public void inputDetailsNews(Actor actor, String details){actor.attemptsTo(DoAnAction.DetailsNews(details));}

    @And("{actor} add picture")
    public void addPictures(Actor actor){actor.attemptsTo(DoAnAction.AddPicture());}

    @Then("{actor} click button send news")
    public void buttonSendNews(Actor actor){actor.attemptsTo(DoAnAction.SubmitNews());}

    @When("{actor} click button view edit")
    public void buttonViewEdit(Actor actor){actor.attemptsTo(DoAnAction.ViewEdit());}

    @And("{actor} click button edit")
    public void buttonEdit(Actor actor){actor.attemptsTo(DoAnAction.Edit());}

    @And("{actor} click button detail status")
    public void detailStatus(Actor actor){actor.attemptsTo(DoAnAction.ViewStatus());}

    @And("{actor} click button resolved")
    public void buttonResolved(Actor actor){actor.attemptsTo(DoAnAction.ViewStatus());}

    @Then("{actor} click button save")
    public void buttonSave(Actor actor){actor.attemptsTo(DoAnAction.SaveStatus());}

    @Then("{actor} click button delete")
    public void buttonDelete(Actor actor){actor.attemptsTo(DoAnAction.DeleteStatus());}

    @And("{actor} click button logout")
    public void buttonLogout(Actor actor){actor.attemptsTo(DoAnAction.Logout());}





}
