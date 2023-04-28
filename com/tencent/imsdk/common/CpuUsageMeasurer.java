package com.tencent.imsdk.common;

import java.io.Closeable;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CpuUsageMeasurer {
    private static final String TAG = "CpuUsageMeasurer";
    private static final long UPDATE_INTERVAL = 0;
    private final long mClockClkInHz;
    private long mIdleCpuTime;
    private float mLastAppCpuTimeUsed;
    private float mLastAppCpuUsage;
    private float mLastSysCpuUsage;
    private long mLastUpdateTime;
    private RandomAccessFile mProcessStatFile;
    private final int mProcessorCount;
    private RandomAccessFile mSystemStatFile;
    private long mTotalCpuTime;

    public static void closeQuietly(Closeable closeable) {
    }

    private static String[] readFirstLineAndSplit(RandomAccessFile randomAccessFile) {
    }

    private void updateCpuUsage() {
    }

    public void finalize() throws Throwable {
    }

    public int[] getCpuUsage() {
    }
}
