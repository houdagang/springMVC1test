package pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ProjectName : springMVC1test
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-12 16:14
 */
public class UploadedImageFile {

    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
