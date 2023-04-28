package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Layout extends Message<Layout, Builder> {
    public static final ProtoAdapter<Layout> ADAPTER = null;
    public static final Float DEFAULT_HEIGHT = null;
    public static final Float DEFAULT_WIDTH = null;
    public static final Float DEFAULT_X = null;
    public static final Float DEFAULT_Y = null;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float width;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float x;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float y;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<Layout, Builder> {
        public Float height;
        public Float width;
        public Float x;
        public Float y;

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ Layout build() {
        }

        public Builder height(Float f2) {
        }

        public Builder width(Float f2) {
        }

        public Builder x(Float f2) {
        }

        public Builder y(Float f2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public Layout build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_Layout extends ProtoAdapter<Layout> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Layout decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Layout layout) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Layout layout) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Layout redact(Layout layout) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Layout decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, Layout layout) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(Layout layout) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public Layout redact2(Layout layout) {
        }
    }

    public Layout(Float f2, Float f3, Float f4, Float f5) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<Layout, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public Layout(Float f2, Float f3, Float f4, Float f5, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<Layout, Builder> newBuilder() {
    }
}
