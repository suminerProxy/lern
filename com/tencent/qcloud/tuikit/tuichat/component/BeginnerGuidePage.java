package com.tencent.qcloud.tuikit.tuichat.component;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BeginnerGuidePage {
    private OnFinishListener onFinishListener;
    private PopupWindow popupWindow;
    private int[] resIDs;
    private ViewPager2 viewPager;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.BeginnerGuidePage$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends PopupWindow {
        public final /* synthetic */ BeginnerGuidePage this$0;
        public final /* synthetic */ Activity val$activity;

        public AnonymousClass1(BeginnerGuidePage beginnerGuidePage, View view, int i2, int i3, boolean z, Activity activity) {
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
        }

        @Override // android.widget.PopupWindow
        public void showAtLocation(View view, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.BeginnerGuidePage$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ BeginnerGuidePage this$0;
        public final /* synthetic */ Window val$window;

        public AnonymousClass2(BeginnerGuidePage beginnerGuidePage, Window window) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class GuideAdapter extends RecyclerView.Adapter<GuideViewHolder> {
        public final /* synthetic */ BeginnerGuidePage this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.BeginnerGuidePage$GuideAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ GuideAdapter this$1;
            public final /* synthetic */ GuideViewHolder val$holder;

            public AnonymousClass1(GuideAdapter guideAdapter, GuideViewHolder guideViewHolder) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class GuideViewHolder extends RecyclerView.ViewHolder {
            private final ImageView image;
            public final /* synthetic */ GuideAdapter this$1;

            public GuideViewHolder(@NonNull GuideAdapter guideAdapter, View view) {
            }

            public static /* synthetic */ ImageView access$100(GuideViewHolder guideViewHolder) {
            }
        }

        public GuideAdapter(BeginnerGuidePage beginnerGuidePage) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull GuideViewHolder guideViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ GuideViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull GuideViewHolder guideViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public GuideViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    @FunctionalInterface
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnFinishListener {
        void onFinish();
    }

    public BeginnerGuidePage(Activity activity) {
    }

    public static /* synthetic */ void access$000(BeginnerGuidePage beginnerGuidePage, Window window, boolean z) {
    }

    public static /* synthetic */ int[] access$200(BeginnerGuidePage beginnerGuidePage) {
    }

    public static /* synthetic */ ViewPager2 access$300(BeginnerGuidePage beginnerGuidePage) {
    }

    public static /* synthetic */ OnFinishListener access$400(BeginnerGuidePage beginnerGuidePage) {
    }

    public static /* synthetic */ PopupWindow access$500(BeginnerGuidePage beginnerGuidePage) {
    }

    private void startAnimation(Window window, boolean z) {
    }

    public void setOnFinishListener(OnFinishListener onFinishListener) {
    }

    public void setPagesResIDs(int... iArr) {
    }

    public void show(View view, int i2) {
    }
}
