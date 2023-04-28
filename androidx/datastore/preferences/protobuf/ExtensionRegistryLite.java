package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ExtensionRegistryLite {
    public static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    public static final String EXTENSION_CLASS_NAME = "androidx.datastore.preferences.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private static final Class<?> extensionClass = null;
    private final Map<ObjectIntPair, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ObjectIntPair {
        private final int number;
        private final Object object;

        public ObjectIntPair(Object obj, int i2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public ExtensionRegistryLite() {
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
    }

    public static boolean isEagerlyParseMessageSets() {
    }

    public static ExtensionRegistryLite newInstance() {
    }

    public static Class<?> resolveExtensionClass() {
    }

    public static void setEagerlyParseMessageSets(boolean z) {
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i2) {
    }

    public ExtensionRegistryLite getUnmodifiable() {
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
    }

    public ExtensionRegistryLite(boolean z) {
    }
}
