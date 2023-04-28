package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ToygerFaceAlgorithmConfig extends ToygerAlgorithmConfig {
    public static final String BAT_LIVENESS = "BatLiveness";
    public static final String DARK = "dark";
    public static final String DEPTH = "depth";
    public static final String DRAGONFLY_LIVENESS = "DragonflyLiveness";
    public static final String GEMINI_LIVENESS = "GeminiLiveness";
    public static final String NO_LIVENESS = "NoLiveness";
    public static final String PANO = "pano";
    public static final String ZFACE_BLINK_LIVENESS = "zfaceBlinkLiveness";
    public float batLivenessThreshold;
    public float blink_openness;
    public int depth_cache_num;
    public float dragonflyMax;
    public float dragonflyMin;
    public float eyeOcclusion;
    public float eye_openness;
    public float geminiMax;
    public float geminiMin;
    public boolean isMirror;
    public List<String> liveness_combination;
    public int log_level;
    public float max_iod;
    public float min_iod;
    public float pose_gaussian;
    public float pose_integrity;
    public float pose_light;
    public float pose_motion;
    public float pose_pitch;
    public float pose_pitchMin;
    public float pose_rectwidth;
    public float pose_yaw;
    public float pose_yawMin;
    public float quality_depth_min_quality;
    public float quality_min_quality;
    public String secProtocol;
    public float stack_time;
    public Map<String, List<Float>> threshold;

    public static ToygerFaceAlgorithmConfig from(String str) {
    }

    public ToygerConfig toToygerConfig() {
    }
}
