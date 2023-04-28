package com.sobot.chat.widget.kpswitch.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.sobot.chat.widget.kpswitch.IPanelConflictLayout;
import com.sobot.chat.widget.kpswitch.IPanelHeightTarget;
import com.sobot.chat.widget.kpswitch.handler.KPSwitchPanelLayoutHandler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KPSwitchPanelFrameLayout extends FrameLayout implements IPanelHeightTarget, IPanelConflictLayout {
    private KPSwitchPanelLayoutHandler panelLayoutHandler;

    public KPSwitchPanelFrameLayout(Context context) {
    }

    private void init(AttributeSet attributeSet) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public void handleHide() {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public void handleShow() {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public boolean isKeyboardShowing() {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public boolean isVisible() {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelHeightTarget
    public void onKeyboardShowing(boolean z) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelHeightTarget
    public void refreshHeight(int i2) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public void setIgnoreRecommendHeight(boolean z) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public KPSwitchPanelFrameLayout(Context context, AttributeSet attributeSet) {
    }

    public KPSwitchPanelFrameLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public KPSwitchPanelFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
