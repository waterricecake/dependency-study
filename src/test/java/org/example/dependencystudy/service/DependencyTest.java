package org.example.dependencystudy.service;

import org.assertj.core.api.Assertions;
import org.example.dependencystudy.a.A;
import org.example.dependencystudy.a.ARepository;
import org.example.dependencystudy.b.B;
import org.example.dependencystudy.b.BRepository;
import org.example.dependencystudy.b.BService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DependencyTest {

    @Autowired
    private BService bservice;

    @Autowired
    private ARepository aRepository;

    @Autowired
    private BRepository bRepository;

    @Test
    void testWithBiDependency(){
        // given
        final String expect = "expect";
        A a = new A();
        B b = new B();
        a.setB(b);
        b = bRepository.save(b);
        a = aRepository.save(a);

        // when
        bservice.changeVal(b.getId(), expect);
        A aActual = aRepository.findById(a.getId()).get();
        B bActual = bRepository.findById(b.getId()).get();

        // then
        Assertions.assertThat(aActual.getVal()).isEqualTo(expect);
        Assertions.assertThat(bActual.getVal()).isEqualTo(expect);
    }
}
