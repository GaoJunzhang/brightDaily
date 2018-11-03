package com.seeyoo.bd.dao;

import com.seeyoo.bd.modle.NideshopCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NideshopCategoryRepository extends JpaRepository<NideshopCategory,Integer> {
    public List<NideshopCategory> findAllByParentId(int parentId);
}
