package com.bwie.ksonframeworkdemo.contract;

import com.bwie.ksonframeworkdemo.model.HomeModel;
import com.bwie.lib_core.base.mvp.BasePresenter;
import com.bwie.lib_core.base.mvp.IBaseModel;
import com.bwie.lib_core.base.mvp.IBaseView;

public interface HomeContract
{

     abstract class HomePresenter extends BasePresenter<IHomeModel,IHomeView>{
         @Override
         public IHomeModel getModel() {
             return new HomeModel();
         }

        public abstract void getHome();


    }

     interface  IHomeModel extends IBaseModel{

         void getHome();

    }

     interface  IHomeView extends IBaseView{

        void sucess(String result);


    }
}
