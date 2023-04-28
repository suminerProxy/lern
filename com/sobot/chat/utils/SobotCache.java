package com.sobot.chat.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, SobotCache> mInstanceMap;
    private ACacheManager mCache;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class ACacheManager {
        private final AtomicInteger cacheCount;
        public File cacheDir;
        private final AtomicLong cacheSize;
        private final int countLimit;
        private final Map<File, Long> lastUsageDates;
        private final long sizeLimit;
        public final /* synthetic */ SobotCache this$0;

        /* renamed from: com.sobot.chat.utils.SobotCache$ACacheManager$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ ACacheManager this$1;

            public AnonymousClass1(ACacheManager aCacheManager) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public /* synthetic */ ACacheManager(SobotCache sobotCache, File file, long j2, int i2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ File access$100(ACacheManager aCacheManager, String str) {
        }

        public static /* synthetic */ boolean access$1400(ACacheManager aCacheManager, String str) {
        }

        public static /* synthetic */ void access$1500(ACacheManager aCacheManager) {
        }

        public static /* synthetic */ long access$1600(ACacheManager aCacheManager, File file) {
        }

        public static /* synthetic */ Map access$1700(ACacheManager aCacheManager) {
        }

        public static /* synthetic */ AtomicLong access$1800(ACacheManager aCacheManager) {
        }

        public static /* synthetic */ AtomicInteger access$1900(ACacheManager aCacheManager) {
        }

        public static /* synthetic */ void access$200(ACacheManager aCacheManager, File file) {
        }

        public static /* synthetic */ File access$400(ACacheManager aCacheManager, String str) {
        }

        private void calculateCacheSizeAndCacheCount() {
        }

        private long calculateSize(File file) {
        }

        private void clear() {
        }

        private File get(String str) {
        }

        private File newFile(String str) {
        }

        private void put(File file) {
        }

        private boolean remove(String str) {
        }

        private long removeNext() {
        }

        private ACacheManager(SobotCache sobotCache, File file, long j2, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class Utils {
        private static final char mSeparator = ' ';

        private Utils() {
        }

        private static byte[] Bitmap2Bytes(Bitmap bitmap) {
        }

        private static Bitmap Bytes2Bimap(byte[] bArr) {
        }

        public static /* synthetic */ byte[] access$1000(Bitmap bitmap) {
        }

        public static /* synthetic */ Bitmap access$1100(byte[] bArr) {
        }

        public static /* synthetic */ Bitmap access$1200(Drawable drawable) {
        }

        public static /* synthetic */ Drawable access$1300(Bitmap bitmap) {
        }

        public static /* synthetic */ String access$300(int i2, String str) {
        }

        public static /* synthetic */ boolean access$500(String str) {
        }

        public static /* synthetic */ String access$600(String str) {
        }

        public static /* synthetic */ byte[] access$700(int i2, byte[] bArr) {
        }

        public static /* synthetic */ boolean access$800(byte[] bArr) {
        }

        public static /* synthetic */ byte[] access$900(byte[] bArr) {
        }

        private static Drawable bitmap2Drawable(Bitmap bitmap) {
        }

        private static String clearDateInfo(String str) {
        }

        private static byte[] copyOfRange(byte[] bArr, int i2, int i3) {
        }

        private static String createDateInfo(int i2) {
        }

        private static Bitmap drawable2Bitmap(Drawable drawable) {
        }

        private static String[] getDateInfoFromDate(byte[] bArr) {
        }

        private static boolean hasDateInfo(byte[] bArr) {
        }

        private static int indexOf(byte[] bArr, char c) {
        }

        private static boolean isDue(String str) {
        }

        private static byte[] newByteArrayWithDateInfo(int i2, byte[] bArr) {
        }

        private static String newStringWithDateInfo(int i2, String str) {
        }

        private static boolean isDue(byte[] bArr) {
        }

        private static byte[] clearDateInfo(byte[] bArr) {
        }
    }

    private SobotCache(File file, long j2, int i2) {
    }

    public static SobotCache get(Context context) {
    }

    private static String myPid() {
    }

    public void clear() {
    }

    public File file(String str) {
    }

    public byte[] getAsBinary(String str) {
    }

    public Bitmap getAsBitmap(String str) {
    }

    public Drawable getAsDrawable(String str) {
    }

    public JSONArray getAsJSONArray(String str) {
    }

    public JSONObject getAsJSONObject(String str) {
    }

    public Object getAsObject(String str) {
    }

    public String getAsString(String str) {
    }

    public void put(String str, String str2) {
    }

    public boolean remove(String str) {
    }

    public static SobotCache get(Context context, String str) {
    }

    public static SobotCache get(File file) {
    }

    public static SobotCache get(Context context, long j2, int i2) {
    }

    public static SobotCache get(File file, long j2, int i2) {
    }

    public void put(String str, String str2, int i2) {
    }

    public void put(String str, JSONObject jSONObject) {
    }

    public void put(String str, JSONObject jSONObject, int i2) {
    }

    public void put(String str, JSONArray jSONArray) {
    }

    public void put(String str, JSONArray jSONArray, int i2) {
    }

    public void put(String str, byte[] bArr) {
    }

    public void put(String str, byte[] bArr, int i2) {
    }

    public void put(String str, Serializable serializable) {
    }

    public void put(String str, Serializable serializable, int i2) {
    }

    public void put(String str, Bitmap bitmap) {
    }

    public void put(String str, Bitmap bitmap, int i2) {
    }

    public void put(String str, Drawable drawable) {
    }

    public void put(String str, Drawable drawable, int i2) {
    }
}
