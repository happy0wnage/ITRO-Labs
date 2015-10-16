package kture.entity;

import kture.entity.notUsed.Item;

import java.util.List;

/**
 * Created by Владислав on 01.10.2015.
 */
public class Device {

    private List<Item> items;

    @Override
    public String toString() {
        return "Device{" +
                "items=" + items +
                '}';
    }
}
