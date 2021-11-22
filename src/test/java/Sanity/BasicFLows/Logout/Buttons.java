package Sanity.BasicFLows.Logout;

public class Buttons {
    private String MyAccountButton = "#app > div > header > section > div > div.neoButtonsContainer > div > div > div.rowOne > button";
    private String logoutButton = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.overflow-container > div.menuAccount__links-container > ul:nth-child(2) > li:nth-child(6) > button";
    private String MenuNameField = "#app > div > div.Drawer.defaultSlideDrawer.account.bottom.open > div > div > div.menuAccount__funds-container > header > div > div > strong";
    public String getMyAccountButton() {
        return MyAccountButton;
    }

    public String getLogoutButton() {
        return logoutButton;
    }

    public String getMenuNameField() {
        return MenuNameField;
    }
}
