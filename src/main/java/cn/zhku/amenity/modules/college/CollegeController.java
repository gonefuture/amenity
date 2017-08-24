package cn.zhku.amenity.modules.college;

import cn.zhku.amenity.po.entity.College;
import cn.zhku.amenity.po.mapper.CollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/23 17:58.
 * @E-mail gonefuture@qq.com
 */
@Controller
public class CollegeController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    CollegeMapper collegeMapper;

    @RequestMapping("college")
    @ResponseBody
    public List<College> college() {
        return collegeMapper.selectByExample(null);
    }
}
