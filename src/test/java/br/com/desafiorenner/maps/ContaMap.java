package br.com.desafiorenner.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContaMap {
    @FindBy (xpath = "//*[@id='__next']//div[2]/div[1]/a")
    public WebElement linkTransferencia;
    @FindBy(css = "#textBalance > span")
    public WebElement textSaldo;




}
