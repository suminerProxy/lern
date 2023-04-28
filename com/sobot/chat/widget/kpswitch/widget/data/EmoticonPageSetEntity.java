package com.sobot.chat.widget.kpswitch.widget.data;

import com.sobot.chat.widget.kpswitch.widget.data.EmoticonPageEntity;
import com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity;
import com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class EmoticonPageSetEntity<T> extends PageSetEntity<EmoticonPageEntity> {
    public final EmoticonPageEntity.DelBtnStatus mDelBtnStatus;
    public final ArrayList<T> mEmoticonList;
    public final int mLine;
    public final int mRow;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class Builder<T> extends PageSetEntity.Builder {
        public EmoticonPageEntity.DelBtnStatus delBtnStatus;
        public ArrayList<T> emoticonList;
        public int line;
        public PageViewInstantiateListener pageViewInstantiateListener;
        public int row;

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public /* bridge */ /* synthetic */ PageSetEntity build() {
        }

        public Builder setEmoticonList(ArrayList<T> arrayList) {
        }

        public Builder setIPageViewInstantiateItem(PageViewInstantiateListener pageViewInstantiateListener) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public /* bridge */ /* synthetic */ PageSetEntity.Builder setIconUri(int i2) {
        }

        public Builder setLine(int i2) {
        }

        public Builder setRow(int i2) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public /* bridge */ /* synthetic */ PageSetEntity.Builder setSetName(String str) {
        }

        public Builder setShowDelBtn(EmoticonPageEntity.DelBtnStatus delBtnStatus) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public /* bridge */ /* synthetic */ PageSetEntity.Builder setShowIndicator(boolean z) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public EmoticonPageSetEntity<T> build() {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public /* bridge */ /* synthetic */ PageSetEntity.Builder setIconUri(String str) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public Builder setSetName(String str) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public Builder setShowIndicator(boolean z) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public Builder setIconUri(String str) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity.Builder
        public Builder setIconUri(int i2) {
        }
    }

    public EmoticonPageSetEntity(Builder builder) {
    }

    public EmoticonPageEntity.DelBtnStatus getDelBtnStatus() {
    }

    public ArrayList<T> getEmoticonList() {
    }

    public int getLine() {
    }

    public int getRow() {
    }
}
