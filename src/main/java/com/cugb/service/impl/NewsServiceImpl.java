package com.cugb.service.impl;

import com.cugb.dao.CustomerMapper;
import com.cugb.dao.NewsMapper;
import com.cugb.pojo.Customer;
import com.cugb.pojo.News;
import com.cugb.pojo.NewsExample;
import com.cugb.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<News> list() {
        NewsExample example = new NewsExample();
        example.createCriteria().andStatusEqualTo(1);
        List<News> news = newsMapper.selectByExample(example);
        for (News z:news){
            Customer customer =customerMapper.selectByPrimaryKey(z.getCstid());
            z.setCustomer(customer);
        }
        return news;
    }

    @Override
    public void save(News entity) {
        newsMapper.insert(entity);
    }

    @Override
    public void del(int id) {
        newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public News get(int id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void audit(int zid) {
        newsMapper.audit(zid);
    }

    @Override
    public List<News> list1() {
        List<News> news = newsMapper.selectByExample(null);
        for (News z:news){
            Customer customer =customerMapper.selectByPrimaryKey(z.getCstid());
            z.setCustomer(customer);
        }
        return news;
    }
}
