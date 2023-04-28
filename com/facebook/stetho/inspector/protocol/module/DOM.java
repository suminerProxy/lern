package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.common.ArrayListAccumulator;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.DocumentView;
import com.facebook.stetho.inspector.elements.NodeType;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.Runtime;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DOM implements ChromeDevtoolsDomain {
    private ChildNodeInsertedEvent mCachedChildNodeInsertedEvent;
    private ChildNodeRemovedEvent mCachedChildNodeRemovedEvent;
    private final Document mDocument;
    private final DocumentUpdateListener mListener;
    private final ObjectMapper mObjectMapper;
    private final ChromePeerManager mPeerManager;
    private final AtomicInteger mResultCounter;
    private final Map<String, List<Integer>> mSearchResults;

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements UncheckedCallable<Node> {
        public final /* synthetic */ DOM this$0;

        public AnonymousClass1(DOM dom) {
        }

        @Override // com.facebook.stetho.common.UncheckedCallable
        public /* bridge */ /* synthetic */ Node call() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.stetho.common.UncheckedCallable
        public Node call() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ DOM this$0;
        public final /* synthetic */ RGBAColor val$contentColor;
        public final /* synthetic */ HighlightNodeRequest val$request;

        public AnonymousClass2(DOM dom, HighlightNodeRequest highlightNodeRequest, RGBAColor rGBAColor) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ DOM this$0;

        public AnonymousClass3(DOM dom) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass4 implements UncheckedCallable<Object> {
        public final /* synthetic */ DOM this$0;
        public final /* synthetic */ ResolveNodeRequest val$request;

        public AnonymousClass4(DOM dom, ResolveNodeRequest resolveNodeRequest) {
        }

        @Override // com.facebook.stetho.common.UncheckedCallable
        public Object call() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ DOM this$0;
        public final /* synthetic */ SetAttributesAsTextRequest val$request;

        public AnonymousClass5(DOM dom, SetAttributesAsTextRequest setAttributesAsTextRequest) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ DOM this$0;
        public final /* synthetic */ SetInspectModeEnabledRequest val$request;

        public AnonymousClass6(DOM dom, SetInspectModeEnabledRequest setInspectModeEnabledRequest) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.DOM$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ DOM this$0;
        public final /* synthetic */ PerformSearchRequest val$request;
        public final /* synthetic */ ArrayListAccumulator val$resultNodeIds;

        public AnonymousClass7(DOM dom, PerformSearchRequest performSearchRequest, ArrayListAccumulator arrayListAccumulator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AttributeModifiedEvent {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String value;

        private AttributeModifiedEvent() {
        }

        public /* synthetic */ AttributeModifiedEvent(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AttributeRemovedEvent {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public int nodeId;

        private AttributeRemovedEvent() {
        }

        public /* synthetic */ AttributeRemovedEvent(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ChildNodeInsertedEvent {
        @JsonProperty(required = true)
        public Node node;
        @JsonProperty(required = true)
        public int parentNodeId;
        @JsonProperty(required = true)
        public int previousNodeId;

        private ChildNodeInsertedEvent() {
        }

        public /* synthetic */ ChildNodeInsertedEvent(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ChildNodeRemovedEvent {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public int parentNodeId;

        private ChildNodeRemovedEvent() {
        }

        public /* synthetic */ ChildNodeRemovedEvent(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DiscardSearchResultsRequest {
        @JsonProperty(required = true)
        public String searchId;

        private DiscardSearchResultsRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class DocumentUpdateListener implements Document.UpdateListener {
        public final /* synthetic */ DOM this$0;

        private DocumentUpdateListener(DOM dom) {
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

        public /* synthetic */ DocumentUpdateListener(DOM dom, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetDocumentResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public Node root;

        private GetDocumentResponse() {
        }

        public /* synthetic */ GetDocumentResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetSearchResultsRequest {
        @JsonProperty(required = true)
        public int fromIndex;
        @JsonProperty(required = true)
        public String searchId;
        @JsonProperty(required = true)
        public int toIndex;

        private GetSearchResultsRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetSearchResultsResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<Integer> nodeIds;

        private GetSearchResultsResponse() {
        }

        public /* synthetic */ GetSearchResultsResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HighlightConfig {
        @JsonProperty
        public RGBAColor contentColor;

        private HighlightConfig() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HighlightNodeRequest {
        @JsonProperty(required = true)
        public HighlightConfig highlightConfig;
        @JsonProperty
        public Integer nodeId;
        @JsonProperty
        public String objectId;

        private HighlightNodeRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InspectNodeRequestedEvent {
        @JsonProperty
        public int nodeId;

        private InspectNodeRequestedEvent() {
        }

        public /* synthetic */ InspectNodeRequestedEvent(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Node implements JsonRpcResult {
        @JsonProperty
        public List<String> attributes;
        @JsonProperty
        public Integer childNodeCount;
        @JsonProperty
        public List<Node> children;
        @JsonProperty(required = true)
        public String localName;
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String nodeName;
        @JsonProperty(required = true)
        public NodeType nodeType;
        @JsonProperty(required = true)
        public String nodeValue;

        private Node() {
        }

        public /* synthetic */ Node(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PeerManagerListener extends PeersRegisteredListener {
        public final /* synthetic */ DOM this$0;

        private PeerManagerListener(DOM dom) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onFirstPeerRegistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onLastPeerUnregistered() {
        }

        public /* synthetic */ PeerManagerListener(DOM dom, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PerformSearchRequest {
        @JsonProperty
        public Boolean includeUserAgentShadowDOM;
        @JsonProperty(required = true)
        public String query;

        private PerformSearchRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PerformSearchResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public int resultCount;
        @JsonProperty(required = true)
        public String searchId;

        private PerformSearchResponse() {
        }

        public /* synthetic */ PerformSearchResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RGBAColor {
        @JsonProperty

        /* renamed from: a  reason: collision with root package name */
        public Double f3274a;
        @JsonProperty(required = true)
        public int b;
        @JsonProperty(required = true)

        /* renamed from: g  reason: collision with root package name */
        public int f3275g;
        @JsonProperty(required = true)
        public int r;

        private RGBAColor() {
        }

        public int getColor() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ResolveNodeRequest {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty
        public String objectGroup;

        private ResolveNodeRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ResolveNodeResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public Runtime.RemoteObject object;

        private ResolveNodeResponse() {
        }

        public /* synthetic */ ResolveNodeResponse(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SetAttributesAsTextRequest {
        @JsonProperty(required = true)
        public int nodeId;
        @JsonProperty(required = true)
        public String text;

        private SetAttributesAsTextRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SetInspectModeEnabledRequest {
        @JsonProperty(required = true)
        public boolean enabled;
        @JsonProperty
        public HighlightConfig highlightConfig;
        @JsonProperty
        public Boolean inspectShadowDOM;

        private SetInspectModeEnabledRequest() {
        }
    }

    public DOM(Document document) {
    }

    public static /* synthetic */ ChromePeerManager access$1200(DOM dom) {
    }

    public static /* synthetic */ ChildNodeRemovedEvent access$1500(DOM dom) {
    }

    public static /* synthetic */ void access$1600(DOM dom, ChildNodeRemovedEvent childNodeRemovedEvent) {
    }

    public static /* synthetic */ ChildNodeInsertedEvent access$1700(DOM dom) {
    }

    public static /* synthetic */ void access$1800(DOM dom, ChildNodeInsertedEvent childNodeInsertedEvent) {
    }

    public static /* synthetic */ DocumentUpdateListener access$1900(DOM dom) {
    }

    public static /* synthetic */ Map access$2000(DOM dom) {
    }

    public static /* synthetic */ Document access$300(DOM dom) {
    }

    public static /* synthetic */ Node access$400(DOM dom, Object obj, DocumentView documentView, Accumulator accumulator) {
    }

    private ChildNodeInsertedEvent acquireChildNodeInsertedEvent() {
    }

    private ChildNodeRemovedEvent acquireChildNodeRemovedEvent() {
    }

    private Node createNodeForElement(Object obj, DocumentView documentView, @Nullable Accumulator<Object> accumulator) {
    }

    private void releaseChildNodeInsertedEvent(ChildNodeInsertedEvent childNodeInsertedEvent) {
    }

    private void releaseChildNodeRemovedEvent(ChildNodeRemovedEvent childNodeRemovedEvent) {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void discardSearchResults(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getDocument(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public GetSearchResultsResponse getSearchResults(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void hideHighlight(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void highlightNode(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public PerformSearchResponse performSearch(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public ResolveNodeResponse resolveNode(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
    }

    @ChromeDevtoolsMethod
    public void setAttributesAsText(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setInspectModeEnabled(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
