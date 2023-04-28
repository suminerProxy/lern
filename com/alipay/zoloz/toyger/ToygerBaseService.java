package com.alipay.zoloz.toyger;

import android.content.Context;
import android.graphics.PointF;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.IToygerDelegate;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ToygerBaseService<C extends ToygerCallback, State extends ToygerState, Attr extends ToygerAttr, Info extends ToygerBiometricInfo, AlgorithmConfig extends ToygerAlgorithmConfig> implements IToygerDelegate<State, Attr, Info> {
    public static final String ASSET_DOC = "toyger.doc.dat";
    public static final String ASSET_FACE = "toyger.face.dat";
    public static final String ASSET_LICENSE = "toyger.license";
    public static final String KEY_ALGORITHM_CONFIG = "algorithmConfig";
    public static final String KEY_ASYNC_BLOB = "AsyncBlob";
    public static final String KEY_CAMERA_CONFIG = "camera_config";
    public static final String KEY_COMPLETE_BLOB = "CompleteBlob";
    public static final String KEY_DOC_FRAME_RECT = "docFrameRect";
    public static final String KEY_ENABLE_ENCUP = "enableEncUp";
    public static final String KEY_IFFA_MSG = "IFFAMsg";
    public static final String KEY_IS_MIRROR = "is_mirror";
    public static final String KEY_LOCAL_MATCHING_COMMAND = "LocalMatchingCommand";
    public static final String KEY_META_SERIALIZER = "meta_serializer";
    public static final String KEY_NINE_SHOT_BLOB = "NineShootBlob";
    public static final String KEY_PUBLIC_KEY = "pubkey";
    public static final String KEY_RES_9_CONTENT = "content";
    public static final String KEY_RES_9_IS_UTF8 = "isUTF8";
    public static final String KEY_RES_9_KEY = "key";
    public static final String KEY_ROTATE_TIMES = "rotateTimes";
    public static final String KEY_TOKEN = "TOKEN";
    public static final String KEY_UPLOAD_CONFIG = "uploadConfig";
    public static final String KEY_USER_ID = "USER_ID";
    public static final String P_TAG_ANDROID = "TOYGER_FLOW_ANDROID";
    public static final String P_TAG_NATIVE = "TOYGER_FLOW_NATIVE";
    public static final String TAG = "TOYGER_FLOW_ANDROID";
    public static final String TAG_NATIVE = "TOYGER_FLOW_NATIVE";
    public C mToygerCallback;

    public static boolean preLoad(Context context) {
    }

    public abstract boolean config(Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public PointF handleAlignDepthPoint(PointF pointF) {
    }

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleCaptureCompleted(int i2, List<Info> list, Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public void handleEventTriggered(int i2, String str) {
    }

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleInfoReady(TGFrame tGFrame, Attr attr);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleLog(int i2, HashMap<String, Object> hashMap);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleScanCompleted(int i2, List<Info> list, Map<String, Object> map);

    @Override // com.alipay.zoloz.toyger.algorithm.IToygerDelegate
    public abstract void handleStateUpdated(State state, Attr attr);

    public abstract boolean init(Context context, C c, String str, String str2, Map<String, Object> map);

    public abstract boolean init(Context context, boolean z, C c);

    public abstract boolean processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame);

    public abstract void release();

    public abstract void reset();
}
