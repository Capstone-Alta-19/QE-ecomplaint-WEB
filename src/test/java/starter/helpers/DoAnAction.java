package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

    public static Performable clickDownloadNow(){
        return Task.where("{0} click button download now",
                Click.on(LandingPage.BUTTON_DOWNLOAD));
    }

//    public static Performable clickLanguage() {
//        return Task.where("{0} click button language",
//                Click.on(LandingPage.BUTTON_LANGUAGE));
//    }

    public static Performable clickHelp(){
        return Task.where("{0} click button help",
                Click.on(LandingPage.BUTTON_HELP));
    }
    public static Performable clickWhatsappHelp(){
        return Task.where("{0} click button whatsapp help",
                Click.on(LandingPage.BUTTON_WHATSAPP));
    }

    public static Performable FieldUsername(String username) {
        return Task.where("{0} email field with " + username,
                Enter.theValue(username)
                        .into(ComplaintzAdminPage.FIELD_USERNAME)
        );
    }

    public static Performable FieldPassword(String password) {
        return Task.where("{0} password field with " + password,
                Enter.theValue(password)
                        .into(ComplaintzAdminPage.FIELD_PASSWORD)
        );
    }

    public static Performable clickLOgin(){
        return Task.where("{0} click button login",
                Click.on(ComplaintzAdminPage.LOGIN_BUTTON));
    }

    public static Performable invalidUsername(String invUsername){
        return Task.where("{0} invalid email with" + invUsername,
                Enter.theValue(invUsername)
                        .into(ComplaintzAdminPage.FIELD_USERNAME)
        );
    }
    public static Performable invalidPassword(String invPassword){
        return Task.where("{0} invalid password with" + invPassword,
                Enter.theValue(invPassword)
                        .into(ComplaintzAdminPage.FIELD_PASSWORD)
        );
    }

}
