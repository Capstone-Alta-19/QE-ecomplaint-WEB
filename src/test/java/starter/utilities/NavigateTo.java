package starter.utilities;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaShopLandingPage() {
        return Task.where("{0} opens the Alta Shop landing page",
                Open.browserOn().the(AltaShopPage.class));
    }
}
