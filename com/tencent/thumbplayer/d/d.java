package com.tencent.thumbplayer.d;

import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class d implements ITPPreloadProxy.IPreloadListener, ITPPlayListener {

    /* renamed from: a  reason: collision with root package name */
    private String f13219a;

    public d(String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getAdvRemainTime() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public String getContentType(int i2, String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int getCurrentPlayClipNo() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getCurrentPlayOffset() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getCurrentPosition() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public String getDataFilePath(int i2, String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getDataTotalSize(int i2, String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public Object getPlayInfo(long j2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public Object getPlayInfo(String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getPlayerBufferLength() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlExpired(Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlUpdate(String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadError(int i2, int i3, String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadFinish() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProgressUpdate(int i2, int i3, long j2, long j3, String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProtocolUpdate(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadStatusUpdate(int i2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public Object onPlayCallback(int i2, Object obj, Object obj2, Object obj3, Object obj4) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareDownloadProgressUpdate(int i2, int i3, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareError() {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareSuccess() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onReadData(int i2, String str, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onStartReadData(int i2, String str, long j2, long j3) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onStopReadData(int i2, String str, int i3) {
    }
}
