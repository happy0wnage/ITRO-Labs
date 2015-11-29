package kture.entity;

/**
 * Created by Владислав on 01.10.2015.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "item",
        propOrder = {
                "model",
                "price",
                "manufacturer"
        })

public class Item {

    private String model;
    private double price;
    private Manufacturer manufacturer;

    @XmlElement(name = "price", required = true)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @XmlElement(name = "model", required = true)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @XmlElement(name = "manufacturer", required = true)
    public Manufacturer getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new Manufacturer();
        }
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
