package kture.entity.notUsed;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Peripherial extends Item {

    private String interfaceType;

    private String connectionType;

    private String appointment;

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Peripherial{" +
                "interfaceType='" + interfaceType + '\'' +
                ", connectionType='" + connectionType + '\'' +
                ", appointment='" + appointment + '\'' +
                '}';
    }
}
