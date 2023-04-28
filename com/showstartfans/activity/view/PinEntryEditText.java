package com.showstartfans.activity.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PinEntryEditText extends EditText {
    private static final String D = "http://schemas.android.com/apk/res/android";
    public int[][] A;
    public int[] B;
    public ColorStateList C;
    public String b;
    public StringBuilder c;

    /* renamed from: d  reason: collision with root package name */
    public String f6886d;

    /* renamed from: e  reason: collision with root package name */
    public int f6887e;

    /* renamed from: f  reason: collision with root package name */
    public float f6888f;

    /* renamed from: g  reason: collision with root package name */
    public float f6889g;

    /* renamed from: h  reason: collision with root package name */
    public float f6890h;

    /* renamed from: i  reason: collision with root package name */
    public float f6891i;

    /* renamed from: j  reason: collision with root package name */
    public int f6892j;

    /* renamed from: k  reason: collision with root package name */
    public RectF[] f6893k;

    /* renamed from: l  reason: collision with root package name */
    public float[] f6894l;

    /* renamed from: m  reason: collision with root package name */
    public Paint f6895m;

    /* renamed from: n  reason: collision with root package name */
    public Paint f6896n;

    /* renamed from: o  reason: collision with root package name */
    public Paint f6897o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f6898p;
    public Rect q;
    public boolean r;
    public View.OnClickListener s;
    public d t;
    public float u;
    public float v;
    public Paint w;
    public boolean x;
    public boolean y;
    public ColorStateList z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PinEntryEditText f6899a;

        public a(PinEntryEditText pinEntryEditText) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ PinEntryEditText b;

        public b(PinEntryEditText pinEntryEditText) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Animator.AnimatorListener {
        public final /* synthetic */ PinEntryEditText b;

        public c(PinEntryEditText pinEntryEditText) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void a(CharSequence charSequence);
    }

    public PinEntryEditText(Context context) {
    }

    private void a(CharSequence charSequence, int i2) {
    }

    private void b() {
    }

    private int d(int... iArr) {
    }

    private void e(Context context, AttributeSet attributeSet) {
    }

    private /* synthetic */ void g(int i2, ValueAnimator valueAnimator) {
    }

    private CharSequence getFullText() {
    }

    private StringBuilder getMaskChars() {
    }

    private /* synthetic */ void i(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void k(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void m(View view) {
    }

    private /* synthetic */ boolean o(View view) {
    }

    public void c() {
    }

    public boolean f() {
    }

    public int getMaxLendth() {
    }

    public /* synthetic */ void h(int i2, ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void j(ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void l(ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void n(View view) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public /* synthetic */ boolean p(View view) {
    }

    public void q(boolean z) {
    }

    public void r(boolean z, boolean z2) {
    }

    public void setAnimateText(boolean z) {
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
    }

    public void setError(boolean z) {
    }

    public void setMaxLength(int i2) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnPinEnteredListener(d dVar) {
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public PinEntryEditText(Context context, AttributeSet attributeSet, int i2, int i3) {
    }
}
