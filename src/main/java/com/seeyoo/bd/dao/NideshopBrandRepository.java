package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopBrand;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NideshopBrandRepository extends JpaRepository<NideshopBrand,Integer> {
    public List<NideshopBrand> findAllByIsShow(Pageable pageable,short isShow);
}
