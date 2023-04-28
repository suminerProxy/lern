package com.sobot.network.http.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PersistentCookieStore implements CookieStore {
    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String COOKIE_PREFS = "CookiePrefsFile";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private final HashMap<String, ConcurrentHashMap<String, HttpCookie>> cookies;

    public PersistentCookieStore(Context context) {
    }

    @Override // java.net.CookieStore
    public void add(URI uri, HttpCookie httpCookie) {
    }

    public String byteArrayToHexString(byte[] bArr) {
    }

    public HttpCookie decodeCookie(String str) {
    }

    public String encodeCookie(SerializableHttpCookie serializableHttpCookie) {
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> get(URI uri) {
    }

    public String getCookieToken(URI uri, HttpCookie httpCookie) {
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> getCookies() {
    }

    @Override // java.net.CookieStore
    public List<URI> getURIs() {
    }

    public byte[] hexStringToByteArray(String str) {
    }

    @Override // java.net.CookieStore
    public boolean remove(URI uri, HttpCookie httpCookie) {
    }

    @Override // java.net.CookieStore
    public boolean removeAll() {
    }
}
