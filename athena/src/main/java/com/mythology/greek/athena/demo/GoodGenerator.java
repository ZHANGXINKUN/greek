package com.mythology.greek.athena.demo;

import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : xinkun.zhang
 * @Date : 2020/11/13 10:48
 * @Description :
 */

@Configuration
public class GoodGenerator {

     public Flux<Good> generateGoods(){
         List<Good> goods = new ArrayList<>();
         goods.add(new Good(1,"小米","2000"));
         goods.add(new Good(2,"华为","4000"));
         goods.add(new Good(3,"苹果","8000"));
         return Flux.fromIterable(goods);
     }
}
