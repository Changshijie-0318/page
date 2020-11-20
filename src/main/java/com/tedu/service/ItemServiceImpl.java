package com.tedu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tedu.mapper.ItemPageMapper;
import com.tedu.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: page
 * @Package: com.tedu.service
 * @ClassName: ItemServiceImpl
 * @Author: Chase
 * @Description:
 * @Date: 2020/11/19 10:16
 * @Version: 1.0
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    ItemPageMapper itemPageMapper;

    @Override
    public PageInfo selectPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Item> itemList = itemPageMapper.selectPage();
        PageInfo pageInfo = new PageInfo(itemList);
        return pageInfo;
    }
}
