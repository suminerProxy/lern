package com.tencent.cloud.huiyansdkface.okhttp3;

import java.util.List;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Cookie {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f10664a = null;
    private static final Pattern b = null;
    private static final Pattern c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f10665d = null;

    /* renamed from: e  reason: collision with root package name */
    private final String f10666e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10667f;

    /* renamed from: g  reason: collision with root package name */
    private final long f10668g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10669h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10670i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f10671j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10672k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10673l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f10674m;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f10675a;
        public String b;
        public long c;

        /* renamed from: d  reason: collision with root package name */
        public String f10676d;

        /* renamed from: e  reason: collision with root package name */
        public String f10677e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10678f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10679g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10680h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10681i;

        private Builder a(String str, boolean z) {
        }

        public final Cookie build() {
        }

        public final Builder domain(String str) {
        }

        public final Builder expiresAt(long j2) {
        }

        public final Builder hostOnlyDomain(String str) {
        }

        public final Builder httpOnly() {
        }

        public final Builder name(String str) {
        }

        public final Builder path(String str) {
        }

        public final Builder secure() {
        }

        public final Builder value(String str) {
        }
    }

    public Cookie(Builder builder) {
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    private static int a(String str, int i2, int i3, boolean z) {
    }

    private static long a(String str) {
    }

    private static Cookie a(long j2, HttpUrl httpUrl, String str) {
    }

    private static boolean a(String str, String str2) {
    }

    public static Cookie parse(HttpUrl httpUrl, String str) {
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
    }

    public final String domain() {
    }

    public final boolean equals(Object obj) {
    }

    public final long expiresAt() {
    }

    public final int hashCode() {
    }

    public final boolean hostOnly() {
    }

    public final boolean httpOnly() {
    }

    public final boolean matches(HttpUrl httpUrl) {
    }

    public final String name() {
    }

    public final String path() {
    }

    public final boolean persistent() {
    }

    public final boolean secure() {
    }

    public final String toString() {
    }

    public final String value() {
    }
}
