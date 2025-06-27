package co.com.proyecto.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ConfirmarProducto implements Question<Boolean> {
    private  String nombreProducto;
    private Target productos;

    public ConfirmarProducto(String nombreProducto, Target productos) {
        this.nombreProducto = nombreProducto;
        this.productos = productos;
    }

    public static ConfirmarProducto conNombre(String nombre, Target target) {
        return new ConfirmarProducto(nombre, target);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return productos.resolveAllFor(actor)
                .stream()
                .anyMatch(elemento -> elemento.getText().trim().equalsIgnoreCase(nombreProducto));
    }
    }

