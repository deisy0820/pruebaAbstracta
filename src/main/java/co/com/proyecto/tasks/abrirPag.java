package co.com.proyecto.tasks;

import co.com.proyecto.userinterfaces.abrirPagina;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class abrirPag implements Task {
    private PageObject page;
    public abrirPag(PageObject page) {
        this.page = page;
    }
    @Override
    @Step("{0} goes to #OpenTheBrowser")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }
    public static abrirPag at(abrirPagina page)
    {
        return instrumented(abrirPag.class, page) ;
    }
}

