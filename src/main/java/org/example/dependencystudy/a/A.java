package org.example.dependencystudy.a;

import org.example.dependencystudy.b.AInterface;
import org.example.dependencystudy.b.B;

public class A implements AInterface {
    private B b;
    private final String val = "A";

    public void setB(B b) {
        this.b = b;
    }

    public String getVal(){
        return this.val;
    }

    public String getBval(){
        return this.b.getVal();
    }
}
