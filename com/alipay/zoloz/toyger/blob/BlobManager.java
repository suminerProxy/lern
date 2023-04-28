package com.alipay.zoloz.toyger.blob;

import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerBlobConfig;
import com.alipay.zoloz.toyger.face.ToygerDepthInfo;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BlobManager<Info extends ToygerBiometricInfo> {
    public static final String BLOB_ELEM_IMAGE_TYPE = "ImageType";
    public static final String BLOB_ELEM_SUBTYPE_GYRO = "gyro";
    public static final String BLOB_ELEM_TYPE_DOC = "doc";
    public static final String BLOB_ELEM_TYPE_FACE = "face";
    public static final String BLOB_ELEM_TYPE_SENSOR = "sensor";
    public static final String BLOB_VERSION = "1.0";
    public static final int META_ALGRESULT_BAT = 3;
    public static final int META_ALGRESULT_DRAGONFLY = 2;
    public static final int META_ALGRESULT_VERIFY = 1;
    public static final String META_COLL_KEY_AUTH_INFO = "authInfo";
    public static final String META_COLL_KEY_IMAGE_SIG = "imageSig";
    public static final int META_SERIALIZER_JSON = 1;
    public static final int META_SERIALIZER_PB = 2;
    public static final String META_TYPE_DOC = "zdoc";
    public static final String META_TYPE_FACE = "zface";
    public static final String SUB_TYPE_DARK = "Dark";
    public static final String SUB_TYPE_DEPTH = "Depth";
    public static final String SUB_TYPE_DOC_IMAGE = "docimage";
    public static final String SUB_TYPE_IR = "SLIR";
    public static final String SUB_TYPE_NANO = "Nano";
    public static final String SUB_TYPE_PANO = "Pano";
    public static final String SUB_TYPE_SURVEILLANCE = "Surveillance";
    public static final String SUB_TYPE_VERSION = "1.0";
    public static final String TAG = "TOYGER_FLOW_BlobManager";
    public ToygerBlobConfig config;
    public CryptoManager crypto;

    public abstract byte[] generateBlob(List<Info> list, Map<String, Object> map);

    public abstract byte[] getKey();

    public abstract boolean isUTF8();

    public byte[] processDepthInfo(ToygerDepthInfo toygerDepthInfo) {
    }

    public byte[] processFrame(TGFrame tGFrame, String str, boolean z) {
    }

    public byte[] processIRFrameInfo(TGFrame tGFrame, boolean z) {
    }

    public byte[] processSensorData(String str) {
    }

    public byte[] processFrame(byte[] bArr) {
    }

    public byte[] processFrame(TGFrame tGFrame, int i2, int i3, String str, boolean z) {
    }
}
