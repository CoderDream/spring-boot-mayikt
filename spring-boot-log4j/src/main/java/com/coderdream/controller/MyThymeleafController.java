package com.coderdream.controller;

import com.coderdream.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ：xulin
 * @date ：Created in 2021/6/3 11:42
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class MyThymeleafController {

    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request, Map<String, Object> result) {
        //request.setAttribute("user", new UserEntity("CoderDream", 30));


        result.put("user", new UserEntity("CoderDream", 30));
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("mayikt1", 22));
        userEntities.add(new UserEntity("mayikt2", 22));
        userEntities.add(new UserEntity("mayikt3", 22));
        result.put("userList", userEntities);
        return "myThymeleaf";
    }
}
