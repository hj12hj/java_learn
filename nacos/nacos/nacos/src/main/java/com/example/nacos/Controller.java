package com.example.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: hj
 * @date: 2022/10/25
 * @time: 9:52 AM
 */
@RestController
@RefreshScope
public class Controller {

    @Value("${aa:111}")
    private String aa;

    @GetMapping("/send")
    public String send(HttpServletRequest request, HttpServletResponse response) {

        return aa;
    }


}
