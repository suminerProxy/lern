package androidx.media;

import android.content.ContentResolver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.media.MediaSessionManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {
    private static final boolean DEBUG = false;
    private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final String TAG = "MediaSessionManager";
    public ContentResolver mContentResolver;
    public Context mContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {
        private String mPackageName;
        private int mPid;
        private int mUid;

        public RemoteUserInfoImplBase(String packageName, int pid, int uid) {
        }

        public boolean equals(Object obj) {
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
        }

        public int hashCode() {
        }
    }

    public MediaSessionManagerImplBase(Context context) {
    }

    private boolean isPermissionGranted(MediaSessionManager.RemoteUserInfoImpl userInfo, String permission) {
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public Context getContext() {
    }

    public boolean isEnabledNotificationListener(@NonNull MediaSessionManager.RemoteUserInfoImpl userInfo) {
    }

    @Override // androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl userInfo) {
    }
}
