package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: androidx.datastore.preferences.protobuf.Duration$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements DurationOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public int getNanos() {
        }

        @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public long getSeconds() {
        }

        public Builder setNanos(int i2) {
        }

        public Builder setSeconds(long j2) {
        }

        private Builder() {
        }
    }

    private Duration() {
    }

    public static /* synthetic */ Duration access$000() {
    }

    public static /* synthetic */ void access$100(Duration duration, long j2) {
    }

    public static /* synthetic */ void access$200(Duration duration) {
    }

    public static /* synthetic */ void access$300(Duration duration, int i2) {
    }

    public static /* synthetic */ void access$400(Duration duration) {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    public static Duration getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Duration> parser() {
    }

    private void setNanos(int i2) {
    }

    private void setSeconds(long j2) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public int getNanos() {
    }

    @Override // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public long getSeconds() {
    }

    public static Builder newBuilder(Duration duration) {
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
    }

    public static Duration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Duration parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Duration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
