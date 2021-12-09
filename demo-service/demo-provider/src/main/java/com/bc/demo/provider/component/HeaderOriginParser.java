package com.bc.demo.provider.component;

import cn.hutool.core.util.StrUtil;
import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月09日 19:27:00
 */
@Component
public class HeaderOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        // 1.获取请求头
        String origin = httpServletRequest.getHeader("origin");
        // 2.非空判断
        if (StrUtil.isBlank(origin)) {
            origin = "blank";
        }
        return origin;
    }
}
