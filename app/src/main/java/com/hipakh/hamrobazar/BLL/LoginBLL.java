package com.hipakh.hamrobazar.BLL;

import com.hipakh.hamrobazar.Api.UsersAPI;
import com.hipakh.hamrobazar.ServerResponse.RegisterResponse;
import com.hipakh.hamrobazar.URL.Url;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginBLL {

    boolean isSuccess=false;
    public boolean checkUser(String email,String password){
        UsersAPI usersAPI= Url.getInstance().create(UsersAPI.class);

        Call<RegisterResponse> usersCall=usersAPI.checkUser(email,password);

        try {
            Response<RegisterResponse> loginResponse=usersCall.execute();
            if (loginResponse.isSuccessful() && loginResponse.body().getStatus().equals("Login success!")){

                Url.token += loginResponse.body().getToken();

                isSuccess=true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
