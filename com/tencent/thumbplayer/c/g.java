package com.tencent.thumbplayer.c;

import com.tencent.thumbplayer.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.api.composition.ITPMediaTrackClip;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class g extends d implements ITPMediaTrack, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private int f13159a;
    private int b;
    private List<ITPMediaTrackClip> c;

    public g(int i2) {
    }

    public g(int i2, int i3) {
    }

    private synchronized void a(ITPMediaTrackClip iTPMediaTrackClip) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int addTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized List<ITPMediaTrackClip> getAllTrackClips() {
    }

    @Override // com.tencent.thumbplayer.c.d, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public synchronized int getMediaType() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized long getTimelineDurationMs() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized ITPMediaTrackClip getTrackClip(int i2) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int getTrackId() {
    }

    @Override // com.tencent.thumbplayer.c.d, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public synchronized String getUrl() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized int insertTrackClip(ITPMediaTrackClip iTPMediaTrackClip, int i2) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized void removeAllTrackClips() {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized boolean removeTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaTrack
    public synchronized boolean swapTrackClip(int i2, int i3) {
    }
}
