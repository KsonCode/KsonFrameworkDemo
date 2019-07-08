package com.bwie.ksonframeworkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bwie.ksonframeworkdemo.contract.HomeContract;
import com.bwie.ksonframeworkdemo.model.HomeModel;
import com.bwie.ksonframeworkdemo.presenter.HomePresenter;
import com.bwie.lib_core.base.BaseActivity;
import com.bwie.lib_core.base.mvp.BaseMvpActivity;
import com.bwie.lib_core.base.mvp.BasePresenter;

import butterknife.BindView;

public class Main2Activity extends BaseMvpActivity<HomeModel,HomePresenter> implements HomeContract.IHomeView {


    @BindView(R.id.tv)
    TextView tv;




    @Override
    protected void initView() {


    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    public void sucess(String result) {

    }

    @Override
    public BasePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void error(String msg) {

    }

    @Override
    protected void initDatas() {
        tv.setText("hhihihi");

        presenter.getHome();
    }
}
