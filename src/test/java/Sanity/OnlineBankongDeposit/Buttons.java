package Sanity.OnlineBankongDeposit;

public class Buttons {

    private String DepositButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button.Button.WH__btn.WH__btn--secondary.depositButton.WH__btn--header";

    private String AccountMenuButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";

    private String ViewAllDepositsMethodsButton = "#paymentForm > mwc-cashier-payment-list-link > div";
    private String SafeAndSecureElement = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > mwc-cashier-safe-and-secure-bar > div > span.ng-binding";
    private String ChooseDepositMethodButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > mwc-cashier-list > div > div > mwc-cashier-list-item:nth-child(2)";

    private String CheckIfNoCardAddedBeforeField = "#mwc-dropdown-header-txt-description > span";
    private String DeleteExistingCardsCredsButton = "#paymentForm > div.mwc-cashier-payment-action-container.ng-scope > mwc-cashier-payment-details > mwc-cashier-details-bycredit > div > div > mwc-cashier-credit-card-bycredit-dropdown > div > a";
    private String ConfirmDeletingCardCredsButton = "body > div.mwc.ng-isolate-scope > div > div > div > div > div.mwc-modal-footer.ng-scope > div > div.mwc-row-fluid.mwc-center.mwc-popup-dialog-buttons > div:nth-child(2) > button";


    private String SearchBankFieldByName = "bank-list-search-input";
    private String DemoBankButtonById = "fic-200005501";
    private String DemoBankButton = "#grid-bankListItems > div > div:nth-child(1)";

    private String UserFieldByName = "username";
    private String PassFieldById = "lbx-formAuthenticate-inputpassword";
    private String ContiniueButton1 = "#lbx-formLogin-submit";
    private String ContiniueButton2 = "#lbx-accountList-submit";
    private String ContiniueButton3 = "#submitDepositForm";
    private String FinishHeader = ".mwc-cashier-success-receipt-panel-title";
    private String depositButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--primary";
    private String myAccountButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button.Button.WH__btn.WH__btn--gradient.neoGamesAccount.WH__btn--header";


    public String getDepositButton() {
        return DepositButton;
    }

    public String getMyAccountButton() {
        return myAccountButton;
    }

    public String getViewAllDepositsMethodsButton() {
        return ViewAllDepositsMethodsButton;
    }

    public String getChooseDepositMethodButton() {
        return ChooseDepositMethodButton;
    }

    public String getCheckIfNoCardAddedBeforeField() {
        return CheckIfNoCardAddedBeforeField;
    }

    public String getDeleteExistingCardsCredsButton() {
        return DeleteExistingCardsCredsButton;
    }

    public String getConfirmDeletingCardCredsButton() {
        return ConfirmDeletingCardCredsButton;
    }

    public String getSearchBankFieldByName() {
        return SearchBankFieldByName;
    }

    public String getDemoBankButtonById() {
        return DemoBankButtonById;
    }

    public String getDemoBankButton() {
        return DemoBankButton;
    }

    public String getUserFieldByName() {
        return UserFieldByName;
    }

    public String getPassFieldById() {
        return PassFieldById;
    }

    public String getContiniueButton1() {
        return ContiniueButton1;
    }

    public String getContiniueButton2() {
        return ContiniueButton2;
    }

    public String getContiniueButton3() {
        return ContiniueButton3;
    }

    public String getFinishHeader() {
        return FinishHeader;
    }

    public String getSafeAndSecureElement() {
        return SafeAndSecureElement;
    }

    public String getAccountMenuButton() {
        return AccountMenuButton;
    }
}
