package com.bwie.ksonframeworkdemo.presenter;

import com.bwie.ksonframeworkdemo.contract.HomeContract;

public class HomePresenter extends HomeContract.HomePresenter {
    @Override
    public void getHome() {

        model.getHome();

        view.sucess("");


    }
}
