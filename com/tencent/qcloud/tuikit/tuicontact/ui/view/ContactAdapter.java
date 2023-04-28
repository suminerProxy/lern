package com.tencent.qcloud.tuikit.tuicontact.ui.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContactAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<String> alreadySelectedList;
    private int dataSourceType;
    private boolean isGroupList;
    private boolean isSingleSelectMode;
    public List<ContactItemBean> mData;
    private ContactListView.OnItemClickListener mOnClickListener;
    private ContactListView.OnSelectChangedListener mOnSelectChangedListener;
    private int mPreSelectedPosition;
    private ContactPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ContactAdapter this$0;
        public final /* synthetic */ ContactItemBean val$contactBean;
        public final /* synthetic */ ViewHolder val$holder;
        public final /* synthetic */ int val$position;

        public AnonymousClass1(ContactAdapter contactAdapter, ContactItemBean contactItemBean, ViewHolder viewHolder, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Integer> {
        public final /* synthetic */ ContactAdapter this$0;
        public final /* synthetic */ ViewHolder val$holder;

        public AnonymousClass2(ContactAdapter contactAdapter, ViewHolder viewHolder) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Integer num) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView avatar;
        public CheckBox ccSelect;
        public View content;
        public View line;
        public TextView tvName;
        public TextView unreadText;
        public View userStatusView;

        public ViewHolder(View view) {
        }
    }

    public ContactAdapter(List<ContactItemBean> list) {
    }

    public static /* synthetic */ ContactListView.OnSelectChangedListener access$000(ContactAdapter contactAdapter) {
    }

    public static /* synthetic */ ContactItemBean access$100(ContactAdapter contactAdapter, int i2) {
    }

    public static /* synthetic */ ContactListView.OnItemClickListener access$200(ContactAdapter contactAdapter) {
    }

    public static /* synthetic */ boolean access$300(ContactAdapter contactAdapter) {
    }

    public static /* synthetic */ int access$400(ContactAdapter contactAdapter) {
    }

    public static /* synthetic */ int access$402(ContactAdapter contactAdapter, int i2) {
    }

    private ContactItemBean getItem(int i2) {
    }

    private void setAlreadySelected(ViewHolder viewHolder, ContactItemBean contactItemBean) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setDataSource(List<ContactItemBean> list) {
    }

    public void setDataSourceType(int i2) {
    }

    public void setIsGroupList(boolean z) {
    }

    public void setOnItemClickListener(ContactListView.OnItemClickListener onItemClickListener) {
    }

    public void setOnSelectChangedListener(ContactListView.OnSelectChangedListener onSelectChangedListener) {
    }

    public void setPresenter(ContactPresenter contactPresenter) {
    }

    public void setSingleSelectMode(boolean z) {
    }

    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i2) {
    }

    /* renamed from: onViewRecycled  reason: avoid collision after fix types in other method */
    public void onViewRecycled2(ViewHolder viewHolder) {
    }
}
