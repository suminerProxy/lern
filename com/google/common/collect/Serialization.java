package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Map;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Serialization {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FieldSetter<T> {
        private final Field field;

        public /* synthetic */ FieldSetter(Field field, AnonymousClass1 anonymousClass1) {
        }

        public void set(T t, Object obj) {
        }

        private FieldSetter(Field field) {
        }

        public void set(T t, int i2) {
        }
    }

    private Serialization() {
    }

    public static <T> FieldSetter<T> getFieldSetter(Class<T> cls, String str) {
    }

    public static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    public static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    public static <E> void populateMultiset(Multiset<E> multiset, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    public static int readCount(ObjectInputStream objectInputStream) throws IOException {
    }

    public static <K, V> void writeMap(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
    }

    public static <K, V> void writeMultimap(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) throws IOException {
    }

    public static <E> void writeMultiset(Multiset<E> multiset, ObjectOutputStream objectOutputStream) throws IOException {
    }

    public static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
    }

    public static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
    }

    public static <E> void populateMultiset(Multiset<E> multiset, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
    }
}
