package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements StructOrBuilder {
    private static final Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<Struct> PARSER;
    private MapFieldLite<String, Value> fields_;

    /* renamed from: androidx.datastore.preferences.protobuf.Struct$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements StructOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder clearFields() {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public boolean containsFields(String str) {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        @Deprecated
        public Map<String, Value> getFields() {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public int getFieldsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Map<String, Value> getFieldsMap() {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrDefault(String str, Value value) {
        }

        @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
        public Value getFieldsOrThrow(String str) {
        }

        public Builder putAllFields(Map<String, Value> map) {
        }

        public Builder putFields(String str, Value value) {
        }

        public Builder removeFields(String str) {
        }

        private Builder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class FieldsDefaultEntryHolder {
        public static final MapEntryLite<String, Value> defaultEntry = null;

        private FieldsDefaultEntryHolder() {
        }
    }

    private Struct() {
    }

    public static /* synthetic */ Struct access$000() {
    }

    public static /* synthetic */ Map access$100(Struct struct) {
    }

    public static Struct getDefaultInstance() {
    }

    private Map<String, Value> getMutableFieldsMap() {
    }

    private MapFieldLite<String, Value> internalGetFields() {
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
    }

    public static Builder newBuilder() {
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Struct> parser() {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public boolean containsFields(String str) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    @Deprecated
    public Map<String, Value> getFields() {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public int getFieldsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Map<String, Value> getFieldsMap() {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrDefault(String str, Value value) {
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public Value getFieldsOrThrow(String str) {
    }

    public static Builder newBuilder(Struct struct) {
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
    }

    public static Struct parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Struct parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Struct parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
