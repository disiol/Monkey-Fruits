package com.monkey.fruits.interactor;

import com.google.gson.Gson;
import com.monkey.fruits.api.Api;
import com.monkey.fruits.util.RxTransformers;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.ResponseBody;
import retrofit2.Response;
import rx.Observable;

@Singleton
public class DataStore {
    private Api api;
    private Gson gson;

    @Inject
    public DataStore(Api api, Gson gson) {
        this.api = api;
        this.gson = gson;
    }
  //TODO

    public Observable<Response<ResponseBody>> sendRequest() {
        return api.sendRequest().compose(RxTransformers.applyApiRequestSchedulers());
    }
}
