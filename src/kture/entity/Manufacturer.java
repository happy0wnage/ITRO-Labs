package kture.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Владислав on 01.10.2015.
 */

@XmlType(name = "manufacturer", propOrder = {
        "name",
        "founded",
        "industry",
        "country"
})
public class Manufacturer {

    private int idManufacturer;

    private String name;

    private int founded;

    private String industry;

    private String country;

    @XmlAttribute(name = "id", required = true)
    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "founded")
    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    @XmlElement(name = "industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "idManufacturer=" + idManufacturer +
                ", name='" + name + '\'' +
                ", founded=" + founded +
                ", industry='" + industry + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
