package com.bwie.lib_core.base.mvp;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<M,V> {

    public M model;
    public V view;

    private WeakReference<V> vWeakReference;
    private WeakReference<M> mWeakReference;

    public abstract M getModel();

    /**
     * 绑定，初始化
     */
    public void attach(M model,V v){

        vWeakReference = new WeakReference<V>(v);
        mWeakReference = new WeakReference<M>(model);
//        model = getModel();
        this.model = mWeakReference.get();

        this.view = vWeakReference.get();

    }

    /**
     * 解绑，释放内存，内存优化，防止内存泄漏
     */
    public void detach(){

        if (vWeakReference!=null){
            vWeakReference.clear();

        }if (mWeakReference!=null){
            mWeakReference.clear();

        }
//        if (view!=null){
//            view = null;
//        }



    }

}
