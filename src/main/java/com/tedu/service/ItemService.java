package com.tedu.service;

import com.github.pagehelper.PageInfo;
import com.tedu.pojo.Item;

import java.util.List;

/**
 * @ProjectName: page
 * @Package: com.tedu.service
 * @ClassName: ItemService
 * @Author: Chase
 * @Description:
 * @Date: 2020/11/19 10:15
 * @Version: 1.0
 */
public interface ItemService {
    /**
     * 功能描述: 分页
     * @Param: [pageNum 显示第几页, pageSize 每页显示几行]
     * @Return: java.util.List<com.tedu.pojo.Item>
     * @Author: Chase
     * @Date: 2020/11/19 10:31
     */
    PageInfo selectPage(Integer pageNum, Integer pageSize);
}
