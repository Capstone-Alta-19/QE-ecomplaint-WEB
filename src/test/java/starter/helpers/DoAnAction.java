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
    public static Performable clickReport(){
        return Task.where("{0} click button report",
                Click.on(ComplaintzAdminPage.BUTTON_REPORT));
    }
    public static Performable clickViewDetailsReport(){
        return Task.where("{0} click button view details report",
                Click.on(ComplaintzAdminPage.VIEW_DETAILS_REPORT));
    }
//    public static Performable FieldFeedback(String feedback) {
//        return Task.where("{0} email field with " + feedback,
//                Enter.theValue(feedback)
//                        .into(ComplaintzAdminPage.INPUT_FEEDBACK)
//        );
//    }
//    public static Performable clickSend(){
//        return Task.where("{0} click button send",
//                Click.on(ComplaintzAdminPage.BUTTON_SEND));
//    }

    public static Performable clickNews(){
        return Task.where("{0} click button news",
                Click.on(ComplaintzAdminPage.CLICK_NEWS));
    }

    public static Performable ViewDetailsNews(){
        return Task.where("{0} click view details news",
                Click.on(ComplaintzAdminPage.DETAILS_VIEW_NEWS));
    }

    public static Performable AddNews(){
        return Task.where("{0} click view add news",
                Click.on(ComplaintzAdminPage.BUTTON_ADD_NEWS));
    }
    public static Performable InputNewsTitle(String title) {
        return Task.where("{0} title field with " + title,
                Enter.theValue(title)
                        .into(ComplaintzAdminPage.INPUT_NEWS_TITLE)
        );
    }
    public static Performable ChooseStatus(){
        return Task.where("{0} click choose status",
                Click.on(ComplaintzAdminPage.CHOOSE_STATUS));
    }
    public static Performable DetailsNews(String detail) {
        return Task.where("{0} details news field with " + detail,
                Enter.theValue(detail)
                        .into(ComplaintzAdminPage.DETAILS_NEWS)
        );
    }
    public static Performable AddPicture(){
        return Task.where("{0} click add picture",
                Click.on(ComplaintzAdminPage.ADD_PICTURE));
    }
    public static Performable SubmitNews(){
        return Task.where("{0} click submit news",
                Click.on(ComplaintzAdminPage.BUTTON_SUBMIT_NEWS));
    }
    public static Performable ViewEdit(){
        return Task.where("{0} click view edit",
                Click.on(ComplaintzAdminPage.VIEW_EDIT));
    }
    public static Performable Edit(){
        return Task.where("{0} click edit",
                Click.on(ComplaintzAdminPage.EDIT));
    }
    public static Performable ViewStatus(){
        return Task.where("{0} click view status",
                Click.on(ComplaintzAdminPage.VIEW_STATUS));
    }
    public static Performable SaveStatus(){
        return Task.where("{0} click save status",
                Click.on(ComplaintzAdminPage.SAVE_STATUS));
    }
    public static Performable DeleteStatus(){
        return Task.where("{0} click delete status",
                Click.on(ComplaintzAdminPage.DELETE_STATUS));
    }
    public static Performable Logout(){
        return Task.where("{0} click logout",
                Click.on(ComplaintzAdminPage.LOGOUT));
    }

}
