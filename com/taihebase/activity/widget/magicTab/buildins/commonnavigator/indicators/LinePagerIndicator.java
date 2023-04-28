package com.taihebase.activity.widget.magicTab.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import h.y.a.p.y.k.c.a.c;
import h.y.a.p.y.k.c.b.a;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LinePagerIndicator extends View implements c {

    /* renamed from: n  reason: collision with root package name */
    public static final int f8355n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f8356o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f8357p = 2;
    private int b;
    private Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f8358d;

    /* renamed from: e  reason: collision with root package name */
    private float f8359e;

    /* renamed from: f  reason: collision with root package name */
    private float f8360f;

    /* renamed from: g  reason: collision with root package name */
    private float f8361g;

    /* renamed from: h  reason: collision with root package name */
    private float f8362h;

    /* renamed from: i  reason: collision with root package name */
    private float f8363i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f8364j;

    /* renamed from: k  reason: collision with root package name */
    private List<a> f8365k;

    /* renamed from: l  reason: collision with root package name */
    private List<Integer> f8366l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f8367m;

    public LinePagerIndicator(Context context) {
    }

    private void b(Context context) {
    }

    @Override // h.y.a.p.y.k.c.a.c
    public void a(List<a> list) {
    }

    public List<Integer> getColors() {
    }

    public Interpolator getEndInterpolator() {
    }

    public float getLineHeight() {
    }

    public float getLineWidth() {
    }

    public int getMode() {
    }

    public Paint getPaint() {
    }

    public float getRoundRadius() {
    }

    public Interpolator getStartInterpolator() {
    }

    public float getXOffset() {
    }

    public float getYOffset() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // h.y.a.p.y.k.c.a.c
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // h.y.a.p.y.k.c.a.c
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // h.y.a.p.y.k.c.a.c
    public void onPageSelected(int i2) {
    }

    public void setColors(Integer... numArr) {
    }

    public void setEndInterpolator(Interpolator interpolator) {
    }

    public void setLineHeight(float f2) {
    }

    public void setLineWidth(float f2) {
    }

    public void setMode(int i2) {
    }

    public void setRoundRadius(float f2) {
    }

    public void setStartInterpolator(Interpolator interpolator) {
    }

    public void setXOffset(float f2) {
    }

    public void setYOffset(float f2) {
    }
}
