package br.com.desafiorenner.testes;

import br.com.desafiorenner.driver.Driver;
import br.com.desafiorenner.enums.Browser;
import br.com.desafiorenner.pages.ContaPage;
import br.com.desafiorenner.pages.PrincipalPage;
import br.com.desafiorenner.pages.RegistrarPage;
import br.com.desafiorenner.pages.TransferenciaPage;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferenciaTest {
    static ContaPage contaPage;
    static PrincipalPage principalPage;
    static RegistrarPage registrarPage;
    static TransferenciaPage transferenciaPage;

    @BeforeAll
    public static void inicializaTest() {
        new Driver(Browser.CHROME);
        contaPage = new ContaPage();
        principalPage = new PrincipalPage();
        registrarPage = new RegistrarPage();
        transferenciaPage = new TransferenciaPage();
        Driver.getDriver().get("https://bugbank.netlify.app/");
    }

    @AfterAll
    public static void finalizaTeste(){
        Driver.getDriver().quit();
    }


    @Test
    @DisplayName("Realizar transferencia de saldo")
    public void realizarTranferencia() {
        registrarConta("teste@teste.com", "KarlaCavalcante");
        String conta2 = registrarConta("teste@teste2.com", "CavalcanteKarla");

        principalPage.realizarLogin("teste@teste.com", "teste123");
        String[] dadosconta = conta2.split("-");
        contaPage.clicktTransferencia();
        transferenciaPage.transferencia(dadosconta[0], dadosconta[1], "100", "teste");
        assertEquals("Transferencia realizada com sucesso",transferenciaPage.getMsg());
        assertEquals("900,00",contaPage.getSaldo());
    }

    private static String registrarConta(String email, String KarlaCavalcante) {
        principalPage.clickRegistrar();
        registrarPage.cadastrarConta(email, KarlaCavalcante,
                "teste123", "teste123");
        return registrarPage.getConta();
    }
}
