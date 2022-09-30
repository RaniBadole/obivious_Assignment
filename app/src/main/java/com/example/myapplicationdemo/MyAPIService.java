package com.example.myapplicationdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPIService {

    @GET("/Oclemy/SampleJSON/338d9585/spacecrafts.json")
    Call<List<Spacecraft>> getSpacecrafts();
}
