package br.com.desafiorenner.pages;

import br.com.desafiorenner.driver.Driver;
import br.com.desafiorenner.maps.PrincipalMap;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    private PrincipalMap principalMap;

    public PrincipalPage() {
        principalMap = new PrincipalMap();
        PageFactory.initElements(Driver.getDriver(),principalMap);
    }
    public void clickRegistrar(){
        principalMap.btnRegistrar.click();
    }
    public void realizarLogin(String email, String senha){
        principalMap.inpEmail.sendKeys(email);
        principalMap.inpPassword.sendKeys(senha);
        principalMap.btnAcessar.click();
    }
}
