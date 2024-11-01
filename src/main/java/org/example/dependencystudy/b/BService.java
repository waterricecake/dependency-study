package org.example.dependencystudy.b;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BService {

    private final BRepository bRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public void changeVal(Long id, String val){
        B b = bRepository.findById(id).get();
        b.setVal(val);
        bRepository.save(b);
        applicationEventPublisher.publishEvent(new Bevent(b.getId(), val));
    }
}
