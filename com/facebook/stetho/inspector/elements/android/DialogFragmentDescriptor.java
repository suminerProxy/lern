package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.android.DialogFragmentAccessor;
import com.facebook.stetho.common.android.FragmentCompat;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ChainedDescriptor;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DialogFragmentDescriptor extends Descriptor<Object> implements ChainedDescriptor<Object>, HighlightableDescriptor<Object> {
    private final DialogFragmentAccessor mAccessor;
    private Descriptor<? super Object> mSuper;

    private DialogFragmentDescriptor(FragmentCompat fragmentCompat) {
    }

    private static void maybeRegister(DescriptorMap descriptorMap, @Nullable FragmentCompat fragmentCompat) {
    }

    public static DescriptorMap register(DescriptorMap descriptorMap) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getChildren(Object obj, Accumulator<Object> accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public Object getElementToHighlightAtPosition(Object obj, int i2, int i3, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public String getLocalName(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public String getNodeName(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public NodeType getNodeType(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    @Nullable
    public String getNodeValue(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.HighlightableDescriptor
    @Nullable
    public View getViewAndBoundsForHighlighting(Object obj, Rect rect) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void hook(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void setAttributesAsText(Object obj, String str) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void setStyle(Object obj, String str, String str2, String str3) {
    }

    @Override // com.facebook.stetho.inspector.elements.ChainedDescriptor
    public void setSuper(Descriptor<? super Object> descriptor) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void unhook(Object obj) {
    }
}
