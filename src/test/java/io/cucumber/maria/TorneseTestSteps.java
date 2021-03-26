package io.cucumber.maria;

import io.cucumber.java.pt.Então;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;

public class TorneseTestSteps {

    public WebDriver browser;

    public TorneseTestSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		browser = new ChromeDriver();
        
    }

    @Dado("que que estou no site do tornese um programador")
    public void que_que_estou_no_site_do_tornese_um_programador() {
        browser.get("https://www.torneseumprogramador.com.br/");
        browser.manage().window().maximize();
    }

    @Dado("digito no campo de busca a palavra {string}")
    public void digito_no_campo_de_busca_a_palavra(String string) {
        WebElement input = browser.findElement( By.cssSelector(".form-pesquisa") );
        input.sendKeys(string);
    }

    @Então("devo ver o resultado na busca")
    public void devo_ver_o_resultado_na_busca() {
        WebElement button = browser.findElement( By.cssSelector(".btn-pesquisa") );
        button.click();
    }

    
}

