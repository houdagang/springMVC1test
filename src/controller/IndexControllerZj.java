package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

    @RequestMapping("/index.do")
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message","Hello Spring Mvc by 注解");
        return mav;
    }

    @RequestMapping("/jump.do")
    public ModelAndView jump() {
        //redirect:xxx            客户端跳转
        // url会跟随着变，变为xxx ，这时已是全新的独立的请求，不能够再使用前面获得的数据
        //forward:xxx            服务端转发
        // url保持不变，且原获取到的值，在xxx 控制器下依旧能够用
        ModelAndView mav = new ModelAndView("forward:/index");
        return mav;
    }

    @RequestMapping("/check.do")
    public ModelAndView check(HttpSession session) {
        Integer i = (Integer)session.getAttribute("count");
        if(null == i) {
            i = 0;
        }
        i++;
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("check");
        return mav;

    }

    @RequestMapping("/clear.do")
    public ModelAndView clear(HttpSession session) {
        session.removeAttribute("count");
        ModelAndView mav = new ModelAndView("check");
        return mav;

    }

}
