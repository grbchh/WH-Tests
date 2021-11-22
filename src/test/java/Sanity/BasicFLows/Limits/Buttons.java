package Sanity.BasicFLows.Limits;

import Start.URL;

public class Buttons {

    private String MyAccountButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";
    private String AccountSettingsButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.overflow-container > div.menuAccount__links-container > ul:nth-child(2) > li:nth-child(1) > button";
    private String GamingLimitsButton = "#accountSections-itemid-6 > div:nth-child(2) > div:nth-child(1)";

    private String DailyLimitDropDown = "#field-240";
    private String ApplyButton = "#gameLimit-form > div.mwc-form-group.mwc-row > div > button";
    private String ConfirmButton = "body > div.mwc.ng-isolate-scope > div > div > div > div > div.mwc-modal-footer.ng-scope > div > div.mwc-row-fluid.mwc-center.mwc-popup-dialog-buttons > div:nth-child(2) > button";
    private String CheckIfLimitsPageLoaded = "#gameLimit-form > div.mwc-game-limit-in-content > mwc-gaming-limit-section:nth-child(1) > div > div > div.section-title.ng-binding";
//    private String  = "";
//    private String  = "";



    public String getCheckIfLimitsPageLoaded() {
        return CheckIfLimitsPageLoaded;
    }

    public String getMyAccountButton() {
        return MyAccountButton;
    }

    public String getAccountSettingsButton() {
        return AccountSettingsButton;
    }

    public String getGamingLimitsButton() {
        return GamingLimitsButton;
    }

    public String getDailyLimitDropDown() {
        return DailyLimitDropDown;
    }

    public String getApplyButton() {
        return ApplyButton;
    }

    public String getConfirmButton() {
        return ConfirmButton;
    }
}
