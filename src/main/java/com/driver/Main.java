package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        r.setName("siddardha"); //name has private access so cant be used in another class
    }
  
}