package com.seeyoo.bd.controller;

import com.seeyoo.bd.bean.UserInfoBean;
import com.seeyoo.bd.modle.NideshopUser;
import com.seeyoo.bd.service.NideshopUserService;
import com.seeyoo.bd.service.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class LoginController extends BaseController {

    @Value("${redis.session.time}")
    private long sessionIdTime;

    @Autowired
    private WxService wxService;

    @Autowired
    private NideshopUserService nideshopUserService;

    @RequestMapping(method = RequestMethod.POST, value = "loginByWeixin")
    public Map<String, Object> loginByWeixin(@RequestParam(name = "code", required = true) String code, UserInfoBean userInfo) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> wxSessionMap = wxService.getWxSession(code);
        if (null == wxSessionMap) {
            return rtnParam(50010, null);
        }
        //获取异常
        if (wxSessionMap.containsKey("errcode")) {
            return rtnParam(50020, null);
        }
        String wxOpenId = (String) wxSessionMap.get("openid");
        String wxSessionKey = (String) wxSessionMap.get("session_key");
        System.out.println(wxSessionKey);
        String thirdSession = wxService.create3rdSession(wxOpenId, wxSessionKey, sessionIdTime);
        map.put("token", thirdSession);
        NideshopUser nideshopUser = nideshopUserService.findAllByWeixinOpenid(wxOpenId);
        if (nideshopUser == null) {
            nideshopUser = new NideshopUser();
            nideshopUser.setAvatar(userInfo.getAvatarUrl());
            nideshopUser.setNickname(userInfo.getNickName());
            nideshopUser.setGender(userInfo.getGender());
            nideshopUser.setWeixinOpenid(wxOpenId);
//            nideshopUser.setRegisterTime();
        }
        return rtnParam(0, map);
//        return rtnParam(0, ImmutableMap.of("sessionId", thirdSession));
    }
}
