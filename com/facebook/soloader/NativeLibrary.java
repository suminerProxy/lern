package com.facebook.soloader;

import java.util.List;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class NativeLibrary {
    private static final String TAG = "com.facebook.soloader.NativeLibrary";
    private boolean mLibrariesLoaded;
    @Nullable
    private List<String> mLibraryNames;
    @Nullable
    private volatile UnsatisfiedLinkError mLinkError;
    private Boolean mLoadLibraries;
    private final Object mLock;

    public NativeLibrary(List<String> list) {
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
    }

    @Nullable
    public UnsatisfiedLinkError getError() {
    }

    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }

    @Nullable
    public boolean loadLibraries() {
    }
}
