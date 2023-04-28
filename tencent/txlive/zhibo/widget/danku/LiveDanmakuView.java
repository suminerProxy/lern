package tencent.txlive.zhibo.widget.danku;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.showstartfans.activity.model.DanMuCusItem;
import com.tai.danmuku.danmu.widget.DanmakuView;
import h.w.a.e.a.c;
import h.w.a.e.a.f;
import h.w.a.e.b.b.f;
import h.w.a.e.b.b.m;
import h.w.a.e.b.b.s.a;
import h.w.a.e.b.b.s.d;
import h.w.a.e.b.b.s.l;
import h.w.a.e.b.c.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class LiveDanmakuView extends DanmakuView {
    private d mContext;
    private a mParser;

    /* renamed from: tencent.txlive.zhibo.widget.danku.LiveDanmakuView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends l<h.w.a.a> {
        public final /* synthetic */ LiveDanmakuView this$0;

        public AnonymousClass1(LiveDanmakuView liveDanmakuView) {
        }

        @Override // h.w.a.e.b.b.s.l
        public /* bridge */ /* synthetic */ void onBindViewHolder(int i2, h.w.a.a aVar, h.w.a.e.b.b.d dVar, a.C0402a c0402a, TextPaint textPaint) {
        }

        @Override // h.w.a.e.b.b.s.l
        public /* bridge */ /* synthetic */ h.w.a.a onCreateViewHolder(int i2) {
        }

        @Override // h.w.a.e.b.b.s.b
        public void prepare(h.w.a.e.b.b.d dVar, boolean z) {
        }

        @Override // h.w.a.e.b.b.s.l, h.w.a.e.b.b.s.b
        public void releaseResource(h.w.a.e.b.b.d dVar) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(int i2, h.w.a.a aVar, h.w.a.e.b.b.d dVar, a.C0402a c0402a, TextPaint textPaint) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.w.a.e.b.b.s.l
        public h.w.a.a onCreateViewHolder(int i2) {
        }
    }

    /* renamed from: tencent.txlive.zhibo.widget.danku.LiveDanmakuView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 extends h.w.a.e.b.c.a {
        public final /* synthetic */ LiveDanmakuView this$0;

        public AnonymousClass2(LiveDanmakuView liveDanmakuView) {
        }

        @Override // h.w.a.e.b.c.a
        public m parse() {
        }
    }

    /* renamed from: tencent.txlive.zhibo.widget.danku.LiveDanmakuView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass3 implements c.d {
        public final /* synthetic */ LiveDanmakuView this$0;

        public AnonymousClass3(LiveDanmakuView liveDanmakuView) {
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

    /* renamed from: tencent.txlive.zhibo.widget.danku.LiveDanmakuView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass4 implements f.a {
        public final /* synthetic */ LiveDanmakuView this$0;

        public AnonymousClass4(LiveDanmakuView liveDanmakuView) {
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

    public LiveDanmakuView(@NonNull Context context) {
    }

    public void addDanmaku(DanMuCusItem danMuCusItem) {
    }

    @Override // com.tai.danmuku.danmu.widget.DanmakuView, h.w.a.e.a.f
    public View getView() {
    }

    public void addDanmaku(String str, String str2, String str3, int i2, String str4, boolean z, long j2) {
    }

    public LiveDanmakuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public LiveDanmakuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
