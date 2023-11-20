package use_case.clear_users;

import entity.UserFactory;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearOutputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
        this.clearOutputBoundary = clearOutputBoundary;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(this.clearUserDataAccessObject.clearUsers());
        clearOutputBoundary.prepareSuccessView(clearOutputData);
    }
}