package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.FlightsInterface;

public class LatamAnswer implements Question {

    public static LatamAnswer toThe() {
        return new LatamAnswer();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FlightsInterface.VALIDATOR_TEXT).viewedBy(actor).asString();
    }
}
