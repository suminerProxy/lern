package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FrameEntity extends Message<FrameEntity, Builder> {
    public static final ProtoAdapter<FrameEntity> ADAPTER = null;
    public static final Float DEFAULT_ALPHA = null;
    public static final String DEFAULT_CLIPPATH = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float alpha;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String clipPath;
    @WireField(adapter = "com.opensource.svgaplayer.proto.Layout#ADAPTER", tag = 2)
    public final Layout layout;
    @WireField(adapter = "com.opensource.svgaplayer.proto.ShapeEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<ShapeEntity> shapes;
    @WireField(adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER", tag = 3)
    public final Transform transform;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<FrameEntity, Builder> {
        public Float alpha;
        public String clipPath;
        public Layout layout;
        public List<ShapeEntity> shapes;
        public Transform transform;

        public Builder alpha(Float f2) {
        }

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ FrameEntity build() {
        }

        public Builder clipPath(String str) {
        }

        public Builder layout(Layout layout) {
        }

        public Builder shapes(List<ShapeEntity> list) {
        }

        public Builder transform(Transform transform) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public FrameEntity build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_FrameEntity extends ProtoAdapter<FrameEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ FrameEntity decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, FrameEntity frameEntity) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(FrameEntity frameEntity) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ FrameEntity redact(FrameEntity frameEntity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public FrameEntity decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, FrameEntity frameEntity) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(FrameEntity frameEntity) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public FrameEntity redact2(FrameEntity frameEntity) {
        }
    }

    public FrameEntity(Float f2, Layout layout, Transform transform, String str, List<ShapeEntity> list) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<FrameEntity, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public FrameEntity(Float f2, Layout layout, Transform transform, String str, List<ShapeEntity> list, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<FrameEntity, Builder> newBuilder() {
    }
}
