package com.sobot.network.http.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.sobot.network.http.request.RequestCall;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotProgress implements Serializable {
    public static final String CURRENT_SIZE = "currentSize";
    public static final String DATE = "date";
    public static final int ERROR = 4;
    public static final int FALSE = 0;
    public static final String FILE_NAME = "fileName";
    public static final String FILE_PATH = "filePath";
    public static final int FINISH = 5;
    public static final String FOLDER = "folder";
    public static final String FRACTION = "fraction";
    public static final String IS_UPLOAD = "isUpload";
    public static final int LOADING = 2;
    public static final int NONE = 0;
    public static final int PAUSE = 3;
    public static final String PRIORITY = "priority";
    private static final long REFRESH_TIME = 300;
    public static final String REQUEST = "request";
    public static final String STATUS = "status";
    public static final String TAG = "tag";
    public static final String TOTAL_SIZE = "totalSize";
    public static final int TRUE = 1;
    public static final String URL = "url";
    public static final int WAITING = 1;
    private static final long serialVersionUID = 6353658567594109891L;
    public long currentSize;
    public long date;
    public Throwable exception;
    public String fileName;
    public String filePath;
    public String folder;
    public float fraction;
    public boolean isUpload;
    private transient long lastRefreshTime;
    public int priority;
    public RequestCall request;
    public transient long speed;
    public int status;
    public String tag;
    private transient long tempSize;
    public String tmpTag;
    public long totalSize;
    public String url;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface Action {
        void call(SobotProgress sobotProgress);
    }

    public static ContentValues buildContentValues(SobotProgress sobotProgress) {
    }

    public static ContentValues buildUpdateContentValues(SobotProgress sobotProgress) {
    }

    public static SobotProgress changeProgress(SobotProgress sobotProgress, long j2, Action action) {
    }

    public static SobotProgress parseCursorToBean(Cursor cursor) {
    }

    public boolean equals(Object obj) {
    }

    public void from(SobotProgress sobotProgress) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public static SobotProgress changeProgress(SobotProgress sobotProgress, long j2, long j3, Action action) {
    }
}
