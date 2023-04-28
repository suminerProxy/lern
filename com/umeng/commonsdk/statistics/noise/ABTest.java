package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.d;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ABTest implements d {
    private static ABTest instance;
    private Context context;
    private boolean isInTest;
    private int mGroup;
    private int mInterval;
    private String mPoli;
    private int mPolicy;
    private float mProb07;
    private float mProb13;

    private ABTest(Context context, String str, int i2) {
    }

    public static synchronized ABTest getService(Context context) {
    }

    private void parseFIXED(String str) {
    }

    private void parseSig7(String str) {
    }

    private float prob(String str, int i2) {
    }

    public static boolean validate(String str) {
    }

    public int getGroup() {
    }

    public String getGroupInfo() {
    }

    public int getTestInterval() {
    }

    public String getTestName() {
    }

    public int getTestPolicy() {
    }

    public boolean isInTest() {
    }

    public void onExperimentChanged(String str, int i2) {
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
    }

    public String toString() {
    }
}
