package com.bc.demo.user.service;

import com.bc.demo.user.response.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;

/**
 * @author fanls
 */
@Slf4j
@Service
public class UserService {

    public List<UserDTO> list() {
        UserDTO userDTO = UserDTO.builder()
                .id(1L)
                .name("法外狂徒-张三")
                .age(30)
                .sex("男")
                .address("浙江-杭州")
                .phoneNumber(18888888888L)
                .build();
        return Collections.singletonList(userDTO);
    }

}
