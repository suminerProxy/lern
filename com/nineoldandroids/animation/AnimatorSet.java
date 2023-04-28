package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AnimatorSet extends Animator {
    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap<Animator, Node> mNodeMap;
    private ArrayList<Node> mNodes;
    private ArrayList<Animator> mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList<Node> mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    public boolean mTerminated;

    /* renamed from: com.nineoldandroids.animation.AnimatorSet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public boolean canceled;
        public final /* synthetic */ AnimatorSet this$0;
        public final /* synthetic */ ArrayList val$nodesToStart;

        public AnonymousClass1(AnimatorSet animatorSet, ArrayList arrayList) {
        }

        @Override // com.nineoldandroids.animation.AnimatorListenerAdapter, com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.AnimatorListenerAdapter, com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnimatorSetListener implements Animator.AnimatorListener {
        private AnimatorSet mAnimatorSet;
        public final /* synthetic */ AnimatorSet this$0;

        public AnimatorSetListener(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Dependency {
        public static final int AFTER = 1;
        public static final int WITH = 0;
        public Node node;
        public int rule;

        public Dependency(Node node, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class DependencyListener implements Animator.AnimatorListener {
        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;

        public DependencyListener(AnimatorSet animatorSet, Node node, int i2) {
        }

        private void startIfReady(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // com.nineoldandroids.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Node implements Cloneable {
        public Animator animation;
        public ArrayList<Dependency> dependencies;
        public boolean done;
        public ArrayList<Node> nodeDependencies;
        public ArrayList<Node> nodeDependents;
        public ArrayList<Dependency> tmpDependencies;

        public Node(Animator animator) {
        }

        public void addDependency(Dependency dependency) {
        }

        /* renamed from: clone  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m12clone() throws CloneNotSupportedException {
        }

        public Node clone() {
        }
    }

    public static /* synthetic */ ArrayList access$000(AnimatorSet animatorSet) {
    }

    public static /* synthetic */ HashMap access$100(AnimatorSet animatorSet) {
    }

    public static /* synthetic */ ArrayList access$200(AnimatorSet animatorSet) {
    }

    public static /* synthetic */ boolean access$302(AnimatorSet animatorSet, boolean z) {
    }

    public static /* synthetic */ ArrayList access$400(AnimatorSet animatorSet) {
    }

    private void sortNodes() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void cancel() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator clone() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void end() {
    }

    public ArrayList<Animator> getChildAnimations() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getDuration() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public long getStartDelay() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isRunning() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public boolean isStarted() {
    }

    public Builder play(Animator animator) {
    }

    public void playSequentially(Animator... animatorArr) {
    }

    public void playTogether(Animator... animatorArr) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setInterpolator(Interpolator interpolator) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setStartDelay(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setTarget(Object obj) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupEndValues() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupStartValues() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void start() {
    }

    @Override // com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo11clone() throws CloneNotSupportedException {
    }

    @Override // com.nineoldandroids.animation.Animator
    public AnimatorSet setDuration(long j2) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public AnimatorSet clone() {
    }

    public void playTogether(Collection<Animator> collection) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class Builder {
        private Node mCurrentNode;
        public final /* synthetic */ AnimatorSet this$0;

        public Builder(AnimatorSet animatorSet, Animator animator) {
        }

        public Builder after(Animator animator) {
        }

        public Builder before(Animator animator) {
        }

        public Builder with(Animator animator) {
        }

        public Builder after(long j2) {
        }
    }

    public void playSequentially(List<Animator> list) {
    }
}
