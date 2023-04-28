package com.sobot.chat.widget.kpswitch.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;
import android.widget.RelativeLayout;
import com.sobot.chat.widget.kpswitch.IFSPanelConflictLayout;
import com.sobot.chat.widget.kpswitch.IPanelHeightTarget;
import com.sobot.chat.widget.kpswitch.handler.KPSwitchFSPanelLayoutHandler;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KPSwitchFSPanelRelativeLayout extends RelativeLayout implements IPanelHeightTarget, IFSPanelConflictLayout {
    private KPSwitchFSPanelLayoutHandler panelHandler;

    public KPSwitchFSPanelRelativeLayout(Context context) {
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

    public KPSwitchFSPanelRelativeLayout(Context context, AttributeSet attributeSet) {
    }

    public KPSwitchFSPanelRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public KPSwitchFSPanelRelativeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
