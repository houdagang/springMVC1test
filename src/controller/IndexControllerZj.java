package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName : springMVC1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-08 16:26
 */
@Controller
public class IndexControllerZj {

    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message","Hello Spring Mvc by 注解");
        return mav;
    }

}
