package androidx.core.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DatagramSocketWrapper extends Socket {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DatagramSocketImplWrapper extends SocketImpl {
        public DatagramSocketImplWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
        }

        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) throws IOException {
        }

        @Override // java.net.SocketImpl
        public int available() throws IOException {
        }

        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i2) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void close() throws IOException {
        }

        @Override // java.net.SocketImpl
        public void connect(String str, int i2) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void create(boolean z) throws IOException {
        }

        @Override // java.net.SocketImpl
        public InputStream getInputStream() throws IOException {
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i2) throws SocketException {
        }

        @Override // java.net.SocketImpl
        public OutputStream getOutputStream() throws IOException {
        }

        @Override // java.net.SocketImpl
        public void listen(int i2) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void sendUrgentData(int i2) throws IOException {
        }

        @Override // java.net.SocketOptions
        public void setOption(int i2, Object obj) throws SocketException {
        }

        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i2) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i2) throws IOException {
        }
    }

    public DatagramSocketWrapper(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) throws SocketException {
    }
}
