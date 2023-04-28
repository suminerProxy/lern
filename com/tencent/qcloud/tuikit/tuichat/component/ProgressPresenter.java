package com.tencent.qcloud.tuikit.tuichat.component;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ProgressPresenter {
    private static final String TAG = "ProgressPresenter";
    private final int REMOVE_THRESHOLD;
    private final Map<String, List<WeakReference<ProgressListener>>> progressListenerMap;
    private int removeCount;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ProgressListener {
        void onProgress(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class ProgressPresenterHolder {
        private static final ProgressPresenter instance = null;

        private ProgressPresenterHolder() {
        }

        public static /* synthetic */ ProgressPresenter access$100() {
        }
    }

    public /* synthetic */ ProgressPresenter(AnonymousClass1 anonymousClass1) {
    }

    public static ProgressPresenter getInstance() {
    }

    private void removeEmptyReference() {
    }

    public void registerProgressListener(String str, ProgressListener progressListener) {
    }

    public void unregisterProgressListener(String str, ProgressListener progressListener) {
    }

    public void updateProgress(String str, int i2) {
    }

    private ProgressPresenter() {
    }
}
