package kture.entity;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Manufacturer {

    private int idManufacturer;

    private String name;

    private int founded;

    private String industry;

    private String country;

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

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
