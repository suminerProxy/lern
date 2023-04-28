package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = null;
    private final MessageInfoFactory messageInfoFactory;

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
        }
    }

    public ManifestSchemaFactory() {
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
    }

    private static boolean isProto2(MessageInfo messageInfo) {
    }

    private static <T> Schema<T> newSchema(Class<T> cls, MessageInfo messageInfo) {
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> cls) {
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
    }
}
