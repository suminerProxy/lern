package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ViewGroupDescriptor extends AbstractChainedDescriptor<ViewGroup> implements HighlightableDescriptor<ViewGroup> {
    private final Map<View, Object> mViewToElementMap;

    private Object getElement(View view, Object obj) {
    }

    private Object getElementForView(ViewGroup viewGroup, View view) {
    }

    private boolean isChildVisible(View view) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ Object getElementToHighlightAtPosition(ViewGroup viewGroup, int i2, int i3, Rect rect) {
    }

    @Nullable
    /* renamed from: getViewAndBoundsForHighlighting  reason: avoid collision after fix types in other method */
    public View getViewAndBoundsForHighlighting2(ViewGroup viewGroup, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ View getViewAndBoundsForHighlighting(ViewGroup viewGroup, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(ViewGroup viewGroup, Accumulator accumulator) {
    }

    @Nullable
    /* renamed from: getElementToHighlightAtPosition  reason: avoid collision after fix types in other method */
    public Object getElementToHighlightAtPosition2(ViewGroup viewGroup, int i2, int i3, Rect rect) {
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(ViewGroup viewGroup, Accumulator<Object> accumulator) {
    }
}
