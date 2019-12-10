package cn.itchao.app.controller;

import cn.itchao.app.utils.ApiVersion;
import cn.itchao.app.utils.VersionConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jinchao
 */
@RestController
@RequestMapping("{version}/api/")
public class HelloController {

    @ApiVersion(VersionConstants.VERSION_V1_0_0)
    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request){
        System.out.println("hello100..........");

        return "hello"+"->v1.0.0";
    }

    @ApiVersion(VersionConstants.VERSION_V1_0_2)
    @GetMapping(value = "/hello")
    public String hello2(HttpServletRequest request){
        System.out.println("hello102.........");

        return "hello"+"->v1.0.2";
    }

    @ApiVersion(VersionConstants.VERSION_V1_0_5)
    @GetMapping(value = "/hello")
    public String hello5(HttpServletRequest request){
        System.out.println("hello105.........");
        return "hello"+"->v1.0.5";
    }

}
