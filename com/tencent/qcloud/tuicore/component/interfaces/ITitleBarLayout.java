package com.tencent.qcloud.tuicore.component.interfaces;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITitleBarLayout {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Position {
        private static final /* synthetic */ Position[] $VALUES = null;
        public static final Position LEFT = null;
        public static final Position MIDDLE = null;
        public static final Position RIGHT = null;

        private Position(String str, int i2) {
        }

        public static Position valueOf(String str) {
        }

        public static Position[] values() {
        }
    }

    LinearLayout getLeftGroup();

    ImageView getLeftIcon();

    TextView getLeftTitle();

    TextView getMiddleTitle();

    LinearLayout getRightGroup();

    ImageView getRightIcon();

    TextView getRightTitle();

    void setLeftIcon(int i2);

    void setOnLeftClickListener(View.OnClickListener onClickListener);

    void setOnRightClickListener(View.OnClickListener onClickListener);

    void setRightIcon(int i2);

    void setTitle(String str, Position position);
}
