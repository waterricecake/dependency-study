package org.example.dependencystudy.b;

import org.example.dependencystudy.a.A;

public class B {
    private A a;
    private final String val = "B";

    public B(A a) {
        this.a = a;
    }

    public String getVal(){
        return this.val;
    }

    public String getAval(){
        return this.a.getVal();
    }
}
