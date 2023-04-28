package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ApplicationDescriptor extends AbstractChainedDescriptor<Application> {
    private final ActivityTracker mActivityTracker;
    private final Map<Application, ElementContext> mElementToContextMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class ElementContext {
        private Application mElement;
        private final ActivityTracker.Listener mListener;
        public final /* synthetic */ ApplicationDescriptor this$0;

        /* renamed from: com.facebook.stetho.inspector.elements.android.ApplicationDescriptor$ElementContext$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements ActivityTracker.Listener {
            public final /* synthetic */ ElementContext this$1;

            public AnonymousClass1(ElementContext elementContext) {
            }

            @Override // com.facebook.stetho.inspector.elements.android.ActivityTracker.Listener
            public void onActivityAdded(Activity activity) {
            }

            @Override // com.facebook.stetho.inspector.elements.android.ActivityTracker.Listener
            public void onActivityRemoved(Activity activity) {
            }
        }

        public ElementContext(ApplicationDescriptor applicationDescriptor) {
        }

        public List<WeakReference<Activity>> getActivitiesList() {
        }

        public void hook(Application application) {
        }

        public void unhook() {
        }
    }

    public static /* synthetic */ ActivityTracker access$000(ApplicationDescriptor applicationDescriptor) {
    }

    private ElementContext getContext(Application application) {
    }

    private static boolean isDecorViewOfActivity(View view, List<WeakReference<Activity>> list) {
    }

    private void storeWindowIfNeeded(Application application, Accumulator<Object> accumulator, List<WeakReference<Activity>> list) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(Application application, Accumulator accumulator) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ NodeType onGetNodeType(Application application) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onHook(Application application) {
    }

    @Override // com.facebook.stetho.inspector.elements.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onUnhook(Application application) {
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(Application application, Accumulator<Object> accumulator) {
    }

    /* renamed from: onGetNodeType  reason: avoid collision after fix types in other method */
    public NodeType onGetNodeType2(Application application) {
    }

    /* renamed from: onHook  reason: avoid collision after fix types in other method */
    public void onHook2(Application application) {
    }

    /* renamed from: onUnhook  reason: avoid collision after fix types in other method */
    public void onUnhook2(Application application) {
    }
}
