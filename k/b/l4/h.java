package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import k.b.d2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.reactivestreams.Publisher;

/* compiled from: Migration.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a'\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\b\u0000\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/reactivestreams/Publisher;", "batchSize", "", "asFlowDeprecated", "asPublisherDeprecated", "asPublisher", "kotlinx-coroutines-reactive"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/reactive/FlowKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final /* synthetic */ class h {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced in favor of ReactiveFlow extension, please import kotlinx.coroutines.reactive.* instead of kotlinx.coroutines.reactive.FlowKt")
    @JvmName(name = "asFlow")
    public static final /* synthetic */ k.b.i4.i a(Publisher publisher) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "batchSize parameter is deprecated, use .buffer() instead to control the backpressure", replaceWith = @ReplaceWith(expression = "asFlow().buffer(batchSize)", imports = {"kotlinx.coroutines.flow.*"}))
    @d2
    public static final /* synthetic */ k.b.i4.i b(Publisher publisher, int i2) {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced in favor of ReactiveFlow extension, please import kotlinx.coroutines.reactive.* instead of kotlinx.coroutines.reactive.FlowKt")
    @JvmName(name = "asPublisher")
    public static final /* synthetic */ Publisher c(k.b.i4.i iVar) {
    }
}
