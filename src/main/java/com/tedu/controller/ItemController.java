package com.tedu.controller;

import com.github.pagehelper.PageInfo;
import com.tedu.mapper.ItemMapper;
import com.tedu.mapper.ItemPageMapper;
import com.tedu.pojo.Item;
import com.tedu.pojo.PageResult;
import com.tedu.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: page
 * @Package: com.tedu.controller
 * @ClassName: ItemController
 * @Author: Chase
 * @Description:
 * @Date: 2020/11/19 9:38
 * @Version: 1.0
 */
@RestController
@CrossOrigin
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @RequestMapping("/test")
    //http://localhost:8080/test?pageNum=1&pageSize=2
    public PageResult test(Integer pageNum, Integer pageSize){
        PageInfo pageInfo = itemService.selectPage(pageNum,pageSize);
        PageResult pageResult = new PageResult(0,"ok");
        pageResult.setPageInfo(pageInfo);
        return pageResult;
    }

}
