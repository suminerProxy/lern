package com.facebook.imageformat;

import com.facebook.common.internal.ImmutableList;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.List;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DefaultImageFormats {
    private static ImmutableList<ImageFormat> sAllDefaultFormats;
    public static final ImageFormat JPEG = new ImageFormat("JPEG", "jpeg");
    public static final ImageFormat PNG = new ImageFormat("PNG", "png");
    public static final ImageFormat GIF = new ImageFormat("GIF", "gif");
    public static final ImageFormat BMP = new ImageFormat("BMP", "bmp");
    public static final ImageFormat ICO = new ImageFormat("ICO", "ico");
    public static final ImageFormat WEBP_SIMPLE = new ImageFormat("WEBP_SIMPLE", "webp");
    public static final ImageFormat WEBP_LOSSLESS = new ImageFormat("WEBP_LOSSLESS", "webp");
    public static final ImageFormat WEBP_EXTENDED = new ImageFormat("WEBP_EXTENDED", "webp");
    public static final ImageFormat WEBP_EXTENDED_WITH_ALPHA = new ImageFormat("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final ImageFormat WEBP_ANIMATED = new ImageFormat("WEBP_ANIMATED", "webp");
    public static final ImageFormat HEIF = new ImageFormat("HEIF", "heif");
    public static final ImageFormat DNG = new ImageFormat("DNG", "dng");

    private DefaultImageFormats() {
    }

    public static List<ImageFormat> getDefaultFormats() {
        if (sAllDefaultFormats == null) {
            ArrayList arrayList = new ArrayList(9);
            arrayList.add(JPEG);
            arrayList.add(PNG);
            arrayList.add(GIF);
            arrayList.add(BMP);
            arrayList.add(ICO);
            arrayList.add(WEBP_SIMPLE);
            arrayList.add(WEBP_LOSSLESS);
            arrayList.add(WEBP_EXTENDED);
            arrayList.add(WEBP_EXTENDED_WITH_ALPHA);
            arrayList.add(WEBP_ANIMATED);
            arrayList.add(HEIF);
            sAllDefaultFormats = ImmutableList.copyOf((List) arrayList);
        }
        return sAllDefaultFormats;
    }

    public static boolean isStaticWebpFormat(ImageFormat imageFormat) {
        return imageFormat == WEBP_SIMPLE || imageFormat == WEBP_LOSSLESS || imageFormat == WEBP_EXTENDED || imageFormat == WEBP_EXTENDED_WITH_ALPHA;
    }

    public static boolean isWebpFormat(ImageFormat imageFormat) {
        return isStaticWebpFormat(imageFormat) || imageFormat == WEBP_ANIMATED;
    }
}
