package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ShadowDocument implements DocumentView {
    private final IdentityHashMap<Object, ElementInfo> mElementToInfoMap;
    private boolean mIsUpdating;
    private final Object mRootElement;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class Update implements DocumentView {
        private final Map<Object, ElementInfo> mElementToInfoChangesMap;
        private final Set<Object> mRootElementChangesSet;
        public final /* synthetic */ ShadowDocument this$0;

        public Update(ShadowDocument shadowDocument, Map<Object, ElementInfo> map, Set<Object> set) {
        }

        private void removeGarbageSubTree(Map<Object, ElementInfo> map, Object obj) {
        }

        private void validateTree(Map<Object, ElementInfo> map) {
        }

        public void abandon() {
        }

        public void commit() {
        }

        public void getChangedElements(Accumulator<Object> accumulator) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentView
        public ElementInfo getElementInfo(Object obj) {
        }

        public void getGarbageElements(Accumulator<Object> accumulator) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentView
        public Object getRootElement() {
        }

        public boolean isElementChanged(Object obj) {
        }

        public boolean isEmpty() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class UpdateBuilder {
        private HashSet<Object> mCachedNotNewChildrenSet;
        private final Map<Object, ElementInfo> mElementToInfoChangesMap;
        private final HashSet<Object> mRootElementChanges;
        public final /* synthetic */ ShadowDocument this$0;

        public UpdateBuilder(ShadowDocument shadowDocument) {
        }

        private HashSet<Object> acquireNotNewChildrenHashSet() {
        }

        private void releaseNotNewChildrenHashSet(HashSet<Object> hashSet) {
        }

        private void setElementParent(Object obj, Object obj2) {
        }

        public Update build() {
        }

        public void setElementChildren(Object obj, List<Object> list) {
        }
    }

    public ShadowDocument(Object obj) {
    }

    public static /* synthetic */ IdentityHashMap access$000(ShadowDocument shadowDocument) {
    }

    public static /* synthetic */ Object access$100(ShadowDocument shadowDocument) {
    }

    public static /* synthetic */ boolean access$200(ShadowDocument shadowDocument) {
    }

    public static /* synthetic */ boolean access$202(ShadowDocument shadowDocument, boolean z) {
    }

    public UpdateBuilder beginUpdate() {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentView
    public ElementInfo getElementInfo(Object obj) {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentView
    public Object getRootElement() {
    }
}
