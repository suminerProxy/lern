package com.facebook.fresco.ui.common;

import android.net.Uri;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.PropagatesNullable;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ControllerListener2<INFO> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Extras {
        @Nullable
        public Object callerContext;
        @Nullable
        public Map<String, Object> componentExtras;
        @Nullable
        public Map<String, Object> datasourceExtras;
        public float focusX;
        public float focusY;
        @Nullable
        public Map<String, Object> imageExtras;
        @Nullable
        public Uri mainUri;
        @Nullable
        public Object scaleType;
        @Nullable
        public Map<String, Object> shortcutExtras;
        public int viewportHeight;
        public int viewportWidth;

        private static Map<String, Object> copyMap(@PropagatesNullable Map<String, Object> map) {
        }

        public static Extras of(@Nullable Map<String, Object> componentExtras) {
        }

        public Extras makeExtrasCopy() {
        }
    }

    void onFailure(String id, @Nullable Throwable throwable, @Nullable Extras extraData);

    void onFinalImageSet(String id, @Nullable INFO imageInfo, @Nullable Extras extraData);

    void onIntermediateImageFailed(String id);

    void onIntermediateImageSet(String id, @Nullable INFO imageInfo);

    void onRelease(String id, @Nullable Extras extraData);

    void onSubmit(String id, @Nullable Object callerContext, @Nullable Extras extraData);
}
