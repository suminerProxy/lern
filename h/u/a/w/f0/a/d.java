package h.u.a.w.f0.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.model.FindVideoHotCommBean;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.view.LoadImageView;
import h.a.a.a.a.i.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter;

/* compiled from: ListVideoDMAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/widget/videoNew/listDm/ListVideoDMAdapter;", "Ltencent/txlive/zhibo/audience/BaseLiveRecycleAdapter;", "Lcom/showstartfans/activity/model/FindVideoHotCommBean;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dealOnScroll", "", "getItemCount", "", "onBindViewHolder", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", g.C, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class d extends BaseLiveRecycleAdapter<FindVideoHotCommBean> {

    /* compiled from: ListVideoDMAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/widget/videoNew/listDm/ListVideoDMAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "logo", "Lcom/taihebase/activity/view/LoadImageView;", "getLogo", "()Lcom/taihebase/activity/view/LoadImageView;", Oauth2AccessToken.KEY_SCREEN_NAME, "Landroid/widget/TextView;", "getUserName", "()Landroid/widget/TextView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final TextView f25336a;
        @NotNull
        private final LoadImageView b;

        public a(@NotNull View view) {
        }

        @NotNull
        public final LoadImageView c() {
        }

        @NotNull
        public final TextView getUserName() {
        }
    }

    public d(@NotNull Context context) {
    }

    private final void dealOnScroll() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // tencent.txlive.zhibo.audience.BaseLiveRecycleAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
    }
}
