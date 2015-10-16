package kture.entity.notUsed;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Keyboard extends Peripherial{

    private boolean usbPort;

    private boolean touchpad;

    private boolean lightning;

    public boolean isUsbPort() {
        return usbPort;
    }

    public void setUsbPort(boolean usbPort) {
        this.usbPort = usbPort;
    }

    public boolean isTouchpad() {
        return touchpad;
    }

    public void setTouchpad(boolean touchpad) {
        this.touchpad = touchpad;
    }

    public boolean isLightning() {
        return lightning;
    }

    public void setLightning(boolean lightning) {
        this.lightning = lightning;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "usbPort=" + usbPort +
                ", touchpad=" + touchpad +
                ", lightning=" + lightning +
                '}';
    }
}
