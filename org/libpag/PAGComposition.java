package org.libpag;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGComposition extends PAGLayer {
    public PAGComposition(long j2) {
    }

    public static native PAGComposition Make(int i2, int i3);

    private static native void nativeInit();

    public native void addLayer(PAGLayer pAGLayer);

    public native void addLayerAt(PAGLayer pAGLayer, int i2);

    public native ByteBuffer audioBytes();

    public native PAGMarker[] audioMarkers();

    public native long audioStartTime();

    public native boolean contains(PAGLayer pAGLayer);

    public native PAGLayer getLayerAt(int i2);

    public native int getLayerIndex(PAGLayer pAGLayer);

    public native PAGLayer[] getLayersByName(String str);

    public native PAGLayer[] getLayersUnderPoint(float f2, float f3);

    public native int height();

    public native int numChildren();

    public native void removeAllLayers();

    public native PAGLayer removeLayer(PAGLayer pAGLayer);

    public native PAGLayer removeLayerAt(int i2);

    public native void setContentSize(int i2, int i3);

    public native void setLayerIndex(PAGLayer pAGLayer, int i2);

    public native void swapLayer(PAGLayer pAGLayer, PAGLayer pAGLayer2);

    public native void swapLayerAt(int i2, int i3);

    public native int width();
}
