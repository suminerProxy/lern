package com.google.common.graph;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class GraphConstants {
    public static final int DEFAULT_EDGE_COUNT = 20;
    public static final int DEFAULT_NODE_COUNT = 10;
    public static final String EDGE_ALREADY_EXISTS = "Edge %s already exists in the graph.";
    public static final String EDGE_NOT_IN_GRAPH = "Edge %s is not an element of this graph.";
    public static final String ENDPOINTS_MISMATCH = "Mismatch: unordered endpoints cannot be used with directed graphs";
    public static final int EXPECTED_DEGREE = 2;
    public static final int INNER_CAPACITY = 2;
    public static final float INNER_LOAD_FACTOR = 1.0f;
    public static final String MULTIPLE_EDGES_CONNECTING = "Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.";
    public static final String NODE_NOT_IN_GRAPH = "Node %s is not an element of this graph.";
    public static final String NOT_AVAILABLE_ON_UNDIRECTED = "Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.";
    public static final String PARALLEL_EDGES_NOT_ALLOWED = "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.";
    public static final String REUSING_EDGE = "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.";
    public static final String SELF_LOOPS_NOT_ALLOWED = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Presence {
        private static final /* synthetic */ Presence[] $VALUES = null;
        public static final Presence EDGE_EXISTS = null;

        private Presence(String str, int i2) {
        }

        public static Presence valueOf(String str) {
        }

        public static Presence[] values() {
        }
    }

    private GraphConstants() {
    }
}
