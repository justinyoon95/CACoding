package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputData;

public class ClearState {
    private String emptied_users = "";
    public void setClearedUsers(ClearOutputData return_string){
        this.emptied_users =  return_string.getEmpty();
    }
    public String getClearedUsers(){
        return this.emptied_users;

    }
}
