package org.example.dependencystudy.a;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.dependencystudy.b.B;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class A  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "b_id")
    private B b;

    private String val;

    public void setBval(String val){
        this.b.setVal(val);
    }
}
