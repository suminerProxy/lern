package com.tencent.qcloud.tuikit.tuichat.component.popmenu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.face.EmojiIndicatorView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatPopMenu {
    public static int ACTION_COLUMN_NUM = 5;
    public static int EMOJI_COLUMN_NUM = 8;
    public static int EMOJI_ROW_NUM = 3;
    public static String RECENT_EMOJI_KEY = "recentEmoji";
    public static int RECENT_EMOJI_NUM = 6;
    public static int RECT_RADIUS = 16;
    public static int SHADOW_WIDTH = 10;
    public GridLayoutManager actionGridLayoutManager;
    public RecyclerView actionRecyclerView;
    public View anchorView;
    public ChatPopMenu chatPopMenu;
    public List<ChatPopMenuAction> chatPopMenuActionList;
    public Context context;
    public View divideLine;
    public List<Emoji> emojiList;
    public EmojiOnClickListener emojiOnClickListener;
    public FacePageAdapter facePageAdapter;
    public EmojiIndicatorView facePageIndicator;
    public LinearLayout facePageLinearLayout;
    public RecyclerView facePageRecyclerView;
    public int indicatorHeight;
    public boolean isShowFaces;
    public boolean isShowMoreFace;
    public MessageRecyclerView.OnEmptySpaceClickListener mEmptySpaceClickListener;
    public MenuAdapter menuAdapter;
    public int minY;
    public int oldFacePageIndex;
    public int paddingBottomOffset;
    public int paddingTopOffset;
    public View popupView;
    public PopupWindow popupWindow;
    public List<String> recentEmojiList;
    public RecyclerView recentFaceView;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends RecyclerView.OnScrollListener {
        public final /* synthetic */ ChatPopMenu this$0;
        public final /* synthetic */ LinearLayoutManager val$faceLayoutManager;

        public AnonymousClass1(ChatPopMenu chatPopMenu, LinearLayoutManager linearLayoutManager) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ChatPopMenuAction {
        public OnClickListener actionClickListener;
        public int actionIcon;
        public String actionName;

        @FunctionalInterface
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public interface OnClickListener {
            void onClick();
        }

        public OnClickListener getActionClickListener() {
        }

        public int getActionIcon() {
        }

        public String getActionName() {
        }

        public void setActionClickListener(OnClickListener onClickListener) {
        }

        public void setActionIcon(int i2) {
        }

        public void setActionName(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface EmojiOnClickListener {
        void onClick(Emoji emoji);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FaceGridAdapter extends RecyclerView.Adapter<FaceViewHolder> {
        public List<Emoji> data;
        public final /* synthetic */ ChatPopMenu this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu$FaceGridAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ FaceGridAdapter this$1;
            public final /* synthetic */ Emoji val$emoji;

            public AnonymousClass1(FaceGridAdapter faceGridAdapter, Emoji emoji) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public FaceGridAdapter(ChatPopMenu chatPopMenu) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull FaceViewHolder faceViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ FaceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(List<Emoji> list) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull FaceViewHolder faceViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public FaceViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class FaceGridDecoration extends RecyclerView.ItemDecoration {
        public int columnNum;
        public int leftRightSpace;
        public int topBottomSpace;

        public FaceGridDecoration(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FacePageAdapter extends RecyclerView.Adapter<FacePageViewHolder> {
        public final /* synthetic */ ChatPopMenu this$0;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class FacePageViewHolder extends RecyclerView.ViewHolder {
            public RecyclerView recyclerView;
            public final /* synthetic */ FacePageAdapter this$1;

            public FacePageViewHolder(@NonNull FacePageAdapter facePageAdapter, View view) {
            }
        }

        public FacePageAdapter(ChatPopMenu chatPopMenu) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull FacePageViewHolder facePageViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ FacePageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull FacePageViewHolder facePageViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public FacePageViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class FaceViewHolder extends RecyclerView.ViewHolder {
        public ImageView faceIv;

        public FaceViewHolder(@NonNull View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class GridDecoration extends RecyclerView.ItemDecoration {
        public int columnNum;
        public Drawable divider;
        public int leftRightSpace;
        public int topBottomSpace;

        public GridDecoration(Drawable drawable, int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MenuAdapter extends RecyclerView.Adapter<MenuItemViewHolder> {
        public final /* synthetic */ ChatPopMenu this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu$MenuAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ MenuAdapter this$1;
            public final /* synthetic */ ChatPopMenuAction val$chatPopMenuAction;

            public AnonymousClass1(MenuAdapter menuAdapter, ChatPopMenuAction chatPopMenuAction) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class MenuItemViewHolder extends RecyclerView.ViewHolder {
            public ImageView icon;
            public final /* synthetic */ MenuAdapter this$1;
            public TextView title;

            public MenuItemViewHolder(@NonNull MenuAdapter menuAdapter, View view) {
            }
        }

        public MenuAdapter(ChatPopMenu chatPopMenu) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull MenuItemViewHolder menuItemViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull MenuItemViewHolder menuItemViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public MenuItemViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class PopIndicatorDrawable extends Drawable {
        public View anchorView;
        public int indicatorHeight;
        public Paint paint;
        public Path path;
        public float radius;
        public final /* synthetic */ ChatPopMenu this$0;

        public PopIndicatorDrawable(ChatPopMenu chatPopMenu, View view, int i2, float f2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class RecentFaceAdapter extends RecyclerView.Adapter<RecentFaceViewHolder> {
        public final /* synthetic */ ChatPopMenu this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu$RecentFaceAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ RecentFaceAdapter this$1;
            public final /* synthetic */ Emoji val$emoji;
            public final /* synthetic */ int val$position;

            public AnonymousClass1(RecentFaceAdapter recentFaceAdapter, int i2, Emoji emoji) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RecentFaceViewHolder extends RecyclerView.ViewHolder {
            public ImageView faceIv;
            public final /* synthetic */ RecentFaceAdapter this$1;

            public RecentFaceViewHolder(@NonNull RecentFaceAdapter recentFaceAdapter, View view) {
            }
        }

        public RecentFaceAdapter(ChatPopMenu chatPopMenu) {
        }

        public Emoji getEmoji(String str) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecentFaceViewHolder recentFaceViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ RecentFaceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull RecentFaceViewHolder recentFaceViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public RecentFaceViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    public ChatPopMenu(Context context) {
    }

    public ChatPopMenuAction getChatPopMenuAction(int i2) {
    }

    public void hide() {
    }

    public void initDefaultEmoji() {
    }

    public void initEmojiList() {
    }

    public void refreshLayout() {
    }

    public void setChatPopMenuActionList(List<ChatPopMenuAction> list) {
    }

    public void setEmojiOnClickListener(EmojiOnClickListener emojiOnClickListener) {
    }

    public void setEmptySpaceClickListener(MessageRecyclerView.OnEmptySpaceClickListener onEmptySpaceClickListener) {
    }

    public void setFacePageIndicator(LinearLayoutManager linearLayoutManager) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
    }

    public void setShowFaces(boolean z) {
    }

    public void show(View view, int i2) {
    }

    public void showAtLocation() {
    }

    public void updateRecentEmoji(Emoji emoji) {
    }
}
