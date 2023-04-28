package com.sobot.chat.widget.attachment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.api.model.SobotFileModel;
import com.sobot.chat.widget.attachment.AttachmentView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FileAttachmentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<SobotFileModel> arrayList;
    private AttachmentView.Listener clickListener;
    private Context context;
    private int fileColor;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private AttachmentView attachmentView;

        public ViewHolder(@NonNull View view) {
        }

        public static /* synthetic */ AttachmentView access$000(ViewHolder viewHolder) {
        }
    }

    public FileAttachmentAdapter(Context context, ArrayList<SobotFileModel> arrayList, int i2, AttachmentView.Listener listener) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NonNull ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
    }
}
