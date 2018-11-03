package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface NideshopUserRepository extends JpaRepository<NideshopUser,Integer> {
    public NideshopUser findAllByWeixinOpenid(@Param("weixinOpenid") String weixinOpenid);
}
