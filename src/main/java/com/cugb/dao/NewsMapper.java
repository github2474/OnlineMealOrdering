package com.cugb.dao;

import com.cugb.pojo.News;


public interface NewsMapper extends BaseMapper<News> {


    /**
     * 资讯审核
     * @param zid
     */
    void audit(int zid);

}