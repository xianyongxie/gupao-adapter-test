package com.gupao.adapter;

/**
 * Created by xuhuan on 2019/3/17.
 */
public class Adapter implements WeiboLogin {

    //适配器先获取微博的信息，然后调用之前的登录接口
    public void login() {
        System.out.println("获取微博信息");
        new Login().login("weibo-name","weibo-pwd");
    }
}
