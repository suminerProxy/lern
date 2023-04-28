package tencent.txlive.zhibo.ui.gift;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.viewpagerindicator.UnderlinePageIndicator;
import h.y.a.o.y.b;
import h.y.a.o.y.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.audience.OnAudienceBanCall;

/* compiled from: LiveAudienceDialog.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u001a\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0006\u0010$\u001a\u00020\u001dJ6\u0010%\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveAudienceDialog;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "call", "Ltencent/txlive/zhibo/audience/OnAudienceBanCall;", "currentPos", "", "indicator", "Lcom/viewpagerindicator/UnderlinePageIndicator;", "isManager", "", "isShowTopUser", "isShowUser", "lineP", "Landroid/widget/FrameLayout;", "mRoomId", "", "radioBtn1", "Landroid/widget/RadioButton;", "radioBtn2", "radioGroup", "Landroid/widget/RadioGroup;", "tabFragment", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "viewPage", "Landroidx/viewpager/widget/ViewPager;", "getContentView", "initData", "", "initListener", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resetData", "setData", "clickTop", "MyFragmentPagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveAudienceDialog extends b {
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private OnAudienceBanCall call;
    private int currentPos;
    private UnderlinePageIndicator indicator;
    private boolean isManager;
    private boolean isShowTopUser;
    private boolean isShowUser;
    private FrameLayout lineP;
    @NotNull
    private String mRoomId;
    private RadioButton radioBtn1;
    private RadioButton radioBtn2;
    private RadioGroup radioGroup;
    @NotNull
    private final ArrayList<Fragment> tabFragment;
    @Nullable
    private ViewPager viewPage;

    /* compiled from: LiveAudienceDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Ltencent/txlive/zhibo/ui/gift/LiveAudienceDialog$MyFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "list", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getCount", "", "getItem", "arg0", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        @NotNull
        private final ArrayList<Fragment> list;

        public MyFragmentPagerAdapter(@Nullable FragmentManager fragmentManager, @NotNull ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i2) {
        }
    }

    public static final /* synthetic */ RadioButton access$getRadioBtn1$p(LiveAudienceDialog liveAudienceDialog) {
    }

    public static final /* synthetic */ RadioButton access$getRadioBtn2$p(LiveAudienceDialog liveAudienceDialog) {
    }

    public static final /* synthetic */ c access$getSheetDialog(LiveAudienceDialog liveAudienceDialog) {
    }

    public static final /* synthetic */ ArrayList access$getTabFragment$p(LiveAudienceDialog liveAudienceDialog) {
    }

    public static /* synthetic */ void e(LiveAudienceDialog liveAudienceDialog, RadioGroup radioGroup, int i2) {
    }

    /* renamed from: initListener$lambda-0  reason: not valid java name */
    private static final void m1737initListener$lambda0(LiveAudienceDialog liveAudienceDialog, RadioGroup radioGroup, int i2) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    @Override // h.y.a.o.y.b
    public void initData() {
    }

    @Override // h.y.a.o.y.b
    public void initListener() {
    }

    @Override // h.y.a.o.y.b
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    public final void resetData() {
    }

    public final void setData(@NotNull String str, boolean z, boolean z2, boolean z3, boolean z4, @NotNull OnAudienceBanCall onAudienceBanCall) {
    }
}
