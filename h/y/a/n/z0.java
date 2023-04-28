package h.y.a.n;

import com.sobot.network.http.model.SobotProgress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuffixUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u001e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004J \u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u00042\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0004J\u0010\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0004J\u0014\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/taihebase/activity/utils/SuffixUtils;", "", "()V", "TYPE_3GP", "", "TYPE_AAC", "TYPE_AC3", "TYPE_AMR", "TYPE_AVI", "TYPE_FLAC", "TYPE_FLV", "TYPE_M3U8", "TYPE_M4A", "TYPE_MKV", "TYPE_MOV", "TYPE_MP3", "TYPE_MP4", "TYPE_MPG", "TYPE_OGG", "TYPE_OPUS", "TYPE_RAW", "TYPE_TS", "TYPE_WAV", "TYPE_WEBM", "TYPE_WMA", "TYPE_WMV", "checkFileExist", "", "path", "concatFile", "srcFilePath", "appendFilePath", "concatFilePath", "createListFile", "listPath", "fileList", "", "deleteFile", "deleteFolder", "ensureDir", "fileDir", "getFileName", "filePath", "getFilePath", "getFileSuffix", SobotProgress.FILE_NAME, "isAudio", "isVideo", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class z0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f26398a = null;
    @NotNull
    private static final String b = "mp3";
    @NotNull
    private static final String c = "aac";
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f26399d = "amr";
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final String f26400e = "flac";
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final String f26401f = "m4a";
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private static final String f26402g = "wma";
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final String f26403h = "wav";
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private static final String f26404i = "ogg";
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private static final String f26405j = "ac3";
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private static final String f26406k = "pcm";
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private static final String f26407l = "opus";
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final String f26408m = "mp4";
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private static final String f26409n = "mkv";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private static final String f26410o = "webm";
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private static final String f26411p = "avi";
    @NotNull
    private static final String q = "wmv";
    @NotNull
    private static final String r = "flv";
    @NotNull
    private static final String s = "ts";
    @NotNull
    private static final String t = "m3u8";
    @NotNull
    private static final String u = "3gp";
    @NotNull
    private static final String v = "mov";
    @NotNull
    private static final String w = "mpg";

    private z0() {
    }

    @JvmStatic
    @Nullable
    public static final String i(@Nullable String str) {
    }

    public final boolean a(@NotNull String str) {
    }

    public final boolean b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable List<String> list) {
    }

    public final boolean d(@NotNull String str) {
    }

    public final boolean e(@NotNull String str) {
    }

    public final boolean f(@NotNull String str) {
    }

    @Nullable
    public final String g(@NotNull String str) {
    }

    @Nullable
    public final String h(@NotNull String str) {
    }

    public final boolean j(@NotNull String str) {
    }

    public final boolean k(@NotNull String str) {
    }
}
