package com.monkey.fruits.ui.fragments.web.presenter;


import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.web.view.WebView;

import javax.inject.Inject;

public class WebPresenter extends BasePresenter<WebView> {

    @Inject
    WebPresenter(){
    }

    public void showSite() {
        getView().showSite();
    }
}
