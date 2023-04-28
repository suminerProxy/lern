package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LazyFieldLite {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = null;
    private ByteString delayedBytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile ByteString memoizedBytes;
    public volatile MessageLite value;

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    private static void checkArguments(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
    }

    private static MessageLite mergeValueAndBytes(MessageLite messageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
    }

    public void clear() {
    }

    public boolean containsDefaultInstance() {
    }

    public void ensureInitialized(MessageLite messageLite) {
    }

    public boolean equals(Object obj) {
    }

    public int getSerializedSize() {
    }

    public MessageLite getValue(MessageLite messageLite) {
    }

    public int hashCode() {
    }

    public void merge(LazyFieldLite lazyFieldLite) {
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public void set(LazyFieldLite lazyFieldLite) {
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
    }

    public MessageLite setValue(MessageLite messageLite) {
    }

    public ByteString toByteString() {
    }

    public void writeTo(Writer writer, int i2) throws IOException {
    }

    public LazyFieldLite() {
    }
}
