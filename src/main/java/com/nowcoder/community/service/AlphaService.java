package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("singleton")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public String find(){
        return alphaDao.select();
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化AlphaService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁方法");
    }

}
