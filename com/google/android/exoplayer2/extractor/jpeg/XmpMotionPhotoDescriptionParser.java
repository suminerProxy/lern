package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class XmpMotionPhotoDescriptionParser {
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = null;
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = null;
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = null;
    private static final String TAG = "MotionPhotoXmpParser";

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    public static MotionPhotoDescription parse(String xmpString) throws IOException {
    }

    @Nullable
    private static MotionPhotoDescription parseInternal(String xmpString) throws XmlPullParserException, IOException {
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(XmlPullParser xpp) {
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xpp) {
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xpp) {
    }

    private static ImmutableList<MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(XmlPullParser xpp, String containerNamespacePrefix, String itemNamespacePrefix) throws XmlPullParserException, IOException {
    }
}
