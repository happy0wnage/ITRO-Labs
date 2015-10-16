package kture.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владислав on 10/02/15.
 */
public class MobilePhone {

    private List<Phone> phoneList;

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
        return "MobilePhone{" +
                "phoneList=" + phoneList +
                '}';
    }
}
