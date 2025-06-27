package co.com.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.proyecto.userinterfaces.eliminarCompra.BOTON_QUITAR_COMPRA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class EliminarProducto implements Task {

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BOTON_QUITAR_COMPRA,isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_QUITAR_COMPRA)
        );
    }
    public static EliminarProducto of() {

        return Tasks.instrumented(EliminarProducto.class);
    }
}
