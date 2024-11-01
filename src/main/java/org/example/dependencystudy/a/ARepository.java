package org.example.dependencystudy.a;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ARepository extends JpaRepository<A,Long> {

    Optional<A> findByBId(Long bId);
}
