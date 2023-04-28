package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class StringValue extends GeneratedMessageLite<StringValue, Builder> implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE = null;
    private static volatile Parser<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_;

    /* renamed from: androidx.datastore.preferences.protobuf.StringValue$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StringValue, Builder> implements StringValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public String getValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
        public ByteString getValueBytes() {
        }

        public Builder setValue(String str) {
        }

        public Builder setValueBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private StringValue() {
    }

    public static /* synthetic */ StringValue access$000() {
    }

    public static /* synthetic */ void access$100(StringValue stringValue, String str) {
    }

    public static /* synthetic */ void access$200(StringValue stringValue) {
    }

    public static /* synthetic */ void access$300(StringValue stringValue, ByteString byteString) {
    }

    private void clearValue() {
    }

    public static StringValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static StringValue of(String str) {
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<StringValue> parser() {
    }

    private void setValue(String str) {
    }

    private void setValueBytes(ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public String getValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.StringValueOrBuilder
    public ByteString getValueBytes() {
    }

    public static Builder newBuilder(StringValue stringValue) {
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static StringValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
