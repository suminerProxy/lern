package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GlobalEnvStruct {

    /* renamed from: a  reason: collision with root package name */
    private String f3051a;
    private String b;
    private boolean c;
    public long configRefreshDelayMills;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3052d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3053e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f3054f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3055g;

    /* renamed from: h  reason: collision with root package name */
    private String f3056h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3057i;

    /* renamed from: j  reason: collision with root package name */
    private long f3058j;

    /* renamed from: k  reason: collision with root package name */
    private long f3059k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, String> f3060l;

    /* renamed from: m  reason: collision with root package name */
    private ILogEncryptAction f3061m;
    public Context mAppContext;

    /* renamed from: n  reason: collision with root package name */
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f3062n;

    /* renamed from: o  reason: collision with root package name */
    private List<IEfsReporterObserver> f3063o;

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
    }

    public void addPublicParams(Map<String, String> map) {
    }

    public String getAppid() {
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i2) {
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
    }

    public ILogEncryptAction getLogEncryptAction() {
    }

    public long getLogSendDelayMills() {
    }

    public long getLogSendIntervalMills() {
    }

    public Map<String, String> getPublicParamMap() {
    }

    public String getSecret() {
    }

    public String getUid() {
    }

    public boolean isDebug() {
    }

    public boolean isEnableSendLog() {
    }

    public boolean isEnableWaStat() {
    }

    public boolean isIntl() {
    }

    public boolean isPrintLogDetail() {
    }

    public void registerCallback(int i2, ValueCallback<Pair<Message, Message>> valueCallback) {
    }

    public void setAppid(String str) {
    }

    public void setDebug(boolean z) {
    }

    public void setEnableSendLog(boolean z) {
    }

    public void setEnableWaStat(boolean z) {
    }

    public void setIsIntl(boolean z) {
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
    }

    public void setPrintLogDetail(boolean z) {
    }

    public void setSecret(String str) {
    }

    public void setUid(String str) {
    }
}
