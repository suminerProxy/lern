package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.inspector.elements.ShadowDocument;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Document extends ThreadBoundProxy {
    private AttributeListAccumulator mCachedAttributeAccumulator;
    private ChildEventingList mCachedChildEventingList;
    private ArrayListAccumulator<Object> mCachedChildrenAccumulator;
    private final Queue<Object> mCachedUpdateQueue;
    private DocumentProvider mDocumentProvider;
    private final DocumentProviderFactory mFactory;
    private final ObjectIdMapper mObjectIdMapper;
    @GuardedBy("this")
    private int mReferenceCounter;
    private ShadowDocument mShadowDocument;
    private UpdateListenerCollection mUpdateListeners;

    /* renamed from: com.facebook.stetho.inspector.elements.Document$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Document this$0;

        public AnonymousClass1(Document document) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.elements.Document$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Document this$0;

        public AnonymousClass2(Document document) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.elements.Document$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Accumulator<Object> {
        public final /* synthetic */ Document this$0;
        public final /* synthetic */ ShadowDocument.Update val$docUpdate;
        public final /* synthetic */ ArrayList val$garbageElementIds;

        public AnonymousClass3(Document document, ShadowDocument.Update update, ArrayList arrayList) {
        }

        @Override // com.facebook.stetho.common.Accumulator
        public void store(Object obj) {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.elements.Document$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements Accumulator<Object> {
        public final /* synthetic */ Document this$0;
        public final /* synthetic */ ShadowDocument.Update val$docUpdate;
        public final /* synthetic */ ArrayList val$garbageElementIds;

        public AnonymousClass4(Document document, ArrayList arrayList, ShadowDocument.Update update) {
        }

        @Override // com.facebook.stetho.common.Accumulator
        public void store(Object obj) {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.elements.Document$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements Accumulator<Object> {
        private Accumulator<Object> insertedElements;
        private final HashSet<Object> listenerInsertedElements;
        public final /* synthetic */ Document this$0;
        public final /* synthetic */ ShadowDocument.Update val$docUpdate;

        /* renamed from: com.facebook.stetho.inspector.elements.Document$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Accumulator<Object> {
            public final /* synthetic */ AnonymousClass5 this$1;

            public AnonymousClass1(AnonymousClass5 anonymousClass5) {
            }

            @Override // com.facebook.stetho.common.Accumulator
            public void store(Object obj) {
            }
        }

        public AnonymousClass5(Document document, ShadowDocument.Update update) {
        }

        public static /* synthetic */ HashSet access$800(AnonymousClass5 anonymousClass5) {
        }

        @Override // com.facebook.stetho.common.Accumulator
        public void store(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AttributeListAccumulator extends ArrayList<String> implements AttributeAccumulator {
        @Override // com.facebook.stetho.inspector.elements.AttributeAccumulator
        public void store(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class DocumentObjectIdMapper extends ObjectIdMapper {
        public final /* synthetic */ Document this$0;

        private DocumentObjectIdMapper(Document document) {
        }

        @Override // com.facebook.stetho.inspector.helper.ObjectIdMapper
        public void onMapped(Object obj, int i2) {
        }

        @Override // com.facebook.stetho.inspector.helper.ObjectIdMapper
        public void onUnmapped(Object obj, int i2) {
        }

        public /* synthetic */ DocumentObjectIdMapper(Document document, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ProviderListener implements DocumentProviderListener {
        public final /* synthetic */ Document this$0;

        private ProviderListener(Document document) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public void onAttributeModified(Object obj, String str, String str2) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public void onAttributeRemoved(Object obj, String str) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public void onInspectRequested(Object obj) {
        }

        @Override // com.facebook.stetho.inspector.elements.DocumentProviderListener
        public void onPossiblyChanged() {
        }

        public /* synthetic */ ProviderListener(Document document, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface UpdateListener {
        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);

        void onChildNodeInserted(DocumentView documentView, Object obj, int i2, int i3, Accumulator<Object> accumulator);

        void onChildNodeRemoved(int i2, int i3);

        void onInspectRequested(Object obj);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class UpdateListenerCollection implements UpdateListener {
        private final List<UpdateListener> mListeners;
        private volatile UpdateListener[] mListenersSnapshot;
        public final /* synthetic */ Document this$0;

        public UpdateListenerCollection(Document document) {
        }

        private UpdateListener[] getListenersSnapshot() {
        }

        public synchronized void add(UpdateListener updateListener) {
        }

        public synchronized void clear() {
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onAttributeModified(Object obj, String str, String str2) {
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onAttributeRemoved(Object obj, String str) {
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onChildNodeInserted(DocumentView documentView, Object obj, int i2, int i3, Accumulator<Object> accumulator) {
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onChildNodeRemoved(int i2, int i3) {
        }

        @Override // com.facebook.stetho.inspector.elements.Document.UpdateListener
        public void onInspectRequested(Object obj) {
        }

        public synchronized void remove(UpdateListener updateListener) {
        }
    }

    public Document(DocumentProviderFactory documentProviderFactory) {
    }

    public static /* synthetic */ ShadowDocument access$100(Document document) {
    }

    public static /* synthetic */ void access$1000(ChildEventingList childEventingList, List list, Accumulator accumulator) {
    }

    public static /* synthetic */ ShadowDocument access$102(Document document, ShadowDocument shadowDocument) {
    }

    public static /* synthetic */ void access$1100(Document document, ChildEventingList childEventingList) {
    }

    public static /* synthetic */ void access$1200(Document document) {
    }

    public static /* synthetic */ DocumentProvider access$200(Document document) {
    }

    public static /* synthetic */ DocumentProvider access$202(Document document, DocumentProvider documentProvider) {
    }

    public static /* synthetic */ ShadowDocument.Update access$300(Document document) {
    }

    public static /* synthetic */ ObjectIdMapper access$500(Document document) {
    }

    public static /* synthetic */ UpdateListenerCollection access$700(Document document) {
    }

    public static /* synthetic */ ChildEventingList access$900(Document document, Object obj, DocumentView documentView) {
    }

    private AttributeListAccumulator acquireCachedAttributeAccumulator() {
    }

    private ChildEventingList acquireChildEventingList(Object obj, DocumentView documentView) {
    }

    private ArrayListAccumulator<Object> acquireChildrenAccumulator() {
    }

    private void applyDocumentUpdate(ShadowDocument.Update update) {
    }

    private void cleanUp() {
    }

    private ShadowDocument.Update createShadowDocumentUpdate() {
    }

    private boolean doesElementMatch(Object obj, Pattern pattern) {
    }

    private void findMatches(Object obj, Pattern pattern, Accumulator<Integer> accumulator) {
    }

    private void init() {
    }

    private void releaseCachedAttributeAccumulator(AttributeListAccumulator attributeListAccumulator) {
    }

    private void releaseChildEventingList(ChildEventingList childEventingList) {
    }

    private void releaseChildrenAccumulator(ArrayListAccumulator<Object> arrayListAccumulator) {
    }

    private static void updateListenerChildren(ChildEventingList childEventingList, List<Object> list, Accumulator<Object> accumulator) {
    }

    private void updateTree() {
    }

    public synchronized void addRef() {
    }

    public void addUpdateListener(UpdateListener updateListener) {
    }

    public void findMatchingElements(String str, Accumulator<Integer> accumulator) {
    }

    public DocumentView getDocumentView() {
    }

    public void getElementComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    @Nullable
    public Object getElementForNodeId(int i2) {
    }

    public void getElementStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public void getElementStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    @Nullable
    public NodeDescriptor getNodeDescriptor(Object obj) {
    }

    @Nullable
    public Integer getNodeIdForElement(Object obj) {
    }

    public Object getRootElement() {
    }

    public void hideHighlight() {
    }

    public void highlightElement(Object obj, int i2) {
    }

    public synchronized void release() {
    }

    public void removeUpdateListener(UpdateListener updateListener) {
    }

    public void setAttributesAsText(Object obj, String str) {
    }

    public void setElementStyle(Object obj, String str, String str2, String str3) {
    }

    public void setInspectModeEnabled(boolean z) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ChildEventingList extends ArrayList<Object> {
        private DocumentView mDocumentView;
        private Object mParentElement;
        private int mParentNodeId;
        public final /* synthetic */ Document this$0;

        private ChildEventingList(Document document) {
        }

        public void acquire(Object obj, DocumentView documentView) {
        }

        public void addWithEvent(int i2, Object obj, Accumulator<Object> accumulator) {
        }

        public void release() {
        }

        public void removeWithEvent(int i2) {
        }

        public /* synthetic */ ChildEventingList(Document document, AnonymousClass1 anonymousClass1) {
        }
    }
}
