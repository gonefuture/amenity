package cn.zhku.amenity.modules.studentClass;

import cn.zhku.amenity.po.entity.Class;
import cn.zhku.amenity.po.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/23 18:09.
 * @E-mail gonefuture@qq.com
 */
@Controller
public class ClassController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    ClassMapper classMapper;
    @RequestMapping("studentClass")
    @ResponseBody
    public List<Class> studentClass() {
        return classMapper.selectByExample(null);
    }
}
