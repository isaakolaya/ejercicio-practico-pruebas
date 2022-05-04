package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.ReportAreaInterface;

public class OpenCartAnswer implements Question {

    public static OpenCartAnswer toThe() {
        return new OpenCartAnswer();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ReportAreaInterface.VALIDATOR_TEXT).viewedBy(actor).asString();
    }
}
