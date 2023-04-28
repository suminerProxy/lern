package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ActivityDescriptor extends AbstractChainedDescriptor<Activity> implements HighlightableDescriptor<Activity> {
    private static void getDialogFragments(@Nullable FragmentCompat fragmentCompat, Activity activity, Accumulator<Object> accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ Object getElementToHighlightAtPosition(Activity activity, int i2, int i3, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public /* bridge */ /* synthetic */ View getViewAndBoundsForHighlighting(Activity activity, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(Activity activity, Accumulator accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ String onGetNodeName(Activity activity) {
    }

    @Nullable
    /* renamed from: getElementToHighlightAtPosition  reason: avoid collision after fix types in other method */
    public Object getElementToHighlightAtPosition2(Activity activity, int i2, int i3, Rect rect) {
    }

    @Nullable
    /* renamed from: getViewAndBoundsForHighlighting  reason: avoid collision after fix types in other method */
    public View getViewAndBoundsForHighlighting2(Activity activity, Rect rect) {
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(Activity activity, Accumulator<Object> accumulator) {
    }

    /* renamed from: onGetNodeName  reason: avoid collision after fix types in other method */
    public String onGetNodeName2(Activity activity) {
    }
}
