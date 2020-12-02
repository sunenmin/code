package com.sun.rpcServer;

public class IUserServiceImpl implements IUserService {
    @Override
    public User findUserById(int id) {
        return new User(id,"Alice");
    }//直接new模拟数据库查询

    @Override
    public String savaUser(User user) {
        return "保存成功";
    }
}
