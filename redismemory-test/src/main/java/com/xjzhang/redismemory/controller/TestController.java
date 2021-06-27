package com.xjzhang.redismemory.controller;

import com.xjzhang.common.cache.CacheProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjzhang
 * @version 1.0
 * @date 2021/6/27 19:30
 */
@RestController
@RequestMapping("/test/")
public class TestController {
    @ResponseBody
    @RequestMapping("index")
    public String index() {

        String str = "";

        str += CacheProvider.set("tyh", "aaaaaaaaaaaaaaaaaa");
        str += "|";
        str += CacheProvider.get("tyh");
        str += "|";
        str += CacheProvider.del("tyh");

        str += "|||";
        return str.toString();
    }
}
