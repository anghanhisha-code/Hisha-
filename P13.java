package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    // Constructor
    public A(int pubVar, int protVar, int privVar) {
        this.pubVar = pubVar;
        this.protVar = protVar;
        this.privVar = privVar;
    }

    // Getter for private variable
    public int getPrivVar() {
        return privVar;


      package bpack;

import apack.A;

public class B extends A {

    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("Inside Class B (Subclass)");

        // Accessible: public and protected
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);

        // Not accessible directly: private
        // System.out.println(privVar); // ❌ ERROR

        // Access private using getter
        System.out.println("Private Variable (via getter): " + getPrivVar());
    }
}
    }
}



package cpack;

import apack.A;

public class C {

    public void display() {
        System.out.println("Inside Class C (Non-Subclass)");

        A obj = new A(10, 20, 30);

        // Accessible: only public
        System.out.println("Public Variable: " + obj.pubVar);

        // Not accessible: protected (outside package, no inheritance)
        // System.out.println(obj.protVar); // ❌ ERROR

        // Not accessible: private
        // System.out.println(obj.privVar); // ❌ ERROR

        // Access private via getter
        System.out.println("Private Variable (via getter): " + obj.getPrivVar());
    }
}
