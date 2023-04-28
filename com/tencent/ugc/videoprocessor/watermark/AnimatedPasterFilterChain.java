package com.tencent.ugc.videoprocessor.watermark;

import com.tencent.liteav.base.util.p;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPaster;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AnimatedPasterFilterChain extends PasterBase {
    private static final String TAG = "AnimatedPasterFilterChain";
    private List<TXVideoEditConstants.TXAnimatedPaster> mAnimatedPasterList;
    private CopyOnWriteArrayList<AnimatedPaster> mNormalizedList;

    private TXVideoEditConstants.TXAnimatedPaster construct(TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster, TXVideoEditConstants.TXRect tXRect) {
    }

    private String parseJsonFromFile(String str) {
    }

    private AnimatedPasterJsonConfig parsePaster(String str) {
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void clear() {
    }

    public List<AnimatedPaster> getAnimatedPasterList() {
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void normalized(int i2, int i3, int i4) {
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list, p pVar) {
    }
}
