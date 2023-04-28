package cn.sharesdk.onekeyshare.themes.classic;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.gui.PullToRequestListAdapter;
import com.mob.tools.gui.PullToRequestView;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FriendAdapter extends PullToRequestListAdapter implements PlatformActionListener {
    private FriendListPage activity;
    private int curPage;
    private ArrayList<Following> follows;
    private boolean hasNext;
    private PRTHeader llHeader;
    private HashMap<String, Boolean> map;
    private final int pageCount;
    private Platform platform;
    private float ratio;

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.FriendAdapter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ FriendAdapter this$0;

        public AnonymousClass1(FriendAdapter friendAdapter) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.FriendAdapter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Handler.Callback {
        public final /* synthetic */ FriendAdapter this$0;
        public final /* synthetic */ FollowersResult val$followersResult;

        public AnonymousClass2(FriendAdapter friendAdapter, FollowersResult followersResult) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.themes.classic.FriendAdapter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Handler.Callback {
        public final /* synthetic */ FriendAdapter this$0;

        public AnonymousClass3(FriendAdapter friendAdapter) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Following {
        public String atName;
        public boolean checked;
        public String description;
        public String icon;
        public String screenName;
        public String uid;
    }

    public FriendAdapter(FriendListPage friendListPage, PullToRequestView pullToRequestView) {
    }

    public static /* synthetic */ int access$000(FriendAdapter friendAdapter) {
    }

    public static /* synthetic */ ArrayList access$100(FriendAdapter friendAdapter) {
    }

    public static /* synthetic */ FriendListPage access$300(FriendAdapter friendAdapter) {
    }

    private void next() {
    }

    private FollowersResult parseFollowers(String str, HashMap<String, Object> hashMap, HashMap<String, Boolean> hashMap2) {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public int getCount() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public View getFooterView() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public View getHeaderView() {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public /* bridge */ /* synthetic */ Object getItem(int i2) {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public long getItemId(int i2) {
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i2) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i2, HashMap<String, Object> hashMap) {
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i2, Throwable th) {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onPullDown(int i2) {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onRefresh() {
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onReversed() {
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    public void setPlatform(Platform platform) {
    }

    public void setRatio(float f2) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FollowersResult {
        public boolean hasNextPage;
        public ArrayList<Following> list;

        private FollowersResult() {
        }

        public /* synthetic */ FollowersResult(AnonymousClass1 anonymousClass1) {
        }
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public Following getItem(int i2) {
    }
}
