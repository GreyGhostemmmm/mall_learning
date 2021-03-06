package com.mall.dao;

import com.mall.pojo.Shipping;
import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    List<Shipping> selectAll();

    int updateByPrimaryKey(Shipping record);
}