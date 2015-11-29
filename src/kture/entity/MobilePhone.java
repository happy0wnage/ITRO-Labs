package kture.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "mobile_phone")
public class MobilePhone {

    private List<Phone> phoneList;

    @XmlElement (name = "phone")
    public List<Phone> getPhoneList() {

        if(phoneList == null) {
            phoneList = new ArrayList<>();
        }
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Phone phone : phoneList) {
            sb.append(phone.toString()).append("\n");
        }
        return sb.toString();
    }
}
