package com.mob.tools.gui;

import java.util.LinkedList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CachePoolInner<K, V> {
    private int capacity;
    private OnRemoveListener<K, V> listener;
    private LinkedList<CachePoolInner<K, V>.Node<K, V>> pool;
    private int poolSize;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Node<K, V> {
        private long cacheTime;
        public K key;
        private int size;
        public final /* synthetic */ CachePoolInner this$0;
        public V value;

        private Node(CachePoolInner cachePoolInner) {
        }

        public static /* synthetic */ long access$100(Node node) {
        }

        public static /* synthetic */ long access$102(Node node, long j2) {
        }

        public static /* synthetic */ int access$200(Node node) {
        }

        public static /* synthetic */ int access$202(Node node, int i2) {
        }

        public /* synthetic */ Node(CachePoolInner cachePoolInner, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnRemoveListener<K, V> {
        void onRemove(K k2, V v);
    }

    public CachePoolInner(int i2) {
    }

    public synchronized void clear() {
    }

    public synchronized V get(K k2) {
    }

    public synchronized boolean put(K k2, V v, int i2) {
    }

    public void setOnRemoveListener(OnRemoveListener<K, V> onRemoveListener) {
    }

    public synchronized int size() {
    }

    public synchronized void trimBeforeTime(long j2) {
    }

    public synchronized boolean put(K k2, V v) {
    }
}
