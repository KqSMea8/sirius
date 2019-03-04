package com.qtu404.sirius.service.impl;

import com.qtu404.sirius.dao.UserDao;
import com.qtu404.sirius.model.User;
import com.qtu404.sirius.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public String sayHi(String name) {
        if (Objects.isNull(name)) name = "";
        return "Hello " + name + " welcome to sirius";
    }

    @Override
    public User findById(Long id) {
        return this.userDao.findById(id);
    }

    @Override
    public Long create(User user) {
        return this.userDao.create(user) ? user.getId() : null;
    }
}
