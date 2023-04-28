package com.wrapper.proxyapplication;

import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_app_com.showstartfans.activity-1_base.apk_68136.dex */
public class CustomerClassLoader extends PathClassLoader {
    private static final boolean VERBOSE_DEBUG = false;
    private boolean initialized;
    private final String libPath;
    private final String mDexOutputPath;
    private DexFile[] mDexs;
    private File[] mFiles;
    private String[] mLibPaths;
    private String[] mPaths;
    private ZipFile[] mZips;
    private final String path;

    private native int ShowLogs(String str, int i2);

    public CustomerClassLoader(String str, String str2, String str3, ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException, IllegalArgumentException, NullPointerException, IOException {
        super("", str3, classLoader.getParent());
        if (str == null || str2 == null) {
            throw new NullPointerException();
        }
        this.path = str;
        this.libPath = str3;
        this.mDexOutputPath = str2;
        try {
            findField(classLoader, "parent").set(classLoader, this);
            ensureInit();
        } catch (IOException e2) {
            throw e2;
        } catch (NoSuchFieldException e3) {
            throw e3;
        }
    }

    private synchronized void ensureInit() throws IOException {
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        this.mPaths = this.path.split(":");
        int length = this.mPaths.length;
        this.mFiles = new File[length];
        this.mZips = new ZipFile[length];
        this.mDexs = new DexFile[length];
        for (int i2 = 0; i2 < length; i2++) {
            File file = new File(this.mPaths[i2]);
            this.mFiles[i2] = file;
            if (file.isFile()) {
                try {
                    this.mZips[i2] = new ZipFile(file);
                } catch (IOException unused) {
                }
                try {
                    if (this.mDexOutputPath != null) {
                        this.mDexs[i2] = DexFile.loadDex(this.mPaths[i2], generateOutputName(this.mPaths[i2], this.mDexOutputPath), 0);
                    }
                } catch (IOException unused2) {
                    throw new IOException("load dex fail");
                } catch (RuntimeException unused3) {
                    throw new IOException("load dex fail");
                }
            }
        }
        String property = System.getProperty("java.library.path", ".");
        String property2 = System.getProperty("path.separator", ":");
        String property3 = System.getProperty("file.separator", "/");
        if (this.libPath != null) {
            property = property.length() > 0 ? this.libPath + property2 + property : this.libPath;
        }
        this.mLibPaths = property.split(property2);
        int length2 = this.mLibPaths.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (!this.mLibPaths[i3].endsWith(property3)) {
                StringBuilder sb = new StringBuilder();
                String[] strArr = this.mLibPaths;
                sb.append(strArr[i3]);
                sb.append(property3);
                strArr[i3] = sb.toString();
            }
        }
    }

    private static String generateOutputName(String str, String str2) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(str2);
        if (!str2.endsWith("/")) {
            sb.append("/");
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(".");
        if (lastIndexOf2 < 0) {
            sb.append(str);
        } else {
            sb.append((CharSequence) str, 0, lastIndexOf2);
        }
        sb.append(".dex");
        return sb.toString();
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
        try {
            ensureInit();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        int length = this.mPaths.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.mDexs[i2] != null) {
                ShowLogs(str, i2);
                Class<?> loadClass = this.mDexs[i2].loadClass(str.replace('.', '/'), this);
                if (loadClass != null) {
                    return loadClass;
                }
                try {
                    Class<?> findClass = super.findClass(str);
                    if (findClass != null) {
                        return findClass;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            } else if (this.mZips[i2] != null) {
                loadFromArchive(this.mZips[i2], str.replace('.', '/') + ".class");
            } else if (this.mFiles[i2].isDirectory()) {
                loadFromDirectory(this.mPaths[i2] + "/" + str.replace('.', '/') + ".class");
            }
        }
        throw new ClassNotFoundException(str + " in loader " + this);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected URL findResource(String str) {
        URL findResource = super.findResource(str);
        if (findResource != null) {
            return findResource;
        }
        int length = this.mPaths.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = this.mFiles[i2];
            ZipFile zipFile = this.mZips[i2];
            if (!this.mPaths[i2].endsWith(".dex") && zipFile.getEntry(str) != null) {
                try {
                    return new URL("jar:" + file.toURL() + "!/" + str);
                } catch (MalformedURLException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return null;
    }

    private byte[] loadFromDirectory(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.read(bArr);
                randomAccessFile.close();
                return bArr;
            } catch (IOException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    private byte[] loadFromArchive(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry(str);
        if (entry == null) {
            return null;
        }
        try {
            InputStream inputStream = zipFile.getInputStream(entry);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) entry.getSize());
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean isInArchive(ZipFile zipFile, String str) {
        return zipFile.getEntry(str) != null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        try {
            ensureInit();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String mapLibraryName = System.mapLibraryName(str);
        for (int i2 = 0; i2 < this.mLibPaths.length; i2++) {
            String str2 = this.mLibPaths[i2] + mapLibraryName;
            if (new File(str2).exists()) {
                return str2;
            }
            String findLibrary = super.findLibrary(str);
            if (findLibrary != null) {
                return findLibrary;
            }
        }
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Package getPackage(String str) {
        Package r0;
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (this) {
            r0 = super.getPackage(str);
            if (r0 == null) {
                r0 = definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", null);
            }
        }
        return r0;
    }

    private static Field findField(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }
}
