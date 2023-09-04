package br.com.desafiorenner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalMap {
@FindBy (name = "email")
    public WebElement inpEmail;
@FindBy (name = "password")
    public WebElement inpPassword;
@FindBy (xpath = "//button[text()='Acessar']")
    public WebElement btnAcessar;
@FindBy (xpath = "//button[text()='Registrar']")
    public WebElement btnRegistrar;


}
