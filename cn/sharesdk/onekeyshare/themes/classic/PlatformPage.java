package cn.sharesdk.onekeyshare.themes.classic;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.onekeyshare.CustomerLogo;
import cn.sharesdk.onekeyshare.OnekeySharePage;
import cn.sharesdk.onekeyshare.OnekeyShareThemeImpl;
import cn.sharesdk.onekeyshare.ShareContentCustomizeCallback;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class PlatformPage extends OnekeySharePage {
    private Animation animHide;
    private Animation animShow;
    private Runnable beforeFinish;
    private boolean finished;
    private ClassicTheme impl;
    private LinearLayout llPanel;

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.PlatformPage$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ PlatformPage this$0;

        public AnonymousClass1(PlatformPage platformPage) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.PlatformPage$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ PlatformPage this$0;
        public final /* synthetic */ Platform val$platform;

        public AnonymousClass2(PlatformPage platformPage, Platform platform) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.PlatformPage$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ PlatformPage this$0;
        public final /* synthetic */ CustomerLogo val$logo;
        public final /* synthetic */ View val$v;

        public AnonymousClass3(PlatformPage platformPage, CustomerLogo customerLogo, View view) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.PlatformPage$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Animation.AnimationListener {
        public final /* synthetic */ PlatformPage this$0;

        public AnonymousClass4(PlatformPage platformPage) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public PlatformPage(OnekeyShareThemeImpl onekeyShareThemeImpl) {
    }

    public static /* synthetic */ boolean access$000(PlatformPage platformPage) {
    }

    public static /* synthetic */ boolean access$100(PlatformPage platformPage, Platform platform) {
    }

    public static /* synthetic */ void access$200(PlatformPage platformPage, Platform platform) {
    }

    public static /* synthetic */ Platform.ShareParams access$300(PlatformPage platformPage, Platform platform) {
    }

    public static /* synthetic */ ShareContentCustomizeCallback access$400(PlatformPage platformPage) {
    }

    public static /* synthetic */ ShareContentCustomizeCallback access$500(PlatformPage platformPage) {
    }

    public static /* synthetic */ Activity access$600(PlatformPage platformPage) {
    }

    public static /* synthetic */ ClassicTheme access$700(PlatformPage platformPage) {
    }

    public static /* synthetic */ Runnable access$800(PlatformPage platformPage) {
    }

    public static /* synthetic */ Runnable access$802(PlatformPage platformPage, Runnable runnable) {
    }

    public static /* synthetic */ boolean access$902(PlatformPage platformPage, boolean z) {
    }

    private void initAnims() {
    }

    private boolean isCanShare(Platform platform) {
    }

    public ArrayList<Object> collectCells() {
    }

    public abstract PlatformPageAdapter newAdapter(ArrayList<Object> arrayList);

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
    }

    public final void performCustomLogoClick(View view, CustomerLogo customerLogo) {
    }

    public final void showEditPage(Platform platform) {
    }
}
