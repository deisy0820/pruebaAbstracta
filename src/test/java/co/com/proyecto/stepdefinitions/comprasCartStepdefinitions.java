package co.com.proyecto.stepdefinitions;

import co.com.proyecto.questions.ConfirmarProducto;
import co.com.proyecto.questions.productoYaNoEsta;
import co.com.proyecto.tasks.EliminarProducto;
import co.com.proyecto.tasks.abrirPag;
import co.com.proyecto.tasks.agregarCompraCarrito;
import co.com.proyecto.userinterfaces.abrirPagina;
import co.com.proyecto.utils.driverSetup;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.is;



import static co.com.proyecto.userinterfaces.agregarCompra.NOMBRE_PRODUCTO_EN_CARRITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class comprasCartStepdefinitions {
   @Managed(driver = "chrome")
    private WebDriver suNavegador;
    private Actor user ;
    private abrirPagina abrirPagina;

    @Before
    public void configurar() {
        user = Actor.named("usuario");
        user.can(BrowseTheWeb.with(suNavegador));

    }

    @Given("^El usuario ingresa a la pagina web$")
    public void elUsuarioIngresaALaPaginaWeb() {

        user.attemptsTo(abrirPag.at(abrirPagina));
    }

    @When("^El usuario agrega el telefono al carrito$")
    public void elUsuarioAgregaElTelefonoAlCarrito() {
        user.attemptsTo(agregarCompraCarrito.of("iphone"));


    }

    @Then("^El usuario verifica que el telefono si este en el carro de compras \"([^\"]*)\"$")
    public void elUsuarioVerificaQueElTelefonoSiEsteEnElCarroDeCompras(String nombreProducto) {
        user.should(
                seeThat(
                        ConfirmarProducto.conNombre(nombreProducto, NOMBRE_PRODUCTO_EN_CARRITO),
                        is(true)
                )
        );

    }

    @When("^El usuario elimina el telefono al carrito$")
    public void elUsuarioEliminaElTelefonoAlCarrito() {
        user.attemptsTo(agregarCompraCarrito.of("iphone"));
        user.attemptsTo(EliminarProducto.of());

    }


    @Then("^El usuario verifica que el telefono no se enuentre en el carrito de compras$")
    public void elUsuarioVerificaQueElTelefonoNoSeEnuentreEnElCarritoDeCompras() {
        user.should(
                seeThat("Your shopping cart is empty!",
                        productoYaNoEsta.enElCarrito("iPhone"),
                        is(true)
                )
        );

    }

}

