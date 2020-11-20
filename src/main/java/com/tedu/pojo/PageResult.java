package com.tedu.pojo;

import com.github.pagehelper.PageInfo;

/**
 * @ProjectName: page
 * @Package: com.tedu.pojo
 * @ClassName: PageResult
 * @Author: Chase
 * @Description:
 * @Date: 2020/11/19 10:52
 * @Version: 1.0
 */
public class PageResult extends Result{

    PageInfo pageInfo;

    public PageResult(Integer state, String msg) {
        super(state, msg);
    }

    public PageResult(Integer state, String msg, Object data) {
        super(state, msg, data);
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
