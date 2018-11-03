package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopAd;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NideshopAdRepository extends JpaRepository<NideshopAd,Integer> {
    public List<NideshopAd> findAllByEnabled(Pageable pageable, short enabled);
}
