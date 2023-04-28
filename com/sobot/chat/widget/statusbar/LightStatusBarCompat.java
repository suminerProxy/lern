package com.sobot.chat.widget.statusbar;

import android.annotation.TargetApi;
import android.view.Window;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LightStatusBarCompat {
    private static final ILightStatusBar IMPL = null;

    /* renamed from: com.sobot.chat.widget.statusbar.LightStatusBarCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 extends MLightStatusBarImpl {
        private final ILightStatusBar DELEGATE;

        @Override // com.sobot.chat.widget.statusbar.LightStatusBarCompat.MLightStatusBarImpl, com.sobot.chat.widget.statusbar.LightStatusBarCompat.ILightStatusBar
        public void setLightStatusBar(Window window, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.widget.statusbar.LightStatusBarCompat$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements ILightStatusBar {
        @Override // com.sobot.chat.widget.statusbar.LightStatusBarCompat.ILightStatusBar
        public void setLightStatusBar(Window window, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ILightStatusBar {
        void setLightStatusBar(Window window, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class MIUILightStatusBarImpl implements ILightStatusBar {
        private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
        private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
        private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

        private MIUILightStatusBarImpl() {
        }

        public static boolean isMe() {
        }

        @Override // com.sobot.chat.widget.statusbar.LightStatusBarCompat.ILightStatusBar
        public void setLightStatusBar(Window window, boolean z) {
        }

        public /* synthetic */ MIUILightStatusBarImpl(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class MLightStatusBarImpl implements ILightStatusBar {
        private MLightStatusBarImpl() {
        }

        @Override // com.sobot.chat.widget.statusbar.LightStatusBarCompat.ILightStatusBar
        @TargetApi(11)
        public void setLightStatusBar(Window window, boolean z) {
        }

        public /* synthetic */ MLightStatusBarImpl(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class MeizuLightStatusBarImpl implements ILightStatusBar {
        private MeizuLightStatusBarImpl() {
        }

        public static boolean isMe() {
        }

        @Override // com.sobot.chat.widget.statusbar.LightStatusBarCompat.ILightStatusBar
        public void setLightStatusBar(Window window, boolean z) {
        }

        public /* synthetic */ MeizuLightStatusBarImpl(AnonymousClass1 anonymousClass1) {
        }
    }

    public static void setLightStatusBar(Window window, boolean z) {
    }
}
