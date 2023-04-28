package com.sobot.chat.notchlib;

import android.app.Activity;
import android.graphics.Rect;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class NotchScreenManager {
    private static final NotchScreenManager instance = null;
    private final INotchScreen notchScreen;
    private boolean res;

    /* renamed from: com.sobot.chat.notchlib.NotchScreenManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements INotchScreen.NotchSizeCallback {
        public final /* synthetic */ NotchScreenManager this$0;
        public final /* synthetic */ INotchScreen.NotchScreenCallback val$notchScreenCallback;
        public final /* synthetic */ INotchScreen.NotchScreenInfo val$notchScreenInfo;

        public AnonymousClass1(NotchScreenManager notchScreenManager, INotchScreen.NotchScreenInfo notchScreenInfo, INotchScreen.NotchScreenCallback notchScreenCallback) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchSizeCallback
        public void onResult(List<Rect> list) {
        }
    }

    /* renamed from: com.sobot.chat.notchlib.NotchScreenManager$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements INotchScreen.NotchSizeCallback {
        public final /* synthetic */ NotchScreenManager this$0;

        public AnonymousClass2(NotchScreenManager notchScreenManager) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchSizeCallback
        public void onResult(List<Rect> list) {
        }
    }

    private NotchScreenManager() {
    }

    public static /* synthetic */ boolean access$002(NotchScreenManager notchScreenManager, boolean z) {
    }

    public static NotchScreenManager getInstance() {
    }

    private INotchScreen getNotchScreen() {
    }

    public void getNotchInfo(Activity activity, INotchScreen.NotchScreenCallback notchScreenCallback) {
    }

    public boolean hasNotch(Activity activity) {
    }

    public void setDisplayInNotch(Activity activity) {
    }
}
