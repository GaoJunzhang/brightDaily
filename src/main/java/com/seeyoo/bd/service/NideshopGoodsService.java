package com.seeyoo.bd.service;

import com.seeyoo.bd.dao.NideshopGoodsRepository;
import com.seeyoo.bd.modle.NideshopGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class NideshopGoodsService {
    @Autowired
    private NideshopGoodsRepository nideshopGoodsRepository;

    public List<NideshopGoods> newGoodsList(short isNew) {
        return nideshopGoodsRepository.findAllByIsNew(isNew);
    }

    public List<NideshopGoods> hotGoodsList(short isHot) {
        return nideshopGoodsRepository.findAllByIsHot(isHot);
    }

    public Page<NideshopGoods> nideshopGoods(int categoryId, int page, int size, String sortType, String sortValue) {
        String[] svs = sortValue.split(",");
        String[] sts = sortType.split(",");
        List<Sort.Order> orders = new ArrayList<Sort.Order>();
        for (int i = 0; i < svs.length; i++) {
            Sort.Order order = new Sort.Order(Sort.Direction.fromString(sts[i]), svs[i]);
            orders.add(order);
        }
        Sort sort = new Sort(orders);
        Pageable pageable = new PageRequest(page, size, sort);

        Specification<NideshopGoods> nideshopGoodsSpecification = new Specification<NideshopGoods>() {
            @Override
            public Predicate toPredicate(Root<NideshopGoods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate predicate = cb.conjunction();
//                    predicate.getExpressions().add(cb.like(root.get("createrWxId"), "%" + name + "%"));
                    predicate.getExpressions().add(cb.equal(root.get("categoryId"),categoryId));
                return predicate;
            }

        };

        return nideshopGoodsRepository.findAll(nideshopGoodsSpecification, pageable);
    }
}
