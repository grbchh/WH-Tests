package Sanity.RegistrationUAT;

import com.codeborne.selenide.WebDriverRunner;

public class Buttons {
    private String regiButton = ".neoGamesRegister";
    private String firstNameField = "#firstname";
    private String lastNameField = "#lastName";
    private String emailField = "#email";
    private String GenderDropdown = "#gender";
    private String nextRegiStepButton = "button.mwc-primary-button:nth-child(1)";
    private String finishRegiButton = "button.mwc-primary-button:nth-child(1)";
    private String passwordField = "#password";
    private String securityQuestionField1 = "#answerSecurityQs0";
    private String securityQuestionField2 = "#answerSecurityQs1";
    private String ssnField = "#PersonNationalID";
    private String adressField = "#address";
    private String birthdayMonthDropdown = "#birthdayMonth";
    private String birthdayDayDropdown = "#birthdayDay";
    private String birthdayYearDropdown = "#birthdayYear";
    private String cellPhoneField = "#cellPhone";
    private String securityQuestionDropdown1 = "div.mwc-security-questions-row:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(6)";
    private String securityQuestionDropdown2 = "select.ng-empty > option:nth-child(8)";
    private String cityField = "#city";
    private String zipCodeField = "#zipCode";
    private String agreementCheckbox1 = "mwc-reg-terms-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)";
    private String agreementCheckbox2 = "mwc-reg-personal-info.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)";
    private String agreementCheckbox3 = "mwc-min-age-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)";
    private String agreementCheckbox4 = "mwc-privacy-policy-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)";
    private String AfterRegiDepositButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__footer.ng-scope > div > mwc-reg-step3-footer-area-wh > div > div > button";
    private String AfterRegiUnactiveDocUploadButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div > div.mwc-wh-limited-account-content > div > mwc-upload-document-wrapper > div > mwc-doc-upload > div > div > div > div > mwc-doc-upload-form > form > div.mwc-form-group.mwc-no-margin-bottom > div";
    private String BackButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__footer.ng-scope > div > mwc-reg-step2-footer-web-default > div > mwc-reg-first-step-link > div > button";
    private String FinishRegiErrorText = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div.mwc-reg-wizard > div.mwc-reg-content.ng-scope > div > div > p > span";
    private String LoadingScreenAfterSubmitBtn = "#loadingLogo > img";
    private String IDTypeDropdown = "#registration-form > div > mwc-registration-inputs-order > mwc-reg-document > div > div > div:nth-child(1) > div > select";
    //Driving license
    private String DrivingLicenseNumberField = "#documentNumber";
    private String IDExpiresDayDropdown = "#registration-form > div > mwc-registration-inputs-order > mwc-reg-document > div > div > div.mwc-form-group.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required.ng-valid-valid-date.ng-valid-min.ng-valid-max > div > div:nth-child(3) > select";
    private String IDExpiresMonthDropdown = "#registration-form > div > mwc-registration-inputs-order > mwc-reg-document > div > div > div.mwc-form-group.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required.ng-valid-valid-date.ng-valid-min.ng-valid-max > div > div:nth-child(2) > select";
    private String IDExpiresYearDropdown = "#registration-form > div > mwc-registration-inputs-order > mwc-reg-document > div > div > div.mwc-form-group.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required.ng-valid-valid-date.ng-valid-min.ng-valid-max > div > div:nth-child(4) > select";
    private String DriverLicenseStateDropdown = "<select class=\"mwc-form-control mwc-selectpicker mwc-f4 mwc-r mwc-t3 ng-pristine ng-valid ng-not-empty ng-valid-required ng-touched\" name=\"DocumentIssuePlace\" data-mwc-img=\"\" type=\"background\" mwcsrc=\"dropdown.png\" ng-model=\"$ctrl.model.DocumentIssuePlace\" ng-options=\"state.Code as state.Code for state in $ctrl.states\" ng-required=\"true\" style=\"background-image: url(&quot;https://download.neo.il.us.gpt.williamhill-test.com/secure/MWC/2022.01_509006/assets/base/dropdown.png?bid=509006&quot;);\" required=\"required\"><option label=\"AL\" value=\"string:AL\">AL</option><option label=\"AK\" value=\"string:AK\">AK</option><option label=\"AZ\" value=\"string:AZ\">AZ</option><option label=\"AR\" value=\"string:AR\">AR</option><option label=\"CA\" value=\"string:CA\">CA</option><option label=\"CO\" value=\"string:CO\">CO</option><option label=\"CT\" value=\"string:CT\">CT</option><option label=\"DE\" value=\"string:DE\">DE</option><option label=\"FL\" value=\"string:FL\">FL</option><option label=\"GA\" value=\"string:GA\">GA</option><option label=\"HI\" value=\"string:HI\">HI</option><option label=\"ID\" value=\"string:ID\">ID</option><option label=\"IL\" value=\"string:IL\">IL</option><option label=\"IN\" value=\"string:IN\">IN</option><option label=\"IA\" value=\"string:IA\">IA</option><option label=\"KS\" value=\"string:KS\">KS</option><option label=\"KY\" value=\"string:KY\">KY</option><option label=\"LA\" value=\"string:LA\">LA</option><option label=\"ME\" value=\"string:ME\">ME</option><option label=\"MD\" value=\"string:MD\">MD</option><option label=\"MA\" value=\"string:MA\">MA</option><option label=\"MI\" value=\"string:MI\">MI</option><option label=\"MN\" value=\"string:MN\">MN</option><option label=\"MS\" value=\"string:MS\">MS</option><option label=\"MO\" value=\"string:MO\">MO</option><option label=\"MT\" value=\"string:MT\">MT</option><option label=\"NE\" value=\"string:NE\">NE</option><option label=\"NV\" value=\"string:NV\" selected=\"selected\">NV</option><option label=\"NH\" value=\"string:NH\">NH</option><option label=\"NJ\" value=\"string:NJ\">NJ</option><option label=\"NM\" value=\"string:NM\">NM</option><option label=\"NY\" value=\"string:NY\">NY</option><option label=\"NC\" value=\"string:NC\">NC</option><option label=\"ND\" value=\"string:ND\">ND</option><option label=\"OH\" value=\"string:OH\">OH</option><option label=\"OK\" value=\"string:OK\">OK</option><option label=\"OR\" value=\"string:OR\">OR</option><option label=\"PA\" value=\"string:PA\">PA</option><option label=\"RI\" value=\"string:RI\">RI</option><option label=\"SC\" value=\"string:SC\">SC</option><option label=\"SD\" value=\"string:SD\">SD</option><option label=\"TN\" value=\"string:TN\">TN</option><option label=\"TX\" value=\"string:TX\">TX</option><option label=\"UT\" value=\"string:UT\">UT</option><option label=\"VT\" value=\"string:VT\">VT</option><option label=\"VA\" value=\"string:VA\">VA</option><option label=\"WA\" value=\"string:WA\">WA</option><option label=\"DC\" value=\"string:DC\">DC</option><option label=\"WV\" value=\"string:WV\">WV</option><option label=\"WI\" value=\"string:WI\">WI</option><option label=\"WY\" value=\"string:WY\">WY</option></select>";
    private String AfterRegiContentField = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope";

    private String StateSelector = "#registration-form > div > mwc-registration-inputs-order > mwc-reg-address-wh > div.mwc-reg-form-field.ng-scope > div > div > select";

    public String getStateSelector() {
        return StateSelector;
    }

    public String getAfterRegiContentField() {
        return AfterRegiContentField;
    }

    public String getIDTypeDropdown() {
        return IDTypeDropdown;
    }

    public String getDrivingLicenseNumberField() {
        return DrivingLicenseNumberField;
    }

    public String getIDExpiresDayDropdown() {
        return IDExpiresDayDropdown;
    }

    public String getIDExpiresMonthDropdown() {
        return IDExpiresMonthDropdown;
    }

    public String getIDExpiresYearDropdown() {
        return IDExpiresYearDropdown;
    }

    public String getDriverLicenseStateDropdown() {
        return DriverLicenseStateDropdown;
    }

    public String getLoadingScreenAfterSubmitBtn() {
        return LoadingScreenAfterSubmitBtn;
    }

    public String getFinishRegiErrorText() {
        return FinishRegiErrorText;
    }

    public String getRegiButton() {
        return regiButton;
    }

    public String getFirstNameField() {
        return firstNameField;
    }

    public String getLastNameField() {
        return lastNameField;
    }

    public String getEmailField() {
        return emailField;
    }

    public String getNextRegiStepButton() {
        return nextRegiStepButton;
    }

    public String getFinishRegiButton() {
        return finishRegiButton;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public String getSecurityQuestionField1() {
        return securityQuestionField1;
    }

    public String getSecurityQuestionField2() {
        return securityQuestionField2;
    }

    public String getSsnField() {
        return ssnField;
    }

    public String getAdressField() {
        return adressField;
    }

    public String getBirthdayMonthDropdown() {
        return birthdayMonthDropdown;
    }

    public String getBirthdayDayDropdown() {
        return birthdayDayDropdown;
    }

    public String getBirthdayYearDropdown() {
        return birthdayYearDropdown;
    }

    public String getCellPhoneField() {
        return cellPhoneField;
    }

    public String getSecurityQuestionDropdown1() {
        return securityQuestionDropdown1;
    }

    public String getSecurityQuestionDropdown2() {
        return securityQuestionDropdown2;
    }

    public String getCityField() {
        return cityField;
    }

    public String getZipCodeField() {
        return zipCodeField;
    }

    public String getAgreementCheckbox1() {
        return agreementCheckbox1;
    }

    public String getAgreementCheckbox2() {
        return agreementCheckbox2;
    }

    public String getAgreementCheckbox3() {
        return agreementCheckbox3;
    }

    public String getAgreementCheckbox4() {
        return agreementCheckbox4;
    }

    public String getAfterRegiDepositButton() {
        return AfterRegiDepositButton;
    }

    public String getAfterRegiUnactiveDocUploadButton() {
        return AfterRegiUnactiveDocUploadButton;
    }

    public String getBackButton() {
        return BackButton;
    }

    public String getGenderDropdown() {
        return GenderDropdown;
    }
}
