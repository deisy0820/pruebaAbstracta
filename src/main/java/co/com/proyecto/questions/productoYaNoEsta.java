package co.com.proyecto.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.proyecto.userinterfaces.eliminarCompra.TEXTO_PRODUCTO_ELIMINADO;

public class productoYaNoEsta implements Question<Boolean> {

    private  String nombreProducto;

    public productoYaNoEsta(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static productoYaNoEsta enElCarrito(String nombreProducto) {
        return new productoYaNoEsta(nombreProducto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !Text.of(TEXTO_PRODUCTO_ELIMINADO).equals("iphone");


    }
}


