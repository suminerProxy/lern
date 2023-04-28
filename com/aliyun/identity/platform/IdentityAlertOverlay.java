package com.aliyun.identity.platform;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityAlertOverlay extends FrameLayout {
    private CommAlertOverlayListener commAlertOverlayListener;
    private boolean hasCancel;

    /* renamed from: com.aliyun.identity.platform.IdentityAlertOverlay$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ IdentityAlertOverlay this$0;

        public AnonymousClass1(IdentityAlertOverlay identityAlertOverlay) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.IdentityAlertOverlay$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ IdentityAlertOverlay this$0;

        public AnonymousClass2(IdentityAlertOverlay identityAlertOverlay) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.IdentityAlertOverlay$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ IdentityAlertOverlay this$0;

        public AnonymousClass3(IdentityAlertOverlay identityAlertOverlay) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CommAlertOverlayListener {
        void onCancel();

        void onConfirm();
    }

    public IdentityAlertOverlay(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ CommAlertOverlayListener access$000(IdentityAlertOverlay identityAlertOverlay) {
    }

    public void setButtonType(boolean z) {
    }

    public void setCancelText(String str) {
    }

    public void setCommAlertOverlayListener(CommAlertOverlayListener commAlertOverlayListener) {
    }

    public void setConfirmText(String str) {
    }

    public void setMessageText(String str) {
    }

    public void setTitleText(String str) {
    }
}
