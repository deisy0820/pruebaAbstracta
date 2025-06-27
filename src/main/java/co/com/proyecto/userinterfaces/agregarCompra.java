package co.com.proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class agregarCompra {
    public static final Target BUSCAR = Target.the("campo buscar").located(By.name("search"));
    public static final Target BOTON_AGREGAR_CARRITO= Target.the("Boton agregar al carrito").
            located(By.xpath("//button[@onclick=\"cart.add('40', '1');\"]"));
    public static final Target BOTON_ITEMS= Target.the("Boton mirar items").
            located(By.xpath("//span[@id='cart-total']/parent::button"));
    public static final Target BOTON_VER_CARRITO= Target.the("Boton mirar carrito").
            located(By.xpath("//div[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
         public static final Target NOMBRE_PRODUCTO_EN_CARRITO= Target.the("nombre de producto").
            located(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a"));
}

