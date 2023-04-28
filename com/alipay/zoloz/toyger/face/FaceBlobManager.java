package com.alipay.zoloz.toyger.face;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobManager;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FaceBlobManager extends BlobManager<ToygerFaceInfo> {
    public static final int MONITOR_COMPRESS_RATE = 30;
    public static final int MONITOR_IMAGE_WIDTH = 160;
    public byte[] bestDepthImage;
    public byte[] bestIRImage;
    public byte[] bestLightImage;
    public String compressFormat;
    public float compressRate;
    public ToygerDepthInfo depthInfo;
    public int desireWidth;
    public TGFrame irFrame;
    public boolean isMirror;
    public boolean isNano;

    public FaceBlobManager() {
    }

    public static Rect convertFaceRegion(RectF rectF, int i2, int i3, int i4, boolean z) {
    }

    public abstract void addMonitorImage(TGFrame tGFrame);

    public abstract Map<String, Object> generateBlob(Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map);

    public abstract byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr);

    public abstract byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2);

    public String getBlobElemType(ToygerFaceInfo toygerFaceInfo) {
    }

    public abstract byte[] getFileIdBlob(String str);

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] getKey() {
    }

    public abstract byte[] getMonitorBlob();

    @Override // com.alipay.zoloz.toyger.blob.BlobManager
    public abstract boolean isUTF8();

    public FaceBlobManager(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z) {
    }
}
