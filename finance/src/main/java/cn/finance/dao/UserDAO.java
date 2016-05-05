package cn.finance.dao;

import cn.finance.model.User;

/**
 * Created by REXTEC-15-2 on 2016-05-05.
 */
public interface  UserDAO {
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
