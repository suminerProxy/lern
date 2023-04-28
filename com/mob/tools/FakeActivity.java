package com.mob.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.utils.DH;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FakeActivity implements EverythingKeeper {
    private static Class<? extends Activity> shellClass;
    public Activity activity;
    private View contentView;
    private HashMap<String, Object> result;
    private FakeActivity resultReceiver;

    /* renamed from: com.mob.tools.FakeActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3950a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ FakeActivity c;

        public AnonymousClass1(FakeActivity fakeActivity, Context context, Intent intent) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.mob.tools.FakeActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements DH.DHResponder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f3951a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ FakeActivity c;

        public AnonymousClass2(FakeActivity fakeActivity, Intent intent, Context context) {
        }

        @Override // com.mob.tools.utils.DH.DHResponder
        public void onResponse(DH.DHResponse dHResponse) {
        }
    }

    /* renamed from: com.mob.tools.FakeActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f3952a;
        public final /* synthetic */ FakeActivity b;

        public AnonymousClass3(FakeActivity fakeActivity, Runnable runnable) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: com.mob.tools.FakeActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f3953a;
        public final /* synthetic */ FakeActivity b;

        public AnonymousClass4(FakeActivity fakeActivity, Runnable runnable) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    public static /* synthetic */ void access$000(FakeActivity fakeActivity, Context context, Intent intent) {
    }

    public static void registerExecutor(String str, Object obj) {
    }

    public static void setShell(Class<? extends Activity> cls) {
    }

    private void showActivity(Context context, Intent intent) {
    }

    public void beforeStartActivityForResult(Intent intent, int i2, Bundle bundle) {
    }

    public boolean disableScreenCapture() {
    }

    public <T extends View> T findViewById(int i2) {
    }

    public <T extends View> T findViewByResName(View view, String str) {
    }

    public final void finish() {
    }

    public View getContentView() {
    }

    public Context getContext() {
    }

    public int getOrientation() {
    }

    public FakeActivity getParent() {
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
    }

    public void onDestroy() {
    }

    public boolean onFinish() {
    }

    public boolean onKeyEvent(int i2, KeyEvent keyEvent) {
    }

    public void onNewIntent(Intent intent) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onRestart() {
    }

    public void onResult(HashMap<String, Object> hashMap) {
    }

    public void onResume() {
    }

    public int onSetTheme(int i2, boolean z) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void requestFullScreen(boolean z) {
    }

    public void requestLandscapeOrientation() {
    }

    public void requestPermissions(String[] strArr, int i2) {
    }

    public void requestPortraitOrientation() {
    }

    public void requestSensorLandscapeOrientation() {
    }

    public void requestSensorPortraitOrientation() {
    }

    public void runOnUIThread(Runnable runnable) {
    }

    public void sendResult() {
    }

    public void setActivity(Activity activity) {
    }

    public void setContentView(View view) {
    }

    public void setContentViewLayoutResName(String str) {
    }

    public void setRequestedOrientation(int i2) {
    }

    public final void setResult(HashMap<String, Object> hashMap) {
    }

    public void show(Context context, Intent intent) {
    }

    public void showForResult(Context context, Intent intent, FakeActivity fakeActivity) {
    }

    public void startActivity(Intent intent) {
    }

    public void startActivityForResult(Intent intent, int i2) {
    }

    public void runOnUIThread(Runnable runnable, long j2) {
    }

    public <T extends View> T findViewByResName(String str) {
    }
}
