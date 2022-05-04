package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.CatalogProductsInterface;
import userInterfaces.ProductsSectionInterface;
import userInterfaces.ReportAreaInterface;

public class OpenCartAnswerProducts implements Question {
    public static OpenCartAnswerProducts toThe() {
        return new OpenCartAnswerProducts();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductsSectionInterface.VALIDATOR_TEXT).viewedBy(actor).asString();
    }
}
