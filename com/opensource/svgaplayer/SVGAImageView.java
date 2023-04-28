package com.opensource.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.tencent.android.tpush.common.MessageKey;
import com.umeng.analytics.pro.am;
import h.s.a.f;
import h.s.a.g;
import h.s.a.h;
import h.s.a.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SVGAImageView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0087\u0001waB,\b\u0007\u0012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\t\b\u0002\u0010\u0084\u0001\u001a\u000207¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u001bJ!\u0010+\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u001bJ\r\u0010-\u001a\u00020\u0004¢\u0006\u0004\b-\u0010\u001bJ\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u001bJ\u0015\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b2\u0010\u0013J!\u00105\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\u00042\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0016¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00162\b\u0010D\u001a\u0004\u0018\u00010CH\u0017¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0014¢\u0006\u0004\bG\u0010\u001bR\"\u0010M\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u00101R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010WR\"\u0010\\\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010K\"\u0004\b[\u00101R\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010^R$\u0010c\u001a\u00020\u00162\u0006\u0010`\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010KR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010IR\u0016\u0010g\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010m\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010IR\u0016\u0010p\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010fR\"\u0010v\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010y\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\bw\u0010xR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Landroid/util/AttributeSet;", "attrs", "", "q", "(Landroid/util/AttributeSet;)V", "", MessageKey.MSG_SOURCE, am.aI, "(Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "ref", "Lh/s/a/h$d;", "n", "(Ljava/lang/ref/WeakReference;)Lh/s/a/h$d;", "Lh/s/a/j;", "videoItem", "z", "(Lh/s/a/j;)V", "Lh/s/a/n/b;", SessionDescription.ATTR_RANGE, "", "reverse", am.aE, "(Lh/s/a/n/b;Z)V", "x", "()V", "Lh/s/a/f;", "getSVGADrawable", "()Lh/s/a/f;", "", "o", "()D", "Landroid/animation/ValueAnimator;", "animator", am.aB, "(Landroid/animation/ValueAnimator;)V", "Landroid/animation/Animator;", "animation", "r", "(Landroid/animation/Animator;)V", "y", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "m", am.aH, ExifInterface.LONGITUDE_EAST, "clear", "F", "(Z)V", "setVideoItem", "Lh/s/a/g;", "dynamicItem", "w", "(Lh/s/a/j;Lh/s/a/g;)V", "", "frame", "andPlay", "C", "(IZ)V", "percentage", "D", "(DZ)V", "Lh/s/a/e;", "clickListener", "setOnAnimKeyClickListener", "(Lh/s/a/e;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "f", "Z", "getClearsAfterDetached", "()Z", "setClearsAfterDetached", "clearsAfterDetached", "Lcom/opensource/svgaplayer/SVGAImageView$c;", "g", "Lcom/opensource/svgaplayer/SVGAImageView$c;", "getFillMode", "()Lcom/opensource/svgaplayer/SVGAImageView$c;", "setFillMode", "(Lcom/opensource/svgaplayer/SVGAImageView$c;)V", "fillMode", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "mAnimatorListener", "e", "getClearsAfterStop", "setClearsAfterStop", "clearsAfterStop", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "mAnimatorUpdateListener", "<set-?>", am.aF, "p", "isAnimating", "l", "mAutoPlay", "I", "mEndFrame", "i", "Landroid/animation/ValueAnimator;", "mAnimator", "j", "Lh/s/a/e;", "mItemClickAreaListener", "k", "mAntiAlias", "mStartFrame", "d", "getLoops", "()I", "setLoops", "(I)V", "loops", "b", "Ljava/lang/String;", "TAG", "Lh/s/a/d;", "h", "Lh/s/a/d;", "getCallback", "()Lh/s/a/d;", "setCallback", "(Lh/s/a/d;)V", "callback", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SVGAImageView extends ImageView {
    private final String b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f5223d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5224e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5225f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private c f5226g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private h.s.a.d f5227h;

    /* renamed from: i  reason: collision with root package name */
    private ValueAnimator f5228i;

    /* renamed from: j  reason: collision with root package name */
    private h.s.a.e f5229j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5230k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5231l;

    /* renamed from: m  reason: collision with root package name */
    private final a f5232m;

    /* renamed from: n  reason: collision with root package name */
    private final b f5233n;

    /* renamed from: o  reason: collision with root package name */
    private int f5234o;

    /* renamed from: p  reason: collision with root package name */
    private int f5235p;
    private HashMap q;

    /* compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"com/opensource/svgaplayer/SVGAImageView$a", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "Ljava/lang/ref/WeakReference;", "Lcom/opensource/svgaplayer/SVGAImageView;", "b", "Ljava/lang/ref/WeakReference;", "weakReference", "view", "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a implements Animator.AnimatorListener {
        private final WeakReference<SVGAImageView> b;

        public a(@NotNull SVGAImageView sVGAImageView) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@Nullable Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Nullable Animator animator) {
        }
    }

    /* compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"com/opensource/svgaplayer/SVGAImageView$b", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animation", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Ljava/lang/ref/WeakReference;", "Lcom/opensource/svgaplayer/SVGAImageView;", "b", "Ljava/lang/ref/WeakReference;", "weakReference", "view", "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        private final WeakReference<SVGAImageView> b;

        public b(@NotNull SVGAImageView sVGAImageView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@Nullable ValueAnimator valueAnimator) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/opensource/svgaplayer/SVGAImageView$c", "", "Lcom/opensource/svgaplayer/SVGAImageView$c;", "<init>", "(Ljava/lang/String;I)V", "Backward", "Forward", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES = null;
        public static final c Backward = null;
        public static final c Forward = null;

        private c(String str, int i2) {
        }

        public static c valueOf(String str) {
        }

        public static c[] values() {
        }
    }

    /* compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/opensource/svgaplayer/SVGAImageView$d", "Lh/s/a/h$d;", "Lh/s/a/j;", "videoItem", "", "a", "(Lh/s/a/j;)V", "onError", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f5236a;

        public d(WeakReference weakReference) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    /* compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ SVGAImageView b;
        public final /* synthetic */ j c;

        public e(SVGAImageView sVGAImageView, j jVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context) {
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public /* synthetic */ SVGAImageView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static /* synthetic */ void B(SVGAImageView sVGAImageView, h.s.a.n.b bVar, boolean z, int i2, Object obj) {
    }

    public static final /* synthetic */ boolean c(SVGAImageView sVGAImageView) {
    }

    public static final /* synthetic */ boolean d(SVGAImageView sVGAImageView) {
    }

    public static final /* synthetic */ f e(SVGAImageView sVGAImageView) {
    }

    public static final /* synthetic */ boolean f(SVGAImageView sVGAImageView) {
    }

    public static final /* synthetic */ void g(SVGAImageView sVGAImageView, Animator animator) {
    }

    private final f getSVGADrawable() {
    }

    public static final /* synthetic */ void h(SVGAImageView sVGAImageView, ValueAnimator valueAnimator) {
    }

    public static final /* synthetic */ void i(SVGAImageView sVGAImageView, boolean z) {
    }

    public static final /* synthetic */ void j(SVGAImageView sVGAImageView, boolean z) {
    }

    public static final /* synthetic */ void k(SVGAImageView sVGAImageView, boolean z) {
    }

    public static final /* synthetic */ void l(SVGAImageView sVGAImageView, j jVar) {
    }

    private final h.d n(WeakReference<SVGAImageView> weakReference) {
    }

    private final double o() {
    }

    private final void q(AttributeSet attributeSet) {
    }

    private final void r(Animator animator) {
    }

    private final void s(ValueAnimator valueAnimator) {
    }

    private final void t(String str) {
    }

    private final void v(h.s.a.n.b bVar, boolean z) {
    }

    private final void x() {
    }

    private final void z(j jVar) {
    }

    public final void A(@Nullable h.s.a.n.b bVar, boolean z) {
    }

    public final void C(int i2, boolean z) {
    }

    public final void D(double d2, boolean z) {
    }

    public final void E() {
    }

    public final void F(boolean z) {
    }

    public void a() {
    }

    public View b(int i2) {
    }

    @Nullable
    public final h.s.a.d getCallback() {
    }

    public final boolean getClearsAfterDetached() {
    }

    public final boolean getClearsAfterStop() {
    }

    @NotNull
    public final c getFillMode() {
    }

    public final int getLoops() {
    }

    public final void m() {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
    }

    public final boolean p() {
    }

    public final void setCallback(@Nullable h.s.a.d dVar) {
    }

    public final void setClearsAfterDetached(boolean z) {
    }

    public final void setClearsAfterStop(boolean z) {
    }

    public final void setFillMode(@NotNull c cVar) {
    }

    public final void setLoops(int i2) {
    }

    public final void setOnAnimKeyClickListener(@NotNull h.s.a.e eVar) {
    }

    public final void setVideoItem(@Nullable j jVar) {
    }

    public final void u() {
    }

    public final void w(@Nullable j jVar, @Nullable g gVar) {
    }

    public final void y() {
    }

    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
