package calander.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ScrollableLayout extends LinearLayout {
    private final String b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private float f48d;

    /* renamed from: e  reason: collision with root package name */
    private float f49e;

    /* renamed from: f  reason: collision with root package name */
    private int f50f;

    /* renamed from: g  reason: collision with root package name */
    private int f51g;

    /* renamed from: h  reason: collision with root package name */
    private int f52h;

    /* renamed from: i  reason: collision with root package name */
    private int f53i;

    /* renamed from: j  reason: collision with root package name */
    private int f54j;

    /* renamed from: k  reason: collision with root package name */
    private int f55k;

    /* renamed from: l  reason: collision with root package name */
    private int f56l;

    /* renamed from: m  reason: collision with root package name */
    private a f57m;

    /* renamed from: n  reason: collision with root package name */
    private int f58n;

    /* renamed from: o  reason: collision with root package name */
    private int f59o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f60p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private View u;
    private ViewPager v;
    private Scroller w;
    private VelocityTracker x;
    private b y;
    private g.e.a z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a DOWN = null;
        public static final a UP = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        void a(int i2, int i3);
    }

    public ScrollableLayout(Context context) {
    }

    private int a(int i2, int i3) {
    }

    private void c(int i2, int i3, int i4) {
    }

    private void d(int i2, int i3, int i4) {
    }

    @TargetApi(14)
    private int e(int i2, int i3) {
    }

    private void f(Context context) {
    }

    private void g() {
    }

    private void h() {
    }

    private void k() {
    }

    public boolean b() {
    }

    @Override // android.view.View
    public void computeScroll() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public g.e.a getHelper() {
    }

    public int getMaxY() {
    }

    public boolean i() {
    }

    public boolean j() {
    }

    public void l(boolean z) {
    }

    public void m() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    public void setClickHeadExpand(int i2) {
    }

    public void setOnScrollListener(b bVar) {
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
    }

    @TargetApi(11)
    public ScrollableLayout(Context context, AttributeSet attributeSet, int i2) {
    }
}
