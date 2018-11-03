package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopBrandRepository;
import com.seeyoo.bd.modle.NideshopBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopBrandService {
    @Autowired
    private NideshopBrandRepository nideshopBrandRepository;

    public List<NideshopBrand> nideshopBrands(int page,int size,short isShow){
        PageRequest pageRequest = new PageRequest(page,size);
        return nideshopBrandRepository.findAllByIsShow(pageRequest,isShow);
    }
}
