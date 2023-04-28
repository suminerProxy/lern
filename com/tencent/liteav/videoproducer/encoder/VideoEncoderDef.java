package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.h;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface VideoEncoderDef {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class BitrateMode {

        /* renamed from: a  reason: collision with root package name */
        public static final BitrateMode f12517a = null;
        public static final BitrateMode b = null;
        public static final BitrateMode c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final BitrateMode[] f12518d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ BitrateMode[] f12519e = null;
        public int mValue;

        private BitrateMode(String str, int i2, int i3) {
        }

        public static BitrateMode a(int i2) {
        }

        public static BitrateMode valueOf(String str) {
        }

        public static BitrateMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EncodeAbility {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12520a;
        public boolean b;
        public boolean c;

        @CalledByNative("EncodeAbility")
        public boolean isSupportHEVC() {
        }

        @CalledByNative("EncodeAbility")
        public boolean isSupportRPS() {
        }

        @CalledByNative("EncodeAbility")
        public boolean isSupportSVC() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EncodeStrategy {

        /* renamed from: a  reason: collision with root package name */
        public static final EncodeStrategy f12521a = null;
        public static final EncodeStrategy b = null;
        public static final EncodeStrategy c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final EncodeStrategy f12522d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final EncodeStrategy[] f12523e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ EncodeStrategy[] f12524f = null;
        public int mValue;

        private EncodeStrategy(String str, int i2, int i3) {
        }

        public static EncodeStrategy a(int i2) {
        }

        public static EncodeStrategy valueOf(String str) {
        }

        public static EncodeStrategy[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class EncoderProfile {

        /* renamed from: a  reason: collision with root package name */
        public static final EncoderProfile f12525a = null;
        public static final EncoderProfile b = null;
        public static final EncoderProfile c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final EncoderProfile f12526d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final EncoderProfile f12527e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final EncoderProfile f12528f = null;

        /* renamed from: g  reason: collision with root package name */
        private static final EncoderProfile[] f12529g = null;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ EncoderProfile[] f12530h = null;
        public int mValue;

        private EncoderProfile(String str, int i2, int i3) {
        }

        public static EncoderProfile a(int i2) {
        }

        public static EncoderProfile valueOf(String str) {
        }

        public static EncoderProfile[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class EncoderProperty {

        /* renamed from: a  reason: collision with root package name */
        public a f12531a;
        public ReferenceStrategy b;
        public CodecType c;

        public EncoderProperty(a aVar, ReferenceStrategy referenceStrategy, CodecType codecType) {
        }

        @CalledByNative("EncoderProperty")
        public int getCodecType() {
        }

        @CalledByNative("EncoderProperty")
        public int getEncoderType() {
        }

        @CalledByNative("EncoderProperty")
        public int getReferenceStrategy() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class ReferenceStrategy {

        /* renamed from: a  reason: collision with root package name */
        public static final ReferenceStrategy f12532a = null;
        public static final ReferenceStrategy b = null;
        public static final ReferenceStrategy c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final ReferenceStrategy f12533d = null;

        /* renamed from: e  reason: collision with root package name */
        private static final ReferenceStrategy[] f12534e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ ReferenceStrategy[] f12535f = null;
        public int mValue;

        private ReferenceStrategy(String str, int i2, int i3) {
        }

        public static ReferenceStrategy a(int i2) {
        }

        public static ReferenceStrategy valueOf(String str) {
        }

        public static ReferenceStrategy[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoEncoderDataListener {
        void onEncodedFail(h.a aVar);

        void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z);

        void onOutputFormatChanged(MediaFormat mediaFormat);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12536a = null;
        public static final a b = null;
        private static final /* synthetic */ a[] c = null;
        public int value;

        private a(String str, int i2, int i3) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }
}
