package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShareActionProvider extends ActionProvider {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
    public OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    public String mShareHistoryFileName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
        public final /* synthetic */ ShareActionProvider this$0;

        public ShareActivityChooserModelPolicy(ShareActionProvider shareActionProvider) {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public final /* synthetic */ ShareActionProvider this$0;

        public ShareMenuItemOnMenuItemClickListener(ShareActionProvider shareActionProvider) {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public ShareActionProvider(Context context) {
    }

    private void setActivityChooserPolicyIfNeeded() {
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
    }

    public void setShareHistoryFileName(String str) {
    }

    public void setShareIntent(Intent intent) {
    }

    public void updateIntent(Intent intent) {
    }
}
