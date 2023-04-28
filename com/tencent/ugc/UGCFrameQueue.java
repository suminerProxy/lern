package com.tencent.ugc;

import java.util.Deque;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCFrameQueue<T> {
    private final Deque<T> mDeque;
    private UGCFrameQueueListener mListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface UGCFrameQueueListener {
        void onFrameDequeued();
    }

    private void notifyFrameBeenDequeued() {
    }

    public void clear() {
    }

    public T dequeue() {
    }

    public List<T> dequeueAll() {
    }

    public T peekLast() {
    }

    public void queue(T t) {
    }

    public void setUGCFrameQueueListener(UGCFrameQueueListener uGCFrameQueueListener) {
    }

    public int size() {
    }
}
