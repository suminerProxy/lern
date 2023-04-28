package com.tencent.imsdk.v2;

import com.tencent.imsdk.relationship.FriendSearchParam;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMFriendSearchParam implements Serializable {
    private static final int SEARCH_FIELD_NICK_NAME = 2;
    private static final int SEARCH_FIELD_REMARK = 4;
    private static final int SEARCH_FIELD_USER_ID = 1;
    private FriendSearchParam friendSearchParam = new FriendSearchParam();

    public FriendSearchParam getFriendSearchParam() {
        return this.friendSearchParam;
    }

    public List<String> getKeywordList() {
        return this.friendSearchParam.getKeywordList();
    }

    public void setKeywordList(List<String> list) {
        this.friendSearchParam.setKeywordList(list);
    }

    public void setSearchNickName(boolean z) {
        if (z) {
            this.friendSearchParam.addSearchField(2);
        } else {
            this.friendSearchParam.removeSearchField(2);
        }
    }

    public void setSearchRemark(boolean z) {
        if (z) {
            this.friendSearchParam.addSearchField(4);
        } else {
            this.friendSearchParam.removeSearchField(4);
        }
    }

    public void setSearchUserID(boolean z) {
        if (z) {
            this.friendSearchParam.addSearchField(1);
        } else {
            this.friendSearchParam.removeSearchField(1);
        }
    }
}
