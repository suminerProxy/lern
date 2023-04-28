package h.u.a.u.h4.h;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WheelViewAdapter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface g {
    View a(int i2, View view, ViewGroup viewGroup);

    View b(View view, ViewGroup viewGroup);

    int getItemsCount();

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
