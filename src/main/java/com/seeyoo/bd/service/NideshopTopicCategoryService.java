package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopTopicCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NideshopTopicCategoryService {
    @Autowired
    private NideshopTopicCategoryRepository nideshopTopicCategoryRepository;
}
