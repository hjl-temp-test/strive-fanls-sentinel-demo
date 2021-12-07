package com.bc.demo.user.impl;

import com.bc.demo.constant.api.R;
import com.bc.demo.user.api.UserApi;
import com.bc.demo.user.response.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月06日 20:07:00
 * 用户RPC接口实现
 */
@DubboService
public class UserServiceImpl implements UserApi {
    @Override
    public R<UserDTO> findUserDetail(String userCode) {
        return R.success("");
    }
}
