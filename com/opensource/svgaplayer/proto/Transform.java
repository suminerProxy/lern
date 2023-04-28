package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Transform extends Message<Transform, Builder> {
    public static final ProtoAdapter<Transform> ADAPTER = null;
    public static final Float DEFAULT_A = null;
    public static final Float DEFAULT_B = null;
    public static final Float DEFAULT_C = null;
    public static final Float DEFAULT_D = null;
    public static final Float DEFAULT_TX = null;
    public static final Float DEFAULT_TY = null;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    public final Float f5243a;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float b;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float c;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    public final Float f5244d;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float tx;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
    public final Float ty;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<Transform, Builder> {

        /* renamed from: a  reason: collision with root package name */
        public Float f5245a;
        public Float b;
        public Float c;

        /* renamed from: d  reason: collision with root package name */
        public Float f5246d;
        public Float tx;
        public Float ty;

        public Builder a(Float f2) {
        }

        public Builder b(Float f2) {
        }

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ Transform build() {
        }

        public Builder c(Float f2) {
        }

        public Builder d(Float f2) {
        }

        public Builder tx(Float f2) {
        }

        public Builder ty(Float f2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public Transform build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_Transform extends ProtoAdapter<Transform> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Transform decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Transform transform) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Transform transform) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Transform redact(Transform transform) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Transform decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, Transform transform) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(Transform transform) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public Transform redact2(Transform transform) {
        }
    }

    public Transform(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<Transform, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public Transform(Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<Transform, Builder> newBuilder() {
    }
}
