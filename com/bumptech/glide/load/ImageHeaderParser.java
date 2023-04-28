package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import h.g.a.p.p.a0.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2962a = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ImageType {
        private static final /* synthetic */ ImageType[] $VALUES = null;
        public static final ImageType GIF = null;
        public static final ImageType JPEG = null;
        public static final ImageType PNG = null;
        public static final ImageType PNG_A = null;
        public static final ImageType RAW = null;
        public static final ImageType UNKNOWN = null;
        public static final ImageType WEBP = null;
        public static final ImageType WEBP_A = null;
        private final boolean hasAlpha;

        private ImageType(String str, int i2, boolean z) {
        }

        public static ImageType valueOf(String str) {
        }

        public static ImageType[] values() {
        }

        public boolean hasAlpha() {
        }
    }

    @NonNull
    ImageType a(@NonNull ByteBuffer byteBuffer) throws IOException;

    int b(@NonNull ByteBuffer byteBuffer, @NonNull b bVar) throws IOException;

    @NonNull
    ImageType c(@NonNull InputStream inputStream) throws IOException;

    int d(@NonNull InputStream inputStream, @NonNull b bVar) throws IOException;
}
