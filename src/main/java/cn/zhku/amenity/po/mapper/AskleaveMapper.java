package cn.zhku.amenity.po.mapper;

import cn.zhku.amenity.po.entity.Askleave;
import cn.zhku.amenity.po.entity.AskleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AskleaveMapper {
    int countByExample(AskleaveExample example);

    int deleteByExample(AskleaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Askleave record);

    int insertSelective(Askleave record);

    List<Askleave> selectByExampleWithBLOBs(AskleaveExample example);

    List<Askleave> selectByExample(AskleaveExample example);

    Askleave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Askleave record, @Param("example") AskleaveExample example);

    int updateByExampleWithBLOBs(@Param("record") Askleave record, @Param("example") AskleaveExample example);

    int updateByExample(@Param("record") Askleave record, @Param("example") AskleaveExample example);

    int updateByPrimaryKeySelective(Askleave record);

    int updateByPrimaryKeyWithBLOBs(Askleave record);

    int updateByPrimaryKey(Askleave record);
}