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
public final class SpriteEntity extends Message<SpriteEntity, Builder> {
    public static final ProtoAdapter<SpriteEntity> ADAPTER = null;
    public static final String DEFAULT_IMAGEKEY = "";
    public static final String DEFAULT_MATTEKEY = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.opensource.svgaplayer.proto.FrameEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<FrameEntity> frames;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String imageKey;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String matteKey;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<SpriteEntity, Builder> {
        public List<FrameEntity> frames;
        public String imageKey;
        public String matteKey;

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ SpriteEntity build() {
        }

        public Builder frames(List<FrameEntity> list) {
        }

        public Builder imageKey(String str) {
        }

        public Builder matteKey(String str) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public SpriteEntity build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_SpriteEntity extends ProtoAdapter<SpriteEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ SpriteEntity decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, SpriteEntity spriteEntity) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(SpriteEntity spriteEntity) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ SpriteEntity redact(SpriteEntity spriteEntity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public SpriteEntity decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, SpriteEntity spriteEntity) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(SpriteEntity spriteEntity) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public SpriteEntity redact2(SpriteEntity spriteEntity) {
        }
    }

    public SpriteEntity(String str, List<FrameEntity> list, String str2) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<SpriteEntity, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public SpriteEntity(String str, List<FrameEntity> list, String str2, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<SpriteEntity, Builder> newBuilder() {
    }
}
