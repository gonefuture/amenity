package cn.zhku.amenity.modules.proof;

import cn.zhku.amenity.po.entity.Proof;
import cn.zhku.amenity.utils.Beans.Message;
import cn.zhku.amenity.utils.Beans.Query;
import cn.zhku.amenity.utils.Beans.YiBanUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/20 11:14.
 * @E-mail gonefuture@qq.com
 */
@Controller
public class ProofController {

    @Autowired
    ProofService proofService;

    @RequestMapping("proof/apply")
    @ResponseBody
    public Message prrofApply(String address, String phone) {


        return new Message("1","生成证明成功");
    }

    @RequestMapping("proof/query")
    @ResponseBody
    public PageInfo<Proof> proofQuery(Query query, HttpSession session, Proof proof) {
        YiBanUser yiBanUser= (YiBanUser) session.getAttribute("yiBanUser");
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
        if (yiBanUser.getYb_employid() != null && !yiBanUser.getYb_employid().trim().isEmpty()) {
            proof.setYbEmployid(yiBanUser.getYb_employid());
            return new PageInfo<Proof>(proofService.findList(proof));
        }
        return null;
    }

    @RequestMapping("student/proof")
    @ResponseBody
    public PageInfo<Proof> studentProof(Query query, HttpSession session, Proof proof) {
        YiBanUser yiBanUser= (YiBanUser) session.getAttribute("yiBanUser");
        PageHelper.startPage(query.getPageNum(),query.getPageSize());
            proof.setYbEmployid(yiBanUser.getYb_userid());
            return new PageInfo<Proof>(proofService.findList(proof));
    }

    @RequestMapping("proof/audit")
    @ResponseBody
    public Message proofAudit (String id,String state) {
        Proof proof = new Proof();
        proof.setId(Integer.valueOf(id)); proof.setState(Integer.valueOf(state));
        if (proofService.update(proof) == 1 && Integer.valueOf(state) == 2) {
            return new Message("1","审核证明成功");
        } else if(proofService.update(proof) == 1 && Integer.valueOf(state) == 3) {
            return new Message("2","审核证明被驳回");
        } else
            return new Message("2","审核证明失败，联系开发者");

    }

}
