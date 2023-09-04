package br.com.desafiorenner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrarMap {
    @FindBy (xpath = "//*[@id='__next']//div[2]/input")
    public WebElement inpEmail;
    @FindBy (name = "name")
    public WebElement inpName;
    @FindBy (xpath = "//*[@id='__next']//div[4]//input")
    public WebElement inpPassword;
    @FindBy (name = "passwordConfirmation")
    public WebElement inpPasswordConfirmation;
    @FindBy(xpath = "//*[@id='__next']//label/label")
    public WebElement inpSaldo;
    @FindBy (xpath = "//button[text()='Cadastrar']")
    public WebElement inpCadastrar;
    @FindBy (id = "modalText")
    public WebElement inpModalRegistro;
    @FindBy (id = "btnCloseModal")
    public WebElement btnFechar;
    @FindBy (id = "textBalance")
    public WebElement txtSaldo;





}
