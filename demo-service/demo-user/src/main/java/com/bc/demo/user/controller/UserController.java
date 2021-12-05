package com.bc.demo.user.controller;


import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.bc.demo.constant.api.R;
import com.bc.demo.constant.api.ResultCode;
import com.bc.demo.user.response.UserDTO;
import com.bc.demo.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author fanls
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list")
    public R<List<UserDTO>> list() {
        try (Entry entry = SphU.entry("userList")) {
            // 被保护的逻辑
            return R.data(userService.list());
        } catch (BlockException ex) {
            // 处理被流控的逻辑
            return R.success(ResultCode.SYSTEM_BUSY);
        }
    }


    @PostConstruct
    public void initSentinelRule()
    {
        List<FlowRule> flowRules = new ArrayList<>();
        //创建限流规则
        FlowRule rule = new FlowRule();
        //定义资源
        rule.setResource("userList");
        //定义规则类型
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        //定义每秒可以通过的QPS数
        rule.setCount(2);
        flowRules.add(rule);
        //加载限流规则
        FlowRuleManager.loadRules(flowRules);
    }

}
