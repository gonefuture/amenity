package cn.zhku.amenity.modules.teacher;

import cn.zhku.amenity.po.entity.Teacher;
import cn.zhku.amenity.po.mapper.TeacherMapper;
import cn.zhku.amenity.utils.interfaceUtils.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/20 11:19.
 * @E-mail gonefuture@qq.com
 */
@Service
public class TeacherService  implements IBaseService<Teacher>{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    TeacherMapper teacherMapper;


    @Override
    public int add(Teacher entity) {
        return teacherMapper.insert(entity);
    }

    @Override
    public int update(Teacher entity) {
        return teacherMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public Teacher get(Teacher entity) {
        return teacherMapper.selectByPrimaryKey(entity.getYbEmployid());
    }

    @Override
    public int delete(Teacher entity) {
        return teacherMapper.deleteByPrimaryKey(entity.getYbEmployid());
    }

    @Override
    public List<Teacher> findList(Teacher entity) {
        return teacherMapper.selectByExample(null);
    }
}
