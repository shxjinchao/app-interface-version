package cn.itchao.app.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jinchao
 * @description TODO
 * @date 2019/12/10 17:26
 */
//@Component
public class AuthInteceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception
    {
        System.out.println("URI: " + request.getRequestURI());
        return true;
    }


}
