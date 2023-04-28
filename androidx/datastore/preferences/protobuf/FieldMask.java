package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE = null;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldMask$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public Builder addAllPaths(Iterable<String> iterable) {
        }

        public Builder addPaths(String str) {
        }

        public Builder addPathsBytes(ByteString byteString) {
        }

        public Builder clearPaths() {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public String getPaths(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public ByteString getPathsBytes(int i2) {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public int getPathsCount() {
        }

        @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
        public List<String> getPathsList() {
        }

        public Builder setPaths(int i2, String str) {
        }

        private Builder() {
        }
    }

    private FieldMask() {
    }

    public static /* synthetic */ FieldMask access$000() {
    }

    public static /* synthetic */ void access$100(FieldMask fieldMask, int i2, String str) {
    }

    public static /* synthetic */ void access$200(FieldMask fieldMask, String str) {
    }

    public static /* synthetic */ void access$300(FieldMask fieldMask, Iterable iterable) {
    }

    public static /* synthetic */ void access$400(FieldMask fieldMask) {
    }

    public static /* synthetic */ void access$500(FieldMask fieldMask, ByteString byteString) {
    }

    private void addAllPaths(Iterable<String> iterable) {
    }

    private void addPaths(String str) {
    }

    private void addPathsBytes(ByteString byteString) {
    }

    private void clearPaths() {
    }

    private void ensurePathsIsMutable() {
    }

    public static FieldMask getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<FieldMask> parser() {
    }

    private void setPaths(int i2, String str) {
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public String getPaths(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public ByteString getPathsBytes(int i2) {
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public int getPathsCount() {
    }

    @Override // androidx.datastore.preferences.protobuf.FieldMaskOrBuilder
    public List<String> getPathsList() {
    }

    public static Builder newBuilder(FieldMask fieldMask) {
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
    }

    public static FieldMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static FieldMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
