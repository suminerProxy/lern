package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.util.List;

/* compiled from: ToygerFaceService.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerRunnable implements Runnable {
    private static final String TAG = "TOYGER_FLOW_RUNNABLE";
    public ToygerAttr attr;
    public TGDepthFrame depthFrame;
    public List<TGFrame> frames;

    public ToygerRunnable(List<TGFrame> list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
