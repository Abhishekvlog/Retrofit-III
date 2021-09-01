package com.example.retrofit_iii;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    @Headers("Authorization: Client-ID e464fc8f70482e6")
    @Multipart
    @POST("3/image")
    Call<ResponseDTO> UploadImage(
            @Part MultipartBody.Part image
            );
}
