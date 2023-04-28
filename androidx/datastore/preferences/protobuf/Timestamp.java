package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: androidx.datastore.preferences.protobuf.Timestamp$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public int getNanos() {
        }

        @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public long getSeconds() {
        }

        public Builder setNanos(int i2) {
        }

        public Builder setSeconds(long j2) {
        }

        private Builder() {
        }
    }

    private Timestamp() {
    }

    public static /* synthetic */ Timestamp access$000() {
    }

    public static /* synthetic */ void access$100(Timestamp timestamp, long j2) {
    }

    public static /* synthetic */ void access$200(Timestamp timestamp) {
    }

    public static /* synthetic */ void access$300(Timestamp timestamp, int i2) {
    }

    public static /* synthetic */ void access$400(Timestamp timestamp) {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    public static Timestamp getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Timestamp> parser() {
    }

    private void setNanos(int i2) {
    }

    private void setSeconds(long j2) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public int getNanos() {
    }

    @Override // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public long getSeconds() {
    }

    public static Builder newBuilder(Timestamp timestamp) {
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
    }

    public static Timestamp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
