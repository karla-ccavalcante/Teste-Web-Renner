package br.com.desafiorenner.pages;

import br.com.desafiorenner.driver.Driver;
import br.com.desafiorenner.maps.RegistrarMap;
import org.openqa.selenium.support.PageFactory;

public class RegistrarPage {
    RegistrarMap registrarMap;

    public RegistrarPage() {
        registrarMap = new RegistrarMap();
        PageFactory.initElements(Driver.getDriver(),registrarMap);
    }
    public void cadastrarConta(String email, String nome, String senha, String confirmacaoSenha){
        registrarMap.inpEmail.clear();
        registrarMap.inpName.clear();
        registrarMap.inpPassword.clear();
        registrarMap.inpPasswordConfirmation.clear();

        registrarMap.inpEmail.sendKeys(email);
        registrarMap.inpName.sendKeys(nome);
        registrarMap.inpPassword.sendKeys(senha);
        registrarMap.inpPasswordConfirmation.sendKeys(confirmacaoSenha);
        registrarMap.inpSaldo.click();
        registrarMap.inpCadastrar.click();
    }

    public String getConta(){
        Driver.visibilityOf(registrarMap.inpModalRegistro);
        String[] textoConta = registrarMap.inpModalRegistro.getText().split(" ");
        registrarMap.btnFechar.click();
        return textoConta[2];
    }



}
