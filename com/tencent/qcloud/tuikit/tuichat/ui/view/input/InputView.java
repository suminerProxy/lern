package com.tencent.qcloud.tuikit.tuichat.ui.view.input;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit;
import com.tencent.qcloud.tuikit.tuichat.bean.ReplyPreviewBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer;
import com.tencent.qcloud.tuikit.tuichat.component.face.CustomFace;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IChatLayout;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.TIMMentionEditText;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.inputmore.InputMoreFragment;
import com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class InputView extends LinearLayout implements View.OnClickListener, TextWatcher {
    public static final int CALL_MEMBER_LIMIT = 8;
    public static final int STATE_ACTION_INPUT = 3;
    public static final int STATE_FACE_INPUT = 2;
    public static final int STATE_NONE_INPUT = -1;
    public static final int STATE_SOFT_INPUT = 0;
    public static final int STATE_VOICE_INPUT = 1;
    public static final String TAG = null;
    public Map<String, String> atUserInfoMap;
    public String displayInputString;
    public boolean isQuoteModel;
    public boolean isReplyModel;
    public boolean isShowCustomFace;
    public AppCompatActivity mActivity;
    public boolean mAudioCancel;
    public boolean mAudioInputDisable;
    public ImageView mAudioInputSwitchButton;
    public boolean mCaptureDisable;
    public ChatInfo mChatInfo;
    public ChatInputHandler mChatInputHandler;
    public IChatLayout mChatLayout;
    public int mCurrentState;
    public ImageView mEmojiInputButton;
    public boolean mEmojiInputDisable;
    public FaceFragment mFaceFragment;
    public FragmentManager mFragmentManager;
    public String mInputContent;
    public List<InputMoreActionUnit> mInputMoreActionList;
    public List<InputMoreActionUnit> mInputMoreCustomActionList;
    public InputMoreFragment mInputMoreFragment;
    public View mInputMoreLayout;
    public View mInputMoreView;
    public boolean mIsSending;
    public int mLastMsgLineCount;
    public MessageHandler mMessageHandler;
    public ImageView mMoreInputButton;
    public boolean mMoreInputDisable;
    public Object mMoreInputEvent;
    public AlertDialog mPermissionDialog;
    public Button mSendAudioButton;
    public boolean mSendEnable;
    public boolean mSendFileDisable;
    public boolean mSendPhotoDisable;
    public Button mSendTextButton;
    public OnStartActivityListener mStartActivityListener;
    public float mStartRecordY;
    public TIMMentionEditText mTextInput;
    public boolean mVideoRecordDisable;
    public ChatPresenter presenter;
    public ImageView quoteCloseBtn;
    public View quotePreviewBar;
    public TextView quoteTv;
    public ImageView replyCloseBtn;
    public View replyPreviewBar;
    public ReplyPreviewBean replyPreviewBean;
    public TextView replyTv;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnTouchListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass1(InputView inputView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends ArrayList<String> {
        public final /* synthetic */ InputView this$0;
        public final /* synthetic */ String val$id;

        public AnonymousClass10(InputView inputView, String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass11(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass12(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements PermissionHelper.PermissionCallback {
        public final /* synthetic */ InputView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$13$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback {
            public final /* synthetic */ AnonymousClass13 this$1;

            public AnonymousClass1(AnonymousClass13 anonymousClass13) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onSuccess(Object obj) {
            }
        }

        public AnonymousClass13(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
        public void onDenied() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
        public void onGranted() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements PermissionHelper.PermissionCallback {
        public final /* synthetic */ InputView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$14$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements PermissionHelper.PermissionCallback {
            public final /* synthetic */ AnonymousClass14 this$1;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$14$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02181 extends IUIKitCallback {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02181(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onSuccess(Object obj) {
                }
            }

            public AnonymousClass1(AnonymousClass14 anonymousClass14) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onDenied() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onGranted() {
            }
        }

        public AnonymousClass14(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
        public void onDenied() {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
        public void onGranted() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IUIKitCallback {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass15(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass16(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass17(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements FaceFragment.OnEmojiClickListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass18(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment.OnEmojiClickListener
        public void onCustomFaceClick(int i2, CustomFace customFace) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment.OnEmojiClickListener
        public void onEmojiClick(Emoji emoji) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment.OnEmojiClickListener
        public void onEmojiDelete() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass19(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnKeyListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass2(InputView inputView) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass20(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements Runnable {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass21(InputView inputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 extends InputMoreActionUnit {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass22(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 extends InputMoreActionUnit {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass23(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 extends InputMoreActionUnit {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass24(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 extends InputMoreActionUnit {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass25(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 implements Comparator<InputMoreActionUnit> {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass26(InputView inputView) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 extends InputMoreActionUnit.OnActionClickListener {
        public final /* synthetic */ InputView this$0;
        public final /* synthetic */ InputMoreActionUnit val$unit;

        public AnonymousClass27(InputView inputView, InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit.OnActionClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass28 extends InputMoreActionUnit.OnActionClickListener {
        public final /* synthetic */ InputView this$0;
        public final /* synthetic */ InputMoreActionUnit val$audioUnit;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$28$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements PermissionHelper.PermissionCallback {
            public final /* synthetic */ AnonymousClass28 this$1;

            public AnonymousClass1(AnonymousClass28 anonymousClass28) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onDenied() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onGranted() {
            }
        }

        public AnonymousClass28(InputView inputView, InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit.OnActionClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass29 extends InputMoreActionUnit.OnActionClickListener {
        public final /* synthetic */ InputView this$0;
        public final /* synthetic */ InputMoreActionUnit val$videoUnit;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$29$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements PermissionHelper.PermissionCallback {
            public final /* synthetic */ AnonymousClass29 this$1;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$29$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02191 implements PermissionHelper.PermissionCallback {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02191(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
                public void onDenied() {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
                public void onGranted() {
                }
            }

            public AnonymousClass1(AnonymousClass29 anonymousClass29) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onDenied() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onGranted() {
            }
        }

        public AnonymousClass29(InputView inputView, InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit.OnActionClickListener
        public void onClick() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements TextView.OnEditorActionListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass3(InputView inputView) {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnFocusChangeListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass4(InputView inputView) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnTouchListener {
        public final /* synthetic */ InputView this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements PermissionHelper.PermissionCallback {
            public final /* synthetic */ AnonymousClass5 this$1;
            public final /* synthetic */ MotionEvent val$motionEvent;

            /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$5$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02201 implements AudioPlayer.Callback {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02201(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuikit.tuichat.component.AudioPlayer.Callback
                public void onCompletion(Boolean bool) {
                }
            }

            public AnonymousClass1(AnonymousClass5 anonymousClass5, MotionEvent motionEvent) {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onDenied() {
            }

            @Override // com.tencent.qcloud.tuikit.tuichat.util.PermissionHelper.PermissionCallback
            public void onGranted() {
            }
        }

        public AnonymousClass5(InputView inputView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements TIMMentionEditText.OnMentionInputListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass6(InputView inputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.TIMMentionEditText.OnMentionInputListener
        public void onMentionCharacterInput(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass7(InputView inputView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public final /* synthetic */ InputView this$0;

        public AnonymousClass8(InputView inputView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends ArrayList<String> {
        public final /* synthetic */ InputView this$0;
        public final /* synthetic */ String val$name;

        public AnonymousClass9(InputView inputView, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ChatInputHandler {
        public static final int RECORD_CANCEL = 3;
        public static final int RECORD_FAILED = 5;
        public static final int RECORD_START = 1;
        public static final int RECORD_STOP = 2;
        public static final int RECORD_TOO_SHORT = 4;

        void onInputAreaClick();

        void onRecordStatusChanged(int i2);

        void onUserTyping(boolean z, long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface MessageHandler {
        void scrollToEnd();

        void sendMessage(TUIMessageBean tUIMessageBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnStartActivityListener {
        void onStartGroupMemberSelectActivity();
    }

    public InputView(Context context) {
    }

    public void addAction(InputMoreActionUnit inputMoreActionUnit) {
    }

    public void addActionsFromListeners() {
    }

    public void addInputText(String str, String str2) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    public void appendText(String str) {
    }

    public void assembleActions() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public TUIMessageBean buildVideoMessage(String str) {
    }

    public void clearCustomActionList() {
    }

    public void disableAudioInput(boolean z) {
    }

    public void disableCaptureAction(boolean z) {
    }

    public void disableEmojiInput(boolean z) {
    }

    public void disableMoreInput(boolean z) {
    }

    public void disableSendFileAction(boolean z) {
    }

    public void disableSendPhotoAction(boolean z) {
    }

    public void disableShowCustomFace(boolean z) {
    }

    public void disableVideoRecordAction(boolean z) {
    }

    public void exitReply() {
    }

    public ChatInfo getChatInfo() {
    }

    public Map<String, String> getDisplayAtNameMap(List<String> list, List<String> list2) {
    }

    public EditText getInputText() {
    }

    public int getNavigateBarHeight() {
    }

    public void hideInputMoreLayout() {
    }

    public void hideSoftInput() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void init() {
    }

    public void initViews() {
    }

    public boolean isSoftInputShown() {
    }

    public void onClick(View view) {
    }

    public void onCustomActionClick(int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public void onEmptyClick() {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void recordComplete(boolean z) {
    }

    public void replaceMoreInput(BaseInputFragment baseInputFragment) {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    public void setChatInputHandler(ChatInputHandler chatInputHandler) {
    }

    public void setChatLayout(IChatLayout iChatLayout) {
    }

    public void setDraft() {
    }

    public void setMessageHandler(MessageHandler messageHandler) {
    }

    public void setOpenPhotoCallback() {
    }

    public void setPresenter(ChatPresenter chatPresenter) {
    }

    public void setStartActivityListener(OnStartActivityListener onStartActivityListener) {
    }

    public void showCustomInputMoreFragment() {
    }

    public void showEmojiInputButton(int i2) {
    }

    public void showFaceViewGroup() {
    }

    public void showInputMoreLayout() {
    }

    public void showMoreInputButton(int i2) {
    }

    public void showReplyPreview(ReplyPreviewBean replyPreviewBean) {
    }

    public void showSendTextButton(int i2) {
    }

    public void showSoftInput() {
    }

    public void startCapture() {
    }

    public void startSendFile() {
    }

    public void startSendPhoto() {
    }

    public void startVideoRecord() {
    }

    public void updateAtUserInfoMap(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
    }

    public void updateInputText(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
    }

    public void replaceMoreInput(View.OnClickListener onClickListener) {
    }

    public InputView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public InputView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
