package com.tencent.qcloud.tuikit.tuichat.component.face;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class EmojiIndicatorView extends LinearLayout {
    private Bitmap bmpNomal;
    private Bitmap bmpSelect;
    private Context mContext;
    private int mHeight;
    private ArrayList<ImageView> mImageViews;
    private int mMaxHeight;
    private AnimatorSet mPlayByInAnimatorSet;
    private AnimatorSet mPlayByOutAnimatorSet;
    private AnimatorSet mPlayToAnimatorSet;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.face.EmojiIndicatorView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Animator.AnimatorListener {
        public final /* synthetic */ EmojiIndicatorView this$0;
        public final /* synthetic */ ImageView val$imageViewNext;
        public final /* synthetic */ ImageView val$imageViewStrat;

        public AnonymousClass1(EmojiIndicatorView emojiIndicatorView, ImageView imageView, ImageView imageView2) {
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

    public EmojiIndicatorView(Context context, AttributeSet attributeSet) {
    }

    public static /* synthetic */ Bitmap access$000(EmojiIndicatorView emojiIndicatorView) {
    }

    public static /* synthetic */ Bitmap access$100(EmojiIndicatorView emojiIndicatorView) {
    }

    public static /* synthetic */ AnimatorSet access$200(EmojiIndicatorView emojiIndicatorView) {
    }

    public void init(int i2) {
    }

    public void playBy(int i2, int i3) {
    }

    public void playTo(int i2) {
    }

    public void setIndicatorCount(int i2) {
    }

    public EmojiIndicatorView(Context context) {
    }
}
