package com.bc.demo.user.api;

import com.bc.demo.user.request.UserRequestDTO;
import com.bc.demo.user.response.UserDTO;

/**
 * @author fanls
 */
public interface UserApi {
    /**
     * 获取用户信息
     */
    UserDTO findUserDetail(UserRequestDTO requestDTO);
}
