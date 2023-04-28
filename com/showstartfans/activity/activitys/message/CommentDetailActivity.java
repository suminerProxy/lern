package com.showstartfans.activity.activitys.message;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.CommentCrowdBean;
import com.showstartfans.activity.model.MessageDetailBean;
import com.showstartfans.activity.model.MessageDetailLettersBean;
import com.showstartfans.activity.view.commentdetail.CommentHeadView;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.c.g0.o1;
import h.u.a.k.k;
import h.u.a.k.l;
import h.u.a.k.m;
import h.v.a.d;
import h.v.a.e.e;
import h.y.a.k.h;
import h.y.a.m.n;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CommentDetailActivity extends BaseNewActivity implements l, k, h<MessageDetailLettersBean> {
    public static final String t = "DATA_USERID";
    public static final String u = "DATA_POSITION";
    public static final String v = "DATA_ID";
    public static final String w = "DATA_TYPE";
    private m b;
    private FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    private CommentHeadView f5965d;

    /* renamed from: e  reason: collision with root package name */
    private PullRefreshLayout f5966e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f5967f;

    /* renamed from: g  reason: collision with root package name */
    private o1 f5968g;

    /* renamed from: h  reason: collision with root package name */
    private e f5969h;

    /* renamed from: i  reason: collision with root package name */
    private d f5970i;

    /* renamed from: j  reason: collision with root package name */
    private View f5971j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<MessageDetailLettersBean> f5972k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<MessageDetailLettersBean> f5973l;

    /* renamed from: m  reason: collision with root package name */
    private MessageDetailBean f5974m;

    /* renamed from: n  reason: collision with root package name */
    private MessageDetailBean f5975n;

    /* renamed from: o  reason: collision with root package name */
    private int f5976o;

    /* renamed from: p  reason: collision with root package name */
    private int f5977p;
    private String q;
    private int r;
    private int s;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommentDetailActivity f5978a;

        public a(CommentDetailActivity commentDetailActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static /* synthetic */ int A(CommentDetailActivity commentDetailActivity, int i2) {
    }

    public static /* synthetic */ void B(CommentDetailActivity commentDetailActivity, boolean z, int i2, int i3) {
    }

    private void C(boolean z, int i2, int i3, n nVar) {
    }

    private void D(MessageDetailLettersBean messageDetailLettersBean, int i2) {
    }

    private void E(MessageDetailLettersBean messageDetailLettersBean, int i2) {
    }

    private void F(boolean z, int i2, int i3, int i4) {
    }

    private void G(boolean z, int i2, int i3) {
    }

    private void H(boolean z) {
    }

    private /* synthetic */ void I(h.y.a.p.w.a aVar, MessageDetailLettersBean messageDetailLettersBean, int i2, View view) {
    }

    public static /* synthetic */ void K(h.y.a.p.w.a aVar, View view) {
    }

    private /* synthetic */ void L(int i2, MessageDetailLettersBean messageDetailLettersBean, n nVar) {
    }

    private /* synthetic */ void N(boolean z, int i2, int i3, n nVar) {
    }

    private /* synthetic */ void P(View view) {
    }

    private /* synthetic */ boolean R(View view, MotionEvent motionEvent) {
    }

    private /* synthetic */ void T(View view) {
    }

    private /* synthetic */ void V(boolean z) {
    }

    private /* synthetic */ void X(int i2) {
    }

    private /* synthetic */ Unit Z(boolean z, int i2, int i3) {
    }

    private void d0() {
    }

    private void e0() {
    }

    private void f0(CommentCrowdBean commentCrowdBean) {
    }

    private void g0() {
    }

    public static /* synthetic */ int w(CommentDetailActivity commentDetailActivity) {
    }

    public static /* synthetic */ int x(CommentDetailActivity commentDetailActivity) {
    }

    public static /* synthetic */ int y(CommentDetailActivity commentDetailActivity, int i2) {
    }

    public static /* synthetic */ int z(CommentDetailActivity commentDetailActivity) {
    }

    public /* synthetic */ void J(h.y.a.p.w.a aVar, MessageDetailLettersBean messageDetailLettersBean, int i2, View view) {
    }

    public /* synthetic */ void M(int i2, MessageDetailLettersBean messageDetailLettersBean, n nVar) {
    }

    public /* synthetic */ void O(boolean z, int i2, int i3, n nVar) {
    }

    public /* synthetic */ void Q(View view) {
    }

    public /* synthetic */ boolean S(View view, MotionEvent motionEvent) {
    }

    public /* synthetic */ void U(View view) {
    }

    public /* synthetic */ void W(boolean z) {
    }

    public /* synthetic */ void Y(int i2) {
    }

    public /* synthetic */ Unit a0(boolean z, int i2, int i3) {
    }

    @Override // h.y.a.k.h
    public /* bridge */ /* synthetic */ void b(MessageDetailLettersBean messageDetailLettersBean, int i2) {
    }

    public void b0(boolean z) {
    }

    public void c0(MessageDetailLettersBean messageDetailLettersBean, int i2) {
    }

    @Override // h.u.a.k.l
    public void d(String str) {
    }

    public void h0(MessageDetailLettersBean messageDetailLettersBean) {
    }

    @Override // h.u.a.k.l
    public void i(String str) {
    }

    public void i0(boolean z) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean isInSpecialScene() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // h.u.a.k.k
    public void q() {
    }

    @Override // h.u.a.k.k
    public void r() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
