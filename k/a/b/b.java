package k.a.b;

import android.os.Parcel;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Parceler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/android/parcel/Parceler;", ExifInterface.GPS_DIRECTION_TRUE, "", "create", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)Ljava/lang/Object;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Ljava/lang/Object;", "write", "", "flags", "(Ljava/lang/Object;Landroid/os/Parcel;I)V", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface b<T> {

    /* compiled from: Parceler.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a {
        @NotNull
        public static <T> T[] a(@NotNull b<T> bVar, int i2) {
        }
    }

    void a(T t, @NotNull Parcel parcel, int i2);

    T b(@NotNull Parcel parcel);

    @NotNull
    T[] newArray(int i2);
}
