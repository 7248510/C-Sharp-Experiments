package com.company;

public class Main {
    public static void callMainS()
    {
        System.out.println("This is static test from main");
    }
    public void callMainNS()
    {
        System.out.println("This is non static test from main");
    }
    public static void main(String[] args) {
	    System.out.println("Hello World!\nWe are now learning Java using OPENJDK 16");
        test.testCall();
        test hello = new test(); //Really similar to C++ minus the new keyword
        //W3 schools states(paraphrasing) that the static keyword allows functions to be called without creating objects or ^
        hello.access();
        callMainS();
        //callMainNS(); //This function cannot be called due to it not being static. It needs an object
        Main getNS = new Main();
        getNS.callMainNS();
        test.CallMe();
    }
}