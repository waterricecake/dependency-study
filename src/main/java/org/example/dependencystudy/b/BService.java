package org.example.dependencystudy.b;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BService {

    private final BRepository bRepository;

    @AspectAnnotation
    public void changeVal(Long id, String val){
        B b = bRepository.findById(id).get();
        b.setVal(val);
        bRepository.save(b);
    }
}
