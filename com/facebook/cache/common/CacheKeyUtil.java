package com.facebook.cache.common;

import com.facebook.common.util.SecureHashUtil;
import com.facebook.infer.annotation.Nullsafe;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CacheKeyUtil {
    public static String getFirstResourceId(final CacheKey key) {
        try {
            if (key instanceof MultiCacheKey) {
                return secureHashKey(((MultiCacheKey) key).getCacheKeys().get(0));
            }
            return secureHashKey(key);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List<String> getResourceIds(final CacheKey key) {
        ArrayList arrayList;
        try {
            if (key instanceof MultiCacheKey) {
                List<CacheKey> cacheKeys = ((MultiCacheKey) key).getCacheKeys();
                arrayList = new ArrayList(cacheKeys.size());
                for (int i2 = 0; i2 < cacheKeys.size(); i2++) {
                    arrayList.add(secureHashKey(cacheKeys.get(i2)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(key.isResourceIdForDebugging() ? key.getUriString() : secureHashKey(key));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String secureHashKey(final CacheKey key) throws UnsupportedEncodingException {
        return SecureHashUtil.makeSHA1HashBase64(key.getUriString().getBytes("UTF-8"));
    }
}
