package com.efs.sdk.base.core.controller;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.a.a;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ControllerCenter implements Handler.Callback {

    /* renamed from: h  reason: collision with root package name */
    private static GlobalEnvStruct f3083h;

    /* renamed from: a  reason: collision with root package name */
    private int f3084a;
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3085d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3086e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f3087f;

    /* renamed from: g  reason: collision with root package name */
    private a f3088g;

    /* renamed from: i  reason: collision with root package name */
    private Handler f3089i;

    /* renamed from: com.efs.sdk.base.core.controller.ControllerCenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ILogProtocol f3090a;
        public final /* synthetic */ ControllerCenter b;

        public AnonymousClass1(ControllerCenter controllerCenter, ILogProtocol iLogProtocol) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public ControllerCenter(EfsReporter.Builder builder) {
    }

    private void a() {
    }

    private void b(ILogProtocol iLogProtocol) {
    }

    @NonNull
    public static GlobalEnvStruct getGlobalEnvStruct() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
    }

    public void send(ILogProtocol iLogProtocol) {
    }

    @Nullable
    public HttpResponse sendSyncImmediately(String str, int i2, String str2, boolean z, File file) {
    }

    public static /* synthetic */ void a(ILogProtocol iLogProtocol) {
    }
}
