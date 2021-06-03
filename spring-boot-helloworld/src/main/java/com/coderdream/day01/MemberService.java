package com.coderdream.day01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/3 8:53
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class MemberService {

    @RequestMapping("/getMember")
    public String getMember(){
        return "CoderDream";
    }

}
