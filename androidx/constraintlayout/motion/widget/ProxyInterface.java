package androidx.constraintlayout.motion.widget;

/* compiled from: DesignTool.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ProxyInterface {
    int designAccess(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4);

    float getKeyFramePosition(Object obj, int i2, float f2, float f3);

    Object getKeyframeAtLocation(Object obj, float f2, float f3);

    Boolean getPositionKeyframe(Object obj, Object obj2, float f2, float f3, String[] strArr, float[] fArr);

    long getTransitionTimeMs();

    void setAttributes(int i2, String str, Object obj, Object obj2);

    void setKeyFrame(Object obj, int i2, String str, Object obj2);

    boolean setKeyFramePosition(Object obj, int i2, int i3, float f2, float f3);

    void setToolPosition(float f2);
}
