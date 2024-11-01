package org.example.dependencystudy.b;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.dependencystudy.a.A;

@Entity
@Getter
@Setter
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String val;

    public void setAVal(A a) {
        a.setBval(val);
    }
}
