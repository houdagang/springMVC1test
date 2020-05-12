package controller;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Product;
import pojo.UploadedImageFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @ProjectName : springMVC1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-12 16:16
 */
@Controller
public class UploadController {

    @RequestMapping("/toUploadImage.do")
    public ModelAndView uploadImage(Product product) throws Exception {
        ModelAndView mav = new ModelAndView("upload");
        return mav;
    }

    @RequestMapping("/uploadImage.do")
    public ModelAndView upload(HttpServletRequest request, UploadedImageFile file)
            throws IllegalStateException, IOException {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName", newFileName);
        return mav;
    }

}
