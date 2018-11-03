package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopUserRepository;
import com.seeyoo.bd.modle.NideshopUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NideshopUserService {

    @Autowired
    private NideshopUserRepository nideshopUserRepository;

    public List<NideshopUser> nideshopUserList(){
        return nideshopUserRepository.findAll();
    }

    public void saveUser(NideshopUser nideshopUser){
        nideshopUserRepository.save(nideshopUser);
    }

    public NideshopUser findAllByWeixinOpenid(String openId){
        return nideshopUserRepository.findAllByWeixinOpenid(openId);
    }
}
