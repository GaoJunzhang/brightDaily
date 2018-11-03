package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopAdRepository;
import com.seeyoo.bd.modle.NideshopAd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopAdService {
    @Autowired
    private NideshopAdRepository nideshopAdRepository;

    public List<NideshopAd> nideshopAds(int page, int size, short enabled) {
        PageRequest pageRequest = new PageRequest(page, size);
        return nideshopAdRepository.findAllByEnabled(pageRequest, enabled);
    }
}
