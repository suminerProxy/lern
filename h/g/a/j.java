package h.g.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import h.g.a.t.l.p;
import h.g.a.t.l.r;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j<TranscodeType> extends h.g.a.t.a<j<TranscodeType>> implements Cloneable, g<j<TranscodeType>> {

    /* renamed from: p  reason: collision with root package name */
    public static final RequestOptions f16466p = null;
    private final Context b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<TranscodeType> f16467d;

    /* renamed from: e  reason: collision with root package name */
    private final Glide f16468e;

    /* renamed from: f  reason: collision with root package name */
    private final c f16469f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    private l<?, ? super TranscodeType> f16470g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private Object f16471h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private List<h.g.a.t.h<TranscodeType>> f16472i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private j<TranscodeType> f16473j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private j<TranscodeType> f16474k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private Float f16475l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16476m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16477n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16478o;

    /* compiled from: RequestBuilder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16479a = null;
        public static final /* synthetic */ int[] b = null;
    }

    @SuppressLint({"CheckResult"})
    public j(@NonNull Glide glide, k kVar, Class<TranscodeType> cls, Context context) {
    }

    private boolean C(h.g.a.t.a<?> aVar, h.g.a.t.e eVar) {
    }

    @NonNull
    private j<TranscodeType> N(@Nullable Object obj) {
    }

    private h.g.a.t.e O(Object obj, p<TranscodeType> pVar, h.g.a.t.h<TranscodeType> hVar, h.g.a.t.a<?> aVar, h.g.a.t.f fVar, l<?, ? super TranscodeType> lVar, h hVar2, int i2, int i3, Executor executor) {
    }

    private h.g.a.t.e l(p<TranscodeType> pVar, @Nullable h.g.a.t.h<TranscodeType> hVar, h.g.a.t.a<?> aVar, Executor executor) {
    }

    private h.g.a.t.e m(Object obj, p<TranscodeType> pVar, @Nullable h.g.a.t.h<TranscodeType> hVar, @Nullable h.g.a.t.f fVar, l<?, ? super TranscodeType> lVar, h hVar2, int i2, int i3, h.g.a.t.a<?> aVar, Executor executor) {
    }

    private h.g.a.t.e n(Object obj, p<TranscodeType> pVar, h.g.a.t.h<TranscodeType> hVar, @Nullable h.g.a.t.f fVar, l<?, ? super TranscodeType> lVar, h hVar2, int i2, int i3, h.g.a.t.a<?> aVar, Executor executor) {
    }

    private j<TranscodeType> p() {
    }

    @NonNull
    private h v(@NonNull h hVar) {
    }

    @SuppressLint({"CheckResult"})
    private void w(List<h.g.a.t.h<Object>> list) {
    }

    private <Y extends p<TranscodeType>> Y z(@NonNull Y y, @Nullable h.g.a.t.h<TranscodeType> hVar, h.g.a.t.a<?> aVar, Executor executor) {
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y A(@NonNull Y y, @Nullable h.g.a.t.h<TranscodeType> hVar, Executor executor) {
    }

    @NonNull
    public r<ImageView, TranscodeType> B(@NonNull ImageView imageView) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> D(@Nullable h.g.a.t.h<TranscodeType> hVar) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> E(@Nullable Bitmap bitmap) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> F(@Nullable Drawable drawable) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> G(@Nullable Uri uri) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> H(@Nullable File file) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> I(@Nullable @DrawableRes @RawRes Integer num) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> J(@Nullable Object obj) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> K(@Nullable String str) {
    }

    @CheckResult
    @Deprecated
    public j<TranscodeType> L(@Nullable URL url) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> M(@Nullable byte[] bArr) {
    }

    @NonNull
    public p<TranscodeType> P() {
    }

    @NonNull
    public p<TranscodeType> Q(int i2, int i3) {
    }

    @NonNull
    public h.g.a.t.d<TranscodeType> R() {
    }

    @NonNull
    public h.g.a.t.d<TranscodeType> S(int i2, int i3) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> T(float f2) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> U(@Nullable j<TranscodeType> jVar) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> V(@Nullable List<j<TranscodeType>> list) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> W(@Nullable j<TranscodeType>... jVarArr) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> X(@NonNull l<?, ? super TranscodeType> lVar) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object a(@Nullable String str) {
    }

    @Override // h.g.a.t.a
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ h.g.a.t.a apply(@NonNull h.g.a.t.a aVar) {
    }

    @Override // h.g.a.g
    @CheckResult
    @Deprecated
    public /* bridge */ /* synthetic */ Object b(@Nullable URL url) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object c(@Nullable Uri uri) {
    }

    @Override // h.g.a.t.a
    @CheckResult
    public /* bridge */ /* synthetic */ h.g.a.t.a clone() {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object d(@Nullable byte[] bArr) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object e(@Nullable File file) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object f(@Nullable Drawable drawable) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object g(@Nullable Bitmap bitmap) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object h(@Nullable Object obj) {
    }

    @Override // h.g.a.g
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ Object i(@Nullable @DrawableRes @RawRes Integer num) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> j(@Nullable h.g.a.t.h<TranscodeType> hVar) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> k(@NonNull h.g.a.t.a<?> aVar) {
    }

    @CheckResult
    public j<TranscodeType> o() {
    }

    @CheckResult
    @Deprecated
    public h.g.a.t.d<File> q(int i2, int i3) {
    }

    @CheckResult
    @Deprecated
    public <Y extends p<File>> Y r(@NonNull Y y) {
    }

    @NonNull
    public j<TranscodeType> s(@Nullable j<TranscodeType> jVar) {
    }

    @NonNull
    @CheckResult
    public j<TranscodeType> t(Object obj) {
    }

    @NonNull
    @CheckResult
    public j<File> u() {
    }

    @Deprecated
    public h.g.a.t.d<TranscodeType> x(int i2, int i3) {
    }

    @NonNull
    public <Y extends p<TranscodeType>> Y y(@NonNull Y y) {
    }

    @Override // h.g.a.t.a
    @CheckResult
    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo36clone() throws CloneNotSupportedException {
    }

    @SuppressLint({"CheckResult"})
    public j(Class<TranscodeType> cls, j<?> jVar) {
    }
}
