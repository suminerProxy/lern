package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotKeyWordMessageHolder extends MessageHolderBase {
    private View.OnClickListener mKeyWorkCheckGroupClickListener;
    private LinearLayout sobot_keyword_grouplist;
    private TextView tv_title;

    /* renamed from: com.sobot.chat.viewHolder.RobotKeyWordMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ RobotKeyWordMessageHolder this$0;

        public AnonymousClass1(RobotKeyWordMessageHolder robotKeyWordMessageHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class KeyWorkTempModel {
        private String keyword;
        private String keywordId;
        private String tempGroupId;
        public final /* synthetic */ RobotKeyWordMessageHolder this$0;

        public KeyWorkTempModel(RobotKeyWordMessageHolder robotKeyWordMessageHolder) {
        }

        public String getKeyword() {
        }

        public String getKeywordId() {
        }

        public String getTempGroupId() {
        }

        public void setKeyword(String str) {
        }

        public void setKeywordId(String str) {
        }

        public void setTempGroupId(String str) {
        }
    }

    public RobotKeyWordMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ Context access$000(RobotKeyWordMessageHolder robotKeyWordMessageHolder) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }
}
