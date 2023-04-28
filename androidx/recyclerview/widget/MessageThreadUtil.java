package androidx.recyclerview.widget;

import android.os.Handler;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {
        public static final int ADD_TILE = 2;
        public static final int REMOVE_TILE = 3;
        public static final int UPDATE_ITEM_COUNT = 1;
        private final Handler mMainThreadHandler;
        private Runnable mMainThreadRunnable;
        public final MessageQueue mQueue;
        public final /* synthetic */ MessageThreadUtil this$0;
        public final /* synthetic */ ThreadUtil.MainThreadCallback val$callback;

        /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class RunnableC00061 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;

            public RunnableC00061(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(MessageThreadUtil messageThreadUtil, ThreadUtil.MainThreadCallback mainThreadCallback) {
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i2, TileList.Tile<T> tile) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i2, int i3) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        public static final int LOAD_TILE = 3;
        public static final int RECYCLE_TILE = 4;
        public static final int REFRESH = 1;
        public static final int UPDATE_RANGE = 2;
        private Runnable mBackgroundRunnable;
        public AtomicBoolean mBackgroundRunning;
        private final Executor mExecutor;
        public final MessageQueue mQueue;
        public final /* synthetic */ MessageThreadUtil this$0;
        public final /* synthetic */ ThreadUtil.BackgroundCallback val$callback;

        /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;

            public AnonymousClass1(AnonymousClass2 anonymousClass2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(MessageThreadUtil messageThreadUtil, ThreadUtil.BackgroundCallback backgroundCallback) {
        }

        private void maybeExecuteBackgroundRunnable() {
        }

        private void sendMessage(SyncQueueItem syncQueueItem) {
        }

        private void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i2) {
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i2, int i3, int i4, int i5, int i6) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MessageQueue {
        private SyncQueueItem mRoot;

        public synchronized SyncQueueItem next() {
        }

        public synchronized void removeMessages(int i2) {
        }

        public synchronized void sendMessage(SyncQueueItem syncQueueItem) {
        }

        public synchronized void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(ThreadUtil.BackgroundCallback<T> backgroundCallback) {
    }

    @Override // androidx.recyclerview.widget.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SyncQueueItem {
        private static SyncQueueItem sPool;
        private static final Object sPoolLock = null;
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        public SyncQueueItem next;
        public int what;

        public static SyncQueueItem obtainMessage(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        }

        public void recycle() {
        }

        public static SyncQueueItem obtainMessage(int i2, int i3, int i4) {
        }

        public static SyncQueueItem obtainMessage(int i2, int i3, Object obj) {
        }
    }
}
