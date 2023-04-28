package net.security.device.api.id.gaid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import net.security.device.api.id.IGAID;
import net.security.device.api.id.IGAIDGetter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class GAIDImpl implements IGAID {
    private final Context context;

    /* renamed from: net.security.device.api.id.gaid.GAIDImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements ServiceConnection {
        public final /* synthetic */ GAIDImpl this$0;
        public final /* synthetic */ IGAIDGetter val$getter;

        public AnonymousClass1(GAIDImpl gAIDImpl, IGAIDGetter iGAIDGetter) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public GAIDImpl(Context context) {
    }

    public static /* synthetic */ Context access$000(GAIDImpl gAIDImpl) {
    }

    @Override // net.security.device.api.id.IGAID
    public void doGet(IGAIDGetter iGAIDGetter) {
    }

    @Override // net.security.device.api.id.IGAID
    public boolean supportGAID() {
    }
}
