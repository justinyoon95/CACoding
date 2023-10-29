package interface_adapter.clear_users;

// TODO Complete me
import interface_adapter.ViewModel;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel {

    private ClearState current_state = new ClearState();
    private final PropertyChangeSupport sup = new PropertyChangeSupport(this);
    public void firePropertyChanged() {
        sup.firePropertyChange("clear_state", null, this.current_state);
    }

    public void addPropertyChangeListener(PropertyChangeListener Lis){
        sup.addPropertyChangeListener(Lis);
    }
    public ClearViewModel(){
        super();
    }
    public void setState (ClearState current_state) {
        this.current_state = current_state;
    }

    public ClearState getState(){
        return current_state;
    }
}
