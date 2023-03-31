package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By lupa = By.xpath("//button[@id='search-open']");
	public By caixaPesquisa = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input");
	public By pesquisar = By.cssSelector("#masthead > div.site-header-content > div.desktop-search > form > input");

}
