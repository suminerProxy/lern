package h.u.a.v;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.showstartfans.activity.model.UserPhotoBean;
import h.a.a.a.a.i.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006R'\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/showstartfans/activity/viewmodel/UserPhotoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "shareData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/model/UserPhotoBean;", "Lkotlin/collections/ArrayList;", "getShareData", "()Landroidx/lifecycle/MutableLiveData;", "NewInstance", "ctx", "Landroid/content/Context;", "addData", "", "datas", "", "clearData", "getDatas", "remove", g.C, "", "replaceData", "data", "Factory", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class a extends ViewModel {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a f24996a = null;
    @NotNull
    private static final MutableLiveData<ArrayList<UserPhotoBean>> b = null;

    /* compiled from: UserPhotoViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/viewmodel/UserPhotoViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: h.u.a.v.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class C0387a extends ViewModelProvider.NewInstanceFactory {
        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(@NotNull Class<T> cls) {
        }
    }

    private a() {
    }

    @JvmStatic
    @NotNull
    public static final a a(@NotNull Context context) {
    }

    public final void b(@Nullable List<UserPhotoBean> list) {
    }

    public final void c() {
    }

    @Nullable
    public final List<UserPhotoBean> d() {
    }

    @NotNull
    public final MutableLiveData<ArrayList<UserPhotoBean>> e() {
    }

    public final void f(int i2) {
    }

    public final void g(int i2, @Nullable UserPhotoBean userPhotoBean) {
    }
}
