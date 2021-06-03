package com.coderdream.controller;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author ：xulin
 * @date ：Created in 2021/6/3 10:39
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class FreemarkerIndexController {

    @RequestMapping("/index2")
    public String index(Map<String, Object> map) {
        map.put("name", "每特");
        return "index";
    }

    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String, String> result, HttpServletRequest request) {
        // 转发到页面展示数据name value mayikt
        FreeMarkerAutoConfiguration a = null;
        result.put("name", "mayikt");
        // request.setAttribute("name", "mayikt");
        return "freemarkerIndex";
    }
}
