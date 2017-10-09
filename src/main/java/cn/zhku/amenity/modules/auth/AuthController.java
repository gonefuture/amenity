package cn.zhku.amenity.modules.auth;

import cn.zhku.amenity.utils.Beans.Message;
import cn.zhku.amenity.utils.Beans.YiBanUser;
import cn.zhku.amenity.utils.yiBanUtils.YiBanAuth;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/21 16:24.
 * @E-mail gonefuture@qq.com
 */

@Controller
public class AuthController {
    @RequestMapping("auth")

    public String auth (Model model, HttpServletRequest request, HttpServletResponse response , HttpSession httpSession) throws IOException {
        YiBanUser yiBanUser = YiBanAuth.verifyMe(request,response);

        System.out.println("session数据"+yiBanUser);

        httpSession.setAttribute("yiBanUser",yiBanUser);

        if ( yiBanUser.getYb_studentid().trim().isEmpty()) {
            return "redirect:teacher/index.html";
        } else {
            return "redirect:student/index.html";
        }

    }

    @RequestMapping("getuser")
    @ResponseBody
    public YiBanUser getUser (HttpSession httpSession) {
       return (YiBanUser) httpSession.getAttribute("yiBanUser");

    }

//    @RequestMapping("index")
//    @ResponseBody
//    public String index() {
//        return "rediindex";
//    }




}
