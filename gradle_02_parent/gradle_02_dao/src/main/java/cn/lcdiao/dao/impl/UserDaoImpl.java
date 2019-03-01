package cn.lcdiao.dao.impl;

import cn.lcdiao.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by diao on 2019/3/1
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "保存成功";
    }
}
