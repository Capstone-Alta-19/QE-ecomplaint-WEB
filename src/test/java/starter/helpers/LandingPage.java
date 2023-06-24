package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ecomplainz.netlify.app/")
public class LandingPage extends PageObject {

    public static Target BUTTON_DOWNLOAD = Target.the("download").locatedBy("//button[contains(text(),'Download Now')]");

//    public static Target BUTTON_LANGUAGE = Target.the("language").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]");

    public static Target BUTTON_HELP = Target.the("help").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]");

    public static Target BUTTON_WHATSAPP = Target.the("whatsapp help").locatedBy("//body/div[@id='root']/div[1]/div[2]/a[1]/img[1]");

}
