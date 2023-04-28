package net.security.device.api.id.oaid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import net.security.device.api.id.IOAID;
import net.security.device.api.id.IOAIDGetter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HuaweiImpl implements IOAID {
    private final Context context;

    /* renamed from: net.security.device.api.id.oaid.HuaweiImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements ServiceConnection {
        public final /* synthetic */ HuaweiImpl this$0;
        public final /* synthetic */ IOAIDGetter val$getter;

        public AnonymousClass1(HuaweiImpl huaweiImpl, IOAIDGetter iOAIDGetter) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public HuaweiImpl(Context context) {
    }

    public static /* synthetic */ Context access$000(HuaweiImpl huaweiImpl) {
    }

    @Override // net.security.device.api.id.IOAID
    public void doGet(IOAIDGetter iOAIDGetter) {
    }

    @Override // net.security.device.api.id.IOAID
    public boolean supportOAID() {
    }
}
