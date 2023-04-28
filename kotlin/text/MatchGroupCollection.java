package kotlin.text;

import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: MatchResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0006"}, d2 = {"Lkotlin/text/MatchGroupCollection;", "", "Lkotlin/text/MatchGroup;", "get", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface MatchGroupCollection extends Collection<MatchGroup>, KMappedMarker {
    @Nullable
    MatchGroup get(int i2);
}
