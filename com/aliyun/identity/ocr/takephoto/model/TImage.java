package com.aliyun.identity.ocr.takephoto.model;

import android.net.Uri;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TImage implements Serializable {
    private String compressPath;
    private boolean compressed;
    private boolean cropped;
    private FromType fromType;
    private String originalPath;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class FromType {
        private static final /* synthetic */ FromType[] $VALUES = null;
        public static final FromType CAMERA = null;
        public static final FromType OTHER = null;

        private FromType(String str, int i2) {
        }

        public static FromType valueOf(String str) {
        }

        public static FromType[] values() {
        }
    }

    private TImage(String str, FromType fromType) {
    }

    public static TImage of(String str, FromType fromType) {
    }

    public String getCompressPath() {
    }

    public FromType getFromType() {
    }

    public String getOriginalPath() {
    }

    public boolean isCompressed() {
    }

    public boolean isCropped() {
    }

    public void setCompressPath(String str) {
    }

    public void setCompressed(boolean z) {
    }

    public void setCropped(boolean z) {
    }

    public void setFromType(FromType fromType) {
    }

    public void setOriginalPath(String str) {
    }

    public static TImage of(Uri uri, FromType fromType) {
    }

    private TImage(Uri uri, FromType fromType) {
    }
}
