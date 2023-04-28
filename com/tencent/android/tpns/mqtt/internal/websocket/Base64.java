package com.tencent.android.tpns.mqtt.internal.websocket;

import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class Base64 {
    private static final Base64Encoder ENCODER = null;
    private static final Base64 INSTANCE = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Base64Encoder extends AbstractPreferences {
        private String base64String;
        public final /* synthetic */ Base64 this$0;

        public Base64Encoder(Base64 base64) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public AbstractPreferences childSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public String[] childrenNamesSpi() throws BackingStoreException {
        }

        @Override // java.util.prefs.AbstractPreferences
        public void flushSpi() throws BackingStoreException {
        }

        public String getBase64String() {
        }

        @Override // java.util.prefs.AbstractPreferences
        public String getSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public String[] keysSpi() throws BackingStoreException {
        }

        @Override // java.util.prefs.AbstractPreferences
        public void putSpi(String str, String str2) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public void removeNodeSpi() throws BackingStoreException {
        }

        @Override // java.util.prefs.AbstractPreferences
        public void removeSpi(String str) {
        }

        @Override // java.util.prefs.AbstractPreferences
        public void syncSpi() throws BackingStoreException {
        }
    }

    public static String encode(String str) {
    }

    public static String encodeBytes(byte[] bArr) {
    }
}
