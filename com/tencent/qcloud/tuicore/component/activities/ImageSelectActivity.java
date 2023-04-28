package com.tencent.qcloud.tuicore.component.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ImageSelectActivity extends BaseLightActivity {
    public static final String DATA = "data";
    public static final String ITEM_HEIGHT = "itemHeight";
    public static final String ITEM_WIDTH = "itemWidth";
    public static final String NEED_DOWLOAD_LOCAL = "needdowmload";
    public static final String PLACEHOLDER = "placeholder";
    public static final int RESULT_CODE_ERROR = -1;
    public static final int RESULT_CODE_SUCCESS = 0;
    public static final String SELECTED = "selected";
    public static final String SPAN_COUNT = "spanCount";
    private static final String TAG = null;
    public static final String TITLE = "title";
    private int columnNum;
    private List<ImageBean> data;
    private int defaultSpacing;
    private ImageGridAdapter gridAdapter;
    private GridLayoutManager gridLayoutManager;
    private RecyclerView imageGrid;
    private int itemHeight;
    private int itemWidth;
    private int placeHolder;
    private ImageBean selected;
    private TitleBarLayout titleBarLayout;

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ImageSelectActivity this$0;

        public AnonymousClass1(ImageSelectActivity imageSelectActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ ImageSelectActivity this$0;
        public final /* synthetic */ boolean val$needDownload;

        public AnonymousClass2(ImageSelectActivity imageSelectActivity, boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements OnItemClickListener {
        public final /* synthetic */ ImageSelectActivity this$0;

        public AnonymousClass3(ImageSelectActivity imageSelectActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity.OnItemClickListener
        public void onClick(ImageBean imageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements DialogInterface.OnDismissListener {
        public final /* synthetic */ ImageSelectActivity this$0;

        public AnonymousClass4(ImageSelectActivity imageSelectActivity) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements h<File> {
        public final /* synthetic */ ImageSelectActivity this$0;
        public final /* synthetic */ ProgressDialog val$dialog;
        public final /* synthetic */ ImageBean val$finalBean;

        public AnonymousClass5(ImageSelectActivity imageSelectActivity, ProgressDialog progressDialog, ImageBean imageBean) {
        }

        @Override // h.g.a.t.h
        public boolean onLoadFailed(@Nullable q qVar, Object obj, p<File> pVar, boolean z) {
        }

        @Override // h.g.a.t.h
        public /* bridge */ /* synthetic */ boolean onResourceReady(File file, Object obj, p<File> pVar, a aVar, boolean z) {
        }

        /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
        public boolean onResourceReady2(File file, Object obj, p<File> pVar, a aVar, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GridDecoration extends RecyclerView.ItemDecoration {
        private final int columnNum;
        private final int leftRightSpace;
        private final int topBottomSpace;

        public GridDecoration(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ImageGridAdapter extends RecyclerView.Adapter<ImageViewHolder> {
        private List<ImageBean> data;
        private int itemHeight;
        private int itemWidth;
        private OnItemClickListener onItemClickListener;
        private int placeHolder;
        private ImageBean selected;

        /* renamed from: com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity$ImageGridAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ ImageGridAdapter this$0;
            public final /* synthetic */ ImageBean val$imageBean;

            public AnonymousClass1(ImageGridAdapter imageGridAdapter, ImageBean imageBean) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static class ImageViewHolder extends RecyclerView.ViewHolder {
            private final Button defaultLayout;
            private final ImageView imageView;
            private final RelativeLayout selectBorderLayout;
            private final ImageView selectedBorder;

            public ImageViewHolder(@NonNull View view) {
            }

            public static /* synthetic */ ImageView access$500(ImageViewHolder imageViewHolder) {
            }

            public static /* synthetic */ RelativeLayout access$600(ImageViewHolder imageViewHolder) {
            }

            public static /* synthetic */ Button access$700(ImageViewHolder imageViewHolder) {
            }

            public static /* synthetic */ ImageView access$900(ImageViewHolder imageViewHolder) {
            }
        }

        public static /* synthetic */ OnItemClickListener access$800(ImageGridAdapter imageGridAdapter) {
        }

        private void setItemLayoutParams(ImageViewHolder imageViewHolder) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(List<ImageBean> list) {
        }

        public void setItemHeight(int i2) {
        }

        public void setItemWidth(int i2) {
        }

        public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        }

        public void setPlaceHolder(int i2) {
        }

        public void setSelected(ImageBean imageBean) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ImageViewHolder imageViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ImageViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemClickListener {
        void onClick(ImageBean imageBean);
    }

    private void DownloadUrl() {
    }

    public static /* synthetic */ ImageBean access$000(ImageSelectActivity imageSelectActivity) {
    }

    public static /* synthetic */ ImageBean access$002(ImageSelectActivity imageSelectActivity, ImageBean imageBean) {
    }

    public static /* synthetic */ void access$100(ImageSelectActivity imageSelectActivity) {
    }

    public static /* synthetic */ void access$200(ImageSelectActivity imageSelectActivity) {
    }

    public static /* synthetic */ String access$300() {
    }

    public static /* synthetic */ void access$400(ImageSelectActivity imageSelectActivity, ImageBean imageBean) {
    }

    private void setResult(ImageBean imageBean) {
    }

    private void setSelectedStatus() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ImageBean implements Serializable {
        public List<Object> groupGridAvatar;
        public String imageId;
        public String imageUri;
        public boolean isDefault;
        public String localPath;
        public String thumbnailUri;

        public ImageBean() {
        }

        public List<Object> getGroupGridAvatar() {
        }

        public String getImageId() {
        }

        public String getImageUri() {
        }

        public String getLocalPath() {
        }

        public String getThumbnailUri() {
        }

        public boolean isDefault() {
        }

        public void setDefault(boolean z) {
        }

        public void setGroupGridAvatar(List<Object> list) {
        }

        public void setImageId(String str) {
        }

        public void setImageUri(String str) {
        }

        public void setLocalPath(String str) {
        }

        public void setThumbnailUri(String str) {
        }

        public ImageBean(String str, String str2, boolean z) {
        }
    }
}
