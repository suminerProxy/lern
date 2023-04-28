package h.y.a.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.baidu.platform.comapi.map.MapController;
import com.umeng.analytics.pro.am;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewBaseRecycleAdapter.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0004~\u007f\u0080\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0015\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010=J\u001d\u0010:\u001a\u00020;2\u0006\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020;2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010CH\u0016J\u0016\u0010D\u001a\u00020;2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010CJ\u0010\u0010E\u001a\u00020;2\b\u0010F\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010G\u001a\u00020;2\b\u0010F\u001a\u0004\u0018\u00010\u000bJ\b\u0010H\u001a\u00020;H\u0002J\u0006\u0010I\u001a\u00020\u0014J\u0006\u0010J\u001a\u00020\u0014J\u0006\u0010K\u001a\u00020\u0014J\b\u0010L\u001a\u00020\u0014H\u0016J\u0015\u0010M\u001a\u0004\u0018\u00018\u00002\u0006\u0010>\u001a\u00020\u0014¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014H\u0016J\u0006\u0010P\u001a\u00020\u0014J\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bJ\u0006\u0010R\u001a\u00020\u0014J\u000e\u0010S\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014J\u001b\u0010T\u001a\u00020;2\u0006\u0010>\u001a\u00020\u00142\u0006\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010@J\u0010\u0010V\u001a\u00020;2\u0006\u0010W\u001a\u00020+H\u0016J\u0018\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0014H\u0016J&\u0010X\u001a\u00020;2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00142\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\bH\u0016J:\u0010]\u001a\u00020;2\b\u0010^\u001a\u0004\u0018\u00010\u00032\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u00142\u000e\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0CH\u0016J*\u0010b\u001a\u00020;2\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014H$J*\u0010c\u001a\u00020;2\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014H\u0004J*\u0010d\u001a\u00020;2\b\u0010Y\u001a\u0004\u0018\u00010\u00032\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014H\u0004J\u0018\u0010e\u001a\u00020\u00032\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0014H\u0016J\u001a\u0010i\u001a\u00020\u00032\b\u0010j\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020\u0014H$J\u0010\u0010k\u001a\u00020;2\u0006\u0010Z\u001a\u00020\u0003H\u0016J\u0010\u0010l\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014H\u0016J\b\u0010m\u001a\u00020;H\u0016J\u0006\u0010n\u001a\u00020;J\u0006\u0010o\u001a\u00020;J\u0010\u0010p\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014H\u0016J\u001e\u0010q\u001a\u00020;2\u0006\u0010>\u001a\u00020\u00142\u0006\u0010U\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010@J\u0016\u0010r\u001a\u00020;2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010CJ\u0016\u0010s\u001a\u00020;2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000101J\u0010\u0010u\u001a\u00020;2\b\u00102\u001a\u0004\u0018\u000103J\u001a\u0010v\u001a\u00020;2\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010zH\u0004J\"\u0010{\u001a\u00020;2\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010|\u001a\u0002052\b\b\u0002\u0010}\u001a\u000205H\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u0014X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0014X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u0005X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0006R\u001a\u0010\u001f\u001a\u00020 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006\u0081\u0001"}, d2 = {"Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "list", "", "(Landroid/content/Context;Ljava/util/List;)V", "FooterView", "Landroid/view/View;", "getFooterView", "()Landroid/view/View;", "setFooterView", "(Landroid/view/View;)V", "HeaderView", "getHeaderView", "setHeaderView", "ITEM_TYPE_FOOTER", "", "getITEM_TYPE_FOOTER", "()I", "ITEM_TYPE_HEADER", "getITEM_TYPE_HEADER", "ITEM_TYPE_NORMAL", "getITEM_TYPE_NORMAL", "ctx", "getCtx", "()Landroid/content/Context;", "setCtx", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "setInflater", "(Landroid/view/LayoutInflater;)V", "mList", "getMList", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onAddDataIntercept", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnAddDataIntercept;", "onItemClickListener", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "useHaveAnimationRefresh", "", "getUseHaveAnimationRefresh", "()Z", "setUseHaveAnimationRefresh", "(Z)V", "add", "", am.aI, "(Ljava/lang/Object;)V", h.a.a.a.a.i.g.C, MapController.ITEM_LAYER_TAG, "(ILjava/lang/Object;)V", "addAll", "newData", "", "addAll_Range", "addFooterView", "view", "addHeaderView", "checkList", "getFirstVisibleItemPosition", "getFooterCount", "getHeaderCount", "getItemCount", "getItemData", "(I)Ljava/lang/Object;", "getItemViewType", "getLastVisiblePosition", "getList", "getRealItemCount", "getRealItemPosition", "insert", "data", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "mholder", "holder", "payloads", "", "onBindViewHolderPayLoads", "viewHolder", "itemType", "original_position", "real_position", "onBindViewHolder_impl", "onBindViewHolder_impl_footer", "onBindViewHolder_impl_header", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "onCreateViewHolder_impl", "parent", "onViewDetachedFromWindow", "remove", "removeAll", "removeFooterView", "removeHeaderView", "removeItem", "set", "setList", "setOnAddDataIntercept", "intercept", "setOnItemClickListener", "setText", "textView", "Landroid/widget/TextView;", "text", "", "setViewVisible", "isVisible", "usInvisble", "OnAddDataIntercept", "OnItemClickListener", "ViewHolder", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class m<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26098d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<T> f26099e;

    /* renamed from: f  reason: collision with root package name */
    public Context f26100f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private View f26101g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private View f26102h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private LayoutInflater f26103i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView f26104j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private a<T> f26105k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f26106l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private b f26107m;

    /* compiled from: NewBaseRecycleAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnAddDataIntercept;", ExifInterface.GPS_DIRECTION_TRUE, "", "onAddData", "", "data", "(Ljava/lang/Object;)Z", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a<T> {
        boolean a(T t);
    }

    /* compiled from: NewBaseRecycleAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "", "OnItemClick", "", h.a.a.a.a.i.g.C, "", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void c(int i2);
    }

    /* compiled from: NewBaseRecycleAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taihebase/activity/base/NewBaseRecycleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vb", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "getVb", "()Landroidx/viewbinding/ViewBinding;", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends RecyclerView.ViewHolder {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final ViewBinding f26108a;

        public c(@NotNull ViewBinding viewBinding) {
        }

        @NotNull
        public final ViewBinding c() {
        }
    }

    public m(@NotNull Context context) {
    }

    public static /* synthetic */ void P(m mVar, View view, boolean z, boolean z2, int i2, Object obj) {
    }

    private final void f() {
    }

    public static /* synthetic */ void w(m mVar, int i2, View view) {
    }

    private static final void x(m mVar, int i2, View view) {
    }

    public final void A(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    public final void B(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    @NotNull
    public abstract RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2);

    public final void D() {
    }

    public final void E() {
    }

    public void F(int i2) {
    }

    public final void G(@NotNull Context context) {
    }

    public final void H(@Nullable View view) {
    }

    public final void I(@Nullable View view) {
    }

    public final void J(@NotNull LayoutInflater layoutInflater) {
    }

    public final void K(@Nullable List<T> list) {
    }

    public final void L(@Nullable RecyclerView recyclerView) {
    }

    public final void M(@Nullable a<T> aVar) {
    }

    public final void N(boolean z) {
    }

    public final void O(@NotNull View view, boolean z, boolean z2) {
    }

    public void add(T t) {
    }

    public void addAll(@Nullable List<? extends T> list) {
    }

    public final void c(@Nullable List<? extends T> list) {
    }

    public final void d(@Nullable View view) {
    }

    public final void e(@Nullable View view) {
    }

    @NotNull
    public final Context g() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Nullable
    public final T getItemData(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @Nullable
    public final List<T> getList() {
    }

    public final int h() {
    }

    public final int i() {
    }

    public final void insert(int i2, T t) {
    }

    @Nullable
    public final View j() {
    }

    public final int k() {
    }

    @Nullable
    public final View l() {
    }

    public final int m() {
    }

    public final int n() {
    }

    public final int o() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
    }

    @NotNull
    public final LayoutInflater p() {
    }

    public final int q() {
    }

    @Nullable
    public final List<T> r() {
    }

    public void remove(int i2) {
    }

    public void removeAll() {
    }

    @Nullable
    public final RecyclerView s() {
    }

    public final void set(int i2, T t) {
    }

    public final void setList(@Nullable List<? extends T> list) {
    }

    public final void setOnItemClickListener(@Nullable b bVar) {
    }

    public final void setText(@NotNull TextView textView, @Nullable CharSequence charSequence) {
    }

    public final int t() {
    }

    public final int u(int i2) {
    }

    public final boolean v() {
    }

    public void y(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, @NotNull List<? extends Object> list) {
    }

    public abstract void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4);

    public void add(int i2, T t) {
    }

    public m(@NotNull Context context, @Nullable List<T> list) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2, @NotNull List<Object> list) {
    }
}
