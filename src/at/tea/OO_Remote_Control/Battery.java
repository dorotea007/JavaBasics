package at.tea.OO_Remote_Control;

public class Battery {
    private int status;

    public Battery(int status){
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
