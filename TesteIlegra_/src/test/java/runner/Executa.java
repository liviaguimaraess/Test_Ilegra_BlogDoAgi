package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue= "steps",
		tags = "@test",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends Drivers {

public static void abrirNavegador() {
	String site = "https://blogdoagi.com.br/";
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("start-maximized");




driver = new ChromeDriver(chromeOptions);
driver.get(site);

}
public static void fecharNavegador() {
	driver.quit();
}
}

