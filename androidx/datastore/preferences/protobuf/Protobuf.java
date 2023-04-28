package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Protobuf {
    private static final Protobuf INSTANCE = null;
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache;
    private final SchemaFactory schemaFactory;

    private Protobuf() {
    }

    public static Protobuf getInstance() {
    }

    public int getTotalSchemaSize() {
    }

    public <T> boolean isInitialized(T t) {
    }

    public <T> void makeImmutable(T t) {
    }

    public <T> void mergeFrom(T t, Reader reader) throws IOException {
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
    }

    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
    }

    public <T> void writeTo(T t, Writer writer) throws IOException {
    }

    public <T> void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public <T> Schema<T> schemaFor(T t) {
    }
}
