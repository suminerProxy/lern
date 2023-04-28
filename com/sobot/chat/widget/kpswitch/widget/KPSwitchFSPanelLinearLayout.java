package com.sobot.chat.widget.kpswitch.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;
import android.widget.LinearLayout;
import com.sobot.chat.widget.kpswitch.IFSPanelConflictLayout;
import com.sobot.chat.widget.kpswitch.IPanelHeightTarget;
import com.sobot.chat.widget.kpswitch.handler.KPSwitchFSPanelLayoutHandler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KPSwitchFSPanelLinearLayout extends LinearLayout implements IPanelHeightTarget, IFSPanelConflictLayout {
    private KPSwitchFSPanelLayoutHandler panelHandler;

    public KPSwitchFSPanelLinearLayout(Context context) {
    }

    private void init() {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelHeightTarget
    public void onKeyboardShowing(boolean z) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IFSPanelConflictLayout
    public void recordKeyboardStatus(Window window) {
    }

    @Override // com.sobot.chat.widget.kpswitch.IPanelHeightTarget
    public void refreshHeight(int i2) {
    }

    public KPSwitchFSPanelLinearLayout(Context context, AttributeSet attributeSet) {
    }

    @TargetApi(11)
    public KPSwitchFSPanelLinearLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public KPSwitchFSPanelLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
