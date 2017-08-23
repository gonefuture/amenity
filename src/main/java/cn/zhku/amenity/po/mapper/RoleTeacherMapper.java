package cn.zhku.amenity.po.mapper;

import cn.zhku.amenity.po.entity.RoleTeacher;
import cn.zhku.amenity.po.entity.RoleTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTeacherMapper {
    int countByExample(RoleTeacherExample example);

    int deleteByExample(RoleTeacherExample example);

    int insert(RoleTeacher record);

    int insertSelective(RoleTeacher record);

    List<RoleTeacher> selectByExample(RoleTeacherExample example);

    int updateByExampleSelective(@Param("record") RoleTeacher record, @Param("example") RoleTeacherExample example);

    int updateByExample(@Param("record") RoleTeacher record, @Param("example") RoleTeacherExample example);
}