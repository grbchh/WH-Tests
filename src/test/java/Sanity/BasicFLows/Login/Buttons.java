package Sanity.BasicFLows.Login;

public class Buttons {

    private String LoginButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div > button.Button.WH__btn--login";//"#app > div > header > section > div > div.neoButtonsContainer > div > div > div > button.Button.WH__btn.WH__btn--secondary.neoGamesLogin.WH__btn--header";
    private String EmailFiled = "#user";
    private String PasswordField = "#password";
    private String SighnInButton = "#submit";
    private String MyAccountButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";
    private String DepositButton = ("#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--deposit");
    private String MyAccountVerify = (".myAccountLabel");

    public String getLoginButton() {
        return LoginButton;
    }

    public String getEmailFiled() {
        return EmailFiled;
    }

    public String getPasswordField() {
        return PasswordField;
    }

    public String getSighnInButton() {
        return SighnInButton;
    }

    public String getDepositButton() {
        return DepositButton;
    }

    public String getMyAccountVerify() {
        return MyAccountVerify;
    }

    public String getMyAccountButton() {
        return MyAccountButton;
    }
}
