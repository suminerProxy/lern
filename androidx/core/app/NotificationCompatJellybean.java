package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Field;
import java.util.List;

@RequiresApi(16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NotificationCompatJellybean {
    public static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    public static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static final Object sActionsLock = null;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock = null;

    private NotificationCompatJellybean() {
    }

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> list) {
    }

    private static boolean ensureActionReflectionReadyLocked() {
    }

    private static RemoteInput fromBundle(Bundle bundle) {
    }

    private static RemoteInput[] fromBundleArray(Bundle[] bundleArr) {
    }

    public static NotificationCompat.Action getAction(Notification notification, int i2) {
    }

    public static int getActionCount(Notification notification) {
    }

    public static NotificationCompat.Action getActionFromBundle(Bundle bundle) {
    }

    private static Object[] getActionObjectsLocked(Notification notification) {
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String str) {
    }

    public static Bundle getBundleForAction(NotificationCompat.Action action) {
    }

    public static Bundle getExtras(Notification notification) {
    }

    public static NotificationCompat.Action readAction(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
    }

    private static Bundle toBundle(RemoteInput remoteInput) {
    }

    private static Bundle[] toBundleArray(RemoteInput[] remoteInputArr) {
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.Action action) {
    }
}
