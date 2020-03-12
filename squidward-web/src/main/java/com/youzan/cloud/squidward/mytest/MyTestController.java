package com.youzan.cloud.squidward.mytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/3/13 12:17 AM
 */
@RestController
public class MyTestController {

    @GetMapping(value = "/test")
    public String getTestInfo(){

        return  "hello world";
    }

}
