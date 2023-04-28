package com.facebook.stetho.inspector.runtime;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class RhinoDetectingRuntimeReplFactory implements RuntimeReplFactory {
    private final Context mContext;
    private RuntimeException mRhinoJsUnexpectedError;
    private RuntimeReplFactory mRhinoReplFactory;
    private boolean mSearchedForRhinoJs;

    /* renamed from: com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements RuntimeRepl {
        public final /* synthetic */ RhinoDetectingRuntimeReplFactory this$0;

        public AnonymousClass1(RhinoDetectingRuntimeReplFactory rhinoDetectingRuntimeReplFactory) {
        }

        @Override // com.facebook.stetho.inspector.console.RuntimeRepl
        public Object evaluate(String str) throws Exception {
        }
    }

    public RhinoDetectingRuntimeReplFactory(Context context) {
    }

    public static /* synthetic */ RuntimeException access$000(RhinoDetectingRuntimeReplFactory rhinoDetectingRuntimeReplFactory) {
    }

    @Nullable
    private static RuntimeReplFactory findRhinoReplFactory(Context context) throws RuntimeException {
    }

    @Override // com.facebook.stetho.inspector.console.RuntimeReplFactory
    public RuntimeRepl newInstance() {
    }
}
