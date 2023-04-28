package h.u.a.t;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import com.taihebase.activity.view.RecyclerViewEmpty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewUtil.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\"\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ>\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013J\u0016\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000fJX\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020&2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010(\u001a\u00020\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0015Jb\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020&2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010(\u001a\u00020\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0015J\"\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020\u0018¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/utils/ViewUtil;", "", "()V", "addListViewFooter", "Landroid/view/View;", "context", "Landroid/content/Context;", "listView", "Landroid/widget/ListView;", "addListViewGrayFooter", "addRecyclerFooter", "", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "addView", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "", "getEmptyView", "resourceId", "str", "", "click", "Landroid/view/View$OnClickListener;", "bgColor", "isGrey", "", "removeItem", "parentView", "Landroid/view/ViewGroup;", "listview", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "setCityChangeHtmlText", "Landroid/text/Spanned;", "textString", "setEditTextLength", "mEdit", "Landroid/widget/EditText;", "maxLength", "setNoDataEmptyView", "Lcom/taihebase/activity/view/RecyclerViewEmpty;", "message", "paddingTop", "parent", "listener", "setViewVisible", "view", "isVisible", "usInvisble", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class l3 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final l3 f24530a = null;

    private l3() {
    }

    public static /* synthetic */ void e(l3 l3Var, Context context, LoadMoreRecyclerView loadMoreRecyclerView, int i2, int i3, Object obj) {
    }

    public static /* synthetic */ View g(l3 l3Var, Context context, int i2, String str, View.OnClickListener onClickListener, int i3, boolean z, int i4, Object obj) {
    }

    private final void h(ViewGroup viewGroup, View view, int i2) {
    }

    public static /* synthetic */ void m(l3 l3Var, Context context, RecyclerViewEmpty recyclerViewEmpty, int i2, String str, int i3, ViewGroup viewGroup, int i4, View.OnClickListener onClickListener, int i5, Object obj) {
    }

    public static /* synthetic */ void n(l3 l3Var, Context context, RecyclerViewEmpty recyclerViewEmpty, int i2, String str, int i3, ViewGroup viewGroup, int i4, boolean z, View.OnClickListener onClickListener, int i5, Object obj) {
    }

    public static /* synthetic */ void p(l3 l3Var, View view, boolean z, boolean z2, int i2, Object obj) {
    }

    @Nullable
    public final View a(@NotNull Context context, @NotNull ListView listView) {
    }

    @Nullable
    public final View b(@NotNull Context context, @NotNull ListView listView) {
    }

    public final void c(@Nullable Context context, @NotNull LoadMoreRecyclerView loadMoreRecyclerView, int i2) {
    }

    public final void d(@Nullable Context context, @NotNull LoadMoreRecyclerView loadMoreRecyclerView, @NotNull View view) {
    }

    @NotNull
    public final View f(@NotNull Context context, int i2, @Nullable String str, @Nullable View.OnClickListener onClickListener, int i3, boolean z) {
    }

    @NotNull
    public final Spanned i(@NotNull Context context, @NotNull String str) {
    }

    public final void j(@NotNull EditText editText, int i2) {
    }

    public final void k(@NotNull Context context, @NotNull RecyclerViewEmpty recyclerViewEmpty, int i2, @Nullable String str, int i3, @Nullable ViewGroup viewGroup, int i4, @Nullable View.OnClickListener onClickListener) {
    }

    public final void l(@NotNull Context context, @NotNull RecyclerViewEmpty recyclerViewEmpty, int i2, @Nullable String str, int i3, @Nullable ViewGroup viewGroup, int i4, boolean z, @Nullable View.OnClickListener onClickListener) {
    }

    public final void o(@Nullable View view, boolean z, boolean z2) {
    }
}
