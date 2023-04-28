package com.efs.sdk.base.http;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface IHttpUtil {
    @NonNull
    HttpResponse get(String str, Map<String, String> map);

    @NonNull
    HttpResponse post(String str, Map<String, String> map, File file);

    @NonNull
    HttpResponse post(String str, Map<String, String> map, byte[] bArr);

    @NonNull
    HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr);
}
