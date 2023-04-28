package com.tencent.rtmp.downloader;

import com.tencent.liteav.txcvodplayer.b.d;
import com.tencent.rtmp.downloader.a.a;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVodDownloadMediaInfo {
    public static final int STATE_ERROR = 3;
    public static final int STATE_FINISH = 4;
    public static final int STATE_INIT = 0;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 2;
    public a dataSource;
    public int downloadSegments;
    public int downloadSize;
    public int downloadState;
    public int duration;
    @Deprecated
    public d netApi;
    public String playPath;
    public int playableDuration;
    public float progress;
    public int segments;
    public int size;
    public int tid;
    public String url;
    public String userName;

    public TXVodDownloadDataSource getDataSource() {
    }

    public int getDownloadSize() {
    }

    public int getDownloadState() {
    }

    public int getDuration() {
    }

    public String getPlayPath() {
    }

    public int getPlayableDuration() {
    }

    public float getProgress() {
    }

    public int getSize() {
    }

    public int getTaskId() {
    }

    public String getUrl() {
    }

    public String getUserName() {
    }

    public boolean isDownloadFinished() {
    }
}
