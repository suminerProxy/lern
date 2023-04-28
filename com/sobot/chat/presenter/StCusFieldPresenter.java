package com.sobot.chat.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sobot.chat.api.model.SobotCusFieldConfig;
import com.sobot.chat.api.model.SobotFieldModel;
import com.sobot.chat.api.model.SobotProvinInfo;
import com.sobot.chat.listener.ISobotCusField;
import com.sobot.chat.notchlib.INotchScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StCusFieldPresenter {

    /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements INotchScreen.NotchScreenCallback {
        public final /* synthetic */ View val$view;

        public AnonymousClass1(View view) {
        }

        @Override // com.sobot.chat.notchlib.INotchScreen.NotchScreenCallback
        public void onResult(INotchScreen.NotchScreenInfo notchScreenInfo) {
        }
    }

    /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass2 implements View.OnFocusChangeListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ TextView val$editHintLabel2;
        public final /* synthetic */ TextView val$fieldMoreName;
        public final /* synthetic */ EditText val$moreContent;

        public AnonymousClass2(EditText editText, TextView textView, Context context, TextView textView2) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass3 implements TextWatcher {
        private CharSequence temp;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ SobotCusFieldConfig val$cusFieldConfig;

        public AnonymousClass3(SobotCusFieldConfig sobotCusFieldConfig, Context context) {
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
    }

    /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass4 implements TextWatcher {
        public final /* synthetic */ EditText val$numberContent;

        public AnonymousClass4(EditText editText) {
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
    }

    /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ SobotCusFieldConfig val$cusFieldConfig;
        public final /* synthetic */ ISobotCusField val$cusFieldInterface;
        public final /* synthetic */ TextView val$editHintLabel1;
        public final /* synthetic */ TextView val$editHintLabel2;
        public final /* synthetic */ TextView val$fieldName;
        public final /* synthetic */ SobotFieldModel val$model;
        public final /* synthetic */ EditText val$moreContent;
        public final /* synthetic */ LinearLayout val$work_order_customer_field_ll;

        /* renamed from: com.sobot.chat.presenter.StCusFieldPresenter$5$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements View.OnFocusChangeListener {
            public final /* synthetic */ AnonymousClass5 this$0;
            public final /* synthetic */ EditText val$et;

            public AnonymousClass1(AnonymousClass5 anonymousClass5, EditText editText) {
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
            }
        }

        public AnonymousClass5(SobotCusFieldConfig sobotCusFieldConfig, TextView textView, EditText editText, LinearLayout linearLayout, TextView textView2, Context context, TextView textView3, ISobotCusField iSobotCusField, SobotFieldModel sobotFieldModel) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static void addWorkOrderCusFields(Activity activity, Context context, ArrayList<SobotFieldModel> arrayList, ViewGroup viewGroup, ISobotCusField iSobotCusField) {
    }

    public static void displayInNotch(Activity activity, View view) {
    }

    public static String formatCusFieldVal(Context context, ViewGroup viewGroup, List<SobotFieldModel> list) {
    }

    public static String getCusFieldVal(ArrayList<SobotFieldModel> arrayList, SobotProvinInfo.SobotProvinceModel sobotProvinceModel) {
    }

    public static Map getSaveFieldNameAndVal(ArrayList<SobotFieldModel> arrayList) {
    }

    public static String getSaveFieldVal(ArrayList<SobotFieldModel> arrayList) {
    }

    public static void onStCusFieldActivityResult(Context context, Intent intent, ArrayList<SobotFieldModel> arrayList, ViewGroup viewGroup) {
    }

    public static void openTimePicker(Activity activity, View view, int i2) {
    }

    public static void startChooseCityAct(Activity activity, SobotProvinInfo sobotProvinInfo, SobotFieldModel sobotFieldModel) {
    }

    public static void startSobotCusFieldActivity(Activity activity, SobotFieldModel sobotFieldModel) {
    }

    public static void startSobotCusFieldActivity(Activity activity, Fragment fragment, SobotFieldModel sobotFieldModel) {
    }
}
