package com.xy.service;

import com.xy.model.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    User loginCheck(User user);

//    PageInfo<User> list(UserQuery query);


}
