package com.baidu.mapapi.map.track;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TraceOptions {

    /* renamed from: a  reason: collision with root package name */
    private int f1920a;
    private int b;
    private List<LatLng> c;

    /* renamed from: d  reason: collision with root package name */
    private int f1921d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1922e;

    /* renamed from: f  reason: collision with root package name */
    private int f1923f;

    /* renamed from: g  reason: collision with root package name */
    private int f1924g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1925h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TraceAnimateType {
        public static final TraceAnimateType TraceOverlayAnimationEasingCurveEaseIn = null;
        public static final TraceAnimateType TraceOverlayAnimationEasingCurveEaseInOut = null;
        public static final TraceAnimateType TraceOverlayAnimationEasingCurveEaseOut = null;
        public static final TraceAnimateType TraceOverlayAnimationEasingCurveLinear = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ TraceAnimateType[] f1926a = null;

        private TraceAnimateType(String str, int i2) {
        }

        public static TraceAnimateType valueOf(String str) {
        }

        public static TraceAnimateType[] values() {
        }
    }

    public TraceOptions animate(boolean z) {
    }

    public TraceOptions animationDuration(int i2) {
    }

    public TraceOptions animationTime(int i2) {
    }

    public TraceOptions animationType(TraceAnimateType traceAnimateType) {
    }

    public TraceOptions color(int i2) {
    }

    public TraceAnimateType getAnimateType() {
    }

    public int getAnimationDuration() {
    }

    public int getAnimationTime() {
    }

    public int getColor() {
    }

    public TraceOverlay getOverlay() {
    }

    public List<LatLng> getPoints() {
    }

    public int getWidth() {
    }

    public boolean isAnimation() {
    }

    public boolean isTrackMove() {
    }

    public TraceOptions points(List<LatLng> list) {
    }

    public TraceOptions setTrackMove(boolean z) {
    }

    public TraceOptions width(int i2) {
    }
}
