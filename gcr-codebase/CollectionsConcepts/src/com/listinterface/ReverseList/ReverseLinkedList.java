package com.listinterface.ReverseList;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedList<Integer> reversedList = new LinkedList<>();

        for (Integer num : list) {
            reversedList.addFirst(num); //[1]->[2,1]->[3,2,1]..
        }

        System.out.println(reversedList);
    }
}
