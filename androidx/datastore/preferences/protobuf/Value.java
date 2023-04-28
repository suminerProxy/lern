package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.ListValue;
import androidx.datastore.preferences.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private Object kind_;

    /* renamed from: androidx.datastore.preferences.protobuf.Value$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearBoolValue() {
        }

        public Builder clearKind() {
        }

        public Builder clearListValue() {
        }

        public Builder clearNullValue() {
        }

        public Builder clearNumberValue() {
        }

        public Builder clearStringValue() {
        }

        public Builder clearStructValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ListValue getListValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public String getStringValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public Struct getStructValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
        }

        @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
        }

        public Builder mergeListValue(ListValue listValue) {
        }

        public Builder mergeStructValue(Struct struct) {
        }

        public Builder setBoolValue(boolean z) {
        }

        public Builder setListValue(ListValue listValue) {
        }

        public Builder setNullValue(NullValue nullValue) {
        }

        public Builder setNullValueValue(int i2) {
        }

        public Builder setNumberValue(double d2) {
        }

        public Builder setStringValue(String str) {
        }

        public Builder setStringValueBytes(ByteString byteString) {
        }

        public Builder setStructValue(Struct struct) {
        }

        private Builder() {
        }

        public Builder setListValue(ListValue.Builder builder) {
        }

        public Builder setStructValue(Struct.Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class KindCase {
        private static final /* synthetic */ KindCase[] $VALUES = null;
        public static final KindCase BOOL_VALUE = null;
        public static final KindCase KIND_NOT_SET = null;
        public static final KindCase LIST_VALUE = null;
        public static final KindCase NULL_VALUE = null;
        public static final KindCase NUMBER_VALUE = null;
        public static final KindCase STRING_VALUE = null;
        public static final KindCase STRUCT_VALUE = null;
        private final int value;

        private KindCase(String str, int i2, int i3) {
        }

        public static KindCase forNumber(int i2) {
        }

        public static KindCase valueOf(String str) {
        }

        public static KindCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static KindCase valueOf(int i2) {
        }
    }

    private Value() {
    }

    public static /* synthetic */ Value access$000() {
    }

    public static /* synthetic */ void access$100(Value value) {
    }

    public static /* synthetic */ void access$1000(Value value, boolean z) {
    }

    public static /* synthetic */ void access$1100(Value value) {
    }

    public static /* synthetic */ void access$1200(Value value, Struct struct) {
    }

    public static /* synthetic */ void access$1300(Value value, Struct.Builder builder) {
    }

    public static /* synthetic */ void access$1400(Value value, Struct struct) {
    }

    public static /* synthetic */ void access$1500(Value value) {
    }

    public static /* synthetic */ void access$1600(Value value, ListValue listValue) {
    }

    public static /* synthetic */ void access$1700(Value value, ListValue.Builder builder) {
    }

    public static /* synthetic */ void access$1800(Value value, ListValue listValue) {
    }

    public static /* synthetic */ void access$1900(Value value) {
    }

    public static /* synthetic */ void access$200(Value value, int i2) {
    }

    public static /* synthetic */ void access$300(Value value, NullValue nullValue) {
    }

    public static /* synthetic */ void access$400(Value value) {
    }

    public static /* synthetic */ void access$500(Value value, double d2) {
    }

    public static /* synthetic */ void access$600(Value value) {
    }

    public static /* synthetic */ void access$700(Value value, String str) {
    }

    public static /* synthetic */ void access$800(Value value) {
    }

    public static /* synthetic */ void access$900(Value value, ByteString byteString) {
    }

    private void clearBoolValue() {
    }

    private void clearKind() {
    }

    private void clearListValue() {
    }

    private void clearNullValue() {
    }

    private void clearNumberValue() {
    }

    private void clearStringValue() {
    }

    private void clearStructValue() {
    }

    public static Value getDefaultInstance() {
    }

    private void mergeListValue(ListValue listValue) {
    }

    private void mergeStructValue(Struct struct) {
    }

    public static Builder newBuilder() {
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Value> parser() {
    }

    private void setBoolValue(boolean z) {
    }

    private void setListValue(ListValue listValue) {
    }

    private void setNullValue(NullValue nullValue) {
    }

    private void setNullValueValue(int i2) {
    }

    private void setNumberValue(double d2) {
    }

    private void setStringValue(String str) {
    }

    private void setStringValueBytes(ByteString byteString) {
    }

    private void setStructValue(Struct struct) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ListValue getListValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public String getStringValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public Struct getStructValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
    }

    @Override // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
    }

    public static Builder newBuilder(Value value) {
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setListValue(ListValue.Builder builder) {
    }

    private void setStructValue(Struct.Builder builder) {
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
