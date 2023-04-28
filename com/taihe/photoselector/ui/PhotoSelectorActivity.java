package com.taihe.photoselector.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.taihe.photoselector.model.PhotoModel;
import com.taihe.photoselector.ui.PhotoItem;
import h.x.e.d.g;
import h.x.e.d.j;
import h.x.e.d.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PhotoSelectorActivity extends FragmentActivity implements PhotoItem.a, PhotoItem.b, AdapterView.OnItemClickListener, View.OnClickListener {
    private static final int A = 120;
    public static final String w = "is_selector_more";
    public static final String x = "IS_FROM_Chat";
    public static final String y = "MaxSelctNum";
    public static final String z = "is_carma";
    private boolean b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private k f7856d;

    /* renamed from: e  reason: collision with root package name */
    private GridView f7857e;

    /* renamed from: f  reason: collision with root package name */
    private ListView f7858f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f7859g;

    /* renamed from: h  reason: collision with root package name */
    private View f7860h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7861i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7862j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f7863k;

    /* renamed from: l  reason: collision with root package name */
    private h.x.e.b.b f7864l;

    /* renamed from: m  reason: collision with root package name */
    private j f7865m;

    /* renamed from: n  reason: collision with root package name */
    private g f7866n;

    /* renamed from: o  reason: collision with root package name */
    private HashMap<String, PhotoModel> f7867o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<PhotoModel> f7868p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private d u;
    private e v;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoSelectorActivity f7869a;

        public a(PhotoSelectorActivity photoSelectorActivity) {
        }

        @Override // h.x.e.d.k.c
        public void isDisplay(boolean z) {
        }

        @Override // h.x.e.d.k.c
        public void start(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoSelectorActivity f7870a;

        public b(PhotoSelectorActivity photoSelectorActivity) {
        }

        @Override // com.taihe.photoselector.ui.PhotoSelectorActivity.d
        public void a(List<h.x.e.c.a> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements e {
        public final /* synthetic */ PhotoSelectorActivity b;

        public c(PhotoSelectorActivity photoSelectorActivity) {
        }

        @Override // com.taihe.photoselector.ui.PhotoSelectorActivity.e
        public void u(List<PhotoModel> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void a(List<h.x.e.c.a> list);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface e {
        void u(List<PhotoModel> list);
    }

    public static /* synthetic */ GridView A(PhotoSelectorActivity photoSelectorActivity) {
    }

    public static /* synthetic */ boolean B(PhotoSelectorActivity photoSelectorActivity) {
    }

    public static /* synthetic */ void C(PhotoSelectorActivity photoSelectorActivity) {
    }

    private void D() {
    }

    private void E() {
    }

    private void F(Bundle bundle) {
    }

    private void G() {
    }

    private ArrayList<PhotoModel> H() {
    }

    private int I() {
    }

    private /* synthetic */ void J(Boolean bool) throws Exception {
    }

    private /* synthetic */ void L(Boolean bool) throws Exception {
    }

    private void N() {
    }

    private void O(String str) {
    }

    private String P(String str) {
    }

    private void Q() {
    }

    private void R() {
    }

    private void w() {
    }

    private void x() {
    }

    public static /* synthetic */ g y(PhotoSelectorActivity photoSelectorActivity) {
    }

    public static /* synthetic */ j z(PhotoSelectorActivity photoSelectorActivity) {
    }

    public /* synthetic */ void K(Boolean bool) {
    }

    public /* synthetic */ void M(Boolean bool) {
    }

    public void S(int i2) {
    }

    @Override // com.taihe.photoselector.ui.PhotoItem.a
    public void e(int i2) {
    }

    @Override // com.taihe.photoselector.ui.PhotoItem.b
    public void h(PhotoModel photoModel, CompoundButton compoundButton, boolean z2) {
    }

    public void initView() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }
}
