package com.bc.demo.provider.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月14日 15:44:00
 */
@Data
@Builder
public class HelloRequest implements Serializable {

    private static final long serialVersionUID = 601673817182328263L;

    private String name;
    private Integer age;
    private Address address;

}
