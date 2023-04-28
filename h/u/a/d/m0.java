package h.u.a.d;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DyFragmentChangePagerAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006$"}, d2 = {"Lcom/showstartfans/activity/adapter/DyFragmentChangePagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "mTitle", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "getFm", "()Landroidx/fragment/app/FragmentManager;", "setFm", "(Landroidx/fragment/app/FragmentManager;)V", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "getMTitle", "setMTitle", "getCount", "", "getItem", h.a.a.a.a.i.g.C, "getItemId", "", "getItemPosition", "object", "", "getPageTitle", "", "judgeCurrentSameToCache", "", "currentFragment", "cacheFragment", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class m0 extends FragmentPagerAdapter {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private List<? extends Fragment> f20285a;
    @Nullable
    private List<String> b;
    @Nullable
    private FragmentManager c;

    public m0(@NotNull FragmentManager fragmentManager, @Nullable List<? extends Fragment> list) {
    }

    private final boolean f(Fragment fragment, Fragment fragment2) {
    }

    @Nullable
    public final FragmentManager c() {
    }

    @Nullable
    public final List<Fragment> d() {
    }

    @Nullable
    public final List<String> e() {
    }

    public final void g(@Nullable FragmentManager fragmentManager) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NotNull
    public Fragment getItem(int i2) {
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public long getItemId(int i2) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i2) {
    }

    public final void h(@Nullable List<? extends Fragment> list) {
    }

    public final void i(@Nullable List<String> list) {
    }

    public m0(@NotNull FragmentManager fragmentManager, @Nullable List<? extends Fragment> list, @Nullable List<String> list2) {
    }
}
