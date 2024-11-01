package org.example.dependencystudy.a;

import org.example.dependencystudy.b.B;

public class A {
    private B b;
    private final String val = "A";

    public String getVal(){
        return this.val;
    }
}
