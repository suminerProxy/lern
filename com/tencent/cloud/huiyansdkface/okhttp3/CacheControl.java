package com.tencent.cloud.huiyansdkface.okhttp3;

import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class CacheControl {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10612a;
    private final boolean b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10613d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10614e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f10615f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10616g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10617h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10618i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10619j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10620k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10621l;

    /* renamed from: m  reason: collision with root package name */
    private String f10622m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10623a;
        public boolean b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f10624d;

        /* renamed from: e  reason: collision with root package name */
        public int f10625e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10626f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10627g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10628h;

        public final CacheControl build() {
        }

        public final Builder immutable() {
        }

        public final Builder maxAge(int i2, TimeUnit timeUnit) {
        }

        public final Builder maxStale(int i2, TimeUnit timeUnit) {
        }

        public final Builder minFresh(int i2, TimeUnit timeUnit) {
        }

        public final Builder noCache() {
        }

        public final Builder noStore() {
        }

        public final Builder noTransform() {
        }

        public final Builder onlyIfCached() {
        }
    }

    public CacheControl(Builder builder) {
    }

    private CacheControl(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
    }

    public static CacheControl parse(Headers headers) {
    }

    public final boolean immutable() {
    }

    public final boolean isPrivate() {
    }

    public final boolean isPublic() {
    }

    public final int maxAgeSeconds() {
    }

    public final int maxStaleSeconds() {
    }

    public final int minFreshSeconds() {
    }

    public final boolean mustRevalidate() {
    }

    public final boolean noCache() {
    }

    public final boolean noStore() {
    }

    public final boolean noTransform() {
    }

    public final boolean onlyIfCached() {
    }

    public final int sMaxAgeSeconds() {
    }

    public final String toString() {
    }
}
