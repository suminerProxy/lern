package com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReactBean;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatFlowReactView extends RecyclerView {
    private ChatFlowReactAdapter adapter;
    private ChatFlowReactLayoutManager layoutManager;
    private int themeColorId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ChatFlowReactAdapter extends RecyclerView.Adapter<ChatFlowReactViewHolder> {
        private MessageReactBean data;
        private ReactOnClickListener reactOnClickListener;
        private int themeColorId;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.message.reply.ChatFlowReactView$ChatFlowReactAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ ChatFlowReactAdapter this$0;
            public final /* synthetic */ String val$emojiId;

            public AnonymousClass1(ChatFlowReactAdapter chatFlowReactAdapter, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public static /* synthetic */ ReactOnClickListener access$000(ChatFlowReactAdapter chatFlowReactAdapter) {
        }

        private String formatDisplayUserName(Set<String> set) {
        }

        private String getUserDisplayName(String str) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ChatFlowReactViewHolder chatFlowReactViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ ChatFlowReactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(MessageReactBean messageReactBean) {
        }

        public void setReactOnClickListener(ReactOnClickListener reactOnClickListener) {
        }

        public void setThemeColorId(int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ChatFlowReactViewHolder chatFlowReactViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ChatFlowReactViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ChatFlowReactViewHolder extends RecyclerView.ViewHolder {
        public ImageView faceImageView;
        public TextView userTextView;

        public ChatFlowReactViewHolder(@NonNull View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ReactOnClickListener {
        void onClick(String str);
    }

    public ChatFlowReactView(@NonNull Context context) {
    }

    private void initView() {
    }

    public void setData(MessageReactBean messageReactBean) {
    }

    public void setReactOnClickListener(ReactOnClickListener reactOnClickListener) {
    }

    public void setThemeColorId(int i2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ChatFlowReactLayoutManager extends RecyclerView.LayoutManager {
        private int horizontalSpacing;
        private int verticalSpacing;

        public ChatFlowReactLayoutManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean isAutoMeasureEnabled() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        }

        public ChatFlowReactLayoutManager(float f2, float f3) {
        }
    }

    public ChatFlowReactView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ChatFlowReactView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
