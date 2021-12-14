package com.bc.demo.provider.request;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月14日 15:46:00
 */
@Data
@Builder
public class Address implements Serializable  {
    private static final long serialVersionUID = 4112728736433629764L;
    private String province;
    private String city;
    private String district;
}
