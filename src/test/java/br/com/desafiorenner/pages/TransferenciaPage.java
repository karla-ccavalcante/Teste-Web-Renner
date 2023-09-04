package br.com.desafiorenner.pages;

import br.com.desafiorenner.driver.Driver;
import br.com.desafiorenner.maps.TransferenciaMap;
import org.openqa.selenium.support.PageFactory;

public class TransferenciaPage {
    TransferenciaMap transferenciaMap;

    public TransferenciaPage() {
        transferenciaMap = new TransferenciaMap();
        PageFactory.initElements(Driver.getDriver(),transferenciaMap);
    }
    public void transferencia (String numeroConta, String digito, String valorTransferencia, String descricao){
        Driver.visibilityOf(transferenciaMap.inpAccountNumber);
       transferenciaMap.inpAccountNumber.sendKeys(numeroConta);
       transferenciaMap.inpDigito.sendKeys(digito);
       transferenciaMap.inpValordetranferencia.sendKeys(valorTransferencia);
       transferenciaMap.inpDescricao.sendKeys(descricao);
       transferenciaMap.btnTransferiragora.click();
    }
    public String getMsg(){
        Driver.visibilityOf(transferenciaMap.txtmodalText);
        String msg = transferenciaMap.txtmodalText.getText();
        transferenciaMap.btnFechar.click();
        transferenciaMap.btnVoltar.click();
        return msg;
    }
}
