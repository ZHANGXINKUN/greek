package com.mythology.greek.athena.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * @Author : xinkun.zhang
 * @Date : 2020/11/13 10:54
 * @Description :
 */

@Component
@Configuration
public class GoodHandler {

    private final Flux<Good> goods;

    public GoodHandler(GoodGenerator generator) {
        this.goods = generator.generateGoods();
    }

    public Mono<ServerResponse> sayHello(ServerRequest request){
        return ok().contentType(MediaType.TEXT_PLAIN).body(Mono.just("hello world!"),String.class);
    }

    public Mono<ServerResponse> echo(ServerRequest request) {
        return ok().contentType(MediaType.APPLICATION_STREAM_JSON).body(this.goods,Good.class);
    }

}
