package kture.entity;

import kture.entity.notUsed.Item;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Phone extends Item {

    private int simCardNumber;

    private String screenSize;

    private String resolution;

    private String operationSystem;

    public int getSimCardNumber() {
        return simCardNumber;
    }

    public void setSimCardNumber(int simCardNumber) {
        this.simCardNumber = simCardNumber;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "simCardNumber=" + simCardNumber +
                ", screenSize='" + screenSize + '\'' +
                ", resolution='" + resolution + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
