package com.tencent.thumbplayer.g;

import android.content.Context;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.api.richmedia.TPRichMediaRequestExtraInfo;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor;
import com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback;
import com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.g.a;
import com.tencent.thumbplayer.tplayer.plugins.c;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class b implements com.tencent.thumbplayer.g.a {

    /* renamed from: a  reason: collision with root package name */
    private ITPNativeRichMediaProcessor f13248a;
    private a b;
    private C0250b c;

    /* renamed from: d  reason: collision with root package name */
    private c f13249d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a implements ITPNativeRichMediaInnerProcessorCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13250a;
        private a.InterfaceC0248a b;

        public a(b bVar) {
        }

        public void a(a.InterfaceC0248a interfaceC0248a) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback
        public long onGetCurrentPositionMs(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
        }
    }

    /* renamed from: com.tencent.thumbplayer.g.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class C0250b implements ITPNativeRichMediaProcessorCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f13251a;
        private ITPRichMediaSynchronizerListener b;

        public C0250b(b bVar) {
        }

        public void a(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onDeselectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaError(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureData(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaFeatureFailure(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2, int i3) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaInfo(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2, long j2, long j3, long j4, Object obj) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onRichMediaPrepared(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor) {
        }

        @Override // com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback
        public void onSelectFeatureSuccess(ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i2) {
        }
    }

    public b(Context context) {
    }

    private void a(int i2, int i3, int i4, String str, Object obj) {
    }

    public static /* synthetic */ void a(b bVar, int i2, int i3, int i4, String str, Object obj) {
    }

    @Override // com.tencent.thumbplayer.g.a
    public void a(float f2) {
    }

    @Override // com.tencent.thumbplayer.g.a
    public void a(long j2) {
    }

    @Override // com.tencent.thumbplayer.g.a
    public void a(a.InterfaceC0248a interfaceC0248a) {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void deselectFeatureAsync(int i2) {
    }

    public void finalize() {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public TPRichMediaFeature[] getFeatures() {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void prepareAsync() {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void release() {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void reset() {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void selectFeatureAsync(int i2, TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo) {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void setListener(ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener) {
    }

    @Override // com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer
    public void setRichMediaSource(String str) {
    }
}
