package Start;

import Sanity.Regression.NewJersey.Withdraw;
import org.junit.Test;

public class RegressionGPT {
    Withdraw NewJersey = new Withdraw();
    Sanity.Regression.Indiana.Withdraw Indiana = new Sanity.Regression.Indiana.Withdraw();
    Sanity.Regression.Iowa.Withdraw Iowa = new Sanity.Regression.Iowa.Withdraw();
    Sanity.Regression.Nevada.Withdraw Nevada = new Sanity.Regression.Nevada.Withdraw();
    Sanity.Regression.NewYork.Withdraw NewYork = new Sanity.Regression.NewYork.Withdraw();
    Sanity.Regression.Colorado.Withdraw Colorado = new Sanity.Regression.Colorado.Withdraw();
    Sanity.Regression.Illinois.Withdraw Illinois = new Sanity.Regression.Illinois.Withdraw();
    Sanity.Regression.Lousiana.Withdraw Lousiana = new Sanity.Regression.Lousiana.Withdraw();
    Sanity.Regression.Michigan.Withdraw Michigan = new Sanity.Regression.Michigan.Withdraw();
    Sanity.Regression.Virginia.Withdraw Virginia = new Sanity.Regression.Virginia.Withdraw();
    Sanity.Regression.WestVirginia.Withdraw WestVirginia = new Sanity.Regression.WestVirginia.Withdraw();
    Sanity.Regression.Arizona.Withdraw Arizona = new Sanity.Regression.Arizona.Withdraw();




    @Test
    public void WithdrawNJ() {
        NewJersey.Withdraw();
    }

    @Test
    public void WithdrawIN() {
        Indiana.Withdraw();
    }

    @Test
    public void WithdrawIA() {
        Iowa.WithdrawIa();
    }

    @Test
    public void WithdrawNV() {
        Nevada.Withdraw();
    }

    @Test
    public void WithdrawCO() {
        Colorado.Withdraw();
    }

    @Test
    public void WithdrawIl() {
        Illinois.Withdraw();
    }

    @Test
    public void WithdrawLA() {
        Lousiana.Withdraw();
    }

    @Test
    public void WithdrawMI() {
        Michigan.Withdraw();
    }

    @Test
    public void WithdrawVA() {
        Virginia.Withdraw();
    }

    @Test
    public void WithdrawWV() {
        WestVirginia.WithdrawWV();
    }

    @Test
    public void WithdrawNY() {
        NewYork.Withdraw();
    }

    @Test
    public void WithdrawAZ() {
        Arizona.Withdraw();
    }
}
