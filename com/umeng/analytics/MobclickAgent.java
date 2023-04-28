package com.umeng.analytics;

import android.content.Context;
import com.umeng.common.ISysListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MobclickAgent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EScenarioType {
        public static final EScenarioType E_UM_GAME = null;
        public static final EScenarioType E_UM_NORMAL = null;
        private static final /* synthetic */ EScenarioType[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f14642a;

        private EScenarioType(String str, int i2, int i3) {
        }

        public static EScenarioType valueOf(String str) {
        }

        public static EScenarioType[] values() {
        }

        public int toValue() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class PageMode {
        public static final PageMode AUTO = null;
        public static final PageMode LEGACY_AUTO = null;
        public static final PageMode LEGACY_MANUAL = null;
        public static final PageMode MANUAL = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ PageMode[] f14643a = null;

        private PageMode(String str, int i2) {
        }

        public static PageMode valueOf(String str) {
        }

        public static PageMode[] values() {
        }
    }

    public static void clearPreProperties(Context context) {
    }

    public static void disable() {
    }

    private static void disableExceptionCatch() {
    }

    public static void enableEncrypt(boolean z) {
    }

    public static b getAgent() {
    }

    public static JSONObject getPreProperties(Context context) {
    }

    private static void init(Context context) {
    }

    public static void onEvent(Context context, String str) {
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i2) {
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> hashMap) {
    }

    public static void onKillProcess(Context context) {
    }

    public static void onPageEnd(String str) {
    }

    public static void onPageStart(String str) {
    }

    public static void onPause(Context context) {
    }

    public static void onProfileSignIn(String str) {
    }

    public static void onProfileSignOff() {
    }

    public static void onResume(Context context) {
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
    }

    public static void reportError(Context context, String str) {
    }

    public static void setCatchUncaughtExceptions(boolean z) {
    }

    public static void setCheckDevice(boolean z) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
    }

    private static void setGameScenarioType(Context context) {
    }

    public static void setLatencyWindow(long j2) {
    }

    public static void setLocation(double d2, double d3) {
    }

    public static void setOpenGLContext(GL10 gl10) {
    }

    public static void setPageCollectionMode(PageMode pageMode) {
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
    }

    public static void setSessionContinueMillis(long j2) {
    }

    private static void setSysListener(ISysListener iSysListener) {
    }

    public static void unregisterPreProperty(Context context, String str) {
    }

    public static void onEvent(Context context, String str, String str2) {
    }

    public static void onProfileSignIn(String str, String str2) {
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
    }

    public static void reportError(Context context, Throwable th) {
    }
}
