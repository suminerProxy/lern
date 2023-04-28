package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface DocumentProvider extends ThreadBound {
    void dispose();

    @Nullable
    NodeDescriptor getNodeDescriptor(@Nullable Object obj);

    @Nullable
    Object getRootElement();

    void hideHighlight();

    void highlightElement(Object obj, int i2);

    void setAttributesAsText(Object obj, String str);

    void setInspectModeEnabled(boolean z);

    void setListener(DocumentProviderListener documentProviderListener);
}
