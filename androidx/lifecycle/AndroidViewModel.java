package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AndroidViewModel extends ViewModel {
    @SuppressLint({"StaticFieldLeak"})
    private Application mApplication;

    public AndroidViewModel(@NonNull Application application) {
    }

    @NonNull
    public <T extends Application> T getApplication() {
    }
}
