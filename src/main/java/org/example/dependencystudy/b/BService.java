package org.example.dependencystudy.b;

import lombok.RequiredArgsConstructor;
import org.example.dependencystudy.a.A;
import org.example.dependencystudy.a.ARepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BService {

    private final ARepository aRepository;
    private final BRepository bRepository;

    public void changeVal(Long id, String val){
        A a = aRepository.findById(id).get();
        a.setVal(val);
        B b = bRepository.findById(id).get();
        b.setVal(val);
        aRepository.save(a);
        bRepository.save(b);
    }
}
