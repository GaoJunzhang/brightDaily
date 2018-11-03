package com.seeyoo.bd.controller;

import com.seeyoo.bd.bean.NideshopGoodsBean;
import com.seeyoo.bd.modle.NideshopCategory;
import com.seeyoo.bd.modle.NideshopGoods;
import com.seeyoo.bd.result.JsonResult;
import com.seeyoo.bd.result.ResultCode;
import com.seeyoo.bd.service.NideshopCategorySevice;
import com.seeyoo.bd.service.NideshopGoodsService;
import com.seeyoo.bd.util.BeanPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private NideshopCategorySevice nideshopCategorySevice;

    @Autowired
    private NideshopGoodsService nideshopGoodsService;

    @RequestMapping(value = "count")
    public Object count() {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();

        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }

    @RequestMapping(value = "goodList")
    public BeanPage<NideshopGoodsBean> goodList(int categoryId, int page, int size, @RequestParam(defaultValue = "desc") String sortType, @RequestParam(defaultValue = "id") String sortValue) {
        Page<NideshopGoods> nideshopGoods = nideshopGoodsService.nideshopGoods(categoryId, page, size, sortType, sortValue);
        BeanPage<NideshopGoodsBean> beanPage = new BeanPage<NideshopGoodsBean>();
        beanPage.setTotal(nideshopGoods.getTotalElements());
        beanPage.setTotalPage(nideshopGoods.getTotalPages());
        List<NideshopGoodsBean> nideshopGoodsList = new ArrayList<NideshopGoodsBean>();
        for (NideshopGoods nideshopGoodsobj : nideshopGoods) {
            NideshopGoodsBean nideshopGoodsBean = new NideshopGoodsBean();
            nideshopGoodsBean.inject(nideshopGoodsobj);
            nideshopGoodsList.add(nideshopGoodsBean);
        }
        beanPage.setRows(nideshopGoodsList);
        return beanPage;
    }

    @RequestMapping(value = "category")
    public Object category(int id) {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();
        List<NideshopCategory> nideshopCategories = nideshopCategorySevice.findAllByParentId(0);
        for (int i = 0; i < nideshopCategories.size(); i++) {
            if (id == nideshopCategories.get(i).getId()) {
                map.put("currentCategory", nideshopCategories.get(i));
                break;
            }
        }
        map.put("category", nideshopCategories);
        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }

    @RequestMapping(value = "detail")
    public Object detail() {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();

        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }

    @RequestMapping(value = "newgoods")
    public Object newgoods() {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();

        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }

    @RequestMapping(value = "hot")
    public Object hot() {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();

        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }

    @RequestMapping(value = "related")
    public Object related() {
        JsonResult jsonResult;
        Map<String, Object> map = new HashMap<String, Object>();

        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", map);
        return jsonResult;
    }
}
