package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    /* renamed from: androidx.media.VolumeProviderCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends VolumeProvider {
        public final /* synthetic */ VolumeProviderCompat this$0;

        public AnonymousClass1(final VolumeProviderCompat this$0, int volumeControl, int maxVolume, int currentVolume, String volumeControlId) {
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
        }
    }

    /* renamed from: androidx.media.VolumeProviderCompat$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends VolumeProvider {
        public final /* synthetic */ VolumeProviderCompat this$0;

        public AnonymousClass2(final VolumeProviderCompat this$0, int volumeControl, int maxVolume, int currentVolume) {
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProvider);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface ControlType {
    }

    public VolumeProviderCompat(int volumeControl, int maxVolume, int currentVolume) {
    }

    public final int getCurrentVolume() {
    }

    public final int getMaxVolume() {
    }

    public final int getVolumeControl() {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String getVolumeControlId() {
    }

    public Object getVolumeProvider() {
    }

    public void onAdjustVolume(int direction) {
    }

    public void onSetVolumeTo(int volume) {
    }

    public void setCallback(Callback callback) {
    }

    public final void setCurrentVolume(int currentVolume) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public VolumeProviderCompat(int volumeControl, int maxVolume, int currentVolume, @Nullable String volumeControlId) {
    }
}
