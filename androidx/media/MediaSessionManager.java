package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MediaSessionManager {
    public static final boolean DEBUG = false;
    public static final String TAG = "MediaSessionManager";
    private static final Object sLock = null;
    private static volatile MediaSessionManager sSessionManager;
    public MediaSessionManagerImpl mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MediaSessionManagerImpl {
        Context getContext();

        boolean isTrustedForMediaControl(RemoteUserInfoImpl userInfo);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface RemoteUserInfoImpl {
        String getPackageName();

        int getPid();

        int getUid();
    }

    private MediaSessionManager(Context context) {
    }

    @NonNull
    public static MediaSessionManager getSessionManager(@NonNull Context context) {
    }

    public Context getContext() {
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo userInfo) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_PID = -1;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int UNKNOWN_UID = -1;
        public RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(@NonNull String packageName, int pid, int uid) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        @NonNull
        public String getPackageName() {
        }

        public int getPid() {
        }

        public int getUid() {
        }

        public int hashCode() {
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }
    }
}
