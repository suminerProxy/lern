package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractChainedDescriptor<E> extends Descriptor<E> implements ChainedDescriptor<E> {
    private Descriptor<? super E> mSuper;

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getAttributes(E e2, AttributeAccumulator attributeAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getChildren(E e2, Accumulator<Object> accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public void getComputedStyles(E e2, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getLocalName(E e2) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeName(E e2) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final NodeType getNodeType(E e2) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final String getNodeValue(E e2) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyleRuleNames(E e2, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void getStyles(E e2, String str, StyleAccumulator styleAccumulator) {
    }

    public final Descriptor<? super E> getSuper() {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void hook(E e2) {
    }

    public void onGetAttributes(E e2, AttributeAccumulator attributeAccumulator) {
    }

    public void onGetChildren(E e2, Accumulator<Object> accumulator) {
    }

    public void onGetComputedStyles(E e2, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public String onGetLocalName(E e2) {
    }

    public String onGetNodeName(E e2) {
    }

    public NodeType onGetNodeType(E e2) {
    }

    @Nullable
    public String onGetNodeValue(E e2) {
    }

    public void onGetStyleRuleNames(E e2, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public void onGetStyles(E e2, String str, StyleAccumulator styleAccumulator) {
    }

    public void onHook(E e2) {
    }

    public void onSetAttributesAsText(E e2, String str) {
    }

    public void onSetStyle(E e2, String str, String str2, String str3) {
    }

    public void onUnhook(E e2) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setAttributesAsText(E e2, String str) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void setStyle(E e2, String str, String str2, String str3) {
    }

    @Override // com.facebook.stetho.inspector.elements.ChainedDescriptor
    public void setSuper(Descriptor<? super E> descriptor) {
    }

    @Override // com.facebook.stetho.inspector.elements.NodeDescriptor
    public final void unhook(E e2) {
    }
}
