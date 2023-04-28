package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE = null;
    private static volatile Parser<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_;
    private ByteString value_;

    /* renamed from: androidx.datastore.preferences.protobuf.Any$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements AnyOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearTypeUrl() {
        }

        public Builder clearValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public String getTypeUrl() {
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getTypeUrlBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
        public ByteString getValue() {
        }

        public Builder setTypeUrl(String str) {
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
        }

        public Builder setValue(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Any() {
    }

    public static /* synthetic */ Any access$000() {
    }

    public static /* synthetic */ void access$100(Any any, String str) {
    }

    public static /* synthetic */ void access$200(Any any) {
    }

    public static /* synthetic */ void access$300(Any any, ByteString byteString) {
    }

    public static /* synthetic */ void access$400(Any any, ByteString byteString) {
    }

    public static /* synthetic */ void access$500(Any any) {
    }

    private void clearTypeUrl() {
    }

    private void clearValue() {
    }

    public static Any getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Any> parser() {
    }

    private void setTypeUrl(String str) {
    }

    private void setTypeUrlBytes(ByteString byteString) {
    }

    private void setValue(ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public String getTypeUrl() {
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getTypeUrlBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.AnyOrBuilder
    public ByteString getValue() {
    }

    public static Builder newBuilder(Any any) {
    }

    public static Any parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Any parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
    }

    public static Any parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Any parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Any parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
