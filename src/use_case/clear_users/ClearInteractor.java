package use_case.clear_users;

import entity.UserFactory;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(this.userDataAccessObject.clear_all());
        userPresenter.prepareClearView(clearOutputData);

    }

}
