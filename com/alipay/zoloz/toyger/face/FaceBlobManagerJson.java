package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BlobElem;
import com.alipay.zoloz.toyger.blob.Content;
import com.alipay.zoloz.toyger.blob.FaceInfo;
import com.alipay.zoloz.toyger.blob.Meta;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FaceBlobManagerJson extends FaceBlobManager {
    private List<BlobElem> mMonitorBlobElems;

    public FaceBlobManagerJson() {
    }

    private Content deSerializerByteArray(String str) {
    }

    private Meta generateMeta(List<ToygerFaceInfo> list, Map<String, Object> map) {
    }

    private BlobElem generateMonitorBlob(TGFrame tGFrame) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public void addMonitorImage(TGFrame tGFrame) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public byte[] generateBlob(List<ToygerFaceInfo> list, Map<String, Object> map) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateFaceBlob(TGFrame tGFrame, ToygerFaceAttr toygerFaceAttr) {
    }

    public FaceInfo generateFaceInfo(ToygerFaceInfo toygerFaceInfo, boolean z) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] generateLocalMatchingBlob(String str, byte[] bArr, byte[] bArr2, String str2) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getFileIdBlob(String str) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public byte[] getMonitorBlob() {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager, com.alipay.zoloz.toyger.blob.BlobManager
    public boolean isUTF8() {
    }

    public FaceBlobManagerJson(ToygerFaceBlobConfig toygerFaceBlobConfig, boolean z) {
    }

    @Override // com.alipay.zoloz.toyger.face.FaceBlobManager
    public Map<String, Object> generateBlob(Map<String, Object> map) {
    }
}
