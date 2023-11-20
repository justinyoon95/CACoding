package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputData;

public class ClearState {

    private String cleared_username = "";

    public String getClearedUsername() {
        return cleared_username;
    }
    public void setClearedUsername(ClearOutputData clearOutputData) {
        this.cleared_username = clearOutputData.getClearUsername();
    }
}
