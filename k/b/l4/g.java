package k.b.l4;

import k.b.d2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.reactivestreams.Publisher;

/* compiled from: Migration.kt */
@Metadata(d1 = {"kotlinx/coroutines/reactive/FlowKt__MigrationKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g {
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
