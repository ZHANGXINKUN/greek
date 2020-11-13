package com.mythology.greek.athena.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : xinkun.zhang
 * @Date : 2020/11/13 10:45
 * @Description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {

    private int id;
    private String name;
    private String price;

//    public Good(int id, String name, String price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    public Good() {
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
