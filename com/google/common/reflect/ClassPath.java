package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SetMultimap;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ClassPath {
    private static final String CLASS_FILE_NAME_EXTENSION = ".class";
    private static final Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = null;
    private static final Predicate<ClassInfo> IS_TOP_LEVEL = null;
    private static final Logger logger = null;
    private final ImmutableSet<ResourceInfo> resources;

    /* renamed from: com.google.common.reflect.ClassPath$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Predicate<ClassInfo> {
        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(ClassInfo classInfo) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public boolean apply2(ClassInfo classInfo) {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ClassInfo extends ResourceInfo {
        private final String className;

        public ClassInfo(String str, ClassLoader classLoader) {
        }

        public static /* synthetic */ String access$000(ClassInfo classInfo) {
        }

        public String getName() {
        }

        public String getPackageName() {
        }

        public String getSimpleName() {
        }

        public Class<?> load() {
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
        }
    }

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ResourceInfo {
        public final ClassLoader loader;
        private final String resourceName;

        public ResourceInfo(String str, ClassLoader classLoader) {
        }

        public static ResourceInfo of(String str, ClassLoader classLoader) {
        }

        public final ByteSource asByteSource() {
        }

        public final CharSource asCharSource(Charset charset) {
        }

        public boolean equals(Object obj) {
        }

        public final String getResourceName() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public final URL url() {
        }
    }

    private ClassPath(ImmutableSet<ResourceInfo> immutableSet) {
    }

    public static /* synthetic */ Logger access$100() {
    }

    public static /* synthetic */ Splitter access$200() {
    }

    public static ClassPath from(ClassLoader classLoader) throws IOException {
    }

    @VisibleForTesting
    public static String getClassName(String str) {
    }

    @VisibleForTesting
    public static File toFile(URL url) {
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
    }

    public ImmutableSet<ResourceInfo> getResources() {
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
    }

    public ImmutableSet<ClassInfo> getTopLevelClassesRecursive(String str) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Scanner {
        private final Set<File> scannedUris;

        private static ImmutableList<URL> getClassLoaderUrls(ClassLoader classLoader) {
        }

        @VisibleForTesting
        public static ImmutableMap<File, ClassLoader> getClassPathEntries(ClassLoader classLoader) {
        }

        @VisibleForTesting
        public static URL getClassPathEntry(File file, String str) throws MalformedURLException {
        }

        @VisibleForTesting
        public static ImmutableSet<File> getClassPathFromManifest(File file, @NullableDecl Manifest manifest) {
        }

        @VisibleForTesting
        public static ImmutableList<URL> parseJavaClassPath() {
        }

        private void scanFrom(File file, ClassLoader classLoader) throws IOException {
        }

        private void scanJar(File file, ClassLoader classLoader) throws IOException {
        }

        public final void scan(ClassLoader classLoader) throws IOException {
        }

        public abstract void scanDirectory(ClassLoader classLoader, File file) throws IOException;

        public abstract void scanJarFile(ClassLoader classLoader, JarFile jarFile) throws IOException;

        @VisibleForTesting
        public final void scan(File file, ClassLoader classLoader) throws IOException {
        }
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses(String str) {
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DefaultScanner extends Scanner {
        private final SetMultimap<ClassLoader, String> resources;

        public ImmutableSet<ResourceInfo> getResources() {
        }

        @Override // com.google.common.reflect.ClassPath.Scanner
        public void scanDirectory(ClassLoader classLoader, File file) throws IOException {
        }

        @Override // com.google.common.reflect.ClassPath.Scanner
        public void scanJarFile(ClassLoader classLoader, JarFile jarFile) {
        }

        private void scanDirectory(File file, ClassLoader classLoader, String str, Set<File> set) throws IOException {
        }
    }
}
