package Sanity.Regression.Iowa;

public class Buttons {

    private String LoginButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div > button.Button.WH__btn--login";//"#app > div > header > section > div > div.neoButtonsContainer > div > div > div > button.Button.WH__btn.WH__btn--secondary.neoGamesLogin.WH__btn--header";
    private String EmailFiled = "#user";
    private String PasswordField = "#password";
    private String SighnInButton = "#submit";
    private String MyAccountButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";
    private String DepositButton = ("#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--deposit");
    private String MyAccountVerify = (".myAccountLabel");
    private String WithdrawButton =("#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--withdraw");
    private String WithdrawMethodDropdown = "#dropdownMenu1";
    private String ConfirmWithdrawMethobOption = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > div > div.mwc-cashout-container-inside.mwc-b2.mwc-cashout-new-wrapper.ng-scope > div.mwc-cashout-new-content.mwc-b12.ng-scope > form > div:nth-child(1) > div > div > mwc-cashout-withdraw-method > div > div.mwc-apps-select-dropdown.mwc-dropdown.mwc-open > ul > li:nth-child(3)";
    private String ConfirmWithdrawButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > div > div.mwc-cashout-container-inside.mwc-b2.mwc-cashout-new-wrapper.ng-scope > div.mwc-cashout-new-content.mwc-b12.ng-scope > form > div:nth-child(4) > div > div > button.mwc-btn.mwc-f6.mwc-r.mwc-primary-button.mwc-w-60.mwc-form-control.mwc-push-right.mwc-cashout-new-request-submit-button.ng-binding";
    private String AmountToWithdrawField = "#amount";
    private String SuccessInWithdrawText = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > div > div > div.mwc-chashout-content-success > cashout-success-note-factory > mwc-cashout-success-note > div:nth-child(2) > div > p:nth-child(1) > span:nth-child(1)";
    private String CancelWithdrawButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > div > div > div:nth-child(3) > div:nth-child(4) > div > mwc-cashout-pending-request-item > div > div:nth-child(2) > div.mwc-col-xs-4.mwc-cashout-request-row-cancel-btn.mwc-f3.mwc-l.mwc-t2.ng-scope > div.mwc-col-xs-12.mwc-center > div";
    private String CancelWithdrawConfirmationButton = "body > div.mwc.ng-isolate-scope > div > div > div > div > div.mwc-modal-footer.ng-scope > div > div.mwc-row-fluid.mwc-center.mwc-popup-dialog-buttons > div > button";
    private String MyAccountWithdrawLoadMenuCheck = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__aside.mwc-b22.ng-scope > div > div > button";

    public String getMyAccountWithdrawLoadMenuCheck() {
        return MyAccountWithdrawLoadMenuCheck;
    }

    public String getCancelWithdrawConfirmationButton() {
        return CancelWithdrawConfirmationButton;
    }

    public String getCancelWithdrawButton() {
        return CancelWithdrawButton;
    }

    public String getSuccessInWithdrawText() {
        return SuccessInWithdrawText;
    }

    public String getAmountToWithdrawField() {
        return AmountToWithdrawField;
    }

    public String getConfirmWithdrawMethobOption() {
        return ConfirmWithdrawMethobOption;
    }

    public String getConfirmWithdrawButton() {
        return ConfirmWithdrawButton;
    }

    public String getWithdrawMethodDropdown() {
        return WithdrawMethodDropdown;
    }

    public String getWithdrawButton() {
        return WithdrawButton;
    }

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
