package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ViewModelStore {
    private final HashMap<String, ViewModel> mMap = new HashMap<>();

    public final void clear() {
        for (ViewModel viewModel : this.mMap.values()) {
            viewModel.clear();
        }
        this.mMap.clear();
    }

    public final ViewModel get(String str) {
        return this.mMap.get(str);
    }

    public Set<String> keys() {
        return new HashSet(this.mMap.keySet());
    }

    public final void put(String str, ViewModel viewModel) {
        ViewModel put = this.mMap.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
