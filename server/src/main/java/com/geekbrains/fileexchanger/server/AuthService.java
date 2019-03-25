package com.geekbrains.fileexchanger.server;

public interface AuthService {
    boolean ExistLoginAndPassword(String login, String password);
}
