package com.facebook.stetho.inspector;

import android.content.Context;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import com.facebook.stetho.server.http.LightHttpServer;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DevtoolsSocketHandler implements SocketLikeHandler {
    private final Context mContext;
    private final Iterable<ChromeDevtoolsDomain> mModules;
    private final LightHttpServer mServer;

    public DevtoolsSocketHandler(Context context, Iterable<ChromeDevtoolsDomain> iterable) {
    }

    private LightHttpServer createServer() {
    }

    @Override // com.facebook.stetho.server.SocketLikeHandler
    public void onAccepted(SocketLike socketLike) throws IOException {
    }
}
