package com.sobot.chat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTenRatingLayout extends LinearLayout {
    private OnClickItemListener onClickItemListener;
    private int selectContent;

    /* renamed from: com.sobot.chat.widget.SobotTenRatingLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotTenRatingLayout this$0;
        public final /* synthetic */ boolean val$isCanChange;
        public final /* synthetic */ int val$position;

        public AnonymousClass1(SobotTenRatingLayout sobotTenRatingLayout, boolean z, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnClickItemListener {
        void onClickItem(int i2);
    }

    public SobotTenRatingLayout(Context context) {
    }

    public static /* synthetic */ OnClickItemListener access$000(SobotTenRatingLayout sobotTenRatingLayout) {
    }

    public static /* synthetic */ int access$102(SobotTenRatingLayout sobotTenRatingLayout, int i2) {
    }

    private boolean isTouchPointInView(View view, int i2, int i3) {
    }

    public OnClickItemListener getOnClickItemListener() {
    }

    public int getSelectContent() {
    }

    public void init(int i2, boolean z) {
    }

    public void setOnClickItemListener(OnClickItemListener onClickItemListener) {
    }

    public void setSelectContent(int i2) {
    }

    public void updateUI(int i2) {
    }

    public SobotTenRatingLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public SobotTenRatingLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
