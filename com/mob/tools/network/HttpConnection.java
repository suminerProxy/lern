package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HttpConnection extends PublicMemberKeeper {
    InputStream getErrorStream() throws IOException;

    Map<String, List<String>> getHeaderFields() throws IOException;

    InputStream getInputStream() throws IOException;

    int getResponseCode() throws IOException;
}
