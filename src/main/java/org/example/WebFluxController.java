package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/webflux")
public class WebFluxController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello from WebFlux!")
                .delaySubscription(Duration.ofMillis(100)); // Изящная реализация с неблокирующей задержкой
    }
}
