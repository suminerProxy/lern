package h.y.a.n;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.taihebase.activity.R;

/* compiled from: ToastUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class f1 {
    public static Toast b(Context context, String str) {
        try {
            if (((Activity) context).isFinishing()) {
                return null;
            }
            Toast makeText = Toast.makeText(context, str, 1);
            View inflate = View.inflate(context, R.layout.layout_toast_live, null);
            ((TextView) inflate.findViewById(R.id.txt_toast_info)).setText(str);
            makeText.setView(inflate);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return makeText;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Toast c(Activity activity, String str) {
        Toast makeText = Toast.makeText(activity, str, 0);
        makeText.show();
        return makeText;
    }

    public static Toast d(String str) {
        Toast makeText = Toast.makeText(h.y.a.f.k.b(), str, 0);
        makeText.show();
        return makeText;
    }

    public static void e(int i2) {
        Toast.makeText(h.y.a.f.k.b(), h.y.a.f.k.b().getString(i2), 0).show();
    }

    public static Toast f(Context context, String str, long j2) {
        try {
            if (((Activity) context).isFinishing()) {
                return null;
            }
            Toast makeText = Toast.makeText(context, str, 1);
            View inflate = View.inflate(context, R.layout.layout_toast, null);
            ((TextView) inflate.findViewById(R.id.txt_toast_info)).setText(str);
            makeText.setView(inflate);
            makeText.setGravity(17, 0, 0);
            new Handler().postDelayed(new Runnable(makeText) { // from class: h.y.a.n.o
                public final /* synthetic */ Toast b;

                @Override // java.lang.Runnable
                public final void run() {
                }
            }, j2);
            makeText.show();
            return makeText;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Toast g(String str) {
        Toast makeText = Toast.makeText(h.y.a.f.k.b(), str, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return makeText;
    }

    public static void h(int i2) {
        Toast.makeText(h.y.a.f.k.b(), i2, 1).show();
    }

    public static void i(String str) {
        Toast.makeText(h.y.a.f.k.b(), str, 1).show();
    }

    public static void j(String str) {
        Toast makeText = Toast.makeText(h.y.a.f.k.b(), str, 0);
        makeText.setGravity(48, 0, 0);
        makeText.show();
    }
}
