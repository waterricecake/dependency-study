package org.example.dependencystudy;

import org.assertj.core.api.Assertions;
import org.example.dependencystudy.a.A;
import org.example.dependencystudy.b.B;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DependencyStudyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void dipTest(){
        A a = new A();
        B b = new B(a);
        a.setB(b);

        Assertions.assertThat(a.getBval()).isEqualTo("B");
        Assertions.assertThat(b.getAval()).isEqualTo("A");
    }
}
