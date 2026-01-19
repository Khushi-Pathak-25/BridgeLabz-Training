package com.generics.smartwarehouse;

import java.util.List;

public class WarehouseUtil {

    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}
