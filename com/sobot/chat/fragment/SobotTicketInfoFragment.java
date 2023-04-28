package com.sobot.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.sobot.chat.adapter.SobotTicketInfoAdapter;
import com.sobot.chat.api.model.SobotUserTicketInfo;
import com.sobot.network.http.callback.StringResultCallBack;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotTicketInfoFragment extends SobotBaseFragment {
    private static final int REQUEST_CODE = 1;
    private SobotTicketInfoAdapter mAdapter;
    private String mCompanyId;
    private String mCustomerId;
    private TextView mEmptyView;
    private List<SobotUserTicketInfo> mList;
    private ListView mListView;
    private View mRootView;
    private String mUid;

    /* renamed from: com.sobot.chat.fragment.SobotTicketInfoFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SobotTicketInfoFragment this$0;

        public AnonymousClass1(SobotTicketInfoFragment sobotTicketInfoFragment) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.sobot.chat.fragment.SobotTicketInfoFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StringResultCallBack<List<SobotUserTicketInfo>> {
        public final /* synthetic */ SobotTicketInfoFragment this$0;

        public AnonymousClass2(SobotTicketInfoFragment sobotTicketInfoFragment) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public void onFailure(Exception exc, String str) {
        }

        @Override // com.sobot.network.http.callback.StringResultCallBack
        public /* bridge */ /* synthetic */ void onSuccess(List<SobotUserTicketInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SobotUserTicketInfo> list) {
        }
    }

    public static /* synthetic */ SobotTicketInfoAdapter access$000(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static /* synthetic */ SobotTicketInfoAdapter access$002(SobotTicketInfoFragment sobotTicketInfoFragment, SobotTicketInfoAdapter sobotTicketInfoAdapter) {
    }

    public static /* synthetic */ String access$100(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static /* synthetic */ String access$200(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static /* synthetic */ ListView access$300(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static /* synthetic */ TextView access$400(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static /* synthetic */ List access$500(SobotTicketInfoFragment sobotTicketInfoFragment) {
    }

    public static SobotTicketInfoFragment newInstance(Bundle bundle) {
    }

    public void initData() {
    }

    public void initView(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.sobot.chat.fragment.SobotBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }
}
