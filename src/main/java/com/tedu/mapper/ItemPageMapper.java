package com.tedu.mapper;

import com.tedu.pojo.Item;

import java.util.List;

/**
 * @ProjectName: page
 * @Package: com.tedu.mapper
 * @ClassName: ItemPageMapper
 * @Author: Chase
 * @Description: 实现分页的接口
 * @Date: 2020/11/19 9:48
 * @Version: 1.0
 */
public interface ItemPageMapper {
    public List<Item> selectPage();
}
