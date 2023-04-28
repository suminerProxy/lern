package com.sobot.chat.widget;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.sobot.chat.adapter.base.SobotBaseAdapter;
import com.sobot.chat.api.model.SobotRobotGuess;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ContainsEmojiEditText extends EditText implements View.OnFocusChangeListener {
    private static final String LAYOUT_AUTOCOMPELTE_ITEM = "sobot_item_auto_complete_menu";
    private static final String LAYOUT_CONTENT_VIEW_LAYOUT_RES_NAME = "sobot_layout_auto_complete";
    private static final int MAX_AUTO_COMPLETE_NUM = 3;
    private static final String SOBOT_AUTO_COMPLETE_REQUEST_CANCEL_TAG = "SOBOT_AUTO_COMPLETE_REQUEST_CANCEL_TAG";
    public SobotAutoCompleteListener autoCompleteListener;
    public Handler handler;
    public SobotAutoCompelteAdapter mAdapter;
    public View mContentView;
    public boolean mIsAutoComplete;
    public SobotCustomPopWindow mPopWindow;
    public String mRobotFlag;
    public String mUid;
    public MyEmojiWatcher myEmojiWatcher;
    public MyWatcher myWatcher;

    /* renamed from: com.sobot.chat.widget.ContainsEmojiEditText$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements TextView.OnEditorActionListener {
        public final /* synthetic */ ContainsEmojiEditText this$0;

        public AnonymousClass1(ContainsEmojiEditText containsEmojiEditText) {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.ContainsEmojiEditText$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<SobotRobotGuess> {
        public final /* synthetic */ ContainsEmojiEditText this$0;

        public AnonymousClass2(ContainsEmojiEditText containsEmojiEditText) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(SobotRobotGuess sobotRobotGuess) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(SobotRobotGuess sobotRobotGuess) {
        }
    }

    /* renamed from: com.sobot.chat.widget.ContainsEmojiEditText$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ContainsEmojiEditText this$0;
        public final /* synthetic */ View val$anchorView;
        public final /* synthetic */ LinearLayout.LayoutParams val$params;

        public AnonymousClass3(ContainsEmojiEditText containsEmojiEditText, View view, LinearLayout.LayoutParams layoutParams) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.widget.ContainsEmojiEditText$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ ContainsEmojiEditText this$0;
        public final /* synthetic */ ListView val$listView;

        public AnonymousClass4(ContainsEmojiEditText containsEmojiEditText, ListView listView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyEmojiWatcher implements TextWatcher {
        public final /* synthetic */ ContainsEmojiEditText this$0;

        private MyEmojiWatcher(ContainsEmojiEditText containsEmojiEditText) {
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

        public /* synthetic */ MyEmojiWatcher(ContainsEmojiEditText containsEmojiEditText, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class MyWatcher implements TextWatcher {
        public final /* synthetic */ ContainsEmojiEditText this$0;

        private MyWatcher(ContainsEmojiEditText containsEmojiEditText) {
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

        public /* synthetic */ MyWatcher(ContainsEmojiEditText containsEmojiEditText, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class SobotAutoCompelteAdapter extends SobotBaseAdapter<SobotRobotGuess.RespInfoListBean> {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static class ViewHolder {
            private TextView sobot_child_menu;

            public /* synthetic */ ViewHolder(Context context, View view, AnonymousClass1 anonymousClass1) {
            }

            public static /* synthetic */ TextView access$500(ViewHolder viewHolder) {
            }

            private ViewHolder(Context context, View view) {
            }
        }

        public /* synthetic */ SobotAutoCompelteAdapter(Context context, List list, AnonymousClass1 anonymousClass1) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }

        private SobotAutoCompelteAdapter(Context context, List<SobotRobotGuess.RespInfoListBean> list) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface SobotAutoCompleteListener {
        void onRobotGuessComplete(String str);
    }

    public ContainsEmojiEditText(Context context) {
    }

    public static /* synthetic */ void access$200(ContainsEmojiEditText containsEmojiEditText, View view, List list) {
    }

    private View getContentView() {
    }

    private ListView handleListView(View view, List<SobotRobotGuess.RespInfoListBean> list) {
    }

    private void initEditText() {
    }

    private void measureListViewHeight(ListView listView) {
    }

    private void notifyAdapter(ListView listView, List<SobotRobotGuess.RespInfoListBean> list) {
    }

    private void showPop(View view, List<SobotRobotGuess.RespInfoListBean> list) {
    }

    public void dismissPop() {
    }

    public void doAfterTextChanged(String str) {
    }

    public int getResId(String str) {
    }

    public boolean isShowing() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    public void setAutoCompleteEnable(boolean z) {
    }

    public void setRequestParams(String str, String str2) {
    }

    public void setSobotAutoCompleteListener(SobotAutoCompleteListener sobotAutoCompleteListener) {
    }

    public ContainsEmojiEditText(Context context, AttributeSet attributeSet) {
    }

    public ContainsEmojiEditText(Context context, AttributeSet attributeSet, int i2) {
    }
}
