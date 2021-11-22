package Sanity.BasicFLows.DocumentUpload;

public class Buttons {
    private String AccountMenuButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";
    private String accountSettingsButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.overflow-container > div.menuAccount__links-container > ul:nth-child(2) > li:nth-child(1) > button";
    private String SecureDocumentUploadButton ="#accountSections-itemid-7 > div:nth-child(2) > div:nth-child(1) > div > button";
    private String UploadDocumentField ="#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div.mwc-account-content-wrapper.ng-scope > mwc-doc-upload > div > div > div > div > mwc-doc-upload-form > form > div:nth-child(1) > div > div.mwc-file-upload-wrapper > ul > li > a";
    private String SubmitButton = "#mwc-root > div > div.mwc-widget.mwc-responsive > div > div.mwc-app-container__content > div.mwc-widget__body.ng-scope > div > div.mwc-account-content-wrapper.ng-scope > mwc-doc-upload > div > div > div > div > mwc-doc-upload-form > form > div.mwc-form-group.mwc-no-margin-bottom > div > button";

    public String getAccountMenuButton() {
        return AccountMenuButton;
    }

    public String getAccountSettingsButton() {
        return accountSettingsButton;
    }

    public String getSecureDocumentUploadButton() {
        return SecureDocumentUploadButton;
    }

    public String getUploadDocumentField() {
        return UploadDocumentField;
    }

    public String getSubmitButton() {
        return SubmitButton;
    }
}
