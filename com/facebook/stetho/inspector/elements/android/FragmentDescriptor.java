package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.android.FragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FragmentDescriptor extends AbstractChainedDescriptor<Object> implements HighlightableDescriptor<Object> {
    private static final String ID_ATTRIBUTE_NAME = "id";
    private static final String TAG_ATTRIBUTE_NAME = "tag";
    private final FragmentAccessor mAccessor;

    private FragmentDescriptor(FragmentCompat fragmentCompat) {
    }

    private static void maybeRegister(DescriptorMap descriptorMap, @Nullable FragmentCompat fragmentCompat) {
    }

    public static DescriptorMap register(DescriptorMap descriptorMap) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public Object getElementToHighlightAtPosition(Object obj, int i2, int i3, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public View getViewAndBoundsForHighlighting(Object obj, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public void onGetChildren(Object obj, Accumulator<Object> accumulator) {
    }
}
