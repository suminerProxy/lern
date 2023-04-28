package com.facebook.common.media;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.infer.annotation.Nullsafe;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MediaUtils {
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = ImmutableMap.of("mkv", MimeTypes.VIDEO_MATROSKA, "glb", "model/gltf-binary");

    @Nullable
    private static String extractExtension(String path) {
        int lastIndexOf = path.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == path.length() - 1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    @Nullable
    public static String extractMime(String path) {
        String extractExtension = extractExtension(path);
        if (extractExtension == null) {
            return null;
        }
        String lowerCase = extractExtension.toLowerCase(Locale.US);
        String mimeTypeFromExtension = MimeTypeMapWrapper.getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension == null ? ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase) : mimeTypeFromExtension;
    }

    public static boolean isNonNativeSupportedMimeType(String mimeType) {
        return ADDITIONAL_ALLOWED_MIME_TYPES.containsValue(mimeType);
    }

    public static boolean isPhoto(@Nullable String mimeType) {
        return mimeType != null && mimeType.startsWith("image/");
    }

    public static boolean isThreeD(@Nullable String mimeType) {
        return mimeType != null && mimeType.equals("model/gltf-binary");
    }

    public static boolean isVideo(@Nullable String mimeType) {
        return mimeType != null && mimeType.startsWith("video/");
    }
}
