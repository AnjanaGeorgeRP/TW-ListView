package com.myapplicationdev.android.tw_listview;

public class Module {
    private String name;
    private boolean programming;

    public Module(String name, boolean programming) {
        this.name = name;
        this.programming = programming;
    }
    public String getName(){
        return name;
    }
    public boolean isProgramming(){
        return programming;
    }
}
