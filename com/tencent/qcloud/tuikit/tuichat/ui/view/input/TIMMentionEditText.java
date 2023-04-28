package com.tencent.qcloud.tuikit.tuichat.ui.view.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TIMMentionEditText extends EditText {
    public static final String TIM_MENTION_TAG = "@";
    public static final String TIM_MENTION_TAG_FULL = "＠";
    private boolean mIsSelected;
    private Range mLastSelectedRange;
    private OnMentionInputListener mOnMentionInputListener;
    private List<Range> mRangeArrayList;
    private Map<String, String> mentionList;
    private List<String> mentionTagList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class HackInputConnection extends InputConnectionWrapper {
        private EditText editText;
        public final /* synthetic */ TIMMentionEditText this$0;

        public HackInputConnection(TIMMentionEditText tIMMentionEditText, InputConnection inputConnection, boolean z, TIMMentionEditText tIMMentionEditText2) {
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i2, int i3) {
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class MentionTextWatcher implements TextWatcher {
        public final /* synthetic */ TIMMentionEditText this$0;

        private MentionTextWatcher(TIMMentionEditText tIMMentionEditText) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public /* synthetic */ MentionTextWatcher(TIMMentionEditText tIMMentionEditText, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnMentionInputListener {
        void onMentionCharacterInput(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class Range {
        public int from;
        public final /* synthetic */ TIMMentionEditText this$0;
        public int to;

        public Range(TIMMentionEditText tIMMentionEditText, int i2, int i3) {
        }

        public boolean contains(int i2, int i3) {
        }

        public int getAnchorPosition(int i2) {
        }

        public boolean isEqual(int i2, int i3) {
        }

        public boolean isWrappedBy(int i2, int i3) {
        }
    }

    public TIMMentionEditText(Context context) {
    }

    public static /* synthetic */ List access$100(TIMMentionEditText tIMMentionEditText) {
    }

    public static /* synthetic */ OnMentionInputListener access$200(TIMMentionEditText tIMMentionEditText) {
    }

    public static /* synthetic */ Range access$300(TIMMentionEditText tIMMentionEditText, int i2, int i3) {
    }

    public static /* synthetic */ boolean access$400(TIMMentionEditText tIMMentionEditText) {
    }

    public static /* synthetic */ boolean access$402(TIMMentionEditText tIMMentionEditText, boolean z) {
    }

    public static /* synthetic */ Range access$502(TIMMentionEditText tIMMentionEditText, Range range) {
    }

    private Range getRangeOfClosestMentionString(int i2, int i3) {
    }

    private Range getRangeOfNearbyMentionString(int i2, int i3) {
    }

    private void init() {
    }

    private void setMentionStringRange() {
    }

    private void updateMentionList() {
    }

    public List<String> getMentionIdList() {
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i2, int i3) {
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void setMentionMap(Map<String, String> map) {
    }

    public void setOnMentionInputListener(OnMentionInputListener onMentionInputListener) {
    }

    public TIMMentionEditText(Context context, AttributeSet attributeSet) {
    }

    public TIMMentionEditText(Context context, AttributeSet attributeSet, int i2) {
    }
}
