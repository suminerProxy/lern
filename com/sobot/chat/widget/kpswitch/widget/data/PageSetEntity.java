package com.sobot.chat.widget.kpswitch.widget.data;

import com.sobot.chat.widget.kpswitch.widget.data.PageEntity;
import java.io.Serializable;
import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PageSetEntity<T extends PageEntity> implements Serializable {
    public final String mIconUri;
    public final boolean mIsShowIndicator;
    public final int mPageCount;
    public final LinkedList<T> mPageEntityList;
    public final String mSetName;
    public final String uuid;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class Builder<T extends PageEntity> {
        public String iconUri;
        public boolean isShowIndicator;
        public int pageCount;
        public LinkedList<T> pageEntityList;
        public String setName;

        public Builder addPageEntity(T t) {
        }

        public PageSetEntity<T> build() {
        }

        public Builder setIconUri(String str) {
        }

        public Builder setPageCount(int i2) {
        }

        public Builder setPageEntityList(LinkedList<T> linkedList) {
        }

        public Builder setSetName(String str) {
        }

        public Builder setShowIndicator(boolean z) {
        }

        public Builder setIconUri(int i2) {
        }
    }

    public PageSetEntity(Builder builder) {
    }

    public String getIconUri() {
    }

    public int getPageCount() {
    }

    public LinkedList<T> getPageEntityList() {
    }

    public String getUuid() {
    }

    public boolean isShowIndicator() {
    }
}
