package cn.zhku.amenity.modules.askleave;

import cn.zhku.amenity.po.entity.Askleave;
import cn.zhku.amenity.utils.Beans.Message;
import cn.zhku.amenity.utils.Beans.Query;
import cn.zhku.amenity.utils.Beans.YiBanUser;

import cn.zhku.amenity.utils.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.text.ParseException;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/21 23:29.
 * @E-mail gonefuture@qq.com
 */

@Controller
public class AskleaveController {

    @Autowired
    AskleaveService askleaveService;

    @RequestMapping("askleave/apply")
    @ResponseBody
    public Message leaveApply (String phone, String since , String end, HttpSession httpSession) throws ParseException {
        YiBanUser yiBanUser = (YiBanUser) httpSession.getAttribute("yiBanUser");
        Askleave askleave = new Askleave();
        askleave.setSinceTime(DateUtil.parse(since)); askleave.setEndTime(DateUtil.parse(end));
        askleave.setYbCollegename(yiBanUser.getYb_collegename()); askleave.setYbClassname(yiBanUser.getYb_classname());
        askleave.setYbStudentid(yiBanUser.getYb_studentid()); askleave.setYbRealname(yiBanUser.getYb_realname());
        askleave.setState(1);
        if (askleaveService.add(askleave) == 1) {
            return new Message("1","审核申请成功");
        } else
            return new Message("2","审核申请失败");
    }


    @RequestMapping("askleave/query")
    @ResponseBody
    public PageInfo<Askleave> askleaveQuery(Query query, Askleave askleave, HttpSession httpSession) throws ParseException {
       PageHelper.startPage(query.getPageNum(),query.getPageSize());
       askleave.setSinceTime(DateUtil.parse(query.getSince()));
       askleave.setEndTime(DateUtil.parse(query.getEnd()));

       return  new PageInfo<Askleave> (askleaveService.findList(askleave));

    }

    @RequestMapping("student/askleave")
    @ResponseBody
    public PageInfo<Askleave> studentLeave (Query query, Askleave askleave, HttpSession httpSession) {
        YiBanUser yiBanUser = (YiBanUser) httpSession.getAttribute("yiBanUser");
        askleave.setYbStudentid(yiBanUser.getYb_studentid());
        PageHelper.startPage(query.getPageNum(),query.getPageSize());

        return  new PageInfo<Askleave> (askleaveService.findList(askleave));
    }


    @RequestMapping("askleave/audit")
    @ResponseBody
    public Message leaveAudit(String id , String state) {
        Askleave askleave = new Askleave();
        askleave.setId(Integer.valueOf(id));
        askleave.setState(Integer.valueOf(state));
        if (askleaveService.update(askleave) == 1 && Integer.valueOf(state) == 2) {
            return new Message("1","批准请假");
        } else if(askleaveService.update(askleave) == 1 && Integer.valueOf(state) == 3) {
            return new Message("3","请假被驳回");
        } else
            return new Message("4","程序出现问题，联系开发者");
    }





}
