package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Method;
import androidx.datastore.preferences.protobuf.Mixin;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private Internal.ProtobufList<Method> methods_;
    private Internal.ProtobufList<Mixin> mixins_;
    private String name_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_;

    /* renamed from: androidx.datastore.preferences.protobuf.Api$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addMethods(Method method) {
        }

        public Builder addMixins(Mixin mixin) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearMethods() {
        }

        public Builder clearMixins() {
        }

        public Builder clearName() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        public Builder clearVersion() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Method getMethods(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMethodsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Mixin getMixins(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getMixinsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Option getOptions(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getOptionsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public String getVersion() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeMethods(int i2) {
        }

        public Builder removeMixins(int i2) {
        }

        public Builder removeOptions(int i2) {
        }

        public Builder setMethods(int i2, Method method) {
        }

        public Builder setMixins(int i2, Mixin mixin) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOptions(int i2, Option option) {
        }

        public Builder setSourceContext(SourceContext sourceContext) {
        }

        public Builder setSyntax(Syntax syntax) {
        }

        public Builder setSyntaxValue(int i2) {
        }

        public Builder setVersion(String str) {
        }

        public Builder setVersionBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addMethods(int i2, Method method) {
        }

        public Builder addMixins(int i2, Mixin mixin) {
        }

        public Builder addOptions(int i2, Option option) {
        }

        public Builder setMethods(int i2, Method.Builder builder) {
        }

        public Builder setMixins(int i2, Mixin.Builder builder) {
        }

        public Builder setOptions(int i2, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addMethods(Method.Builder builder) {
        }

        public Builder addMixins(Mixin.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addMethods(int i2, Method.Builder builder) {
        }

        public Builder addMixins(int i2, Mixin.Builder builder) {
        }

        public Builder addOptions(int i2, Option.Builder builder) {
        }
    }

    private Api() {
    }

    public static /* synthetic */ Api access$000() {
    }

    public static /* synthetic */ void access$100(Api api, String str) {
    }

    public static /* synthetic */ void access$1000(Api api, Iterable iterable) {
    }

    public static /* synthetic */ void access$1100(Api api) {
    }

    public static /* synthetic */ void access$1200(Api api, int i2) {
    }

    public static /* synthetic */ void access$1300(Api api, int i2, Option option) {
    }

    public static /* synthetic */ void access$1400(Api api, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1500(Api api, Option option) {
    }

    public static /* synthetic */ void access$1600(Api api, int i2, Option option) {
    }

    public static /* synthetic */ void access$1700(Api api, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1800(Api api, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1900(Api api, Iterable iterable) {
    }

    public static /* synthetic */ void access$200(Api api) {
    }

    public static /* synthetic */ void access$2000(Api api) {
    }

    public static /* synthetic */ void access$2100(Api api, int i2) {
    }

    public static /* synthetic */ void access$2200(Api api, String str) {
    }

    public static /* synthetic */ void access$2300(Api api) {
    }

    public static /* synthetic */ void access$2400(Api api, ByteString byteString) {
    }

    public static /* synthetic */ void access$2500(Api api, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$2600(Api api, SourceContext.Builder builder) {
    }

    public static /* synthetic */ void access$2700(Api api, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$2800(Api api) {
    }

    public static /* synthetic */ void access$2900(Api api, int i2, Mixin mixin) {
    }

    public static /* synthetic */ void access$300(Api api, ByteString byteString) {
    }

    public static /* synthetic */ void access$3000(Api api, int i2, Mixin.Builder builder) {
    }

    public static /* synthetic */ void access$3100(Api api, Mixin mixin) {
    }

    public static /* synthetic */ void access$3200(Api api, int i2, Mixin mixin) {
    }

    public static /* synthetic */ void access$3300(Api api, Mixin.Builder builder) {
    }

    public static /* synthetic */ void access$3400(Api api, int i2, Mixin.Builder builder) {
    }

    public static /* synthetic */ void access$3500(Api api, Iterable iterable) {
    }

    public static /* synthetic */ void access$3600(Api api) {
    }

    public static /* synthetic */ void access$3700(Api api, int i2) {
    }

    public static /* synthetic */ void access$3800(Api api, int i2) {
    }

    public static /* synthetic */ void access$3900(Api api, Syntax syntax) {
    }

    public static /* synthetic */ void access$400(Api api, int i2, Method method) {
    }

    public static /* synthetic */ void access$4000(Api api) {
    }

    public static /* synthetic */ void access$500(Api api, int i2, Method.Builder builder) {
    }

    public static /* synthetic */ void access$600(Api api, Method method) {
    }

    public static /* synthetic */ void access$700(Api api, int i2, Method method) {
    }

    public static /* synthetic */ void access$800(Api api, Method.Builder builder) {
    }

    public static /* synthetic */ void access$900(Api api, int i2, Method.Builder builder) {
    }

    private void addAllMethods(Iterable<? extends Method> iterable) {
    }

    private void addAllMixins(Iterable<? extends Mixin> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addMethods(Method method) {
    }

    private void addMixins(Mixin mixin) {
    }

    private void addOptions(Option option) {
    }

    private void clearMethods() {
    }

    private void clearMixins() {
    }

    private void clearName() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void clearVersion() {
    }

    private void ensureMethodsIsMutable() {
    }

    private void ensureMixinsIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Api getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Api> parser() {
    }

    private void removeMethods(int i2) {
    }

    private void removeMixins(int i2) {
    }

    private void removeOptions(int i2) {
    }

    private void setMethods(int i2, Method method) {
    }

    private void setMixins(int i2, Mixin mixin) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOptions(int i2, Option option) {
    }

    private void setSourceContext(SourceContext sourceContext) {
    }

    private void setSyntax(Syntax syntax) {
    }

    private void setSyntaxValue(int i2) {
    }

    private void setVersion(String str) {
    }

    private void setVersionBytes(ByteString byteString) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Method getMethods(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMethodsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
    }

    public MethodOrBuilder getMethodsOrBuilder(int i2) {
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Mixin getMixins(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getMixinsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
    }

    public MixinOrBuilder getMixinsOrBuilder(int i2) {
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Option getOptions(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getOptionsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i2) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public String getVersion() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Api api) {
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void setSourceContext(SourceContext.Builder builder) {
    }

    private void addMethods(int i2, Method method) {
    }

    private void addMixins(int i2, Mixin mixin) {
    }

    private void addOptions(int i2, Option option) {
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setMethods(int i2, Method.Builder builder) {
    }

    private void setMixins(int i2, Mixin.Builder builder) {
    }

    private void setOptions(int i2, Option.Builder builder) {
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addMethods(Method.Builder builder) {
    }

    private void addMixins(Mixin.Builder builder) {
    }

    private void addOptions(Option.Builder builder) {
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addMethods(int i2, Method.Builder builder) {
    }

    private void addMixins(int i2, Mixin.Builder builder) {
    }

    private void addOptions(int i2, Option.Builder builder) {
    }

    public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
