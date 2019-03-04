package com.qtu404.sirius.service;

import com.qtu404.sirius.model.User;

/**
 * @author DingXing wb-dx470808@alibaba-inc.com
 * @date 2019/3/4 上午10:26
 */
public interface UserService {
    String sayHi(String name);

    User findById(Long id);

    Long create(User user);
}
