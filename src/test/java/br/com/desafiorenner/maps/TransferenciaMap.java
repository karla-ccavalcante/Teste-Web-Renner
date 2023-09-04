package br.com.desafiorenner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferenciaMap {
    @FindBy (name = "accountNumber")
    public WebElement inpAccountNumber;
    @FindBy (name = "digit")
    public WebElement inpDigito;
    @FindBy (name ="transferValue")
    public WebElement inpValordetranferencia;
    @FindBy (name = "description")
    public WebElement inpDescricao;
    @FindBy (xpath = "//button[text()='Transferir agora']")
    public WebElement btnTransferiragora;
    @FindBy(id = "btnCloseModal")
    public WebElement btnFechar;
    @FindBy(id = "modalText")
    public WebElement txtmodalText;
    @FindBy (id = "btnBack")
    public WebElement btnVoltar;

}
