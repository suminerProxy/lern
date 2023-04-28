package com.facebook.stetho.server;

import android.content.Context;
import android.net.LocalSocket;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class SecureSocketHandler implements SocketHandler {
    private final Context mContext;

    public SecureSocketHandler(Context context) {
    }

    private static void enforcePermission(Context context, LocalSocket localSocket) throws IOException, PeerAuthorizationException {
    }

    @Override // com.facebook.stetho.server.SocketHandler
    public final void onAccepted(LocalSocket localSocket) throws IOException {
    }

    public abstract void onSecured(LocalSocket localSocket) throws IOException;
}
