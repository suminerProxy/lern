package h.u.a.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.activitys.article.SelectPhotoActivity;
import com.taihe.photoselector.model.PhotoModel;
import h.u.a.c.w.y1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectUserConverPhotoAdapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ,\u0010\u0015\u001a\u00020\u000f2\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006`\u0019H\u0014J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0014J*\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0014J\u001a\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\bH\u0014R\u000e\u0010\f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/showstartfans/activity/adapter/SelectUserConverPhotoAdapter;", "Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;", "context", "Landroid/content/Context;", "alreadyDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "maxCount", "", "mBuilder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "(Landroid/content/Context;Ljava/util/List;ILcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;)V", "LOCAL_TYPE", "onClickLocal", "Lkotlin/Function0;", "", "Lcom/showstartfans/activity/adapter/OnClickLocal;", "getOnClickLocal", "()Lkotlin/jvm/functions/Function0;", "setOnClickLocal", "(Lkotlin/jvm/functions/Function0;)V", "OnBrowingActivityClickNext", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getItemCount", "getItemViewType", h.a.a.a.a.i.g.C, "notifyShowItems", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onCreateViewHolder_impl", "parent", "Landroid/view/ViewGroup;", "viewType", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class m1 extends y1 {
    private final int w;
    @Nullable
    private Function0<Unit> x;

    public m1(@NotNull Context context, @Nullable List<? extends PhotoModel> list, int i2, @Nullable SelectPhotoActivity.a aVar) {
    }

    public static /* synthetic */ void i0(m1 m1Var, View view) {
    }

    private static final void j0(m1 m1Var, View view) {
    }

    @Override // h.u.a.c.w.y1, h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    @Override // h.u.a.c.w.y1
    public void Q(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
    }

    @Override // h.u.a.c.w.y1
    public void c0() {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // h.u.a.c.w.y1, h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    @Nullable
    public final Function0<Unit> h0() {
    }

    public final void k0(@Nullable Function0<Unit> function0) {
    }

    @Override // h.u.a.c.w.y1, h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
