package com.seeyoo.bd.controller;

import com.seeyoo.bd.modle.*;
import com.seeyoo.bd.result.JsonResult;
import com.seeyoo.bd.result.ResultCode;
import com.seeyoo.bd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class NideshopUserController {
    @Autowired
    private NideshopUserService nideshopUserService;

    @Autowired
    private NideshopGoodsService nideshopGoodsService;

    @Autowired
    private NideshopTopicService nideshopTopicService;

    @Autowired
    private NideshopBrandService nideshopBrandService;

    @Autowired
    private NideshopAdService nideshopAdService;

    @Autowired
    private NideshopChannelService nideshopChannelService;

    @RequestMapping(value = "index")
    public Object userList() {
        JsonResult jsonResult;
        Map<String,Object> map = new HashMap<String, Object>();
        System.out.println("查询用户了");
        List<NideshopGoods> newGoodsList = nideshopGoodsService.newGoodsList((short) 1);
        List<NideshopGoods> hotGoodsList = nideshopGoodsService.hotGoodsList((short) 1);
        List<NideshopTopic> topics = nideshopTopicService.topics(0, 3);
        List<NideshopBrand> nideshopBrands = nideshopBrandService.nideshopBrands(0, 4, (short) 1);
        List<NideshopAd> nideshopAds = nideshopAdService.nideshopAds(0, 3, (short) 1);
        List<NideshopChannel> nideshopChannels = nideshopChannelService.nideshopChannels();
        map.put("newGoodsList",newGoodsList);
        map.put("hotGoodsList",hotGoodsList);
        map.put("topicList",topics);
        map.put("brandList",nideshopBrands);
        map.put("banner",nideshopAds);
        map.put("channel",nideshopChannels);
        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }
}
