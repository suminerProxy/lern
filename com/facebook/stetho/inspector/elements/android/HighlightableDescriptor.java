package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HighlightableDescriptor<E> {
    @Nullable
    Object getElementToHighlightAtPosition(E e2, int i2, int i3, Rect rect);

    @Nullable
    View getViewAndBoundsForHighlighting(E e2, Rect rect);
}
