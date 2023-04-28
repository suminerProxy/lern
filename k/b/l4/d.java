package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import k.b.i2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* compiled from: ContextInjector.kt */
@i2
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/reactive/ContextInjector;", "", "injectCoroutineContext", "Lorg/reactivestreams/Publisher;", ExifInterface.GPS_DIRECTION_TRUE, "publisher", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-reactive"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface d {
    @NotNull
    <T> Publisher<T> a(@NotNull Publisher<T> publisher, @NotNull CoroutineContext coroutineContext);
}
