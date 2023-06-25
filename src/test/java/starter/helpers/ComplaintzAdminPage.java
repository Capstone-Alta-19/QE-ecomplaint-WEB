package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://ecomplainz.netlify.app/admin")
public class ComplaintzAdminPage extends PageObject {

    public static Target FIELD_USERNAME = Target.the("field username").located(By.id("login-admin_username"));

    public static Target FIELD_PASSWORD = Target.the("field password").located(By.id("login-admin_password"));

    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("//button[contains(@type,'submit')]");

    public static Target BUTTON_REPORT = Target.the("button report").locatedBy("//body[1]/div[@id='root']/section[1]/aside[1]/div[1]/div[1]/a[2]");

    public static Target VIEW_DETAILS_REPORT = Target.the("view details report").locatedBy("//body[1]/div[@id='root']/section[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]");

//    public static Target INPUT_FEEDBACK = Target.the("input feedback").located(By.id("description"));
//
//    public static Target BUTTON_SEND = Target.the("button send").locatedBy("//button[contains(@type,'submit')]");
    public static Target CLICK_NEWS = Target.the("click button news").locatedBy("//body[1]/div[@id='root']/section[1]/aside[1]/div[1]/div[1]/a[3]");

    public static Target DETAILS_VIEW_NEWS = Target.the("details view").locatedBy("//body[1]/div[@id='root']/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]");
}
