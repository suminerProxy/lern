package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class NotificationSideChannelStub extends INotificationSideChannel.Stub {
        public final /* synthetic */ NotificationCompatSideChannelService this$0;

        public NotificationSideChannelStub(NotificationCompatSideChannelService notificationCompatSideChannelService) {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i2, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i2, String str2, Notification notification) throws RemoteException {
        }
    }

    public abstract void cancel(String str, int i2, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i2, String str) {
    }

    public abstract void notify(String str, int i2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }
}
