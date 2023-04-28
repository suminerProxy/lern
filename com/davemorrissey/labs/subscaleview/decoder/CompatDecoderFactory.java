package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(@NonNull Class<? extends T> cls) {
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    @NonNull
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
    }

    public CompatDecoderFactory(@NonNull Class<? extends T> cls, Bitmap.Config config) {
    }
}
