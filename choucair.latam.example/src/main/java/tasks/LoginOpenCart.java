package tasks;

import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterfaces.LoginOpenCartInterface;

public class LoginOpenCart implements Task {
    private Data data;

    public LoginOpenCart(Data data) {
        this.data = data;
    }

    public static LoginOpenCart thePage(Data data) {
        return Tasks.instrumented(LoginOpenCart.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                  Enter.theValue(data.getUserN()).into(LoginOpenCartInterface.ENTER_USER)
                , Enter.theValue(data.getPassW()).into(LoginOpenCartInterface.ENTER_PASS)
                , Click.on(LoginOpenCartInterface.LOGIN_BUTTON)
        );
    }
}
