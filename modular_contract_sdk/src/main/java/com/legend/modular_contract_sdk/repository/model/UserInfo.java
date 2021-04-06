package com.legend.modular_contract_sdk.repository.model;

import com.google.gson.annotations.SerializedName;


public class UserInfo {
    /**
     * "id": 89,
     * "name": "王永成",
     * "nickname": "ares",
     * "email": "ares_ywang@aliyun.com",
     * "type": "BC",
     * "relation_parent": "2",
     * "relation_child": "89",
     * "company_id": 21,
     * "customHeadImage": "https://pms.hanmiit.cn/upload/headimg/1_CoreeGnP.jpg",
     * "visit": 0,
     * "introduction": "在行动中思考",
     * "seq": 1,
     * "created_at": null,
     * "updated_at": null,
     * "lastMomentsDate": "2019-12-21 16:41:41"
     */

    private long id;
    private String name;
    private String nickname;
    private String email;
    private String type;
    @SerializedName("company_id")
    private String companyId;
    private String customHeadImage;
    private String introduction;
    private String lastMomentsDate;
    private String company;
    private boolean blogIsUpdate;

    public UserInfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCustomHeadImage() {
        return customHeadImage;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getLastMomentsDate() {
        return lastMomentsDate;
    }

    public String getCompany() {
        return company;
    }

    public boolean isBlogIsUpdate() {
        return blogIsUpdate;
    }

    public void setBlogIsUpdate(boolean blogIsUpdate) {
        this.blogIsUpdate = blogIsUpdate;
    }
}
