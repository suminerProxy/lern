package com.mob.tools.gui;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SmoothScroller {
    private static final /* synthetic */ SmoothScroller[] $VALUES = null;
    public static final SmoothScroller DEFAULT = null;
    public static final SmoothScroller LINEAR_ACC = null;
    public static final SmoothScroller LINEAR_DEC = null;
    public static final SmoothScroller OVER_SCROLL = null;
    private Interpolator interpolator;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LinearACCInterpolator implements Interpolator {
        private LinearACCInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ LinearACCInterpolator(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LinearDECInterpolator implements Interpolator {
        private LinearDECInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ LinearDECInterpolator(AnonymousClass1 anonymousClass1) {
        }
    }

    private SmoothScroller(String str, int i2, Interpolator interpolator) {
    }

    public static SmoothScroller valueOf(String str) {
    }

    public static SmoothScroller[] values() {
    }

    public Scroller getScroller(Context context) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DefaultInterpolator implements Interpolator {
        private float[] defaultInt;

        private DefaultInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ DefaultInterpolator(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class OverScrollInterpolator implements Interpolator {
        private float[] defaultInt;

        private OverScrollInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
        }

        public /* synthetic */ OverScrollInterpolator(AnonymousClass1 anonymousClass1) {
        }
    }
}
