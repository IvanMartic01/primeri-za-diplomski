package lambda.newslatter.functions;

import lambda.newslatter.model.Subscriber;
import lambda.newslatter.service.SubscriberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;

@RequiredArgsConstructor
@Configuration
public class Subscribers {

    private final SubscriberService subscriberService;

    @Bean
    public Supplier<Collection<Subscriber>> findAll() {
        return () -> subscriberService.findAll();
    }

    @Bean
    public Consumer<String> create() {
        return (email) -> subscriberService.create(email);
    }
}
