package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Any;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_;
    private Any value_;

    /* renamed from: androidx.datastore.preferences.protobuf.Option$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements OptionOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearName() {
        }

        public Builder clearValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public Any getValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public boolean hasValue() {
        }

        public Builder mergeValue(Any any) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setValue(Any any) {
        }

        private Builder() {
        }

        public Builder setValue(Any.Builder builder) {
        }
    }

    private Option() {
    }

    public static /* synthetic */ Option access$000() {
    }

    public static /* synthetic */ void access$100(Option option, String str) {
    }

    public static /* synthetic */ void access$200(Option option) {
    }

    public static /* synthetic */ void access$300(Option option, ByteString byteString) {
    }

    public static /* synthetic */ void access$400(Option option, Any any) {
    }

    public static /* synthetic */ void access$500(Option option, Any.Builder builder) {
    }

    public static /* synthetic */ void access$600(Option option, Any any) {
    }

    public static /* synthetic */ void access$700(Option option) {
    }

    private void clearName() {
    }

    private void clearValue() {
    }

    public static Option getDefaultInstance() {
    }

    private void mergeValue(Any any) {
    }

    public static Builder newBuilder() {
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Option> parser() {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setValue(Any any) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public Any getValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public boolean hasValue() {
    }

    public static Builder newBuilder(Option option) {
    }

    public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void setValue(Any.Builder builder) {
    }

    public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
    }

    public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Option parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
