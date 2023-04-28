package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.map.MapStatus;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MapTextureView extends h implements MapRenderModeChangeListener, MapViewInterface, aj {

    /* renamed from: a  reason: collision with root package name */
    public com.baidu.mapsdkplatform.comapi.map.c f2590a;
    public MapController b;
    public ae c;

    /* renamed from: d  reason: collision with root package name */
    public l f2591d;

    /* renamed from: e  reason: collision with root package name */
    public o f2592e;

    /* renamed from: f  reason: collision with root package name */
    public int f2593f;

    /* renamed from: g  reason: collision with root package name */
    public int f2594g;

    /* renamed from: h  reason: collision with root package name */
    public List<Overlay> f2595h;

    /* renamed from: i  reason: collision with root package name */
    public ab f2596i;

    /* renamed from: j  reason: collision with root package name */
    public al f2597j;

    /* renamed from: k  reason: collision with root package name */
    public GestureDetector f2598k;

    /* renamed from: l  reason: collision with root package name */
    private c f2599l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapTextureView f2600a;
        private int b;

        private a(MapTextureView mapTextureView) {
        }

        public void a(String str, int i2) {
        }

        public String b(String str, int i2) {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        }

        private String b(int i2) {
        }

        public /* synthetic */ a(MapTextureView mapTextureView, x xVar) {
        }

        private String a(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapTextureView f2601a;

        private b(MapTextureView mapTextureView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        public /* synthetic */ b(MapTextureView mapTextureView, x xVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {
        void a(int i2);
    }

    public MapTextureView(Context context) {
    }

    private void a(Context context) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addOverlay(Overlay overlay) {
    }

    public void animateTo(MapStatus mapStatus, int i2) {
    }

    public void attachBaseMapController(MapController mapController) {
    }

    public void b() {
    }

    public void c() {
    }

    public void destroyForMultiViews() {
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, int i2, int i3, Bitmap.Config config) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean enable3D() {
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

    public synchronized Overlay getOverlay(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<Overlay> getOverlays() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getOverlooking() {
    }

    public Overlay getPopupOverlay() {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public Projection getProjection() {
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

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isBaseIndoorMap() {
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

    public void listenMapRenderMessage(c cVar) {
    }

    public void onDestroy() {
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onMapRenderModeChange(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.h
    public void onPause() {
    }

    public void onRecycle() {
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onRequestRender() {
    }

    @Override // com.baidu.platform.comapi.map.h
    public void onResume() {
    }

    @Override // com.baidu.platform.comapi.map.h, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // com.baidu.platform.comapi.map.h, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
    }

    @Override // com.baidu.platform.comapi.map.h, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // com.baidu.platform.comapi.map.h, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View, com.baidu.platform.comapi.map.MapViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void refresh(Overlay overlay) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean removeOverlay(Overlay overlay) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void saveScreenToLocal(String str) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setBaseIndoorMap(boolean z) {
    }

    public void setBaseMap(com.baidu.mapsdkplatform.comapi.map.c cVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setGeoRound(MapStatus.GeoBound geoBound) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapCenter(GeoPoint geoPoint) {
    }

    public void setMapRenderStableListener(ab abVar) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapStatus(MapStatus mapStatus) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapTo2D(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setOverlooking(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setRotation(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setSatellite(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setStreetRoad(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setTraffic(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setWinRound(MapStatus.WinRound winRound) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(float f2) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean switchOverlay(Overlay overlay, Overlay overlay2) {
    }

    public void unListenMapRenderMessage() {
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, Rect rect, Bitmap.Config config) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound, int i2, int i3) {
    }

    public synchronized Overlay getOverlay(Class<?> cls) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(int i2) {
    }

    public MapTextureView(Context context, AttributeSet attributeSet) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound) {
    }

    public MapTextureView(Context context, AttributeSet attributeSet, int i2) {
    }
}
