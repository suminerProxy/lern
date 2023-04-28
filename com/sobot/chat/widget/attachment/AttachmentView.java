package com.sobot.chat.widget.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sobot.chat.api.model.SobotFileModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AttachmentView extends FrameLayout {
    private SobotFileModel fileModel;
    private String fileName;
    private String fileUrl;
    private ImageView imageView;
    private Listener listener;
    private Context mContext;
    private int position;
    private View rootView;
    private RelativeLayout sobotAttachmentRootView;
    private TextView sobotFileName;
    private TextView sobotFilePreview;
    private ImageView sobotFileTypeIcon;
    private int type;

    /* renamed from: com.sobot.chat.widget.attachment.AttachmentView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ AttachmentView this$0;

        public AnonymousClass1(AttachmentView attachmentView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface Listener {
        void downFileLister(SobotFileModel sobotFileModel, int i2);

        void previewMp4(SobotFileModel sobotFileModel, int i2);

        void previewPic(String str, String str2, int i2);
    }

    public AttachmentView(@NonNull Context context) {
    }

    public static /* synthetic */ Listener access$000(AttachmentView attachmentView) {
    }

    public static /* synthetic */ int access$100(AttachmentView attachmentView) {
    }

    public static /* synthetic */ SobotFileModel access$200(AttachmentView attachmentView) {
    }

    public static /* synthetic */ int access$300(AttachmentView attachmentView) {
    }

    public static /* synthetic */ String access$400(AttachmentView attachmentView) {
    }

    public static /* synthetic */ String access$500(AttachmentView attachmentView) {
    }

    private void initView(Context context) {
    }

    public void setFileModel(SobotFileModel sobotFileModel) {
    }

    public void setFileName(CharSequence charSequence) {
    }

    public void setFileNameColor(int i2) {
    }

    public void setFileTypeIcon(int i2) {
    }

    public void setFileUrl(String str) {
    }

    public void setListener(Listener listener) {
    }

    public void setPosition(int i2) {
    }

    public AttachmentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public AttachmentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
