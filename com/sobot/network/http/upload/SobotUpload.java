package com.sobot.network.http.upload;

import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.task.XExecutor;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotUpload {
    private static SobotUpload instance;
    private Map<String, SobotUploadTask<?>> taskMap;
    private SobotUploadThreadPool threadPool;

    private SobotUpload() {
    }

    public static SobotUpload getInstance() {
    }

    public static <T> SobotUploadTask<T> request(String str, RequestCall requestCall) {
    }

    public static <T> SobotUploadTask<T> restore(SobotProgress sobotProgress) {
    }

    public void addOnAllTaskEndListener(XExecutor.OnAllTaskEndListener onAllTaskEndListener) {
    }

    public SobotUploadTask<?> getTask(String str) {
    }

    public Map<String, SobotUploadTask<?>> getTaskMap() {
    }

    public SobotUploadThreadPool getThreadPool() {
    }

    public boolean hasTask(String str) {
    }

    public void pauseAll() {
    }

    public void removeAll() {
    }

    public void removeOnAllTaskEndListener(XExecutor.OnAllTaskEndListener onAllTaskEndListener) {
    }

    public SobotUploadTask<?> removeTask(String str) {
    }

    public void startAll() {
    }

    public void unRegister() {
    }

    public static List<SobotUploadTask<?>> restore(List<SobotProgress> list) {
    }
}
