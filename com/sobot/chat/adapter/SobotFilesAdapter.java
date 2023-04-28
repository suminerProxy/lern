package com.sobot.chat.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import java.io.File;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotFilesAdapter extends SobotBaseAdapter<File> {
    public static final int MSG_TYPE_DIR = 1;
    public static final int MSG_TYPE_FILE = 0;
    private static final String[] layoutRes = null;
    private File mCheckedFile;
    private Context mContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class BaseViewHolder {
        public Context mContext;

        public BaseViewHolder(Context context, View view) {
        }

        public abstract void bindData(File file);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class DirViewHolder extends BaseViewHolder {
        private TextView sobot_tv_name;

        public DirViewHolder(Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotFilesAdapter.BaseViewHolder
        public void bindData(File file) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class FileViewHolder extends BaseViewHolder {
        private TextView sobot_tv_descripe;
        private TextView sobot_tv_name;
        private TextView sobot_tv_radioBtn;
        public final /* synthetic */ SobotFilesAdapter this$0;

        public FileViewHolder(SobotFilesAdapter sobotFilesAdapter, Context context, View view) {
        }

        @Override // com.sobot.chat.adapter.SobotFilesAdapter.BaseViewHolder
        public void bindData(File file) {
        }
    }

    public SobotFilesAdapter(Context context, List list) {
    }

    public static /* synthetic */ File access$000(SobotFilesAdapter sobotFilesAdapter) {
    }

    private View initView(View view, int i2, int i3, File file) {
    }

    public File getCheckedFile() {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
    }

    public boolean isCheckedFile(File file) {
    }

    public void setCheckedFile(File file) {
    }
}
