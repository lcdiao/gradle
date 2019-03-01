package cn.lcdiao.dao.impl;

import cn.lcdiao.dao.AccountDao;

import java.util.List;

/**
 * Created by diao on 2019/3/1
 */
public class AccountDaoImpl implements AccountDao {
    @Override
    public List findAll() {
        System.out.println("列表查询成功");
        return null;
    }
}
