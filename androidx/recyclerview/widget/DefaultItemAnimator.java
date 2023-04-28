package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {
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

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ArrayList val$moves;

        public AnonymousClass1(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ArrayList val$changes;

        public AnonymousClass2(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ArrayList val$additions;

        public AnonymousClass3(DefaultItemAnimator defaultItemAnimator, ArrayList arrayList) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass4(DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 extends AnimatorListenerAdapter {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass5(DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
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

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 extends AnimatorListenerAdapter {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ int val$deltaX;
        public final /* synthetic */ int val$deltaY;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass6(DefaultItemAnimator defaultItemAnimator, RecyclerView.ViewHolder viewHolder, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
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

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ChangeInfo val$changeInfo;
        public final /* synthetic */ ViewPropertyAnimator val$oldViewAnim;
        public final /* synthetic */ View val$view;

        public AnonymousClass7(DefaultItemAnimator defaultItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 extends AnimatorListenerAdapter {
        public final /* synthetic */ DefaultItemAnimator this$0;
        public final /* synthetic */ ChangeInfo val$changeInfo;
        public final /* synthetic */ View val$newView;
        public final /* synthetic */ ViewPropertyAnimator val$newViewAnimation;

        public AnonymousClass8(DefaultItemAnimator defaultItemAnimator, ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MoveInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;

        public MoveInfo(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        }
    }

    private void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
    }

    public void cancelAll(List<RecyclerView.ViewHolder> list) {
    }

    public void dispatchFinishedWhenDone() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
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
