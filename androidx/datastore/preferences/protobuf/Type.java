package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Field;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private Internal.ProtobufList<Field> fields_;
    private String name_;
    private Internal.ProtobufList<String> oneofs_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.Type$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addFields(Field field) {
        }

        public Builder addOneofs(String str) {
        }

        public Builder addOneofsBytes(ByteString byteString) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearFields() {
        }

        public Builder clearName() {
        }

        public Builder clearOneofs() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Field getFields(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getOneofs(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Option getOptions(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeFields(int i2) {
        }

        public Builder removeOptions(int i2) {
        }

        public Builder setFields(int i2, Field field) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOneofs(int i2, String str) {
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

        public Builder addFields(int i2, Field field) {
        }

        public Builder addOptions(int i2, Option option) {
        }

        public Builder setFields(int i2, Field.Builder builder) {
        }

        public Builder setOptions(int i2, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addFields(Field.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addFields(int i2, Field.Builder builder) {
        }

        public Builder addOptions(int i2, Option.Builder builder) {
        }
    }

    private Type() {
    }

    public static /* synthetic */ Type access$000() {
    }

    public static /* synthetic */ void access$100(Type type, String str) {
    }

    public static /* synthetic */ void access$1000(Type type, Iterable iterable) {
    }

    public static /* synthetic */ void access$1100(Type type) {
    }

    public static /* synthetic */ void access$1200(Type type, int i2) {
    }

    public static /* synthetic */ void access$1300(Type type, int i2, String str) {
    }

    public static /* synthetic */ void access$1400(Type type, String str) {
    }

    public static /* synthetic */ void access$1500(Type type, Iterable iterable) {
    }

    public static /* synthetic */ void access$1600(Type type) {
    }

    public static /* synthetic */ void access$1700(Type type, ByteString byteString) {
    }

    public static /* synthetic */ void access$1800(Type type, int i2, Option option) {
    }

    public static /* synthetic */ void access$1900(Type type, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$200(Type type) {
    }

    public static /* synthetic */ void access$2000(Type type, Option option) {
    }

    public static /* synthetic */ void access$2100(Type type, int i2, Option option) {
    }

    public static /* synthetic */ void access$2200(Type type, Option.Builder builder) {
    }

    public static /* synthetic */ void access$2300(Type type, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$2400(Type type, Iterable iterable) {
    }

    public static /* synthetic */ void access$2500(Type type) {
    }

    public static /* synthetic */ void access$2600(Type type, int i2) {
    }

    public static /* synthetic */ void access$2700(Type type, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$2800(Type type, SourceContext.Builder builder) {
    }

    public static /* synthetic */ void access$2900(Type type, SourceContext sourceContext) {
    }

    public static /* synthetic */ void access$300(Type type, ByteString byteString) {
    }

    public static /* synthetic */ void access$3000(Type type) {
    }

    public static /* synthetic */ void access$3100(Type type, int i2) {
    }

    public static /* synthetic */ void access$3200(Type type, Syntax syntax) {
    }

    public static /* synthetic */ void access$3300(Type type) {
    }

    public static /* synthetic */ void access$400(Type type, int i2, Field field) {
    }

    public static /* synthetic */ void access$500(Type type, int i2, Field.Builder builder) {
    }

    public static /* synthetic */ void access$600(Type type, Field field) {
    }

    public static /* synthetic */ void access$700(Type type, int i2, Field field) {
    }

    public static /* synthetic */ void access$800(Type type, Field.Builder builder) {
    }

    public static /* synthetic */ void access$900(Type type, int i2, Field.Builder builder) {
    }

    private void addAllFields(Iterable<? extends Field> iterable) {
    }

    private void addAllOneofs(Iterable<String> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addFields(Field field) {
    }

    private void addOneofs(String str) {
    }

    private void addOneofsBytes(ByteString byteString) {
    }

    private void addOptions(Option option) {
    }

    private void clearFields() {
    }

    private void clearName() {
    }

    private void clearOneofs() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void ensureFieldsIsMutable() {
    }

    private void ensureOneofsIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Type getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Type> parser() {
    }

    private void removeFields(int i2) {
    }

    private void removeOptions(int i2) {
    }

    private void setFields(int i2, Field field) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOneofs(int i2, String str) {
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

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Field getFields(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
    }

    public FieldOrBuilder getFieldsOrBuilder(int i2) {
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getOneofs(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Option getOptions(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i2) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Type type) {
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void setSourceContext(SourceContext.Builder builder) {
    }

    private void addFields(int i2, Field field) {
    }

    private void addOptions(int i2, Option option) {
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setFields(int i2, Field.Builder builder) {
    }

    private void setOptions(int i2, Option.Builder builder) {
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addFields(Field.Builder builder) {
    }

    private void addOptions(Option.Builder builder) {
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addFields(int i2, Field.Builder builder) {
    }

    private void addOptions(int i2, Option.Builder builder) {
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
