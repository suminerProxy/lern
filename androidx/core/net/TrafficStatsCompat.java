package androidx.core.net;

import androidx.annotation.NonNull;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TrafficStatsCompat {
    private TrafficStatsCompat() {
    }

    @Deprecated
    public static void clearThreadStatsTag() {
    }

    @Deprecated
    public static int getThreadStatsTag() {
    }

    @Deprecated
    public static void incrementOperationCount(int i2) {
    }

    @Deprecated
    public static void setThreadStatsTag(int i2) {
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket datagramSocket) throws SocketException {
    }

    @Deprecated
    public static void tagSocket(Socket socket) throws SocketException {
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket datagramSocket) throws SocketException {
    }

    @Deprecated
    public static void untagSocket(Socket socket) throws SocketException {
    }

    @Deprecated
    public static void incrementOperationCount(int i2, int i3) {
    }
}
