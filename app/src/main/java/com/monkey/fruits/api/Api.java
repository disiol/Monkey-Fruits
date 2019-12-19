package com.monkey.fruits.api;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.POST;
import rx.Observable;

public interface Api {

   @POST("CX67h1bP")
   Observable<Response<ResponseBody>> sendRequest();
}
