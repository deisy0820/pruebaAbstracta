package co.com.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import static co.com.proyecto.userinterfaces.agregarCompra.*;

public class agregarCompraCarrito implements Task {
    private  String  texto;

    public agregarCompraCarrito(String texto){

        this.texto = texto;
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(BUSCAR),
                Enter.keyValues(texto).into(BUSCAR).thenHit(Keys.ENTER),
                Click.on(BOTON_AGREGAR_CARRITO),
                Click.on(BOTON_ITEMS),
                Click.on(BOTON_VER_CARRITO)
                );
    }

    public static agregarCompraCarrito of(String texto) {

        return Tasks.instrumented(agregarCompraCarrito.class, texto);
    }
}
