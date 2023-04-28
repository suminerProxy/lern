package com.tencent.qcloud.tuikit.tuigroup.component;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BottomSelectSheet {
    private Dialog dialog;
    private ArrayAdapter<String> listAdapter;
    private BottomSelectSheetOnClickListener onClickListener;
    private List<String> selectList;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ BottomSelectSheet this$0;

        public AnonymousClass1(BottomSelectSheet bottomSelectSheet) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.component.BottomSelectSheet$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ BottomSelectSheet this$0;

        public AnonymousClass2(BottomSelectSheet bottomSelectSheet) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface BottomSelectSheetOnClickListener {
        void onSheetClick(int i2);
    }

    public BottomSelectSheet(Context context) {
    }

    public static /* synthetic */ BottomSelectSheetOnClickListener access$000(BottomSelectSheet bottomSelectSheet) {
    }

    public void dismiss() {
    }

    public void setOnClickListener(BottomSelectSheetOnClickListener bottomSelectSheetOnClickListener) {
    }

    public void setSelectList(List<String> list) {
    }

    public void show() {
    }
}
