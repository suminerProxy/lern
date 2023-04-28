package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE = null;
    private static volatile Parser<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;

    /* renamed from: androidx.datastore.preferences.protobuf.BytesValue$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements BytesValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
        public ByteString getValue() {
        }

        public Builder setValue(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private BytesValue() {
    }

    public static /* synthetic */ BytesValue access$000() {
    }

    public static /* synthetic */ void access$100(BytesValue bytesValue, ByteString byteString) {
    }

    public static /* synthetic */ void access$200(BytesValue bytesValue) {
    }

    private void clearValue() {
    }

    public static BytesValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static BytesValue of(ByteString byteString) {
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<BytesValue> parser() {
    }

    private void setValue(ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.BytesValueOrBuilder
    public ByteString getValue() {
    }

    public static Builder newBuilder(BytesValue bytesValue) {
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static BytesValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
