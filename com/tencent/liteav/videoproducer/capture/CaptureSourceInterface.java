package com.tencent.liteav.videoproducer.capture;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.liteav.videobase.frame.PixelFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface CaptureSourceInterface {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class CaptureParams {
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f12341d;

        /* renamed from: e  reason: collision with root package name */
        public Rect f12342e;

        public CaptureParams() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        @NonNull
        public String toString() {
        }

        public CaptureParams(CaptureParams captureParams) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class SourceType {

        /* renamed from: a  reason: collision with root package name */
        public static final SourceType f12343a = null;
        public static final SourceType b = null;
        public static final SourceType c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final SourceType f12344d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final SourceType f12345e = null;

        /* renamed from: f  reason: collision with root package name */
        private static final SourceType[] f12346f = null;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ SourceType[] f12347g = null;
        private final int mValue;

        private SourceType(String str, int i2, int i3) {
        }

        public static SourceType a(int i2) {
        }

        public static SourceType valueOf(String str) {
        }

        public static SourceType[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a();

        void a(CaptureSourceInterface captureSourceInterface, PixelFrame pixelFrame);

        void a(boolean z);

        void b(boolean z);
    }

    void pause();

    void resume();

    void start(Object obj, CaptureParams captureParams, a aVar);

    void stop();

    void updateParams(CaptureParams captureParams);
}
