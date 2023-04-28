package com.showstartfans.activity.widget.danmu;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.showstartfans.activity.model.DanMuCusItem;
import com.tai.danmuku.danmu.widget.DanmakuView;
import h.w.a.e.a.c;
import h.w.a.e.a.f;
import h.w.a.e.b.b.f;
import h.w.a.e.b.b.m;
import h.w.a.e.b.b.s.a;
import h.w.a.e.b.b.s.l;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class THDanmakuView extends DanmakuView {
    private Context b;
    private h.w.a.e.b.b.s.d c;

    /* renamed from: d  reason: collision with root package name */
    private h.w.a.e.b.c.a f7481d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<h.w.a.c> f7482e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends l<h.w.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ THDanmakuView f7483a;

        public a(THDanmakuView tHDanmakuView) {
        }

        public void a(int i2, h.w.a.b bVar, h.w.a.e.b.b.d dVar, a.C0402a c0402a, TextPaint textPaint) {
        }

        public h.w.a.b b(int i2) {
        }

        @Override // h.w.a.e.b.b.s.l
        public /* bridge */ /* synthetic */ void onBindViewHolder(int i2, h.w.a.b bVar, h.w.a.e.b.b.d dVar, a.C0402a c0402a, TextPaint textPaint) {
        }

        @Override // h.w.a.e.b.b.s.l
        public /* bridge */ /* synthetic */ h.w.a.b onCreateViewHolder(int i2) {
        }

        @Override // h.w.a.e.b.b.s.b
        public void prepare(h.w.a.e.b.b.d dVar, boolean z) {
        }

        @Override // h.w.a.e.b.b.s.l, h.w.a.e.b.b.s.b
        public void releaseResource(h.w.a.e.b.b.d dVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends h.w.a.e.b.c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ THDanmakuView f7484a;

        public b(THDanmakuView tHDanmakuView) {
        }

        @Override // h.w.a.e.b.c.a
        public m parse() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements c.d {
        public final /* synthetic */ THDanmakuView b;

        public c(THDanmakuView tHDanmakuView) {
        }

        @Override // h.w.a.e.a.c.d
        public void danmakuShown(h.w.a.e.b.b.d dVar) {
        }

        @Override // h.w.a.e.a.c.d
        public void drawingFinished() {
        }

        @Override // h.w.a.e.a.c.d
        public void prepared() {
        }

        @Override // h.w.a.e.a.c.d
        public void updateTimer(f fVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ THDanmakuView f7485a;

        public d(THDanmakuView tHDanmakuView) {
        }

        @Override // h.w.a.e.a.f.a
        public boolean onDanmakuClick(m mVar) {
        }

        @Override // h.w.a.e.a.f.a
        public boolean onDanmakuLongClick(m mVar) {
        }

        @Override // h.w.a.e.a.f.a
        public boolean onViewClick(h.w.a.e.a.f fVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends h.y.a.k.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h.w.a.e.b.b.d f7486d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ THDanmakuView f7487e;

        public e(THDanmakuView tHDanmakuView, h.w.a.e.b.b.d dVar) {
        }

        @Override // h.y.a.k.c
        public void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
        }

        @Override // h.y.a.k.c
        public void b(@Nullable Bitmap bitmap) {
        }
    }

    public THDanmakuView(@NonNull Context context) {
    }

    public static /* synthetic */ Context a(THDanmakuView tHDanmakuView) {
    }

    public static /* synthetic */ WeakReference b(THDanmakuView tHDanmakuView) {
    }

    public void addDanmaku(DanMuCusItem danMuCusItem) {
    }

    public void c(String str, String str2, String str3, String str4, int i2, String str5, boolean z, long j2) {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.f
    public View getView() {
    }

    public void setDanmuItemCall(h.w.a.c cVar) {
    }

    public THDanmakuView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet) {
    }

    public THDanmakuView(@NonNull Context context, @androidx.annotation.Nullable AttributeSet attributeSet, int i2) {
    }
}
