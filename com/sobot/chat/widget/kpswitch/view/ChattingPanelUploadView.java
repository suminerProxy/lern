package com.sobot.chat.widget.kpswitch.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView;
import com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView;
import com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsIndicatorView;
import com.sobot.chat.widget.kpswitch.widget.adpater.PageSetAdapter;
import com.sobot.chat.widget.kpswitch.widget.adpater.PlusAdapter;
import com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity;
import com.sobot.chat.widget.kpswitch.widget.data.PlusPageEntity;
import com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener;
import com.sobot.chat.widget.kpswitch.widget.interfaces.PlusDisplayListener;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ChattingPanelUploadView extends BaseChattingPanelView implements View.OnClickListener, EmoticonsFuncView.OnEmoticonsPageViewListener {
    private static final String ACTION_CAMERA = "sobot_action_camera";
    private static final String ACTION_CHOOSE_FILE = "sobot_action_choose_file";
    private static final String ACTION_LEAVEMSG = "sobot_action_leavemsg";
    private static final String ACTION_PIC = "sobot_action_pic";
    private static final String ACTION_SATISFACTION = "sobot_action_satisfaction";
    private static final String ACTION_VIDEO = "sobot_action_video";
    private int mCurrentClientMode;
    private EmoticonsFuncView mEmoticonsFuncView;
    private EmoticonsIndicatorView mEmoticonsIndicatorView;
    private SobotPlusClickListener mListener;
    private List<SobotPlusEntity> operatorList;
    private PageSetAdapter pageSetAdapter;
    private List<SobotPlusEntity> robotList;

    /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements PageViewInstantiateListener<PlusPageEntity> {
        public final /* synthetic */ ChattingPanelUploadView this$0;

        public AnonymousClass1(ChattingPanelUploadView chattingPanelUploadView) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener
        public /* bridge */ /* synthetic */ View instantiateItem(ViewGroup viewGroup, int i2, PlusPageEntity plusPageEntity) {
        }

        /* renamed from: instantiateItem  reason: avoid collision after fix types in other method */
        public View instantiateItem2(ViewGroup viewGroup, int i2, PlusPageEntity plusPageEntity) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelUploadView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements PlusDisplayListener<Object> {
        public final /* synthetic */ ChattingPanelUploadView this$0;

        public AnonymousClass2(ChattingPanelUploadView chattingPanelUploadView) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.interfaces.PlusDisplayListener
        public void onBindView(int i2, ViewGroup viewGroup, PlusAdapter.ViewHolder viewHolder, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotPlusClickListener extends BaseChattingPanelView.SobotBasePanelListener {
        void btnCameraPicture();

        void btnPicture();

        void btnSatisfaction();

        void btnVedio();

        void chooseFile();

        void startToPostMsgActivty(boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SobotPlusEntity {
        public String action;
        public int iconResId;
        public String name;

        public SobotPlusEntity(int i2, String str, String str2) {
        }
    }

    public ChattingPanelUploadView(Context context) {
    }

    public static /* synthetic */ SobotPlusClickListener access$000(ChattingPanelUploadView chattingPanelUploadView) {
    }

    private void setAdapter(List<SobotPlusEntity> list) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void emoticonSetChanged(PageSetEntity pageSetEntity) {
    }

    public PlusDisplayListener<Object> getPlusItemDisplayListener(SobotPlusClickListener sobotPlusClickListener) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public String getRootViewTag() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public void initData() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public View initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public void onViewStart(Bundle bundle) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void playBy(int i2, int i3, PageSetEntity pageSetEntity) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void playTo(int i2, PageSetEntity pageSetEntity) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public void setListener(BaseChattingPanelView.SobotBasePanelListener sobotBasePanelListener) {
    }
}
