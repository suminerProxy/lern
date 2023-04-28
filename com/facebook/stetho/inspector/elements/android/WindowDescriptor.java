package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WindowDescriptor extends AbstractChainedDescriptor<Window> implements HighlightableDescriptor<Window> {
    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ Object getElementToHighlightAtPosition(Window window, int i2, int i3, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ View getViewAndBoundsForHighlighting(Window window, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(Window window, Accumulator accumulator) {
    }

    @Nullable
    /* renamed from: getElementToHighlightAtPosition  reason: avoid collision after fix types in other method */
    public Object getElementToHighlightAtPosition2(Window window, int i2, int i3, Rect rect) {
    }

    @Nullable
    /* renamed from: getViewAndBoundsForHighlighting  reason: avoid collision after fix types in other method */
    public View getViewAndBoundsForHighlighting2(Window window, Rect rect) {
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(Window window, Accumulator<Object> accumulator) {
    }
}
