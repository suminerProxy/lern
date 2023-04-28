package com.baidu.platform.comapi.map;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comapi.map.ah;
import com.baidu.platform.comapi.map.f;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MapSurfaceView extends ai implements View.OnKeyListener, MapRenderModeChangeListener, MapViewInterface, aj {
    private static int s;
    private static final ExecutorService z = null;
    private int A;
    private int B;
    private int C;

    /* renamed from: a  reason: collision with root package name */
    public MapController f2575a;
    public ae b;
    public l c;

    /* renamed from: d  reason: collision with root package name */
    public o f2576d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f2577e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2578f;

    /* renamed from: g  reason: collision with root package name */
    public al f2579g;

    /* renamed from: h  reason: collision with root package name */
    public GestureDetector f2580h;

    /* renamed from: i  reason: collision with root package name */
    public ab f2581i;

    /* renamed from: j  reason: collision with root package name */
    public com.baidu.mapsdkplatform.comapi.map.c f2582j;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f2583l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f2584m;

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f2585n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f2586o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2587p;
    private boolean q;
    private LocationOverlay r;
    private boolean t;
    private List<Overlay> u;
    private int v;
    private int w;
    private HashSet<aa> x;
    private boolean y;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements f.InterfaceC0043f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapSurfaceView f2588a;
        private int b;

        private a(MapSurfaceView mapSurfaceView) {
        }

        @Override // com.baidu.platform.comapi.map.f.InterfaceC0043f
        public EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        }

        public String b(String str, int i2) {
        }

        private String b(int i2) {
        }

        public /* synthetic */ a(MapSurfaceView mapSurfaceView, s sVar) {
        }

        @Override // com.baidu.platform.comapi.map.f.InterfaceC0043f
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        }

        public void a(String str, int i2) {
        }

        private String a(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapSurfaceView f2589a;

        private b(MapSurfaceView mapSurfaceView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        public /* synthetic */ b(MapSurfaceView mapSurfaceView, s sVar) {
        }
    }

    public MapSurfaceView(Context context) {
    }

    public static /* synthetic */ boolean a(MapSurfaceView mapSurfaceView) {
    }

    public static /* synthetic */ boolean b(MapSurfaceView mapSurfaceView) {
    }

    public static /* synthetic */ boolean c(MapSurfaceView mapSurfaceView) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean addOverlay(Overlay overlay) {
    }

    public void addSimpleOnGestureListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    public void addStateListener(aa aaVar) {
    }

    public void animateTo(MapStatus mapStatus, int i2) {
    }

    public void beginLocationLayerAnimation() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ Bitmap captureImageFromSurface(int i2, int i3, int i4, int i5, Object obj, Bitmap.Config config) {
    }

    public void clearDefaultLocationLayerData(Bundle bundle) {
    }

    public void doCaptureMapView(c cVar, int i2, int i3) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean enable3D() {
    }

    public void forceSetTraffic(boolean z2) {
    }

    public com.baidu.mapsdkplatform.comapi.map.c getBaseMap() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapController getController() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getCurrentMapStatus() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getCurrentZoomLevel() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ int getDebugFlags() {
    }

    public LocationOverlay getDefaultLocationLay() {
    }

    public int getFPS() {
    }

    public float getFZoomToBoundF(MapBound mapBound, MapBound mapBound2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.GeoBound getGeoRound() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getLatitudeSpan() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getLongitudeSpan() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public GeoPoint getMapCenter() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getMapRotation() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getMapStatus() {
    }

    public MapViewListener getMapViewListener() {
    }

    public OnLongPressListener getOnLongPressListener() {
    }

    public synchronized Overlay getOverlay(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<Overlay> getOverlays() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getOverlooking() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public Projection getProjection() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ ag getRenderControl() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ int getRenderMode() {
    }

    public ExecutorService getSingleThreadPool() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ ah.a getViewType() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.WinRound getWinRound() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomLevel() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound, int i2, int i3) {
    }

    public boolean inRangeOfView(float f2, float f3) {
    }

    public synchronized boolean insertOverlay(Overlay overlay, int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isBaseIndoorMap() {
    }

    public boolean isPredictTraffic() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isSatellite() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isStreetRoad() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isTraffic() {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
    }

    public void onBackground() {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
    }

    public void onForeground() {
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onMapRenderModeChange(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public void onPause() {
    }

    public void onRecycle() {
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onRequestRender() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public void onResume() {
    }

    @Override // android.view.View, com.baidu.platform.comapi.map.MapViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ void queueEvent(Runnable runnable) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void refresh(Overlay overlay) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean removeOverlay(Overlay overlay) {
    }

    public void removeSimpleOnGestureListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    public void removeStateListener(aa aaVar) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ void requestRender() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void saveScreenToLocal(String str) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setBaseIndoorMap(boolean z2) {
    }

    public void setBaseMap(com.baidu.mapsdkplatform.comapi.map.c cVar) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ void setDebugFlags(int i2) {
    }

    public void setDefaultLocationLayerData(List<OverlayLocationData> list) {
    }

    public void setFPS(int i2) {
    }

    public void setFirstFrameListener(e eVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setGeoRound(MapStatus.GeoBound geoBound) {
    }

    public boolean setItsPreTime(int i2, int i3, int i4) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapCenter(GeoPoint geoPoint) {
    }

    public void setMapController(MapController mapController) {
    }

    public void setMapRenderStableListener(ab abVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapStatus(MapStatus mapStatus) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapTo2D(boolean z2) {
    }

    public void setOnLongPressListener(OnLongPressListener onLongPressListener) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setOverlooking(int i2) {
    }

    public void setPixelFormatTransparent(boolean z2) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ void setRenderMode(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public /* bridge */ /* synthetic */ void setRenderer(ap apVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setRotation(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setSatellite(boolean z2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setStreetRoad(boolean z2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setTraffic(boolean z2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setWinRound(MapStatus.WinRound winRound) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(float f2) {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceHolder.Callback2
    @Deprecated
    public /* bridge */ /* synthetic */ void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // com.baidu.platform.comapi.map.ai, android.view.SurfaceHolder.Callback2
    @TargetApi(26)
    public /* bridge */ /* synthetic */ void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean switchOverlay(Overlay overlay, Overlay overlay2) {
    }

    public void unInit() {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public ag a(ah.a aVar, Context context) {
    }

    public void b() {
    }

    public void doCaptureMapView(c cVar, int i2, int i3, Bitmap.Config config) {
    }

    public void animateTo(MapStatus mapStatus, int i2, int i3) {
    }

    public void doCaptureMapView(c cVar, Rect rect, Bitmap.Config config) {
    }

    public void saveScreenToLocal(String str, Rect rect) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound, int i2, int i3) {
    }

    public synchronized Overlay getOverlay(Class<?> cls) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.ai
    public void a(Context context, ah.a aVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound) {
    }

    public void a() {
    }

    public MapSurfaceView(Context context, AttributeSet attributeSet) {
    }

    public MapSurfaceView(Context context, ah.a aVar) {
    }
}
