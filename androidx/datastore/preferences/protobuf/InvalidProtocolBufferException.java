package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private MessageLite unfinishedMessage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
        }
    }

    public InvalidProtocolBufferException(String str) {
    }

    public static InvalidProtocolBufferException invalidEndTag() {
    }

    public static InvalidProtocolBufferException invalidTag() {
    }

    public static InvalidProtocolBufferException invalidUtf8() {
    }

    public static InvalidWireTypeException invalidWireType() {
    }

    public static InvalidProtocolBufferException malformedVarint() {
    }

    public static InvalidProtocolBufferException negativeSize() {
    }

    public static InvalidProtocolBufferException parseFailure() {
    }

    public static InvalidProtocolBufferException recursionLimitExceeded() {
    }

    public static InvalidProtocolBufferException sizeLimitExceeded() {
    }

    public static InvalidProtocolBufferException truncatedMessage() {
    }

    public MessageLite getUnfinishedMessage() {
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
    }

    public IOException unwrapIOException() {
    }

    public InvalidProtocolBufferException(IOException iOException) {
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
    }
}
