package skin.support.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import skin.support.widget.SkinCompatCardView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCardViewInflater implements SkinLayoutInflater {
    @Override // skin.support.app.SkinLayoutInflater
    public View createView(@NonNull Context context, String str, @NonNull AttributeSet attributeSet) {
        str.hashCode();
        if (str.equals("androidx.cardview.widget.CardView")) {
            return new SkinCompatCardView(context, attributeSet);
        }
        return null;
    }
}
