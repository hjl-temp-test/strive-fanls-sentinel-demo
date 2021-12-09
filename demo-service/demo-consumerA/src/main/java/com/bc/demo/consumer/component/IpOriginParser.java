package com.bc.demo.consumer.component;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author fanlinsheng
 * @version 1.0.0
 * @date 2021年12月09日 19:27:00
 */
@Component
public class IpOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getRemoteAddr();
    }
}
