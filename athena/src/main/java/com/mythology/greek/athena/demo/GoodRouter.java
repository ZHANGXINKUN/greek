package com.mythology.greek.athena.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @Author : xinkun.zhang
 * @Date : 2020/11/13 11:28
 * @Description :
 */

@Configuration
public class GoodRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GoodHandler handler){
        return RouterFunctions.route(RequestPredicates.GET("/good")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),handler::sayHello)
                .andRoute(RequestPredicates.GET("/goods")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_STREAM_JSON)),handler::echo);

    }

}
