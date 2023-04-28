package com.sobot.network.http.download;

import android.content.Context;
import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.task.XExecutor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotDownload {
    private static final String CACHE_DIR = "cache";
    private static final String ROOT_DIR = "sobot";
    private static SobotDownload instance;
    private String folder;
    private ConcurrentHashMap<String, SobotDownloadTask> taskMap;
    private SobotDownloadThreadPool threadPool;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface CancelTagType {
        public static final String SOBOT_TAG_CHATROOM = "tag_chatroom";
        public static final String SOBOT_TAG_DOWNLOAD_ACT = "tag_download_act";
    }

    private SobotDownload() {
    }

    public static String encode(String str) {
    }

    public static SobotDownload getInstance() {
    }

    public static String getRootDir(Context context) {
    }

    public static String getSDCardRootPath(Context context) {
    }

    public static boolean isExitsSdcard() {
    }

    public static SobotDownloadTask request(String str, RequestCall requestCall) {
    }

    public static SobotDownloadTask restore(SobotProgress sobotProgress) {
    }

    public void addOnAllTaskEndListener(XExecutor.OnAllTaskEndListener onAllTaskEndListener) {
    }

    public String getFolder() {
    }

    public SobotDownloadTask getTask(String str) {
    }

    public Map<String, SobotDownloadTask> getTaskMap() {
    }

    public SobotDownloadThreadPool getThreadPool() {
    }

    public boolean hasTask(String str) {
    }

    public void initFolder(String str) {
    }

    public void pauseAll() {
    }

    public void removeAll() {
    }

    public void removeOnAllTaskEndListener(XExecutor.OnAllTaskEndListener onAllTaskEndListener) {
    }

    public SobotDownloadTask removeTask(String str) {
    }

    public SobotDownload setFolder(String str) {
    }

    public void startAll() {
    }

    public void unRegister(String str) {
    }

    public void removeAll(boolean z) {
    }

    public static List<SobotDownloadTask> restore(List<SobotProgress> list) {
    }
}
