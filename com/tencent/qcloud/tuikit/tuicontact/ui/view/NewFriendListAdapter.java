package com.tencent.qcloud.tuikit.tuicontact.ui.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NewFriendListAdapter extends ArrayAdapter<FriendApplicationBean> {
    private static final String TAG = null;
    private int mResourceId;
    private View mView;
    private ViewHolder mViewHolder;
    private NewFriendPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ NewFriendListAdapter this$0;
        public final /* synthetic */ FriendApplicationBean val$data;

        public AnonymousClass1(NewFriendListAdapter newFriendListAdapter, FriendApplicationBean friendApplicationBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ NewFriendListAdapter this$0;
        public final /* synthetic */ FriendApplicationBean val$data;

        public AnonymousClass2(NewFriendListAdapter newFriendListAdapter, FriendApplicationBean friendApplicationBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ NewFriendListAdapter this$0;
        public final /* synthetic */ FriendApplicationBean val$data;

        public AnonymousClass3(NewFriendListAdapter newFriendListAdapter, FriendApplicationBean friendApplicationBean) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Void> {
        public final /* synthetic */ NewFriendListAdapter this$0;
        public final /* synthetic */ FriendApplicationBean val$bean;

        public AnonymousClass4(NewFriendListAdapter newFriendListAdapter, FriendApplicationBean friendApplicationBean) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.NewFriendListAdapter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Void> {
        public final /* synthetic */ NewFriendListAdapter this$0;

        public AnonymousClass5(NewFriendListAdapter newFriendListAdapter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ViewHolder {
        public TextView agree;
        public ImageView avatar;
        public TextView des;
        public TextView name;
        public TextView reject;
        public TextView result;
        public final /* synthetic */ NewFriendListAdapter this$0;

        public ViewHolder(NewFriendListAdapter newFriendListAdapter) {
        }
    }

    public NewFriendListAdapter(Context context, int i2, List<FriendApplicationBean> list) {
    }

    public static /* synthetic */ void access$000(NewFriendListAdapter newFriendListAdapter, FriendApplicationBean friendApplicationBean, boolean z) {
    }

    public static /* synthetic */ void access$100(NewFriendListAdapter newFriendListAdapter) {
    }

    private void doResponse(FriendApplicationBean friendApplicationBean, boolean z) {
    }

    private void refreshList() {
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    public void setPresenter(NewFriendPresenter newFriendPresenter) {
    }
}
