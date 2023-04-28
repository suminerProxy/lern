package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.protocol.HttpContext;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class q implements Callable<u> {

    /* renamed from: e  reason: collision with root package name */
    private static final HttpRequestRetryHandler f532e = null;

    /* renamed from: a  reason: collision with root package name */
    public l f533a;
    public Context b;
    public o c;

    /* renamed from: d  reason: collision with root package name */
    public String f534d;

    /* renamed from: f  reason: collision with root package name */
    private HttpUriRequest f535f;

    /* renamed from: g  reason: collision with root package name */
    private HttpContext f536g;

    /* renamed from: h  reason: collision with root package name */
    private CookieStore f537h;

    /* renamed from: i  reason: collision with root package name */
    private CookieManager f538i;

    /* renamed from: j  reason: collision with root package name */
    private AbstractHttpEntity f539j;

    /* renamed from: k  reason: collision with root package name */
    private HttpHost f540k;

    /* renamed from: l  reason: collision with root package name */
    private URL f541l;

    /* renamed from: m  reason: collision with root package name */
    private int f542m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f543n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f544o;

    /* renamed from: p  reason: collision with root package name */
    private String f545p;
    private String q;

    public q(l lVar, o oVar) {
    }

    private static long a(String[] strArr) {
    }

    private static HttpUrlHeader a(HttpResponse httpResponse) {
    }

    private u a(HttpResponse httpResponse, int i2, String str) {
    }

    private static HashMap<String, String> a(String str) {
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
    }

    private static long b(HttpResponse httpResponse) {
    }

    private URI b() {
    }

    private HttpUriRequest c() {
    }

    private u d() {
    }

    private void e() {
    }

    private String f() {
    }

    private int g() {
    }

    private URL h() {
    }

    private CookieManager i() {
    }

    public final o a() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ u call() {
    }
}
