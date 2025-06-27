package co.com.proyecto.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class eliminarCompra {
    public static final Target BOTON_QUITAR_COMPRA= Target.the("Boton quitar compra").
            located(By.xpath("//button[contains(@class,'btn-danger')]//i[contains(@class,'fa-times-circle')]"));
    public static final Target TEXTO_PRODUCTO_ELIMINADO= Target.the("texto producto eliminado").
            located(By.xpath("//*[@id=\"content\"]/p"));
}
