package cn.zhku.amenity.modules.proof;

import cn.zhku.amenity.po.entity.Proof;
import cn.zhku.amenity.po.entity.ProofExample;
import cn.zhku.amenity.po.mapper.ProofMapper;
import cn.zhku.amenity.utils.interfaceUtils.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/20 11:15.
 * @E-mail gonefuture@qq.com
 */

@Service
public class ProofService implements IBaseService<Proof>{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    ProofMapper proofMapper;

    @Override
    public int add(Proof entity) {
        return proofMapper.insert(entity);
    }

    @Override
    public int update(Proof entity) {
        return proofMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public Proof get(Proof entity) {
        return proofMapper.selectByPrimaryKey(entity.getId());
    }

    @Override
    public int delete(Proof entity) {
        return proofMapper.deleteByPrimaryKey(entity.getId());
    }

    @Override
    public List<Proof> findList(Proof entity) {
        ProofExample proofExample = new ProofExample();
        proofExample.or().andYbEmployidEqualTo(entity.getYbEmployid());
        return proofMapper.selectByExample(proofExample);
    }
}
