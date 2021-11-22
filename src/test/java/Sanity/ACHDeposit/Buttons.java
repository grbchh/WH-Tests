package Sanity.ACHDeposit;

public class Buttons {
    private String AccountMenuButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";

    private String DepositButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > div.menuAccount__funds__grid-container > button.Button.WH__btn.WH__btn--deposit";

    private String ViewAllDepositsMethodsButton = "#paymentForm > mwc-cashier-payment-list-link > div";
    private String ChooseDepositMethodButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > mwc-cashier-list > div > div > mwc-cashier-list-item:nth-child(3)";

    private String SafeAndSecureElement = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > mwc-cashier-safe-and-secure-bar > div > span.ng-binding";
    private String CheckIfNoAddedBeforeField = "#mwc-dropdown-header-txt-description > span";
    private String DeleteExistingCardsCredsButton = "#paymentForm > div.mwc-cashier-payment-action-container.ng-scope > mwc-cashier-payment-details > mwc-cashier-details-bycredit > div > div > mwc-cashier-credit-card-bycredit-dropdown > div > a";
    private String ConfirmDeletingCardCredsButton = "body > div.mwc.ng-isolate-scope > div > div > div > div > div.mwc-modal-footer.ng-scope > div > div.mwc-row-fluid.mwc-center.mwc-popup-dialog-buttons > div:nth-child(2) > button";

    private String RoutingNumberField = "#RoutingNo";
    private String AccountNumber = "#AccountNo";
    private String SsnField1 = "div.mwc-col-xs-6:nth-child(2) > input:nth-child(1)";
    private String SsnField2 = "div.mwc-col-xs-6:nth-child(4) > input:nth-child(1)";
    private String DriverLicenseStateDropdown = "#DocumentIssuePlace";
    private String DriverLicenseField = "#DriverLicense";
    private String DepositAmountField =  "#Amount";
    private String agreementCheckbox = "mwc-checkbox.ng-invalid > label:nth-child(1) > i:nth-child(2)";

    private String ContinueButton = "#paymentForm > mwc-cashier-payment-buttons";

    private String SubmitButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > mwc-cashier-summary > form > mwc-cashier-summary-payment-buttons";

    private String DepositMenuAppearCheckHeader = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__header.ng-scope > mwc-header-web > div > div.mwc-header-web__title > div";
    /* / Getters */

    public String getAccountMenuButton() {
        return AccountMenuButton;
    }

    public String getDepositButton() {
        return DepositButton;
    }
    public String getViewAllDepositsMethodsButton() {
        return ViewAllDepositsMethodsButton;
    }
    public String getChooseDepositMethodButton() {
        return ChooseDepositMethodButton;
    }
    public String getCheckIfNoAddedBeforeField() {
        return CheckIfNoAddedBeforeField;
    }
    public String getDeleteExistingCardsCredsButton() {
        return DeleteExistingCardsCredsButton;
    }
    public String getConfirmDeletingCardCredsButton() {
        return ConfirmDeletingCardCredsButton;
    }
    public String getRoutingNumberField() {
        return RoutingNumberField;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public String getSsnField1() {
        return SsnField1;
    }
    public String getSsnField2() {
        return SsnField2;
    }
    public String getDriverLicenseStateDropdown() {
        return DriverLicenseStateDropdown;
    }
    public String getDriverLicenseField() {
        return DriverLicenseField;
    }
    public String getDepositAmountField() {
        return DepositAmountField;
    }
    public String getAgreementCheckbox() {
        return agreementCheckbox;
    }
    public String getContinueButton() {
        return ContinueButton;
    }
    public String getDepositMenuAppearCheckHeader() {
        return DepositMenuAppearCheckHeader;
    }
    public String getSubmitButton() {
        return SubmitButton;
    }
    public String getSafeAndSecureElement() {
        return SafeAndSecureElement;
    }
}
