package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopChannel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NideshopChannelRepository extends JpaRepository<NideshopChannel,Integer> {
    public List<NideshopChannel> findAll();
}
