package com.sobot.chat.widget.kpswitch.widget.data;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class EmoticonPageEntity<T> extends PageEntity<EmoticonPageEntity> {
    private DelBtnStatus mDelBtnStatus;
    private List<T> mEmoticonList;
    private int mLine;
    private int mRow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class DelBtnStatus {
        private static final /* synthetic */ DelBtnStatus[] $VALUES = null;
        public static final DelBtnStatus FOLLOW = null;
        public static final DelBtnStatus GONE = null;
        public static final DelBtnStatus LAST = null;

        private DelBtnStatus(String str, int i2) {
        }

        public static DelBtnStatus valueOf(String str) {
        }

        public static DelBtnStatus[] values() {
        }

        public boolean isShow() {
        }
    }

    public DelBtnStatus getDelBtnStatus() {
    }

    public List<T> getEmoticonList() {
    }

    public int getLine() {
    }

    public int getRow() {
    }

    @Override // com.sobot.chat.widget.kpswitch.widget.data.PageEntity, com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener
    public /* bridge */ /* synthetic */ View instantiateItem(ViewGroup viewGroup, int i2, PageEntity pageEntity) {
    }

    public void setDelBtnStatus(DelBtnStatus delBtnStatus) {
    }

    public void setEmoticonList(List<T> list) {
    }

    public void setLine(int i2) {
    }

    public void setRow(int i2) {
    }

    public View instantiateItem(ViewGroup viewGroup, int i2, EmoticonPageEntity emoticonPageEntity) {
    }
}
