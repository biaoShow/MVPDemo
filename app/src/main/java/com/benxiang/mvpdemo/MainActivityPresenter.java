package com.benxiang.mvpdemo;

import android.util.Log;

import com.benxiang.mvpdemo.model.Person;

/**
 * Created by ZeQiang Fang on 2018/6/30.
 * P层次Presenter
 */

public class MainActivityPresenter implements PresenterInterface {



    @Override
    public void view(String str) {
        Log.i("MainActivityPresenter",str);
    }

    @Override
    public String text(Person person) {
        return "P层完成值返回..." + person.getName() + person.getAge();
    }
}
