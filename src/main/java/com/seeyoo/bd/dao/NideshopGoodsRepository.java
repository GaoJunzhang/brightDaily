package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopGoods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NideshopGoodsRepository extends JpaRepository<NideshopGoods,Integer> {
    public List<NideshopGoods> findAllByIsNew(@Param("isNew") short isNew);
    public List<NideshopGoods> findAllByIsHot(@Param("isHot") short isHot);
    public Page<NideshopGoods> findAll(Specification<NideshopGoods> spec, Pageable pageable);
}
