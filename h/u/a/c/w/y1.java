package h.u.a.c.w;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapController;
import com.showstartfans.activity.activitys.article.SelectPhotoActivity;
import com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity;
import com.showstartfans.activity.view.SelectPhotoItem;
import com.taihe.photoselector.model.PhotoModel;
import com.tencent.qcloud.tuicore.component.activities.ImageSelectActivity;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectPhotoAdapter.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000545678B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ,\u0010\u0016\u001a\u00020\u00172\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002`\u000fH\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002`\u000fJ\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0016J,\u0010 \u001a\u00020\u00172\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002`\u000fH\u0002J\b\u0010!\u001a\u00020\u0017H\u0014J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016J:\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u0006H\u0016J*\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0014J\u001a\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\bH\u0014J\u000e\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\bJ\u000e\u00103\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/taihe/photoselector/model/PhotoModel;", "context", "Landroid/content/Context;", "alreadyDatas", "", "maxCount", "", "mBuilder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "(Landroid/content/Context;Ljava/util/List;ILcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;)V", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "ignoreType", ImageSelectActivity.ITEM_WIDTH, "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onCheckChangeListener", "Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$OnCheckChangeListener;", "OnBrowingActivityClickNext", "", "checkHolder", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "real_position", "clearCheckMap", "getCheckMap", "getItemViewType", h.a.a.a.a.i.g.C, "initData", "notifyShowItems", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolderPayLoads", "viewHolder", "itemType", "original_position", "payloads", "", "onBindViewHolder_impl", "mHolder", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "setIgnoreType", "type", "setOnCheckChangeListener", "Companion", "OnCheckChangeListener", "ViewHolder", "ViewTakeHolder", "onBrowingCheckMapChangeListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class y1 extends h.y.a.f.m<PhotoModel> {
    @NotNull
    public static final a u = null;
    public static final int v = 100;

    /* renamed from: n  reason: collision with root package name */
    private int f20027n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private final LinkedHashMap<String, PhotoModel> f20028o;

    /* renamed from: p  reason: collision with root package name */
    private int f20029p;
    @Nullable
    private RecyclerView.LayoutManager q;
    private int r;
    @Nullable
    private b s;
    @Nullable
    private SelectPhotoActivity.a t;

    /* compiled from: SelectPhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$Companion;", "", "()V", "TYPE_TAKE", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SelectPhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH&¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$OnCheckChangeListener;", "", "OnCheckChange", "", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface b {
        void a(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap);
    }

    /* compiled from: SelectPhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;Landroid/view/View;)V", MapController.ITEM_LAYER_TAG, "Lcom/showstartfans/activity/view/SelectPhotoItem;", "kotlin.jvm.PlatformType", "getItem", "()Lcom/showstartfans/activity/view/SelectPhotoItem;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SelectPhotoItem f20030a;
        public final /* synthetic */ y1 b;

        public c(@NotNull y1 y1Var, View view) {
        }

        public final SelectPhotoItem c() {
        }
    }

    /* compiled from: SelectPhotoAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$ViewTakeHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;Landroid/view/View;)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y1 f20031a;

        public d(@NotNull y1 y1Var, View view) {
        }
    }

    /* compiled from: SelectPhotoAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0016J,\u0010\n\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$onBrowingCheckMapChangeListener;", "Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnCheckDataChangeListener;", "(Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;)V", "OnCheckMapChange", "", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "OnClickNext", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class e implements PhotoVideoBrowingActivity.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y1 f20032a;

        public e(y1 y1Var) {
        }

        @Override // com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity.b
        public void a(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
        }

        @Override // com.showstartfans.activity.activitys.photo.PhotoVideoBrowingActivity.b
        public void b(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
        }
    }

    public /* synthetic */ y1(Context context, List list, int i2, SelectPhotoActivity.a aVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static final /* synthetic */ LinkedHashMap R(y1 y1Var) {
    }

    public static final /* synthetic */ Context S(y1 y1Var) {
    }

    public static final /* synthetic */ b T(y1 y1Var) {
    }

    public static final /* synthetic */ void U(y1 y1Var, LinkedHashMap linkedHashMap) {
    }

    private final void V(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    private final void Y(LinkedHashMap<String, PhotoModel> linkedHashMap) {
    }

    public static /* synthetic */ void Z(y1 y1Var, View view) {
    }

    public static /* synthetic */ void a0(PhotoModel photoModel, y1 y1Var, View view) {
    }

    public static /* synthetic */ void b0(RecyclerView.ViewHolder viewHolder, PhotoModel photoModel, y1 y1Var, View view) {
    }

    private static final void d0(y1 y1Var, View view) {
    }

    private static final void e0(PhotoModel photoModel, y1 y1Var, View view) {
    }

    private static final void f0(RecyclerView.ViewHolder viewHolder, PhotoModel photoModel, y1 y1Var, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public void Q(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
    }

    public final void W() {
    }

    @NotNull
    public final LinkedHashMap<String, PhotoModel> X() {
    }

    public void c0() {
    }

    public final void g0(int i2) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
    }

    public final void setOnCheckChangeListener(@NotNull b bVar) {
    }

    @Override // h.y.a.f.m
    public void y(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, @NotNull List<? extends Object> list) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    public y1(@NotNull Context context, @Nullable List<? extends PhotoModel> list, int i2, @Nullable SelectPhotoActivity.a aVar) {
    }
}
