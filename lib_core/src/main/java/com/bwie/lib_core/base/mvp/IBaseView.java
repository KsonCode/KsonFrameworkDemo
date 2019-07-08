package com.bwie.lib_core.base.mvp;

/**
 *
 */
public interface IBaseView {

    BasePresenter initPresenter();

    void showProgress();
    void hideProgress();
    void error(String msg);
}
