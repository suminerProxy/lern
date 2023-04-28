package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE = null;
    private static volatile Parser<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_;

    /* renamed from: androidx.datastore.preferences.protobuf.ListValue$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements ListValueOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
        }

        public Builder addValues(Value value) {
        }

        public Builder clearValues() {
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public Value getValues(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public int getValuesCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
        public List<Value> getValuesList() {
        }

        public Builder removeValues(int i2) {
        }

        public Builder setValues(int i2, Value value) {
        }

        private Builder() {
        }

        public Builder addValues(int i2, Value value) {
        }

        public Builder setValues(int i2, Value.Builder builder) {
        }

        public Builder addValues(Value.Builder builder) {
        }

        public Builder addValues(int i2, Value.Builder builder) {
        }
    }

    private ListValue() {
    }

    public static /* synthetic */ ListValue access$000() {
    }

    public static /* synthetic */ void access$100(ListValue listValue, int i2, Value value) {
    }

    public static /* synthetic */ void access$200(ListValue listValue, int i2, Value.Builder builder) {
    }

    public static /* synthetic */ void access$300(ListValue listValue, Value value) {
    }

    public static /* synthetic */ void access$400(ListValue listValue, int i2, Value value) {
    }

    public static /* synthetic */ void access$500(ListValue listValue, Value.Builder builder) {
    }

    public static /* synthetic */ void access$600(ListValue listValue, int i2, Value.Builder builder) {
    }

    public static /* synthetic */ void access$700(ListValue listValue, Iterable iterable) {
    }

    public static /* synthetic */ void access$800(ListValue listValue) {
    }

    public static /* synthetic */ void access$900(ListValue listValue, int i2) {
    }

    private void addAllValues(Iterable<? extends Value> iterable) {
    }

    private void addValues(Value value) {
    }

    private void clearValues() {
    }

    private void ensureValuesIsMutable() {
    }

    public static ListValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ListValue> parser() {
    }

    private void removeValues(int i2) {
    }

    private void setValues(int i2, Value value) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public Value getValues(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public int getValuesCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.ListValueOrBuilder
    public List<Value> getValuesList() {
    }

    public ValueOrBuilder getValuesOrBuilder(int i2) {
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
    }

    public static Builder newBuilder(ListValue listValue) {
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addValues(int i2, Value value) {
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void setValues(int i2, Value.Builder builder) {
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    private void addValues(Value.Builder builder) {
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void addValues(int i2, Value.Builder builder) {
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
