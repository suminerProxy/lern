package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import com.baidu.mapapi.model.LatLng;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class HeatMap {
    public static final Gradient DEFAULT_GRADIENT = null;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final String b = "HeatMap";
    private static final SparseIntArray c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1619d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final float[] f1620e = null;
    private static int r;

    /* renamed from: a  reason: collision with root package name */
    public BaiduMap f1621a;

    /* renamed from: f  reason: collision with root package name */
    private v<WeightedLatLng> f1622f;

    /* renamed from: g  reason: collision with root package name */
    private Collection<WeightedLatLng> f1623g;

    /* renamed from: h  reason: collision with root package name */
    private int f1624h;

    /* renamed from: i  reason: collision with root package name */
    private Gradient f1625i;

    /* renamed from: j  reason: collision with root package name */
    private double f1626j;

    /* renamed from: k  reason: collision with root package name */
    private m f1627k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f1628l;

    /* renamed from: m  reason: collision with root package name */
    private double[] f1629m;

    /* renamed from: n  reason: collision with root package name */
    private double[] f1630n;

    /* renamed from: o  reason: collision with root package name */
    private HashMap<String, Tile> f1631o;

    /* renamed from: p  reason: collision with root package name */
    private ExecutorService f1632p;
    private HashSet<String> q;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Collection<WeightedLatLng> f1633a;
        private int b;
        private Gradient c;

        /* renamed from: d  reason: collision with root package name */
        private double f1634d;

        public static /* synthetic */ Collection a(Builder builder) {
        }

        public static /* synthetic */ int b(Builder builder) {
        }

        public static /* synthetic */ Gradient c(Builder builder) {
        }

        public static /* synthetic */ double d(Builder builder) {
        }

        public HeatMap build() {
        }

        public Builder data(Collection<LatLng> collection) {
        }

        public Builder gradient(Gradient gradient) {
        }

        public Builder opacity(double d2) {
        }

        public Builder radius(int i2) {
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
        }
    }

    public /* synthetic */ HeatMap(Builder builder, o oVar) {
    }

    public static /* synthetic */ Collection a(Collection collection) {
    }

    private void b(Collection<WeightedLatLng> collection) {
    }

    private static Collection<WeightedLatLng> c(Collection<LatLng> collection) {
    }

    private synchronized void d() {
    }

    public void removeHeatMap() {
    }

    private HeatMap(Builder builder) {
    }

    public static /* synthetic */ void a(HeatMap heatMap, int i2, int i3, int i4) {
    }

    private static m d(Collection<WeightedLatLng> collection) {
    }

    public Tile a(int i2, int i3, int i4) {
    }

    private synchronized Tile c(String str) {
    }

    private synchronized void b(String str) {
    }

    public void c() {
    }

    public void b() {
    }

    private void b(int i2, int i3, int i4) {
    }

    private synchronized boolean a(String str) {
    }

    public synchronized void a() {
    }

    private synchronized void a(String str, Tile tile) {
    }

    private void a(Gradient gradient) {
    }

    private double[] a(int i2) {
    }

    private static Tile a(Bitmap bitmap) {
    }

    private static double[] a(int i2, double d2) {
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
    }

    private static Bitmap a(double[][] dArr, int[] iArr, double d2) {
    }

    private static double a(Collection<WeightedLatLng> collection, m mVar, int i2, int i3) {
    }
}
