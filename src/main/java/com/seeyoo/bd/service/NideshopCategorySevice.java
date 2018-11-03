package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopCategoryRepository;
import com.seeyoo.bd.modle.NideshopCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopCategorySevice {
    @Autowired
    private NideshopCategoryRepository nideshopCategoryRepository;

    public List<NideshopCategory> findAllByParentId(int parentId){
        return nideshopCategoryRepository.findAllByParentId(parentId);
    }
}
