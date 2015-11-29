package kture.entity;

/**
 * Created by Владислав on 22.10.2015.
 */
public enum OperationSystem {
    IOS("IOS"), ANDROID("Android"), WINDOWS("Windows"), BADA("Bada");

    private String type;

    OperationSystem(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
