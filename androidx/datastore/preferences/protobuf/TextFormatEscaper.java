package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TextFormatEscaper {

    /* renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements ByteSequence {
        public final /* synthetic */ ByteString val$input;

        public AnonymousClass1(ByteString byteString) {
        }

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass2 implements ByteSequence {
        public final /* synthetic */ byte[] val$input;

        public AnonymousClass2(byte[] bArr) {
        }

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ByteSequence {
        byte byteAt(int i2);

        int size();
    }

    private TextFormatEscaper() {
    }

    public static String escapeBytes(ByteSequence byteSequence) {
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
    }

    public static String escapeText(String str) {
    }

    public static String escapeBytes(ByteString byteString) {
    }

    public static String escapeBytes(byte[] bArr) {
    }
}
