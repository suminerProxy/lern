package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(MessageLite messageLite) {
    }

    private static String buildDescription(List<String> list) {
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
    }

    public List<String> getMissingFields() {
    }

    public UninitializedMessageException(List<String> list) {
    }
}
