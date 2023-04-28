package com.baidu.platform.comapi.map;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OverlayItem {
    public static final int ALIGN_BOTTON = 2;
    public static final int ALIGN_TOP = 3;
    public static final int ALING_CENTER = 1;

    /* renamed from: a  reason: collision with root package name */
    public GeoPoint f2602a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    private int f2603d;

    /* renamed from: e  reason: collision with root package name */
    private int f2604e;

    /* renamed from: f  reason: collision with root package name */
    private int f2605f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f2606g;

    /* renamed from: h  reason: collision with root package name */
    private String f2607h;

    /* renamed from: i  reason: collision with root package name */
    private CoordType f2608i;

    /* renamed from: j  reason: collision with root package name */
    private float f2609j;

    /* renamed from: k  reason: collision with root package name */
    private float f2610k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<Bundle> f2611l;

    /* renamed from: m  reason: collision with root package name */
    private Bundle f2612m;

    /* renamed from: n  reason: collision with root package name */
    private Bundle f2613n;

    /* renamed from: o  reason: collision with root package name */
    private float f2614o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f2615p;
    private float q;
    private int r;
    private int s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AnimEffect {
        private static final /* synthetic */ AnimEffect[] $VALUES = null;
        public static final AnimEffect ALPHA = null;
        public static final AnimEffect ANCHOR_GROUTH = null;
        public static final AnimEffect FADE_IN = null;
        public static final AnimEffect FADE_OUT = null;
        public static final AnimEffect GROWTH = null;
        public static final AnimEffect GROWTH_FADE_IN = null;
        public static final AnimEffect GROWTH_REBOUND = null;
        public static final AnimEffect NONE = null;
        public static final AnimEffect ROTATE = null;
        public static final AnimEffect SHRINK = null;
        public static final AnimEffect SHRINK_FADE_OUT = null;
        public static final AnimEffect WAVE = null;

        private AnimEffect(String str, int i2) {
        }

        public static AnimEffect valueOf(String str) {
        }

        public static AnimEffect[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AnimationSubType {
        private static final /* synthetic */ AnimationSubType[] $VALUES = null;
        public static final AnimationSubType NONE = null;
        public static final AnimationSubType RADAR = null;

        private AnimationSubType(String str, int i2) {
        }

        public static AnimationSubType valueOf(String str) {
        }

        public static AnimationSubType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class CoordType {
        private static final /* synthetic */ CoordType[] $VALUES = null;
        public static final CoordType CoordType_BD09 = null;
        public static final CoordType CoordType_BD09LL = null;

        private CoordType(String str, int i2) {
        }

        public static CoordType valueOf(String str) {
        }

        public static CoordType[] values() {
        }
    }

    public OverlayItem(GeoPoint geoPoint, String str, String str2) {
    }

    public void addClickRect(Bundle bundle) {
    }

    public float getAnchorX() {
    }

    public float getAnchorY() {
    }

    public Bundle getAnimate() {
    }

    public int getBound() {
    }

    public ArrayList<Bundle> getClickRect() {
    }

    public CoordType getCoordType() {
    }

    public Bundle getDelay() {
    }

    public float getGeoZ() {
    }

    public byte[] getGifData() {
    }

    public String getId() {
    }

    public int getIndoorPoi() {
    }

    public int getLevel() {
    }

    public final Drawable getMarker() {
    }

    public int getMask() {
    }

    public float getMultiplyDpi() {
    }

    public GeoPoint getPoint() {
    }

    public int getResId() {
    }

    public float getScale() {
    }

    public String getSnippet() {
    }

    public String getTitle() {
    }

    public void setAnchor(float f2, float f3) {
    }

    public void setAnimate(Bundle bundle) {
    }

    public void setAnimateDuration(int i2) {
    }

    public void setAnimateEffect(AnimEffect animEffect) {
    }

    public void setAnimateEndSize(int i2, int i3) {
    }

    public void setAnimateStartSize(int i2, int i3) {
    }

    public void setBound(int i2) {
    }

    public void setClickRect(ArrayList<Bundle> arrayList) {
    }

    public void setCoordType(CoordType coordType) {
    }

    public void setDelay(Bundle bundle) {
    }

    public void setGeoPoint(GeoPoint geoPoint) {
    }

    public void setGeoZ(float f2) {
    }

    public void setGifData(byte[] bArr) {
    }

    public void setId(String str) {
    }

    public void setIndoorPoi(int i2) {
    }

    public void setLevel(int i2) {
    }

    public void setMarker(Drawable drawable) {
    }

    public void setMask(int i2) {
    }

    public void setMultiplyDpi(int i2) {
    }

    public void setScale(float f2) {
    }

    public void setSnippet(String str) {
    }

    public void setSubAnimateEffect(AnimationSubType animationSubType) {
    }

    public void setTitle(String str) {
    }

    public void setAnchor(int i2) {
    }
}
