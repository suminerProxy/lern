package com.sobot.chat.widget.kpswitch.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sobot.chat.widget.emoji.EmojiconNew;
import com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView;
import com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView;
import com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsIndicatorView;
import com.sobot.chat.widget.kpswitch.widget.adpater.EmoticonsAdapter;
import com.sobot.chat.widget.kpswitch.widget.data.EmoticonPageEntity;
import com.sobot.chat.widget.kpswitch.widget.data.PageSetEntity;
import com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonClickListener;
import com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonDisplayListener;
import com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ChattingPanelEmoticonView extends BaseChattingPanelView implements EmoticonsFuncView.OnEmoticonsPageViewListener {
    public EmoticonClickListener emoticonClickListener;
    public EmoticonsFuncView mEmoticonsFuncView;
    public EmoticonsIndicatorView mEmoticonsIndicatorView;
    public SobotEmoticonClickListener mListener;

    /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements PageViewInstantiateListener<EmoticonPageEntity> {
        public final /* synthetic */ ChattingPanelEmoticonView this$0;

        public AnonymousClass1(ChattingPanelEmoticonView chattingPanelEmoticonView) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.interfaces.PageViewInstantiateListener
        public /* bridge */ /* synthetic */ View instantiateItem(ViewGroup viewGroup, int i2, EmoticonPageEntity emoticonPageEntity) {
        }

        /* renamed from: instantiateItem  reason: avoid collision after fix types in other method */
        public View instantiateItem2(ViewGroup viewGroup, int i2, EmoticonPageEntity emoticonPageEntity) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements EmoticonDisplayListener<Object> {
        public final /* synthetic */ ChattingPanelEmoticonView this$0;
        public final /* synthetic */ EmoticonClickListener val$emoticonClickListener;

        /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ EmojiconNew val$emoticonEntity;
            public final /* synthetic */ boolean val$isDelBtn;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, EmojiconNew emojiconNew, boolean z) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public AnonymousClass2(ChattingPanelEmoticonView chattingPanelEmoticonView, EmoticonClickListener emoticonClickListener) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonDisplayListener
        public void onBindView(int i2, ViewGroup viewGroup, EmoticonsAdapter.ViewHolder viewHolder, Object obj, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.widget.kpswitch.view.ChattingPanelEmoticonView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements EmoticonClickListener {
        public final /* synthetic */ ChattingPanelEmoticonView this$0;

        public AnonymousClass3(ChattingPanelEmoticonView chattingPanelEmoticonView) {
        }

        @Override // com.sobot.chat.widget.kpswitch.widget.interfaces.EmoticonClickListener
        public void onEmoticonClick(Object obj, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotEmoticonClickListener extends BaseChattingPanelView.SobotBasePanelListener {
        void backspace();

        void inputEmoticon(EmojiconNew emojiconNew);
    }

    public ChattingPanelEmoticonView(Context context) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void emoticonSetChanged(PageSetEntity pageSetEntity) {
    }

    public EmoticonDisplayListener<Object> getEmoticonDisplayListener(EmoticonClickListener emoticonClickListener) {
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

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void playBy(int i2, int i3, PageSetEntity pageSetEntity) {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.emoticon.EmoticonsFuncView.OnEmoticonsPageViewListener
    public void playTo(int i2, PageSetEntity pageSetEntity) {
    }

    public void setAdapter() {
    }

    @Override // com.sobot.chat.widget.kpswitch.view.BaseChattingPanelView
    public void setListener(BaseChattingPanelView.SobotBasePanelListener sobotBasePanelListener) {
    }
}
