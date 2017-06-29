package com.monicalabbao.dependencyinjectionexercise.di;

import com.monicalabbao.dependencyinjectionexercise.model.ChargeResponse;
import com.monicalabbao.dependencyinjectionexercise.model.TokenResponse;

import io.reactivex.Single;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {
    @POST("token")
    Single<TokenResponse> generateToken(@Header("Authorization") String token); //iba kay Observable

    @POST("charge")
    Single<ChargeResponse> magbayadKana();
}
