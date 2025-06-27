package co.com.proyecto.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/comprasCart.feature",
        glue="co.com.proyecto.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE)

public class comprasCart {
}
