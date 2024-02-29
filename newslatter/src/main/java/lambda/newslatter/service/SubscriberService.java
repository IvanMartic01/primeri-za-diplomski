package lambda.newslatter.service;

import jakarta.annotation.PostConstruct;
import lambda.newslatter.model.Subscriber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {

    private Collection<Subscriber> subscribers = new ArrayList<>();
    private AtomicInteger id = new AtomicInteger(0);

    @PostConstruct
    public void init() {
        subscribers.add(new Subscriber(id.getAndIncrement(), "pera@email.com"));
    }

    public Collection<Subscriber> findAll() {
        return subscribers;
    }

    public void create(String email) {
        subscribers.add(new Subscriber(id.getAndIncrement(), email));
    }
}
