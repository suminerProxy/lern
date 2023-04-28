package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet<OnSelectionChangedListener<S>> onSelectionChangedListeners;

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
    }

    public void clearOnSelectionChangedListeners() {
    }

    public abstract DateSelector<S> getDateSelector();

    public boolean removeOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
    }
}
