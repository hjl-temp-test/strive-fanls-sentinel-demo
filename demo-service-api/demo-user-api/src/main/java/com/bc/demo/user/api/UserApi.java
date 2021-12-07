package com.bc.demo.user.api;

import com.bc.demo.constant.api.R;
import com.bc.demo.user.response.UserDTO;

/**
 * @author fanls
 */
public interface UserApi {
    /**
     * 获取用户信息
     */
    R<UserDTO> findUserDetail(String userCode);
}
