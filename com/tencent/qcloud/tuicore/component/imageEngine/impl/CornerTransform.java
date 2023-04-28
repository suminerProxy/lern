package com.tencent.qcloud.tuicore.component.imageEngine.impl;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import h.g.a.p.n;
import h.g.a.p.p.a0.e;
import h.g.a.p.p.v;
import java.security.MessageDigest;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CornerTransform implements n<Bitmap> {
    private boolean exceptLeftBottom;
    private boolean exceptLeftTop;
    private boolean exceptRightBottom;
    private boolean exceptRightTop;
    private e mBitmapPool;
    private float radius;

    public CornerTransform(Context context, float f2) {
    }

    public void setExceptCorner(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    @Override // h.g.a.p.n
    @NonNull
    public v<Bitmap> transform(@NonNull Context context, @NonNull v<Bitmap> vVar, int i2, int i3) {
    }

    @Override // h.g.a.p.g
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
