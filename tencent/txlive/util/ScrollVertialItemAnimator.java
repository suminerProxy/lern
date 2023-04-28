package tencent.txlive.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ScrollVertialItemAnimator extends SimpleItemAnimator {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    public ArrayList<RecyclerView.ViewHolder> mAddAnimations;
    public ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList;
    public ArrayList<RecyclerView.ViewHolder> mChangeAnimations;
    public ArrayList<ArrayList<ChangeInfo>> mChangesList;
    public ArrayList<RecyclerView.ViewHolder> mMoveAnimations;
    public ArrayList<ArrayList<MoveInfo>> mMovesList;
    private ArrayList<RecyclerView.ViewHolder> mPendingAdditions;
    private ArrayList<ChangeInfo> mPendingChanges;
    private ArrayList<MoveInfo> mPendingMoves;
    private ArrayList<RecyclerView.ViewHolder> mPendingRemovals;
    public ArrayList<RecyclerView.ViewHolder> mRemoveAnimations;
    private RecyclerView rootView;

    /* renamed from: tencent.txlive.util.ScrollVertialItemAnimator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ ScrollVertialItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass1(ScrollVertialItemAnimator scrollVertialItemAnimator, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: tencent.txlive.util.ScrollVertialItemAnimator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ ScrollVertialItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass2(ScrollVertialItemAnimator scrollVertialItemAnimator, RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: tencent.txlive.util.ScrollVertialItemAnimator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        public final /* synthetic */ ScrollVertialItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ int val$deltaX;
        public final /* synthetic */ int val$deltaY;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass3(ScrollVertialItemAnimator scrollVertialItemAnimator, RecyclerView.ViewHolder viewHolder, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: tencent.txlive.util.ScrollVertialItemAnimator$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public final /* synthetic */ ScrollVertialItemAnimator this$0;
        public final /* synthetic */ ChangeInfo val$changeInfo;
        public final /* synthetic */ ViewPropertyAnimator val$oldViewAnim;
        public final /* synthetic */ View val$view;

        public AnonymousClass4(ScrollVertialItemAnimator scrollVertialItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: tencent.txlive.util.ScrollVertialItemAnimator$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass5 extends AnimatorListenerAdapter {
        public final /* synthetic */ ScrollVertialItemAnimator this$0;
        public final /* synthetic */ ChangeInfo val$changeInfo;
        public final /* synthetic */ View val$newView;
        public final /* synthetic */ ViewPropertyAnimator val$newViewAnimation;

        public AnonymousClass5(ScrollVertialItemAnimator scrollVertialItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class MoveInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;

        public MoveInfo(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        }
    }

    public ScrollVertialItemAnimator(RecyclerView recyclerView) {
    }

    private /* synthetic */ void a(ArrayList arrayList) {
    }

    private void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
    }

    private /* synthetic */ void c(ArrayList arrayList) {
    }

    private /* synthetic */ void e(ArrayList arrayList) {
    }

    private void endChangeAnimation(List<ChangeInfo> list, RecyclerView.ViewHolder viewHolder) {
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
    }

    private void resetAnimation(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
    }

    public void animateAddImpl(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
    }

    public void animateChangeImpl(ChangeInfo changeInfo) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
    }

    public void animateMoveImpl(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
    }

    public /* synthetic */ void b(ArrayList arrayList) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
    }

    public void cancelAll(List<RecyclerView.ViewHolder> list) {
    }

    public /* synthetic */ void d(ArrayList arrayList) {
    }

    public void dispatchFinishedWhenDone() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
    }

    public /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class ChangeInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder newHolder;
        public RecyclerView.ViewHolder oldHolder;
        public int toX;
        public int toY;

        private ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        }

        public String toString() {
        }

        public ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        }
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
    }
}
