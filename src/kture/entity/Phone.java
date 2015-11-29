package kture.entity;

import javax.xml.bind.annotation.*;

/**
 * Created by Владислав on 01.10.2015.
 */
@XmlType(name = "phone" , propOrder = {
        "simCardNumber",
        "screenSize",
        "resolution",
        "operationSystem"
})
public class Phone extends Item {

    private int idPhone;
    private int simCardNumber;
    private String screenSize;
    private String resolution;
    private String operationSystem;

    @XmlAttribute(name = "id", required = true)
    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    @XmlElement(name = "sim-card_number", required = true)
    public int getSimCardNumber() {
        return simCardNumber;
    }

    public void setSimCardNumber(int simCardNumber) {
        this.simCardNumber = simCardNumber;
    }

    @XmlElement(name = "screen_size", required = true)
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @XmlElement(name = "resolution", required = true)
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @XmlElement(name = "OS", required = true)
    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "idPhone=" + idPhone + ", " +
                super.toString() +
                ", simCardNumber=" + simCardNumber +
                ", screenSize='" + screenSize + '\'' +
                ", resolution='" + resolution + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
