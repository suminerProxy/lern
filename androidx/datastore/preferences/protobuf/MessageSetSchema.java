package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.FieldSet;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MessageSetSchema<T> implements Schema<T> {
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static <T> MessageSetSchema<T> newSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) throws IOException {
    }

    private <UT, UB> void writeUnknownFieldsHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t, T t2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, T t2) {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
