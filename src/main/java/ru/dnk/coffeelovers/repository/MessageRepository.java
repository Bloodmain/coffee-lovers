package ru.dnk.coffeelovers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dnk.coffeelovers.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
