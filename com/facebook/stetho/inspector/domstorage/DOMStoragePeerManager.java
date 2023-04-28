package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DOMStoragePeerManager extends ChromePeerManager {
    private final Context mContext;
    private final PeerRegistrationListener mPeerListener;

    /* renamed from: com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends PeersRegisteredListener {
        private final List<DevToolsSharedPreferencesListener> mPrefsListeners;
        public final /* synthetic */ DOMStoragePeerManager this$0;

        public AnonymousClass1(DOMStoragePeerManager dOMStoragePeerManager) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onFirstPeerRegistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onLastPeerUnregistered() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class DevToolsSharedPreferencesListener implements SharedPreferences.OnSharedPreferenceChangeListener {
        private final Map<String, Object> mCopy;
        private final SharedPreferences mPrefs;
        private final DOMStorage.StorageId mStorageId;
        public final /* synthetic */ DOMStoragePeerManager this$0;

        public DevToolsSharedPreferencesListener(DOMStoragePeerManager dOMStoragePeerManager, SharedPreferences sharedPreferences, String str) {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        }

        public void unregister() {
        }
    }

    public DOMStoragePeerManager(Context context) {
    }

    public static /* synthetic */ Context access$000(DOMStoragePeerManager dOMStoragePeerManager) {
    }

    public static /* synthetic */ Map access$100(Map map) {
    }

    private static Map<String, Object> prefsCopy(Map<String, ?> map) {
    }

    private static <T> Set<T> shallowCopy(Set<T> set) {
    }

    public void signalItemAdded(DOMStorage.StorageId storageId, String str, String str2) {
    }

    public void signalItemRemoved(DOMStorage.StorageId storageId, String str) {
    }

    public void signalItemUpdated(DOMStorage.StorageId storageId, String str, String str2, String str3) {
    }
}
