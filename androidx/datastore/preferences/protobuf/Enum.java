package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.EnumValue;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Enum extends GeneratedMessageLite<Enum, Builder> implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE = null;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private Internal.ProtobufList<EnumValue> enumvalue_;
    private String name_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.Enum$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Enum, Builder> implements EnumOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addEnumvalue(EnumValue enumValue) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearEnumvalue() {
        }

        public Builder clearName() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Option getOptions(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getOptionsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeEnumvalue(int i2) {
        }

        public Builder removeOptions(int i2) {
        }

        public Builder setEnumvalue(int i2, EnumValue enumValue) {
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

        private Builder() {
        }

        public Builder addEnumvalue(int i2, EnumValue enumValue) {
        }

        public Builder addOptions(int i2, Option option) {
        }

        public Builder setEnumvalue(int i2, EnumValue.Builder builder) {
        }

        public Builder setOptions(int i2, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addEnumvalue(int i2, EnumValue.Builder builder) {
        }

        public Builder addOptions(int i2, Option.Builder builder) {
        }
    }

    private Enum() {
    }

    public static /* synthetic */ Enum access$000() {
    }

    public static /* synthetic */ void access$100(Enum r0, String str) {
    }

    public static /* synthetic */ void access$1000(Enum r0, Iterable iterable) {
    }

    public static /* synthetic */ void access$1100(Enum r0) {
    }

    public static /* synthetic */ void access$1200(Enum r0, int i2) {
    }

    public static /* synthetic */ void access$1300(Enum r0, int i2, Option option) {
    }

    public static /* synthetic */ void access$1400(Enum r0, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1500(Enum r0, Option option) {
    }

    public static /* synthetic */ void access$1600(Enum r0, int i2, Option option) {
    }

    public static /* synthetic */ void access$1700(Enum r0, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1800(Enum r0, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1900(Enum r0, Iterable iterable) {
    }

    public static /* synthetic */ void access$200(Enum r0) {
    }

    public static /* synthetic */ void access$2000(Enum r0) {
    }

    public static /* synthetic */ void access$2100(Enum r0, int i2) {
    }

    public static /* synthetic */ void access$2200(Enum r0, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$2300(Enum r0, SourceContext.Builder builder) {
    }

    public static /* synthetic */ void access$2400(Enum r0, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$2500(Enum r0) {
    }

    public static /* synthetic */ void access$2600(Enum r0, int i2) {
    }

    public static /* synthetic */ void access$2700(Enum r0, Syntax syntax) {
    }

    public static /* synthetic */ void access$2800(Enum r0) {
    }

    public static /* synthetic */ void access$300(Enum r0, ByteString byteString) {
    }

    public static /* synthetic */ void access$400(Enum r0, int i2, EnumValue enumValue) {
    }

    public static /* synthetic */ void access$500(Enum r0, int i2, EnumValue.Builder builder) {
    }

    public static /* synthetic */ void access$600(Enum r0, EnumValue enumValue) {
    }

    public static /* synthetic */ void access$700(Enum r0, int i2, EnumValue enumValue) {
    }

    public static /* synthetic */ void access$800(Enum r0, EnumValue.Builder builder) {
    }

    public static /* synthetic */ void access$900(Enum r0, int i2, EnumValue.Builder builder) {
    }

    private void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addEnumvalue(EnumValue enumValue) {
    }

    private void addOptions(Option option) {
    }

    private void clearEnumvalue() {
    }

    private void clearName() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void ensureEnumvalueIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Enum getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Enum> parser() {
    }

    private void removeEnumvalue(int i2) {
    }

    private void removeOptions(int i2) {
    }

    private void setEnumvalue(int i2, EnumValue enumValue) {
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

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
    }

    public EnumValueOrBuilder getEnumvalueOrBuilder(int i2) {
    }

    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Option getOptions(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getOptionsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i2) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Enum r1) {
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void setSourceContext(SourceContext.Builder builder) {
    }

    private void addEnumvalue(int i2, EnumValue enumValue) {
    }

    private void addOptions(int i2, Option option) {
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setEnumvalue(int i2, EnumValue.Builder builder) {
    }

    private void setOptions(int i2, Option.Builder builder) {
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addEnumvalue(EnumValue.Builder builder) {
    }

    private void addOptions(Option.Builder builder) {
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addEnumvalue(int i2, EnumValue.Builder builder) {
    }

    private void addOptions(int i2, Option.Builder builder) {
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
