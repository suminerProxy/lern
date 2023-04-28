package com.tencent.qcloud.tuikit.tuichat.util;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.rxjava3.RxDataStore;
import com.google.gson.Gson;
import com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil;
import i.a.e1.c.r0;
import i.a.e1.c.s;
import i.a.e1.d.f;
import i.a.e1.g.g;
import i.a.e1.g.o;
import i.a.e1.n.b;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DataStoreUtil {
    private static final String TAG = "DataStoreUtil";
    private static DataStoreUtil instance;
    private RxDataStore<Preferences> dataStore = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class DisponseHandler {
        public f disposable;

        public DisponseHandler() {
            DataStoreUtil.this = r1;
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface GetResult<T> {
        void onFail();

        void onSuccess(T t);
    }

    private DataStoreUtil() {
    }

    public static /* synthetic */ String a(Preferences.Key key, Preferences preferences) throws Throwable {
        return (String) preferences.get(key);
    }

    public static /* synthetic */ String b(Preferences.Key key, Preferences preferences) throws Throwable {
        return (String) preferences.get(key);
    }

    public static /* synthetic */ r0 c(Object obj, Preferences.Key key, Preferences preferences) throws Throwable {
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        mutablePreferences.set(key, new Gson().toJson(obj));
        return r0.N0(mutablePreferences);
    }

    public static DataStoreUtil getInstance() {
        if (instance == null) {
            instance = new DataStoreUtil();
        }
        return instance;
    }

    public <T> T getValue(String str, Class<T> cls) {
        if (this.dataStore == null) {
            TUIChatLog.e(TAG, "dataStore is null");
            return null;
        }
        final Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
        return (T) new Gson().fromJson((String) this.dataStore.data().X3(new o() { // from class: h.a0.a.a.a.c.a
            @Override // i.a.e1.g.o
            public final Object apply(Object obj) {
                return DataStoreUtil.a(Preferences.Key.this, (Preferences) obj);
            }
        }).f(), (Class<Object>) cls);
    }

    public <T> void getValueAsync(String str, final GetResult<T> getResult, final Class<T> cls) {
        if (this.dataStore == null) {
            TUIChatLog.e(TAG, "dataStore is null");
            getResult.onFail();
            return;
        }
        final Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
        final s<R> X3 = this.dataStore.data().X3(new o() { // from class: h.a0.a.a.a.c.b
            @Override // i.a.e1.g.o
            public final Object apply(Object obj) {
                return DataStoreUtil.b(Preferences.Key.this, (Preferences) obj);
            }
        });
        final DisponseHandler disponseHandler = new DisponseHandler();
        disponseHandler.disposable = X3.G6(b.e()).z4(i.a.e1.a.d.b.d()).C6(new g<String>() { // from class: com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.1
            {
                DataStoreUtil.this = this;
            }

            @Override // i.a.e1.g.g
            public void accept(String str2) throws Throwable {
                getResult.onSuccess(new Gson().fromJson((String) X3.f(), (Class<Object>) cls));
                f fVar = disponseHandler.disposable;
                if (fVar == null || fVar.isDisposed()) {
                    return;
                }
                disponseHandler.disposable.dispose();
            }
        }, new g<Throwable>() { // from class: com.tencent.qcloud.tuikit.tuichat.util.DataStoreUtil.2
            {
                DataStoreUtil.this = this;
            }

            @Override // i.a.e1.g.g
            public void accept(Throwable th) throws Throwable {
                String str2 = DataStoreUtil.TAG;
                TUIChatLog.e(str2, "dataStore throwable = " + th);
                getResult.onFail();
                f fVar = disponseHandler.disposable;
                if (fVar == null || fVar.isDisposed()) {
                    return;
                }
                disponseHandler.disposable.dispose();
            }
        });
    }

    public <T> void putValue(String str, final T t) {
        if (this.dataStore == null) {
            TUIChatLog.e(TAG, "dataStore is null");
            return;
        }
        final Preferences.Key<String> stringKey = PreferencesKeys.stringKey(str);
        this.dataStore.updateDataAsync(new o() { // from class: h.a0.a.a.a.c.c
            @Override // i.a.e1.g.o
            public final Object apply(Object obj) {
                return DataStoreUtil.c(t, stringKey, (Preferences) obj);
            }
        }).I1();
    }

    public void setDataStore(RxDataStore<Preferences> rxDataStore) {
        this.dataStore = rxDataStore;
    }
}
