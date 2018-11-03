package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopTopicRepository;
import com.seeyoo.bd.modle.NideshopTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopTopicService {
    @Autowired
    private NideshopTopicRepository nideshopTopicRepository;

    public List<NideshopTopic> topics(int page,int size){
        PageRequest pr = new PageRequest(page,size);
        return nideshopTopicRepository.findAllByIsShow(pr,(short)1);
    }
}
