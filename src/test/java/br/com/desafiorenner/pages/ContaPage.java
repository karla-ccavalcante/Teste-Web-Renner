package br.com.desafiorenner.pages;

import br.com.desafiorenner.driver.Driver;
import br.com.desafiorenner.maps.ContaMap;
import org.openqa.selenium.support.PageFactory;

public class ContaPage {
    ContaMap contaMap;

    public ContaPage() {
        contaMap = new ContaMap();
        PageFactory.initElements(Driver.getDriver(), contaMap);
    }
    public void clicktTransferencia(){
        Driver.visibilityOf(contaMap.linkTransferencia);
        contaMap.linkTransferencia.click();
    }
    public String getSaldo(){
       Driver.visibilityOf(contaMap.textSaldo);
       String[] saldo = contaMap.textSaldo.getText().split("R\\$ ");
       return saldo[1];
    }

}
