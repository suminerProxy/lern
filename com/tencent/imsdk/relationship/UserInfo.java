package com.tencent.imsdk.relationship;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UserInfo implements Serializable {
    public static final int USERINFO_ALLOWTYPE_ALLOWANY = 0;
    public static final int USERINFO_ALLOWTYPE_DENYANY = 2;
    public static final int USERINFO_ALLOWTYPE_NEEDCONFIRM = 1;
    public static final String USERINFO_ALLOWTYPE_TYPE_ALLOWANY = "AllowType_Type_AllowAny";
    public static final String USERINFO_ALLOWTYPE_TYPE_DENYANY = "AllowType_Type_DenyAny";
    public static final String USERINFO_ALLOWTYPE_TYPE_NEEDCONFIRM = "AllowType_Type_NeedConfirm";
    public static final int USERINFO_GENDER_FEMALE = 2;
    public static final int USERINFO_GENDER_MALE = 1;
    public static final String USERINFO_GENDER_TYPE_FEMALE = "Gender_Type_Female";
    public static final String USERINFO_GENDER_TYPE_MALE = "Gender_Type_Male";
    public static final String USERINFO_GENDER_TYPE_UNKNOWN = "Gender_Type_Unknown";
    public static final int USERINFO_GENDER_UNKNOWN = 0;
    public static final String USERINFO_KEY_ALLOWTYPE = "Tag_Profile_IM_AllowType";
    public static final String USERINFO_KEY_BIRTHDAY = "Tag_Profile_IM_BirthDay";
    public static final String USERINFO_KEY_CUSTOM_PREFIX = "Tag_Profile_Custom_";
    public static final String USERINFO_KEY_FACEURL = "Tag_Profile_IM_Image";
    public static final String USERINFO_KEY_GENDER = "Tag_Profile_IM_Gender";
    public static final String USERINFO_KEY_LEVEL = "Tag_Profile_IM_Level";
    public static final String USERINFO_KEY_NICK = "Tag_Profile_IM_Nick";
    public static final String USERINFO_KEY_ROLE = "Tag_Profile_IM_Role";
    public static final String USERINFO_KEY_SELF_SIGNATURE = "Tag_Profile_IM_SelfSignature";
    public static final int USER_NOT_RECEIVE_MESSAGE_NATIVE = 2;
    public static final int USER_RECEIVE_MESSAGE_NATIVE = 1;
    public static final int USER_RECEIVE_NOT_NOTIFY_MESSAGE_NATIVE = 3;
    private int allowType;
    private long birthday;
    private String faceUrl;
    private int gender;
    private long language;
    private int level;
    private String location;
    private String nickname;
    private int role;
    private String signature;
    private String userID;
    private HashMap<String, byte[]> customUserInfoString = new HashMap<>();
    private HashMap<String, Long> customUserInfoNumber = new HashMap<>();

    public void addCustomUserInfoBytes(String str, byte[] bArr) {
        this.customUserInfoString.put(str, bArr);
    }

    public void addCustomUserInfoNumber(String str, long j2) {
        this.customUserInfoNumber.put(str, Long.valueOf(j2));
    }

    public int getAllowType() {
        return this.allowType;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public Map<String, Long> getCustomUserInfoNumber() {
        return this.customUserInfoNumber;
    }

    public HashMap<String, byte[]> getCustomUserInfoString() {
        return this.customUserInfoString;
    }

    public String getFaceUrl() {
        return this.faceUrl;
    }

    public int getGender() {
        return this.gender;
    }

    public long getLanguage() {
        return this.language;
    }

    public int getLevel() {
        return this.level;
    }

    public String getLocation() {
        return this.location;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getRole() {
        return this.role;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setAllowType(int i2) {
        this.allowType = i2;
    }

    public void setBirthday(long j2) {
        this.birthday = j2;
    }

    public void setFaceUrl(String str) {
        this.faceUrl = str;
    }

    public void setGender(int i2) {
        this.gender = i2;
    }

    public void setLanguage(long j2) {
        this.language = j2;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRole(int i2) {
        this.role = i2;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setUserID(String str) {
        this.userID = str;
    }
}
