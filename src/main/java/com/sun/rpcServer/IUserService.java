package com.sun.rpcServer;

public interface IUserService {
    User findUserById(int id);
    String savaUser(User user);
}
