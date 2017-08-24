package cn.zhku.amenity.modules.building;

import cn.zhku.amenity.po.entity.Building;
import cn.zhku.amenity.po.mapper.BuildingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/23 18:15.
 * @E-mail gonefuture@qq.com
 */

@Controller
public class BuildingController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    BuildingMapper buildingMapper;


    @RequestMapping("building")
    @ResponseBody
    public List<Building> building() {
        return buildingMapper.selectByExample(null);
    }
}
