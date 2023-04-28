package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ThreadBound;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface NodeDescriptor<E> extends ThreadBound {
    void getAttributes(E e2, AttributeAccumulator attributeAccumulator);

    void getChildren(E e2, Accumulator<Object> accumulator);

    void getComputedStyles(E e2, ComputedStyleAccumulator computedStyleAccumulator);

    String getLocalName(E e2);

    String getNodeName(E e2);

    NodeType getNodeType(E e2);

    @Nullable
    String getNodeValue(E e2);

    void getStyleRuleNames(E e2, StyleRuleNameAccumulator styleRuleNameAccumulator);

    void getStyles(E e2, String str, StyleAccumulator styleAccumulator);

    void hook(E e2);

    void setAttributesAsText(E e2, String str);

    void setStyle(E e2, String str, String str2, String str3);

    void unhook(E e2);
}
