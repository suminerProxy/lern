package com.facebook.stetho.inspector.protocol.module;

import android.annotation.SuppressLint;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.Origin;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CSS implements ChromeDevtoolsDomain {
    private final Document mDocument;
    private final ObjectMapper mObjectMapper;
    private final ChromePeerManager mPeerManager;

    /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ CSS this$0;
        public final /* synthetic */ GetComputedStyleForNodeRequest val$request;
        public final /* synthetic */ GetComputedStyleForNodeResult val$result;

        /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00561 implements ComputedStyleAccumulator {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00561(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.facebook.stetho.inspector.elements.ComputedStyleAccumulator
            public void store(String str, String str2) {
            }
        }

        public AnonymousClass1(CSS css, GetComputedStyleForNodeRequest getComputedStyleForNodeRequest, GetComputedStyleForNodeResult getComputedStyleForNodeResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ CSS this$0;
        public final /* synthetic */ GetMatchedStylesForNodeRequest val$request;
        public final /* synthetic */ GetMatchedStylesForNodeResult val$result;

        /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements StyleRuleNameAccumulator {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ Object val$elementForNodeId;

            /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C00571 implements StyleAccumulator {
                public final /* synthetic */ AnonymousClass1 this$2;
                public final /* synthetic */ ArrayList val$properties;

                public C00571(AnonymousClass1 anonymousClass1, ArrayList arrayList) {
                }

                @Override // com.facebook.stetho.inspector.elements.StyleAccumulator
                public void store(String str, String str2, boolean z) {
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Object obj) {
            }

            @Override // com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator
            public void store(String str, boolean z) {
            }
        }

        public AnonymousClass2(CSS css, GetMatchedStylesForNodeRequest getMatchedStylesForNodeRequest, GetMatchedStylesForNodeResult getMatchedStylesForNodeResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ CSS this$0;
        public final /* synthetic */ String val$key;
        public final /* synthetic */ int val$nodeId;
        public final /* synthetic */ SetPropertyTextResult val$result;
        public final /* synthetic */ String val$ruleName;
        public final /* synthetic */ String val$value;

        /* renamed from: com.facebook.stetho.inspector.protocol.module.CSS$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements StyleAccumulator {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.facebook.stetho.inspector.elements.StyleAccumulator
            public void store(String str, String str2, boolean z) {
            }
        }

        public AnonymousClass3(CSS css, int i2, String str, String str2, String str3, SetPropertyTextResult setPropertyTextResult) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CSSComputedStyleProperty {
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String value;

        private CSSComputedStyleProperty() {
        }

        public /* synthetic */ CSSComputedStyleProperty(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CSSProperty {
        @JsonProperty
        public Boolean disabled;
        @JsonProperty
        public Boolean implicit;
        @JsonProperty
        public Boolean important;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty
        public Boolean parsedOk;
        @JsonProperty
        public SourceRange range;
        @JsonProperty
        public String text;
        @JsonProperty(required = true)
        public String value;

        private CSSProperty() {
        }

        public /* synthetic */ CSSProperty(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CSSRule {
        @JsonProperty
        public Origin origin;
        @JsonProperty(required = true)
        public SelectorList selectorList;
        @JsonProperty
        public CSSStyle style;
        @JsonProperty
        public String styleSheetId;

        private CSSRule() {
        }

        public /* synthetic */ CSSRule(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CSSStyle {
        @JsonProperty(required = true)
        public List<CSSProperty> cssProperties;
        @JsonProperty
        public String cssText;
        @JsonProperty
        public SourceRange range;
        @JsonProperty
        public List<ShorthandEntry> shorthandEntries;
        @JsonProperty
        public String styleSheetId;

        private CSSStyle() {
        }

        public /* synthetic */ CSSStyle(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetComputedStyleForNodeRequest {
        @JsonProperty(required = true)
        public int nodeId;

        private GetComputedStyleForNodeRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetComputedStyleForNodeResult implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<CSSComputedStyleProperty> computedStyle;

        private GetComputedStyleForNodeResult() {
        }

        public /* synthetic */ GetComputedStyleForNodeResult(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetMatchedStylesForNodeRequest implements JsonRpcResult {
        @JsonProperty
        public Boolean excludeInherited;
        @JsonProperty
        public Boolean excludePseudo;
        @JsonProperty(required = true)
        public int nodeId;

        private GetMatchedStylesForNodeRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class GetMatchedStylesForNodeResult implements JsonRpcResult {
        @JsonProperty
        public List<InheritedStyleEntry> inherited;
        @JsonProperty
        public List<RuleMatch> matchedCSSRules;
        @JsonProperty
        public List<PseudoIdMatches> pseudoElements;

        private GetMatchedStylesForNodeResult() {
        }

        public /* synthetic */ GetMatchedStylesForNodeResult(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InheritedStyleEntry {
        @JsonProperty(required = true)
        public CSSStyle inlineStyle;
        @JsonProperty(required = true)
        public List<RuleMatch> matchedCSSRules;

        private InheritedStyleEntry() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class PeerManagerListener extends PeersRegisteredListener {
        public final /* synthetic */ CSS this$0;

        private PeerManagerListener(CSS css) {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onFirstPeerRegistered() {
        }

        @Override // com.facebook.stetho.inspector.helper.PeersRegisteredListener
        public synchronized void onLastPeerUnregistered() {
        }

        public /* synthetic */ PeerManagerListener(CSS css, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PseudoIdMatches {
        @JsonProperty(required = true)
        public List<RuleMatch> matches;
        @JsonProperty(required = true)
        public int pseudoId;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class RuleMatch {
        @JsonProperty
        public List<Integer> matchingSelectors;
        @JsonProperty
        public CSSRule rule;

        private RuleMatch() {
        }

        public /* synthetic */ RuleMatch(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Selector {
        @JsonProperty
        public SourceRange range;
        @JsonProperty(required = true)
        public String value;

        private Selector() {
        }

        public /* synthetic */ Selector(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SelectorList {
        @JsonProperty
        public List<Selector> selectors;
        @JsonProperty
        public String text;

        private SelectorList() {
        }

        public /* synthetic */ SelectorList(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SetPropertyTextRequest implements JsonRpcResult {
        @JsonProperty(required = true)
        public String styleSheetId;
        @JsonProperty(required = true)
        public String text;

        private SetPropertyTextRequest() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SetPropertyTextResult implements JsonRpcResult {
        @JsonProperty(required = true)
        public CSSStyle style;

        private SetPropertyTextResult() {
        }

        public /* synthetic */ SetPropertyTextResult(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ShorthandEntry {
        @JsonProperty
        public Boolean important;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public String value;

        private ShorthandEntry() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SourceRange {
        @JsonProperty(required = true)
        public int endColumn;
        @JsonProperty(required = true)
        public int endLine;
        @JsonProperty(required = true)
        public int startColumn;
        @JsonProperty(required = true)
        public int startLine;

        private SourceRange() {
        }
    }

    public CSS(Document document) {
    }

    public static /* synthetic */ Document access$200(CSS css) {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getComputedStyleForNode(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    @SuppressLint({"DefaultLocale"})
    public JsonRpcResult getMatchedStylesForNode(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public SetPropertyTextResult setPropertyText(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
