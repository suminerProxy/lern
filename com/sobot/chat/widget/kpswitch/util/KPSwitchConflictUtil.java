package com.sobot.chat.widget.kpswitch.util;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class KPSwitchConflictUtil {
    private static boolean mIsInMultiWindowMode;

    /* renamed from: com.sobot.chat.widget.kpswitch.util.KPSwitchConflictUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ View val$focusView;
        public final /* synthetic */ View val$panelLayout;
        public final /* synthetic */ SwitchClickListener val$switchClickListener;

        public AnonymousClass1(View view, View view2, SwitchClickListener switchClickListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.util.KPSwitchConflictUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements View.OnTouchListener {
        public final /* synthetic */ View val$panelLayout;

        public AnonymousClass2(View view) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.util.KPSwitchConflictUtil$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements View.OnTouchListener {
        public final /* synthetic */ View val$panelLayout;

        public AnonymousClass3(View view) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.util.KPSwitchConflictUtil$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ View val$boundTriggerSubPanelView;
        public final /* synthetic */ View val$focusView;
        public final /* synthetic */ View val$panelLayout;
        public final /* synthetic */ SubPanelAndTrigger[] val$subPanelAndTriggers;
        public final /* synthetic */ SwitchClickListener val$switchClickListener;

        public AnonymousClass4(View view, View view2, View view3, SubPanelAndTrigger[] subPanelAndTriggerArr, SwitchClickListener switchClickListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SubPanelAndTrigger {
        public final View subPanelView;
        public final View triggerView;

        public SubPanelAndTrigger(View view, View view2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SwitchClickListener {
        void onClickSwitch(View view, boolean z);
    }

    public static /* synthetic */ void access$000(View view, SubPanelAndTrigger[] subPanelAndTriggerArr) {
    }

    public static void attach(View view, View view2, View view3) {
    }

    private static void bindSubPanel(SubPanelAndTrigger subPanelAndTrigger, SubPanelAndTrigger[] subPanelAndTriggerArr, View view, View view2, SwitchClickListener switchClickListener) {
    }

    public static void hidePanelAndKeyboard(View view) {
    }

    public static boolean isHandleByPlaceholder(Activity activity) {
    }

    public static boolean isHandleByPlaceholder(boolean z, boolean z2, boolean z3) {
    }

    public static void onMultiWindowModeChanged(boolean z) {
    }

    private static void showBoundTriggerSubPanel(View view, SubPanelAndTrigger[] subPanelAndTriggerArr) {
    }

    public static void showKeyboard(View view, View view2) {
    }

    public static void showPanel(View view) {
    }

    public static boolean switchPanelAndKeyboard(View view, View view2) {
    }

    public static void attach(View view, View view2, View view3, SwitchClickListener switchClickListener) {
    }

    public static void attach(View view, View view2, SubPanelAndTrigger... subPanelAndTriggerArr) {
    }

    public static void attach(View view, View view2, SwitchClickListener switchClickListener, SubPanelAndTrigger... subPanelAndTriggerArr) {
    }
}
