package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    private ProtoAdapter<Object> adapter;
    private final String adapterString;
    private final Field builderField;
    private final Method builderMethod;
    private ProtoAdapter<?> keyAdapter;
    private final String keyAdapterString;
    public final WireField.Label label;
    private final Field messageField;
    public final String name;
    public final boolean redacted;
    private ProtoAdapter<?> singleAdapter;
    public final int tag;

    public FieldBinding(WireField wireField, Field field, Class<B> cls) {
    }

    private static Field getBuilderField(Class<?> cls, String str) {
    }

    private static Method getBuilderMethod(Class<?> cls, String str, Class<?> cls2) {
    }

    public ProtoAdapter<Object> adapter() {
    }

    public Object get(M m2) {
    }

    public Object getFromBuilder(B b) {
    }

    public boolean isMap() {
    }

    public ProtoAdapter<?> keyAdapter() {
    }

    public void set(B b, Object obj) {
    }

    public ProtoAdapter<?> singleAdapter() {
    }

    public void value(B b, Object obj) {
    }
}
