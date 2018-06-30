package com.benxiang.mvpdemo;

import com.benxiang.mvpdemo.model.Person;

/**
 * Created by ZeQiang Fang on 2018/6/30.
 * P层次接口
 */

public interface PresenterInterface {
    void view(String str);
    String text(Person person);
}
