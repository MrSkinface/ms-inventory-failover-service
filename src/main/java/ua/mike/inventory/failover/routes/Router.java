package ua.mike.inventory.failover.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by mike on 13.06.2022 15:18
 */
@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/inventory/failover"), request -> ok().body(Mono.just(999), Integer.class));
    }
}
