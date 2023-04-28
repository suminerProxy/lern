package com.sobot.chat.widget.kpswitch.handler;

import android.util.AttributeSet;
import android.view.View;
import com.sobot.chat.widget.kpswitch.IPanelConflictLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KPSwitchPanelLayoutHandler implements IPanelConflictLayout {
    private boolean mIgnoreRecommendHeight;
    private boolean mIsHide;
    private boolean mIsKeyboardShowing;
    private final View panelLayout;
    private final int[] processedMeasureWHSpec;

    public KPSwitchPanelLayoutHandler(View view, AttributeSet attributeSet) {
    }

    public boolean filterSetVisibility(int i2) {
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

    public int[] processOnMeasure(int i2, int i3) {
    }

    public void resetToRecommendPanelHeight(int i2) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelConflictLayout
    public void setIgnoreRecommendHeight(boolean z) {
    }

    public void setIsKeyboardShowing(boolean z) {
    }
}
