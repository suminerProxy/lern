package com.facebook.stetho.inspector.elements.android;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.Predicate;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderListener;
import com.facebook.stetho.inspector.elements.NodeDescriptor;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AndroidDocumentProvider extends ThreadBoundProxy implements DocumentProvider, AndroidDescriptorHost {
    private static final int INSPECT_HOVER_COLOR = 1077952767;
    private static final int INSPECT_OVERLAY_COLOR = 1090519039;
    private static final long REPORT_CHANGED_INTERVAL_MS = 1000;
    private final Application mApplication;
    private final DescriptorMap mDescriptorMap;
    private final AndroidDocumentRoot mDocumentRoot;
    private final ViewHighlighter mHighlighter;
    private final Rect mHighlightingBoundsRect;
    private final Rect mHitRect;
    private final InspectModeHandler mInspectModeHandler;
    private boolean mIsReportChangesTimerPosted;
    @Nullable
    private DocumentProviderListener mListener;
    private final Runnable mReportChangesTimer;

    /* renamed from: com.facebook.stetho.inspector.elements.android.AndroidDocumentProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ AndroidDocumentProvider this$0;

        public AnonymousClass1(AndroidDocumentProvider androidDocumentProvider) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.elements.android.AndroidDocumentProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Accumulator<Object> {
        public final /* synthetic */ AndroidDocumentProvider this$0;
        public final /* synthetic */ Accumulator val$accumulator;

        public AnonymousClass2(AndroidDocumentProvider androidDocumentProvider, Accumulator accumulator) {
        }

        @Override // com.facebook.stetho.common.Accumulator
        public void store(Object obj) {
        }
    }

    public AndroidDocumentProvider(Application application, List<DescriptorProvider> list, ThreadBound threadBound) {
    }

    public static /* synthetic */ boolean access$002(AndroidDocumentProvider androidDocumentProvider, boolean z) {
    }

    public static /* synthetic */ DocumentProviderListener access$100(AndroidDocumentProvider androidDocumentProvider) {
    }

    public static /* synthetic */ Application access$300(AndroidDocumentProvider androidDocumentProvider) {
    }

    public static /* synthetic */ void access$500(AndroidDocumentProvider androidDocumentProvider, Accumulator accumulator) {
    }

    public static /* synthetic */ Rect access$600(AndroidDocumentProvider androidDocumentProvider) {
    }

    public static /* synthetic */ Rect access$700(AndroidDocumentProvider androidDocumentProvider) {
    }

    public static /* synthetic */ ViewHighlighter access$800(AndroidDocumentProvider androidDocumentProvider) {
    }

    private void getWindows(Accumulator<Window> accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void dispose() {
    }

    @Override // com.facebook.stetho.inspector.elements.Descriptor.Host
    public Descriptor getDescriptor(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.android.AndroidDescriptorHost
    @Nullable
    public HighlightableDescriptor getHighlightableDescriptor(@Nullable Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public NodeDescriptor getNodeDescriptor(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public Object getRootElement() {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void hideHighlight() {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void highlightElement(Object obj, int i2) {
    }

    @Override // com.facebook.stetho.inspector.elements.Descriptor.Host
    public void onAttributeModified(Object obj, String str, String str2) {
    }

    @Override // com.facebook.stetho.inspector.elements.Descriptor.Host
    public void onAttributeRemoved(Object obj, String str) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void setAttributesAsText(Object obj, String str) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void setInspectModeEnabled(boolean z) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProvider
    public void setListener(DocumentProviderListener documentProviderListener) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class InspectModeHandler {
        private List<View> mOverlays;
        private final Predicate<View> mViewSelector;
        public final /* synthetic */ AndroidDocumentProvider this$0;

        /* renamed from: com.facebook.stetho.inspector.elements.android.AndroidDocumentProvider$InspectModeHandler$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Predicate<View> {
            public final /* synthetic */ InspectModeHandler this$1;

            public AnonymousClass1(InspectModeHandler inspectModeHandler) {
            }

            @Override // com.facebook.stetho.common.Predicate
            public /* bridge */ /* synthetic */ boolean apply(View view) {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(View view) {
            }
        }

        /* renamed from: com.facebook.stetho.inspector.elements.android.AndroidDocumentProvider$InspectModeHandler$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass2 implements Accumulator<Window> {
            public final /* synthetic */ InspectModeHandler this$1;

            public AnonymousClass2(InspectModeHandler inspectModeHandler) {
            }

            @Override // com.facebook.stetho.common.Accumulator
            public /* bridge */ /* synthetic */ void store(Window window) {
            }

            /* renamed from: store  reason: avoid collision after fix types in other method */
            public void store2(Window window) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public final class OverlayView extends DocumentHiddenView {
            public final /* synthetic */ InspectModeHandler this$1;

            public OverlayView(InspectModeHandler inspectModeHandler, Context context) {
            }

            @Override // android.view.View
            public void onDraw(Canvas canvas) {
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
            }
        }

        private InspectModeHandler(AndroidDocumentProvider androidDocumentProvider) {
        }

        public static /* synthetic */ List access$400(InspectModeHandler inspectModeHandler) {
        }

        public void disable() {
        }

        public void enable() {
        }

        public /* synthetic */ InspectModeHandler(AndroidDocumentProvider androidDocumentProvider, AnonymousClass1 anonymousClass1) {
        }
    }
}
