package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Method extends GeneratedMessageLite<Method, Builder> implements MethodOrBuilder {
    private static final Method DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile Parser<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_;
    private Internal.ProtobufList<Option> options_;
    private boolean requestStreaming_;
    private String requestTypeUrl_;
    private boolean responseStreaming_;
    private String responseTypeUrl_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.Method$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Method, Builder> implements MethodOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearName() {
        }

        public Builder clearOptions() {
        }

        public Builder clearRequestStreaming() {
        }

        public Builder clearRequestTypeUrl() {
        }

        public Builder clearResponseStreaming() {
        }

        public Builder clearResponseTypeUrl() {
        }

        public Builder clearSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Option getOptions(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getOptionsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getRequestTypeUrl() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getRequestTypeUrlBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public String getResponseTypeUrl() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public ByteString getResponseTypeUrlBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public Syntax getSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
        }

        public Builder removeOptions(int i2) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOptions(int i2, Option option) {
        }

        public Builder setRequestStreaming(boolean z) {
        }

        public Builder setRequestTypeUrl(String str) {
        }

        public Builder setRequestTypeUrlBytes(ByteString byteString) {
        }

        public Builder setResponseStreaming(boolean z) {
        }

        public Builder setResponseTypeUrl(String str) {
        }

        public Builder setResponseTypeUrlBytes(ByteString byteString) {
        }

        public Builder setSyntax(Syntax syntax) {
        }

        public Builder setSyntaxValue(int i2) {
        }

        private Builder() {
        }

        public Builder addOptions(int i2, Option option) {
        }

        public Builder setOptions(int i2, Option.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addOptions(int i2, Option.Builder builder) {
        }
    }

    private Method() {
    }

    public static /* synthetic */ Method access$000() {
    }

    public static /* synthetic */ void access$100(Method method, String str) {
    }

    public static /* synthetic */ void access$1000(Method method) {
    }

    public static /* synthetic */ void access$1100(Method method, ByteString byteString) {
    }

    public static /* synthetic */ void access$1200(Method method, boolean z) {
    }

    public static /* synthetic */ void access$1300(Method method) {
    }

    public static /* synthetic */ void access$1400(Method method, int i2, Option option) {
    }

    public static /* synthetic */ void access$1500(Method method, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1600(Method method, Option option) {
    }

    public static /* synthetic */ void access$1700(Method method, int i2, Option option) {
    }

    public static /* synthetic */ void access$1800(Method method, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1900(Method method, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$200(Method method) {
    }

    public static /* synthetic */ void access$2000(Method method, Iterable iterable) {
    }

    public static /* synthetic */ void access$2100(Method method) {
    }

    public static /* synthetic */ void access$2200(Method method, int i2) {
    }

    public static /* synthetic */ void access$2300(Method method, int i2) {
    }

    public static /* synthetic */ void access$2400(Method method, Syntax syntax) {
    }

    public static /* synthetic */ void access$2500(Method method) {
    }

    public static /* synthetic */ void access$300(Method method, ByteString byteString) {
    }

    public static /* synthetic */ void access$400(Method method, String str) {
    }

    public static /* synthetic */ void access$500(Method method) {
    }

    public static /* synthetic */ void access$600(Method method, ByteString byteString) {
    }

    public static /* synthetic */ void access$700(Method method, boolean z) {
    }

    public static /* synthetic */ void access$800(Method method) {
    }

    public static /* synthetic */ void access$900(Method method, String str) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addOptions(Option option) {
    }

    private void clearName() {
    }

    private void clearOptions() {
    }

    private void clearRequestStreaming() {
    }

    private void clearRequestTypeUrl() {
    }

    private void clearResponseStreaming() {
    }

    private void clearResponseTypeUrl() {
    }

    private void clearSyntax() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Method getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Method> parser() {
    }

    private void removeOptions(int i2) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOptions(int i2, Option option) {
    }

    private void setRequestStreaming(boolean z) {
    }

    private void setRequestTypeUrl(String str) {
    }

    private void setRequestTypeUrlBytes(ByteString byteString) {
    }

    private void setResponseStreaming(boolean z) {
    }

    private void setResponseTypeUrl(String str) {
    }

    private void setResponseTypeUrlBytes(ByteString byteString) {
    }

    private void setSyntax(Syntax syntax) {
    }

    private void setSyntaxValue(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Option getOptions(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getOptionsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i2) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getRequestTypeUrl() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getRequestTypeUrlBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public String getResponseTypeUrl() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public ByteString getResponseTypeUrlBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public Syntax getSyntax() {
    }

    @Override // androidx.datastore.preferences.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
    }

    public static Builder newBuilder(Method method) {
    }

    public static Method parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Method parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Method parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addOptions(int i2, Option option) {
    }

    public static Method parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setOptions(int i2, Option.Builder builder) {
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Method parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addOptions(Option.Builder builder) {
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
    }

    public static Method parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addOptions(int i2, Option.Builder builder) {
    }

    public static Method parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Method parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
