package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MovieEntity extends Message<MovieEntity, Builder> {
    public static final ProtoAdapter<MovieEntity> ADAPTER = null;
    public static final String DEFAULT_VERSION = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.opensource.svgaplayer.proto.AudioEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<AudioEntity> audios;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, ByteString> images;
    @WireField(adapter = "com.opensource.svgaplayer.proto.MovieParams#ADAPTER", tag = 2)
    public final MovieParams params;
    @WireField(adapter = "com.opensource.svgaplayer.proto.SpriteEntity#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<SpriteEntity> sprites;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String version;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<MovieEntity, Builder> {
        public List<AudioEntity> audios;
        public Map<String, ByteString> images;
        public MovieParams params;
        public List<SpriteEntity> sprites;
        public String version;

        public Builder audios(List<AudioEntity> list) {
        }

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ MovieEntity build() {
        }

        public Builder images(Map<String, ByteString> map) {
        }

        public Builder params(MovieParams movieParams) {
        }

        public Builder sprites(List<SpriteEntity> list) {
        }

        public Builder version(String str) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public MovieEntity build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_MovieEntity extends ProtoAdapter<MovieEntity> {
        private final ProtoAdapter<Map<String, ByteString>> images;

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ MovieEntity decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, MovieEntity movieEntity) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(MovieEntity movieEntity) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ MovieEntity redact(MovieEntity movieEntity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public MovieEntity decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, MovieEntity movieEntity) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(MovieEntity movieEntity) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public MovieEntity redact2(MovieEntity movieEntity) {
        }
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<MovieEntity, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public MovieEntity(String str, MovieParams movieParams, Map<String, ByteString> map, List<SpriteEntity> list, List<AudioEntity> list2, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<MovieEntity, Builder> newBuilder() {
    }
}
