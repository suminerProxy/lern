package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GradientLineOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    private List<LatLng> f1597a;
    private List<Integer> b;
    private List<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    private int f1598d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1599e;

    /* renamed from: f  reason: collision with root package name */
    private LineDirectionCross180 f1600f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineDirectionCross180 {
        public static final LineDirectionCross180 FROM_EAST_TO_WEST = null;
        public static final LineDirectionCross180 FROM_WEST_TO_EAST = null;
        public static final LineDirectionCross180 NONE = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ LineDirectionCross180[] f1601a = null;

        private LineDirectionCross180(String str, int i2) {
        }

        public static LineDirectionCross180 valueOf(String str) {
        }

        public static LineDirectionCross180[] values() {
        }
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
    }

    public List<Integer> getColors() {
    }

    public List<Integer> getIndexs() {
    }

    public LineDirectionCross180 getLineDirectionCross180() {
    }

    public List<LatLng> getPoints() {
    }

    public int getWidth() {
    }

    public boolean isVisible() {
    }

    public GradientLineOptions setColorIndex(List<Integer> list) {
    }

    public GradientLineOptions setColorsValues(List<Integer> list) {
    }

    public GradientLineOptions setLineDirectionCross180(LineDirectionCross180 lineDirectionCross180) {
    }

    public GradientLineOptions setPoints(List<LatLng> list) {
    }

    public GradientLineOptions setWidth(int i2) {
    }

    public GradientLineOptions visible(boolean z) {
    }
}
