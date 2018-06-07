package com.xy.service.impl;

import com.xy.dao.UserMapper;
import com.xy.dao.UserMapper;
import com.xy.model.User;
import com.xy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return dao.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public User loginCheck(User user) {
        return dao.loginCheck(user);
    }

//    @Override
//    public PageInfo<User> list(UserQuery query) {
//        PageHelper.startPage(query.getPageNum(), query.getPageSize());
//        List<User> list = dao.list(query);
//        PageInfo<User> pageInfo = new PageInfo<>(list);
//        return pageInfo;
//    }


}