package com.tencent.qcloud.tuicore.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TitleBarLayout extends LinearLayout implements ITitleBarLayout {
    private TextView mCenterTitle;
    private LinearLayout mLeftGroup;
    private ImageView mLeftIcon;
    private TextView mLeftTitle;
    private LinearLayout mRightGroup;
    private ImageView mRightIcon;
    private TextView mRightTitle;
    private RelativeLayout mTitleLayout;
    private UnreadCountTextView unreadCountTextView;

    /* renamed from: com.tencent.qcloud.tuicore.component.TitleBarLayout$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TitleBarLayout this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass1(TitleBarLayout titleBarLayout, Context context) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.TitleBarLayout$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$qcloud$tuicore$component$interfaces$ITitleBarLayout$Position = null;
    }

    public TitleBarLayout(Context context) {
    }

    private void init(Context context, @Nullable AttributeSet attributeSet) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public LinearLayout getLeftGroup() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public ImageView getLeftIcon() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public TextView getLeftTitle() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public TextView getMiddleTitle() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public LinearLayout getRightGroup() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public ImageView getRightIcon() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public TextView getRightTitle() {
    }

    public UnreadCountTextView getUnreadCountTextView() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public void setLeftIcon(int i2) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public void setOnLeftClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public void setOnRightClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public void setRightIcon(int i2) {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ITitleBarLayout
    public void setTitle(String str, ITitleBarLayout.Position position) {
    }

    public TitleBarLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public TitleBarLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
