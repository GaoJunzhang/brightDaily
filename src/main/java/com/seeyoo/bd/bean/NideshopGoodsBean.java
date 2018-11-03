package com.seeyoo.bd.bean;

import com.seeyoo.bd.annoation.RelevanceClass;
import lombok.Data;

import java.math.BigDecimal;

@Data
@RelevanceClass("NideshopGoods")
public class NideshopGoodsBean extends MainBean{
    private int id;
    private int categoryId;
    private String goodsSn;
    private String name;
    private int brandId;
    private int goodsNumber;
    private String keywords;
    private String goodsBrief;
    private String goodsDesc;
    private short isOnSale;
    private int addTime;
    private short sortOrder;
    private short isDelete;
    private int attributeCategory;
    private BigDecimal counterPrice;
    private BigDecimal extraPrice;
    private short isNew;
    private String goodsUnit;
    private String primaryPicUrl;
    private String listPicUrl;
    private BigDecimal retailPrice;
    private int sellVolume;
    private int primaryProductId;
    private BigDecimal unitPrice;
    private String promotionDesc;
    private String promotionTag;
    private BigDecimal appExclusivePrice;
    private short isAppExclusive;
    private short isLimited;
    private short isHot;
}
