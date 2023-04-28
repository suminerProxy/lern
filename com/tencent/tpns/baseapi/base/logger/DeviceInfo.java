package com.tencent.tpns.baseapi.base.logger;

import android.content.Context;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DeviceInfo {

    /* renamed from: a  reason: collision with root package name */
    private BuildInfo f13624a = new BuildInfo(this);
    private ScreenInfo b;

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class BuildInfo {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DeviceInfo f13625a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private int f13626d;

        /* renamed from: e  reason: collision with root package name */
        private String f13627e;

        /* renamed from: f  reason: collision with root package name */
        private String f13628f;

        public BuildInfo(DeviceInfo deviceInfo) {
        }

        public String toString() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ScreenInfo {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DeviceInfo f13629a;
        private int b;
        private int c;

        public ScreenInfo(DeviceInfo deviceInfo, Context context) {
        }

        private int a(Context context) {
        }

        private int b(Context context) {
        }

        public String toString() {
        }
    }

    public DeviceInfo(Context context) {
        this.b = new ScreenInfo(this, context);
    }

    public String toString() {
        return "DeviceInfo{buildInfo=" + this.f13624a + ", screenInfo=" + this.b + '}';
    }
}
