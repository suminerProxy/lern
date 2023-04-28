package com.tencent.qcloud.tuikit.tuicontact.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactLayout;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContactLayout extends LinearLayout implements IContactLayout {
    private static final String TAG = null;
    private ContactListView mContactListView;
    private ContactPresenter presenter;

    public ContactLayout(Context context) {
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactLayout
    public ContactListView getContactListView() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public TitleBarLayout getTitleBar() {
    }

    public void initDefault() {
    }

    @Override // com.tencent.qcloud.tuicore.component.interfaces.ILayout
    public void setParentLayout(Object obj) {
    }

    public void setPresenter(ContactPresenter contactPresenter) {
    }

    public ContactLayout(Context context, @Nullable AttributeSet attributeSet) {
    }

    public ContactLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
