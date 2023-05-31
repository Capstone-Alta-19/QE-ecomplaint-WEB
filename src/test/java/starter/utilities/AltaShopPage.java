package starter.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://alta-shop.vercel.app/")
public class AltaShopPage extends PageObject {

    //button
    public static Target ACCOUNT_ICON = Target.the("account icon").locatedBy("//header/div[1]/button[2]");
    public static Target CART_ICON = Target.the("cart icon").locatedBy("//header/div[1]/button[1]");
    public static Target BUY_BUTTON = Target.the("buy button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[2]");
    public static Target DETAIL_BUTTON = Target.the("detail button").locatedBy("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]");
    public static Target TRANSACTION_BUTTON = Target.the("transaction button").located(By.id("list-item-1883"));
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("//span[contains(text(),'Login')]");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//a[contains(text(),'Register')]");
    public static Target SUBMIT_BUTTON = Target.the("submit button").locatedBy("//span[contains(text(),'Register')]");
    public static Target PAY_BUTTON = Target.the("pay button").located(By.id("button-bayar"));
    public static Target DECREASE_BUTTON = Target.the("decrease button").locatedBy("//span[contains(text(),'-')]");
    public static Target INCREASE_BUTTON = Target.the("increase button").locatedBy("//span[contains(text(),'+')]");

    //field
    public static Target EMAIL_LOGIN_FIELD = Target.the("email login field").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static Target PASSWORD_LOGIN_FIELD = Target.the("password login field").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public static Target FULLNAME_REGISTER_FIELD = Target.the("full name register field").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static Target EMAIL_REGISTER_FILED = Target.the("email register field").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public static Target PASSWORD_REGISTER_FIELD = Target.the("password register field").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/input[1]");

    //text
    public static Target MAIN_PAGE = Target.the("text AltaShop").locatedBy("//h3[contains(text(),'AltaShop')]");
    public static Target LOGIN_PAGE = Target.the("text Login").locatedBy("//div[contains(text(),'Login')]");
    public static Target ERROR_LOGIN_WRONG = Target.the("text error wrong").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    public static Target ERROR_LOGIN_EMPTY_EMAIL = Target.the("text error empty").locatedBy("//div[contains(text(),'email is required')]");
    public static Target ERROR_LOGIN_EMPTY_PASSWORD = Target.the("text error empty").locatedBy("//div[contains(text(),'password is required')]");
    public static Target ERROR_REGISTER = Target.the("register error alert box").locatedBy("//div[contains(text(),'Register')]");
    public static Target INCREASE_ORDER_PAGE = Target.the("increased order page").locatedBy("//span[@id='label-total-quantity']");
    public static Target DECREASE_ORDER_PAGE = Target.the("decreased order page").locatedBy("//div[contains(text(),'Order is empty!')]");
    public static Target TRANSACTION_PAGE = Target.the("transaction page").locatedBy("//h1[contains(text(),'Transactions')]");
    public static Target DETAIL_PAGE = Target.the("detail page").locatedBy("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/p[2]");

}
