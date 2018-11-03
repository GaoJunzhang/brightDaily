package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopChannelRepository;
import com.seeyoo.bd.modle.NideshopChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopChannelService {
    @Autowired
    private NideshopChannelRepository nideshopChannelRepository;

    public List<NideshopChannel> nideshopChannels(){
        return nideshopChannelRepository.findAll();
    }
}
