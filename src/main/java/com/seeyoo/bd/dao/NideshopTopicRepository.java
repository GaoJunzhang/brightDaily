package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopTopic;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NideshopTopicRepository extends JpaRepository<NideshopTopic,Integer> {
    public List<NideshopTopic> findAllByIsShow(Pageable pageable,short isShow);
}
