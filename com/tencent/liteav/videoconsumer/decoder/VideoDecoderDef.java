package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videoconsumer.decoder.av;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface VideoDecoderDef {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class ConsumerScene {

        /* renamed from: a  reason: collision with root package name */
        public static final ConsumerScene f12176a = null;
        public static final ConsumerScene b = null;
        public static final ConsumerScene c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final ConsumerScene[] f12177d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ ConsumerScene[] f12178e = null;
        private int mValue;

        private ConsumerScene(String str, int i2, int i3) {
        }

        public static ConsumerScene a(int i2) {
        }

        public static ConsumerScene valueOf(String str) {
        }

        public static ConsumerScene[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DecodeAbility {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12179a;
        public boolean b;
        public boolean c;

        @CalledByNative("DecodeAbility")
        public boolean isSupportHEVC() {
        }

        @CalledByNative("DecodeAbility")
        public boolean isSupportRPS() {
        }

        @CalledByNative("DecodeAbility")
        public boolean isSupportSVC() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class DecoderProperty {

        /* renamed from: a  reason: collision with root package name */
        public av.a f12180a;
        public CodecType b;

        public DecoderProperty(av.a aVar, CodecType codecType) {
        }

        @CalledByNative("DecoderProperty")
        public int getCodecType() {
        }

        @CalledByNative("DecoderProperty")
        public int getDecoderType() {
        }
    }
}
