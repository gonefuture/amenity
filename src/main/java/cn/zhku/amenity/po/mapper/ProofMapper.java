package cn.zhku.amenity.po.mapper;

import cn.zhku.amenity.po.entity.Proof;
import cn.zhku.amenity.po.entity.ProofExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProofMapper {
    int countByExample(ProofExample example);

    int deleteByExample(ProofExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Proof record);

    int insertSelective(Proof record);

    List<Proof> selectByExample(ProofExample example);

    Proof selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Proof record, @Param("example") ProofExample example);

    int updateByExample(@Param("record") Proof record, @Param("example") ProofExample example);

    int updateByPrimaryKeySelective(Proof record);

    int updateByPrimaryKey(Proof record);
}