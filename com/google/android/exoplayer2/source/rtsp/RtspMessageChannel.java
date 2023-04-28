package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspMessageChannel implements Closeable {
    public static final Charset CHARSET = null;
    public static final int DEFAULT_RTSP_PORT = 554;
    private static final String TAG = "RtspMessageChannel";
    private volatile boolean closed;
    private final Map<Integer, InterleavedBinaryDataListener> interleavedBinaryDataListeners;
    private final MessageListener messageListener;
    private final Loader receiverLoader;
    private Sender sender;
    private Socket socket;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface InterleavedBinaryDataListener {
        void onInterleavedBinaryDataReceived(byte[] data);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class LoaderCallbackImpl implements Loader.Callback<Receiver> {
        public final /* synthetic */ RtspMessageChannel this$0;

        private LoaderCallbackImpl(final RtspMessageChannel this$0) {
        }

        /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
        public void onLoadCanceled2(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCanceled(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
        public void onLoadCompleted2(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ void onLoadCompleted(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }

        public /* synthetic */ LoaderCallbackImpl(RtspMessageChannel rtspMessageChannel, AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
        public Loader.LoadErrorAction onLoadError2(Receiver loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface MessageListener {
        void onReceivingFailed(Exception e2);

        void onRtspMessageReceived(List<String> message);

        void onSendingFailed(List<String> message, Exception e2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MessageParser {
        private static final int STATE_READING_BODY = 3;
        private static final int STATE_READING_FIRST_LINE = 1;
        private static final int STATE_READING_HEADER = 2;
        private long messageBodyLength;
        private final List<String> messageLines;
        @ReadingState
        private int state;

        private ImmutableList<String> addMessageBody(byte[] messageBodyBytes) {
        }

        @Nullable
        private ImmutableList<String> addMessageLine(byte[] lineBytes) throws ParserException {
        }

        private static byte[] parseNextLine(byte firstByte, DataInputStream dataInputStream) throws IOException {
        }

        private void reset() {
        }

        public ImmutableList<String> parseNext(byte firstByte, DataInputStream dataInputStream) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Receiver implements Loader.Loadable {
        private static final byte INTERLEAVED_MESSAGE_MARKER = 36;
        private final DataInputStream dataInputStream;
        private volatile boolean loadCanceled;
        private final MessageParser messageParser;
        public final /* synthetic */ RtspMessageChannel this$0;

        public Receiver(final RtspMessageChannel this$0, InputStream inputStream) {
        }

        private void handleInterleavedBinaryData() throws IOException {
        }

        private void handleRtspMessage(byte firstByte) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Sender implements Closeable {
        private final OutputStream outputStream;
        private final HandlerThread senderThread;
        private final Handler senderThreadHandler;
        public final /* synthetic */ RtspMessageChannel this$0;

        public Sender(final RtspMessageChannel this$0, OutputStream outputStream) {
        }

        private /* synthetic */ void a(byte[] bArr, List list) {
        }

        public /* synthetic */ void b(byte[] bArr, List list) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public void send(List<String> message) {
        }
    }

    public RtspMessageChannel(MessageListener messageListener) {
    }

    public static /* synthetic */ boolean access$100(RtspMessageChannel rtspMessageChannel) {
    }

    public static /* synthetic */ MessageListener access$200(RtspMessageChannel rtspMessageChannel) {
    }

    public static /* synthetic */ Map access$300(RtspMessageChannel rtspMessageChannel) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void open(Socket socket) throws IOException {
    }

    public void registerInterleavedBinaryDataListener(int channel, InterleavedBinaryDataListener listener) {
    }

    public void send(List<String> message) {
    }
}
