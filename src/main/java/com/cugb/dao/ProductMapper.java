package com.cugb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cugb.pojo.Product;
import com.cugb.pojo.ProductVO;

import java.util.List;

public interface ProductMapper extends BaseMapper<Product> {


    /**
     * 商品上线
     * @param name
     */
    void enableStatus(String name);

    /**
     * 商品下线
     * @param name
     */
    void stopStatus(String name);

    /**
     * 设置图片保存的位置
     * @param vo
     */
    void setImageUrl(ProductVO vo);

    /**
     * 随机五条商品
     * @return
     */
    List<Product> randFive();

    boolean findProByCid(int cid);

}