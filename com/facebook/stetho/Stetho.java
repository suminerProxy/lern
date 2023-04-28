package com.facebook.stetho;

import android.app.Application;
import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import com.facebook.stetho.server.SocketHandler;
import com.facebook.stetho.server.SocketHandlerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class Stetho {

    /* renamed from: com.facebook.stetho.Stetho$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends Initializer {
        public final /* synthetic */ Context val$context;

        public AnonymousClass1(Context context, Context context2) {
        }

        @Override // com.facebook.stetho.Stetho.Initializer
        public Iterable<DumperPlugin> getDumperPlugins() {
        }

        @Override // com.facebook.stetho.Stetho.Initializer
        public Iterable<ChromeDevtoolsDomain> getInspectorModules() {
        }
    }

    /* renamed from: com.facebook.stetho.Stetho$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 implements DumperPluginsProvider {
        public final /* synthetic */ Context val$context;

        public AnonymousClass2(Context context) {
        }

        @Override // com.facebook.stetho.DumperPluginsProvider
        public Iterable<DumperPlugin> get() {
        }
    }

    /* renamed from: com.facebook.stetho.Stetho$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements InspectorModulesProvider {
        public final /* synthetic */ Context val$context;

        public AnonymousClass3(Context context) {
        }

        @Override // com.facebook.stetho.InspectorModulesProvider
        public Iterable<ChromeDevtoolsDomain> get() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class BuilderBasedInitializer extends Initializer {
        @Nullable
        private final DumperPluginsProvider mDumperPlugins;
        @Nullable
        private final InspectorModulesProvider mInspectorModules;

        public /* synthetic */ BuilderBasedInitializer(InitializerBuilder initializerBuilder, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.stetho.Stetho.Initializer
        @Nullable
        public Iterable<DumperPlugin> getDumperPlugins() {
        }

        @Override // com.facebook.stetho.Stetho.Initializer
        @Nullable
        public Iterable<ChromeDevtoolsDomain> getInspectorModules() {
        }

        private BuilderBasedInitializer(InitializerBuilder initializerBuilder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DefaultDumperPluginsBuilder {
        private final Context mContext;
        private final PluginBuilder<DumperPlugin> mDelegate;

        public DefaultDumperPluginsBuilder(Context context) {
        }

        private DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin dumperPlugin) {
        }

        public Iterable<DumperPlugin> finish() {
        }

        public DefaultDumperPluginsBuilder provide(DumperPlugin dumperPlugin) {
        }

        public DefaultDumperPluginsBuilder remove(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DefaultInspectorModulesBuilder {
        private final Application mContext;
        @Nullable
        private List<DatabaseDriver2> mDatabaseDrivers;
        @Nullable
        private DatabaseFilesProvider mDatabaseFilesProvider;
        private final PluginBuilder<ChromeDevtoolsDomain> mDelegate;
        @Nullable
        private DocumentProviderFactory mDocumentProvider;
        private boolean mExcludeSqliteDatabaseDriver;
        @Nullable
        private RuntimeReplFactory mRuntimeRepl;

        public DefaultInspectorModulesBuilder(Context context) {
        }

        private DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain chromeDevtoolsDomain) {
        }

        @Nullable
        private DocumentProviderFactory resolveDocumentProvider() {
        }

        @Deprecated
        public DefaultInspectorModulesBuilder databaseFiles(DatabaseFilesProvider databaseFilesProvider) {
        }

        public DefaultInspectorModulesBuilder documentProvider(DocumentProviderFactory documentProviderFactory) {
        }

        public DefaultInspectorModulesBuilder excludeSqliteDatabaseDriver(boolean z) {
        }

        public Iterable<ChromeDevtoolsDomain> finish() {
        }

        @Deprecated
        public DefaultInspectorModulesBuilder provide(ChromeDevtoolsDomain chromeDevtoolsDomain) {
        }

        @Deprecated
        public DefaultInspectorModulesBuilder provideDatabaseDriver(Database.DatabaseDriver databaseDriver) {
        }

        @Deprecated
        public DefaultInspectorModulesBuilder remove(String str) {
        }

        public DefaultInspectorModulesBuilder runtimeRepl(RuntimeReplFactory runtimeReplFactory) {
        }

        public DefaultInspectorModulesBuilder provideDatabaseDriver(DatabaseDriver2 databaseDriver2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Initializer {
        private final Context mContext;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class RealSocketHandlerFactory implements SocketHandlerFactory {
            public final /* synthetic */ Initializer this$0;

            private RealSocketHandlerFactory(Initializer initializer) {
            }

            @Override // com.facebook.stetho.server.SocketHandlerFactory
            public SocketHandler create() {
            }

            public /* synthetic */ RealSocketHandlerFactory(Initializer initializer, AnonymousClass1 anonymousClass1) {
            }
        }

        public Initializer(Context context) {
        }

        public static /* synthetic */ Context access$100(Initializer initializer) {
        }

        @Nullable
        public abstract Iterable<DumperPlugin> getDumperPlugins();

        @Nullable
        public abstract Iterable<ChromeDevtoolsDomain> getInspectorModules();

        public final void start() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InitializerBuilder {
        public final Context mContext;
        @Nullable
        public DumperPluginsProvider mDumperPlugins;
        @Nullable
        public InspectorModulesProvider mInspectorModules;

        public /* synthetic */ InitializerBuilder(Context context, AnonymousClass1 anonymousClass1) {
        }

        public Initializer build() {
        }

        public InitializerBuilder enableDumpapp(DumperPluginsProvider dumperPluginsProvider) {
        }

        public InitializerBuilder enableWebKitInspector(InspectorModulesProvider inspectorModulesProvider) {
        }

        private InitializerBuilder(Context context) {
        }
    }

    private Stetho() {
    }

    public static DumperPluginsProvider defaultDumperPluginsProvider(Context context) {
    }

    public static InspectorModulesProvider defaultInspectorModulesProvider(Context context) {
    }

    public static void initialize(Initializer initializer) {
    }

    public static void initializeWithDefaults(Context context) {
    }

    public static InitializerBuilder newInitializerBuilder(Context context) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PluginBuilder<T> {
        private boolean mFinished;
        private final ArrayList<T> mPlugins;
        private final Set<String> mProvidedNames;
        private final Set<String> mRemovedNames;

        private PluginBuilder() {
        }

        private void throwIfFinished() {
        }

        public Iterable<T> finish() {
        }

        public void provide(String str, T t) {
        }

        public void provideIfDesired(String str, T t) {
        }

        public void remove(String str) {
        }

        public /* synthetic */ PluginBuilder(AnonymousClass1 anonymousClass1) {
        }
    }
}
