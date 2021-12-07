package com.bc.demo.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fanls
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 6171802009943994734L;
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private Long phoneNumber;
}
