package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class UrlEscapers {
    private static final Escaper URL_FORM_PARAMETER_ESCAPER = null;
    public static final String URL_FORM_PARAMETER_OTHER_SAFE_CHARS = "-_.*";
    private static final Escaper URL_FRAGMENT_ESCAPER = null;
    public static final String URL_PATH_OTHER_SAFE_CHARS_LACKING_PLUS = "-._~!$'()*,;&=@:";
    private static final Escaper URL_PATH_SEGMENT_ESCAPER = null;

    private UrlEscapers() {
    }

    public static Escaper urlFormParameterEscaper() {
    }

    public static Escaper urlFragmentEscaper() {
    }

    public static Escaper urlPathSegmentEscaper() {
    }
}
