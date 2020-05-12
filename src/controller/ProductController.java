package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Product;

/**
 * @ProjectName : springMVC1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-12 8:57
 */
@Controller
public class ProductController {

    @RequestMapping("/addProduct.do")
    public ModelAndView add(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }

    @RequestMapping("/toAddProduct.do")
    public ModelAndView toAdd(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("addProduct");
        return mav;
    }

    @RequestMapping("/toFileUpload.do")
    public ModelAndView toFileUpload(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("upload");
        return mav;
    }

}
