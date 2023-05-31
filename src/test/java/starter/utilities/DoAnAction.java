package starter.utilities;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {
    //click
    public static Performable clickAltaShopAccountIcon() {
        return Task.where("{0} click account icon",
                Click.on(AltaShopPage.ACCOUNT_ICON));
    }
    public static Performable clickAltaShopCartIcon() {
        return Task.where("{0} click cart icon",
                Click.on(AltaShopPage.CART_ICON));
    }
    public static Performable clickAltaShopBuyButton() {
        return Task.where("{0} click buy button",
                Click.on(AltaShopPage.BUY_BUTTON));
    }
    public static Performable clickAltaShopDetailButton() {
        return Task.where("{0} click detail button",
                Click.on(AltaShopPage.DETAIL_BUTTON));
    }
    public static Performable clickAltaShopTransactionButton() {
        return Task.where("{0} click transaction button",
                Click.on(AltaShopPage.TRANSACTION_BUTTON));
    }
    public static Performable clickAltaShopLoginButton() {
        return Task.where("{0} click login button",
                Click.on(AltaShopPage.LOGIN_BUTTON));
    }
    public static Performable clickAltaShopRegisterButton() {
        return Task.where("{0} click register button",
                Click.on(AltaShopPage.REGISTER_BUTTON));
    }
    public static Performable clickAltaShopSubmitButton() {
        return Task.where("{0} click submit button",
                Click.on(AltaShopPage.SUBMIT_BUTTON));
    }
    public static Performable clickAltaShopPayButton() {
        return Task.where("{0} click pay button",
                Click.on(AltaShopPage.PAY_BUTTON));
    }
    public static Performable clickAltaShopDecreaseButton() {
        return Task.where("{0} click decrease button",
                Click.on(AltaShopPage.DECREASE_BUTTON));
    }
    public static Performable clickAltaShopIncreaseButton() {
        return Task.where("{0} click increase button",
                Click.on(AltaShopPage.INCREASE_BUTTON));
    }
    //fill
    public static Performable fillValidEmailLoginField(String emailLogin) {
        return Task.where("{0} fill login email field with " + emailLogin,
                Enter.theValue(emailLogin).into(AltaShopPage.EMAIL_LOGIN_FIELD));
    }
    public static Performable fillInvalidEmailLoginField(String invEmailLogin) {
        return Task.where("{0} fill login email field with " + invEmailLogin,
                Enter.theValue(invEmailLogin).into(AltaShopPage.EMAIL_LOGIN_FIELD));
    }
    public static Performable fillValidPasswordLoginField(String passwordLogin) {
        return Task.where("{0} fill login password field with " + passwordLogin,
                Enter.theValue(passwordLogin).into(AltaShopPage.PASSWORD_LOGIN_FIELD));
    }
    public static Performable fillInvalidPasswordLoginField(String invPasswordLogin) {
        return Task.where("{0} fill login password field with " + invPasswordLogin,
                Enter.theValue(invPasswordLogin).into(AltaShopPage.PASSWORD_LOGIN_FIELD));
    }
    public static Performable fillValidFullNameRegisterField(String fullNameRegister) {
        return Task.where("{0} fill register full name field with " + fullNameRegister,
                Enter.theValue(fullNameRegister).into(AltaShopPage.FULLNAME_REGISTER_FIELD));
    }
    public static Performable fillInvalidFullNameRegisterField(String invFullNameRegister) {
        return Task.where("{0} fill register full name field with " + invFullNameRegister,
                Enter.theValue(invFullNameRegister).into(AltaShopPage.FULLNAME_REGISTER_FIELD));
    }
    public static Performable fillValidEmailRegisterField(String emailRegister) {
        return Task.where("{0} fill register email field with " + emailRegister,
                Enter.theValue(emailRegister).into(AltaShopPage.EMAIL_REGISTER_FILED));
    }
    public static Performable fillInvalidEmailRegisterField(String invEmailRegister) {
        return Task.where("{0} fill register email field with " + invEmailRegister,
                Enter.theValue(invEmailRegister).into(AltaShopPage.EMAIL_REGISTER_FILED));
    }
    public static Performable fillValidPasswordRegisterField(String passwordRegister) {
        return Task.where("{0} fill register password field with " + passwordRegister,
                Enter.theValue(passwordRegister).into(AltaShopPage.PASSWORD_REGISTER_FIELD));
    }
    public static Performable fillInvalidPasswordRegisterField(String invPasswordRegister) {
        return Task.where("{0} fill register password field with " + invPasswordRegister,
                Enter.theValue(invPasswordRegister).into(AltaShopPage.PASSWORD_REGISTER_FIELD));
    }
}
