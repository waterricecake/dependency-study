package org.example.dependencystudy.b;

public class B {
    private AInterface a;
    private final String val = "B";

    public B(AInterface a) {
        this.a = a;
    }

    public String getVal(){
        return this.val;
    }

    public String getAval(){
        return this.a.getVal();
    }
}
