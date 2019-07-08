package com.bwie.lib_core.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.blankj.utilcode.util.LogUtils;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {


    private Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayoutId());
        unbinder = ButterKnife.bind(this);
        initView();
        initData();


    }

    protected abstract void initData();


    protected abstract void initView();

    /**
     *
     * @return
     */
    protected abstract int bindLayoutId();

    /**
     * 设置沉浸状态栏方法
     * @param b
     */
    protected void setBar(boolean b){
        if (b){

        }

    } /**
     * 设置沉浸状态栏方法
     * @param b
     */
    protected void setfullScreen(boolean b){
        if (b){
            //全屏展示代码
        }

    }

    /**
     * 显示toast
     * @param msg
     */
    public void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
/**
     * 跳转
     */
    public void startActivity(Class<?> clz){
        startActivity(new Intent(this,clz));

    }
/**
     * 有参跳转
     */
    public void startActivity(Bundle bundle,Class<?> clz){
        Intent intent = new Intent(this,clz);
        intent.putExtras(bundle);
        startActivity(intent);

    }


    @Override
    protected void onStart() {
        super.onStart();

        //utilcode
        LogUtils.e("onStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder!=null){
            unbinder.unbind();
        }
    }
}
