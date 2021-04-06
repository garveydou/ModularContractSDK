package com.legend.modular_contract_sdk.repository.model;

public class LoginInfo {



    private String token;
    private String sig;
    private UserInfo organization;

    public String getToken() {
        return token;
    }

    public String getSig() {
        return sig;
    }

    public UserInfo getUserInfo(){
        return organization;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.organization = userInfo;
    }
}
