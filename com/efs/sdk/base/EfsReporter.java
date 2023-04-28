package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class EfsReporter {
    private static ControllerCenter sControllerCenter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap;
        private static boolean sUseAppContext;
        private final String TAG;
        private GlobalEnvStruct mGlobalEnvStruct;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@NonNull Application application, @NonNull String str, @NonNull String str2) {
        }

        private static Context checkContext(Context context) {
        }

        private void checkParam(String str) {
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
        }

        public EfsReporter build() {
        }

        public Builder configRefreshAction(@NonNull IConfigRefreshAction iConfigRefreshAction) {
        }

        public Builder configRefreshDelayMills(long j2) {
        }

        public Builder debug(boolean z) {
        }

        public Builder efsDirRootName(String str) {
        }

        public Builder enableSendLog(boolean z) {
        }

        public Builder enableWaStat(boolean z) {
        }

        public GlobalEnvStruct getGlobalEnvStruct() {
        }

        public Builder intl(boolean z) {
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
        }

        public Builder maxConcurrentUploadCnt(int i2) {
        }

        public Builder printLogDetail(boolean z) {
        }

        public Builder publicParams(@NonNull IPublicParams iPublicParams) {
        }

        public Builder uid(String str) {
        }

        public Builder(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        }

        public Builder publicParams(@NonNull Map<String, String> map) {
        }
    }

    public /* synthetic */ EfsReporter(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ GlobalEnvStruct access$100(EfsReporter efsReporter) {
    }

    @NonNull
    private GlobalEnvStruct getGlobalEnvStruct() {
    }

    public void addPublicParams(@NonNull Map<String, String> map) {
    }

    public void flushRecordLogImmediately(String str) {
    }

    public Map<String, String> getAllConfig() {
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
    }

    public void refreshConfig(String str) {
    }

    public void registerCallback(int i2, ValueCallback<Pair<Message, Message>> valueCallback) {
    }

    public void send(ILogProtocol iLogProtocol) {
    }

    public HttpResponse sendSyncImediatelly(String str, int i2, String str2, File file) {
    }

    public void setEnableRefreshConfigFromRemote(boolean z) {
    }

    private EfsReporter(Builder builder) {
    }

    public HttpResponse sendSyncImediatelly(String str, int i2, String str2, boolean z, File file) {
    }

    public Map<String, Object> getAllSdkConfig() {
    }
}
