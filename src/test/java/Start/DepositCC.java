package Start;

import Info.Links;
import Sanity.BasicFLows.Login.Login;
import Sanity.CreditCardDeposit.Deposit;
import com.codeborne.selenide.Configuration;
import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DepositCC {
    Login login = new Login();
    Deposit cc = new Deposit();
    Links run = new Links();

    @Before
    public void StartUp() {
        Configuration.startMaximized = true;
//        Configuration.timeout = 60000;
        Configuration.holdBrowserOpen =  false;
        Configuration.screenshots = true;
        BasicConfigurator.configure();
    }

    @Test
    public void Deposit_CC_GPT_Arizona() {
        open(run.getArizonaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Colorado() {
        open(run.getColoradoGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Iowa() {
        open(run.getIaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Illinois() {
        open(run.getIlGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Tennesey() {
        open(run.getTennesseGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Virginia() {
        open(run.getVaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_NewJersey() {
        open(run.getNewJerseyGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Indiana() {
        open(run.getIndianaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_WestVirginia() {
        open(run.getWestVirginiaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Louisiana() {
        open(run.getLouisianaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Nevada() {
        open(run.getNevadaGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_NewYork() {
        open(run.getNewYorkGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Ontarion() {
        open(run.getOntarioGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Wyoming() {
        open(run.getWyomingGpt());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_GPT_Pensilvania() {
        open(run.getPaGpt());
        login.CClogin();
        cc.flow();
    }

    @Test
    public void Deposit_CC_CERT_Arizona() {
        open(run.getArizonaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Colorado() {
        open(run.getColoradoCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Iowa() {
        open(run.getIaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Illinois() {
        open(run.getIlCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Tennesey() {
        open(run.getTennesseCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Virginia() {
        open(run.getVaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_NewJersey() {
        open(run.getNewJerseyCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Indiana() {
        open(run.getIndianaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_WestVirginia() {
        open(run.getWestVirginiaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Louisiana() {
        open(run.getLouisianaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Nevada() {
        open(run.getNevadaCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_NewYork() {
        open(run.getNewYorkCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Ontarion() {
        open(run.getOntarioCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Wyoming() {
        open(run.getWyomingCert());
        login.CClogin();
        cc.flow();
    }
    @Test
    public void Deposit_CC_CERT_Pennsylvania() {
        open(run.getPennsylvaniaCert());
        login.CClogin();
        cc.flow();
    }
}

