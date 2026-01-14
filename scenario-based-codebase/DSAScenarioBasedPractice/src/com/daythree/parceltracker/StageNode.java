package com.daythree.parceltracker;

public class StageNode {

    String stageName;   // parcel stage name
    StageNode next;      // link to next stage

    public StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}