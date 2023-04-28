package com.opensource.svgaplayer.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AudioEntity extends Message<AudioEntity, Builder> {
    public static final ProtoAdapter<AudioEntity> ADAPTER = null;
    public static final String DEFAULT_AUDIOKEY = "";
    public static final Integer DEFAULT_ENDFRAME = null;
    public static final Integer DEFAULT_STARTFRAME = null;
    public static final Integer DEFAULT_STARTTIME = null;
    public static final Integer DEFAULT_TOTALTIME = null;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String audioKey;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer endFrame;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer startFrame;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer startTime;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer totalTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder extends Message.Builder<AudioEntity, Builder> {
        public String audioKey;
        public Integer endFrame;
        public Integer startFrame;
        public Integer startTime;
        public Integer totalTime;

        public Builder audioKey(String str) {
        }

        @Override // com.squareup.wire.Message.Builder
        public /* bridge */ /* synthetic */ AudioEntity build() {
        }

        public Builder endFrame(Integer num) {
        }

        public Builder startFrame(Integer num) {
        }

        public Builder startTime(Integer num) {
        }

        public Builder totalTime(Integer num) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.Message.Builder
        public AudioEntity build() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ProtoAdapter_AudioEntity extends ProtoAdapter<AudioEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ AudioEntity decode(ProtoReader protoReader) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AudioEntity audioEntity) throws IOException {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(AudioEntity audioEntity) {
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ AudioEntity redact(AudioEntity audioEntity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public AudioEntity decode(ProtoReader protoReader) throws IOException {
        }

        /* renamed from: encode  reason: avoid collision after fix types in other method */
        public void encode2(ProtoWriter protoWriter, AudioEntity audioEntity) throws IOException {
        }

        /* renamed from: encodedSize  reason: avoid collision after fix types in other method */
        public int encodedSize2(AudioEntity audioEntity) {
        }

        /* renamed from: redact  reason: avoid collision after fix types in other method */
        public AudioEntity redact2(AudioEntity audioEntity) {
        }
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.squareup.wire.Message
    /* renamed from: newBuilder  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ Message.Builder<AudioEntity, Builder> newBuilder2() {
    }

    @Override // com.squareup.wire.Message
    public String toString() {
    }

    public AudioEntity(String str, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
    }

    @Override // com.squareup.wire.Message
    public Message.Builder<AudioEntity, Builder> newBuilder() {
    }
}
