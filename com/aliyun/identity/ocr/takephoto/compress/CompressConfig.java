package com.aliyun.identity.ocr.takephoto.compress;

import com.aliyun.identity.ocr.takephoto.model.LubanOptions;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CompressConfig implements Serializable {
    private boolean enablePixelCompress;
    private boolean enableQualityCompress;
    private boolean enableReserveRaw;
    private LubanOptions lubanOptions;
    private int maxPixel;
    private int maxSize;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private CompressConfig config;

        public CompressConfig create() {
        }

        public Builder enablePixelCompress(boolean z) {
        }

        public Builder enableQualityCompress(boolean z) {
        }

        public Builder enableReserveRaw(boolean z) {
        }

        public Builder setMaxPixel(int i2) {
        }

        public Builder setMaxSize(int i2) {
        }
    }

    public /* synthetic */ CompressConfig(AnonymousClass1 anonymousClass1) {
    }

    public static CompressConfig ofDefaultConfig() {
    }

    public static CompressConfig ofLuban(LubanOptions lubanOptions) {
    }

    public void enablePixelCompress(boolean z) {
    }

    public void enableQualityCompress(boolean z) {
    }

    public void enableReserveRaw(boolean z) {
    }

    public LubanOptions getLubanOptions() {
    }

    public int getMaxPixel() {
    }

    public int getMaxSize() {
    }

    public boolean isEnablePixelCompress() {
    }

    public boolean isEnableQualityCompress() {
    }

    public boolean isEnableReserveRaw() {
    }

    public CompressConfig setMaxPixel(int i2) {
    }

    public void setMaxSize(int i2) {
    }

    private CompressConfig() {
    }

    private CompressConfig(LubanOptions lubanOptions) {
    }
}
