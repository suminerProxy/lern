package com.sobot.chat.widget.kpswitch.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseChattingPanelView {
    public Context context;
    private View rootView;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotBasePanelListener {
    }

    public BaseChattingPanelView(Context context) {
    }

    public int getResDrawableId(String str) {
    }

    public int getResId(String str) {
    }

    public int getResInteger(String str) {
    }

    public int getResIntegerId(String str) {
    }

    public int getResLayoutId(String str) {
    }

    public String getResString(String str) {
    }

    public int getResStringId(String str) {
    }

    public View getRootView() {
    }

    public abstract String getRootViewTag();

    public abstract void initData();

    public abstract View initView();

    public void onViewStart(Bundle bundle) {
    }

    public abstract void setListener(SobotBasePanelListener sobotBasePanelListener);
}
