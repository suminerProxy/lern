package com.facebook.stetho.server.http;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class HandlerRegistry {
    private final ArrayList<HttpHandler> mHttpHandlers;
    private final ArrayList<PathMatcher> mPathMatchers;

    @Nullable
    public synchronized HttpHandler lookup(String str) {
    }

    public synchronized void register(PathMatcher pathMatcher, HttpHandler httpHandler) {
    }

    public synchronized boolean unregister(PathMatcher pathMatcher, HttpHandler httpHandler) {
    }
}
