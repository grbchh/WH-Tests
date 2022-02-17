package Sanity.CreditCardDeposit;

public class Buttons {
    private String AccountMenuButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";

    private String DepositButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--deposit";


    private String ViewAllDepositsMethodsButton = "#paymentForm > mwc-cashier-payment-list-link > div > a";
    private String SafeAndSecureElement = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > mwc-cashier-safe-and-secure-bar > div > span.ng-binding";
    private String ChooseDepositMethodButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > mwc-cashier-list > div > div > mwc-cashier-list-item:nth-child(2)";

    private String CheckIfNoCardAddedBeforeField = "#mwc-dropdown-header-txt-description > span";
    private String DeleteExistingCardsCredsButton = "#paymentForm > div.mwc-cashier-payment-action-container.ng-scope > mwc-cashier-payment-details > mwc-cashier-details-bycredit > div > div > mwc-cashier-credit-card-bycredit-dropdown > div > a";
    private String ConfirmDeletingCardCredsButton = "body > div.mwc.ng-isolate-scope > div > div > div > div > div.mwc-modal-footer.ng-scope > div > div.mwc-row-fluid.mwc-center.mwc-popup-dialog-buttons > div:nth-child(2) > button";

    private String NameOnCardField = "#AccountName";
    private String CardNumberField = "#AccountNo";
    private String ExpirationMonthDropdown = "#ExpirationMonth";
    private String expirationYearDropdown = "#ExpirationYear";
    private String cvvField = "#Authentication";

    private String AmountField = "#Amount";
    private String SubmitDepositFormButton = "#submitDepositForm";

    private String SummarySubmitDepositFormButton = "#summarySubmitDepositForm";
    private String finishHeader = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__header.ng-scope > mwc-header-web > div > div.mwc-header-web__title > div";

    ////////Getters


    public String getAccountMenuButton() {
        return AccountMenuButton;
    }

    public String getDepositButton() {
        return DepositButton;
    }

    public String getDeleteExistingCardsCredsButton() {
        return DeleteExistingCardsCredsButton;
    }

    public String getConfirmDeletingCardCredsButton() {
        return ConfirmDeletingCardCredsButton;
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

    public String getNameOnCardField() {
        return NameOnCardField;
    }

    public String getCardNumberField() {
        return CardNumberField;
    }

    public String getExpirationMonthDropdown() {
        return ExpirationMonthDropdown;
    }

    public String getExpirationYearDropdown() {
        return expirationYearDropdown;
    }

    public String getCvvField() {
        return cvvField;
    }

    public String getAmountField() {
        return AmountField;
    }

    public String getSubmitDepositFormButton() {
        return SubmitDepositFormButton;
    }

    public String getSummarySubmitDepositFormButton() {
        return SummarySubmitDepositFormButton;
    }

    public String getSafeAndSecureElement() {
        return SafeAndSecureElement;
    }

    public String getFinishHeader() {
        return finishHeader;
    }

}

