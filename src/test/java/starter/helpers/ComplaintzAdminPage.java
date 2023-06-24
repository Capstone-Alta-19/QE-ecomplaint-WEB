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

}
