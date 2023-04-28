package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements EnumValueOrBuilder {
    private static final EnumValue DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<EnumValue> PARSER;
    private String name_;
    private int number_;
    private Internal.ProtobufList<Option> options_;

    /* renamed from: androidx.datastore.preferences.protobuf.EnumValue$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements EnumValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearName() {
        }

        public Builder clearNumber() {
        }

        public Builder clearOptions() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public String getName() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getNumber() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public Option getOptions(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public List<Option> getOptionsList() {
        }

        public Builder removeOptions(int i2) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setNumber(int i2) {
        }

        public Builder setOptions(int i2, Option option) {
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

    private EnumValue() {
    }

    public static /* synthetic */ EnumValue access$000() {
    }

    public static /* synthetic */ void access$100(EnumValue enumValue, String str) {
    }

    public static /* synthetic */ void access$1000(EnumValue enumValue, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1100(EnumValue enumValue, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$1200(EnumValue enumValue, Iterable iterable) {
    }

    public static /* synthetic */ void access$1300(EnumValue enumValue) {
    }

    public static /* synthetic */ void access$1400(EnumValue enumValue, int i2) {
    }

    public static /* synthetic */ void access$200(EnumValue enumValue) {
    }

    public static /* synthetic */ void access$300(EnumValue enumValue, ByteString byteString) {
    }

    public static /* synthetic */ void access$400(EnumValue enumValue, int i2) {
    }

    public static /* synthetic */ void access$500(EnumValue enumValue) {
    }

    public static /* synthetic */ void access$600(EnumValue enumValue, int i2, Option option) {
    }

    public static /* synthetic */ void access$700(EnumValue enumValue, int i2, Option.Builder builder) {
    }

    public static /* synthetic */ void access$800(EnumValue enumValue, Option option) {
    }

    public static /* synthetic */ void access$900(EnumValue enumValue, int i2, Option option) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addOptions(Option option) {
    }

    private void clearName() {
    }

    private void clearNumber() {
    }

    private void clearOptions() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static EnumValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<EnumValue> parser() {
    }

    private void removeOptions(int i2) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setNumber(int i2) {
    }

    private void setOptions(int i2, Option option) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public String getName() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getNumber() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public Option getOptions(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i2) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    public static Builder newBuilder(EnumValue enumValue) {
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addOptions(int i2, Option option) {
    }

    public static EnumValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setOptions(int i2, Option.Builder builder) {
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static EnumValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addOptions(Option.Builder builder) {
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static EnumValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addOptions(int i2, Option.Builder builder) {
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static EnumValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
