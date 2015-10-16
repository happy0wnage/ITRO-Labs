package kture.entity.notUsed;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Mouse extends Peripherial{

    private int dpi;

    private int keys_number;

    private String type;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getKeys_number() {
        return keys_number;
    }

    public void setKeys_number(int keys_number) {
        this.keys_number = keys_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "dpi=" + dpi +
                ", keys_number=" + keys_number +
                ", type='" + type + '\'' +
                '}';
    }
}
