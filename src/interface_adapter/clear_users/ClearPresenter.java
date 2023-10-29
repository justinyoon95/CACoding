package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }
    public void prepareClearView(ClearOutputData return_string){
        ClearState clearstate = clearViewModel.getState();
        clearstate.setClearedUsers(return_string);
        clearViewModel.firePropertyChanged();
    }
}
