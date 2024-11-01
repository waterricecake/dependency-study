package org.example.dependencystudy.a;

import lombok.RequiredArgsConstructor;
import org.example.dependencystudy.b.Bevent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AEventListener {

    private final ARepository aRepository;

    @EventListener
    public void listenBevent(Bevent bevent) {
        A a = aRepository.findById(bevent.getId()).get();
        a.setVal(bevent.getVal());
        aRepository.save(a);
    }
}
