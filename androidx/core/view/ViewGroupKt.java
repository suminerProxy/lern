package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewGroup.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a7\u0010\u0015\u001a\u00020\n*\u00020\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aL\u0010\u0018\u001a\u00020\n*\u00020\u000026\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\n*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001f\u0010 \u001a<\u0010%\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010#\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b%\u0010&\u001a<\u0010)\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010'\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010(\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b)\u0010&\"\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030**\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0018\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroid/view/ViewGroup;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Landroid/view/View;", "get", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "", "contains", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "", "plusAssign", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "minusAssign", "isEmpty", "(Landroid/view/ViewGroup;)Z", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "forEach", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Landroid/view/ViewGroup$MarginLayoutParams;", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "setMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "updateMargins", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)V", "start", "end", "updateMarginsRelative", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "getSize", "(Landroid/view/ViewGroup;)I", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ViewGroupKt {
    public static final boolean contains(@NotNull ViewGroup viewGroup, @NotNull View view) {
    }

    public static final void forEach(@NotNull ViewGroup viewGroup, @NotNull Function1<? super View, Unit> function1) {
    }

    public static final void forEachIndexed(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super View, Unit> function2) {
    }

    @NotNull
    public static final View get(@NotNull ViewGroup viewGroup, int i2) {
    }

    @NotNull
    public static final Sequence<View> getChildren(@NotNull ViewGroup viewGroup) {
    }

    public static final int getSize(@NotNull ViewGroup viewGroup) {
    }

    public static final boolean isEmpty(@NotNull ViewGroup viewGroup) {
    }

    public static final boolean isNotEmpty(@NotNull ViewGroup viewGroup) {
    }

    @NotNull
    public static final Iterator<View> iterator(@NotNull ViewGroup viewGroup) {
    }

    public static final void minusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
    }

    public static final void plusAssign(@NotNull ViewGroup viewGroup, @NotNull View view) {
    }

    public static final void setMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2) {
    }

    public static final void updateMargins(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
    }

    @RequiresApi(17)
    public static final void updateMarginsRelative(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
    }
}
