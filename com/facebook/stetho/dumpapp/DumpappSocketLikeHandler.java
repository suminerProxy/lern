package com.facebook.stetho.dumpapp;

import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.SocketLikeHandler;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DumpappSocketLikeHandler implements SocketLikeHandler {
    public static final byte[] PROTOCOL_MAGIC = null;
    public static final int PROTOCOL_VERSION = 1;
    private final Dumper mDumper;

    public DumpappSocketLikeHandler(Dumper dumper) {
    }

    public static void dump(Dumper dumper, Framer framer, String[] strArr) throws IOException {
    }

    private void establishConversation(DataInputStream dataInputStream) throws IOException {
    }

    private static IOException logAndThrowProtocolException(String str) throws IOException {
    }

    private String[] readArgs(Framer framer) throws IOException {
    }

    @Override // com.facebook.stetho.server.SocketLikeHandler
    public void onAccepted(SocketLike socketLike) throws IOException {
    }
}
