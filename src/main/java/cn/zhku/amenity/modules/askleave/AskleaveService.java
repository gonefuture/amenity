package cn.zhku.amenity.modules.askleave;

import cn.zhku.amenity.po.entity.Askleave;
import cn.zhku.amenity.po.entity.AskleaveExample;
import cn.zhku.amenity.po.mapper.AskleaveMapper;
import cn.zhku.amenity.utils.interfaceUtils.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/21 23:28.
 * @E-mail gonefuture@qq.com
 */

@Service
public class AskleaveService implements IBaseService<Askleave>{
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    AskleaveMapper askleaveMapper;

    @Override
    public int add(Askleave entity) {
        return askleaveMapper.insert(entity);
    }

    @Override
    public int delete(Askleave entity) {
        return askleaveMapper.deleteByPrimaryKey(entity.getId());
    }

    @Override
    public int update(Askleave entity) {
        return askleaveMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public Askleave get(Askleave entity) {
        return askleaveMapper.selectByPrimaryKey(entity.getId());
    }

    @Override
    public List<Askleave> findList(Askleave askleave) {

        AskleaveExample askleaveExample = new AskleaveExample();
        askleaveExample.setOrderByClause("leave_time desc");
        AskleaveExample.Criteria criteria = askleaveExample.createCriteria();

        if (askleave.getYbCollegename() != null)
            criteria.andYbCollegenameEqualTo(askleave.getYbCollegename());
        if (askleave.getYbClassname()!= null )
            criteria.andYbClassnameEqualTo(askleave.getYbClassname());
        if (askleave.getYbStudentid() != null)
            criteria.andYbStudentidEqualTo(askleave.getYbStudentid());
        if (askleave.getState() != null)
            criteria.andStateEqualTo(askleave.getState());
        if (askleave.getSinceTime() != null  )
            criteria.andSinceTimeGreaterThanOrEqualTo(askleave.getSinceTime());
        if (askleave.getEndTime() != null)
            criteria.andEndTimeLessThanOrEqualTo(askleave.getEndTime());
        if (askleave.getYbRealname() != null){
            criteria.andYbRealnameLike("%"+askleave.getYbRealname()+"%");
        }

        return askleaveMapper.selectByExample(askleaveExample);
    }
}
