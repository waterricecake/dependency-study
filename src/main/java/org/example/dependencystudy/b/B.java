package org.example.dependencystudy.b;

import org.example.dependencystudy.a.A;

public class B {
    private A a;
    private final String val = "B";

    public String getVal(){
        return this.val;
    }
}
