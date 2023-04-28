package com.mob.commons;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ActivityTracker;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class j {

    /* renamed from: a */
    private static j f3630a;
    private volatile Handler c;
    private final HashSet<i> b = new HashSet<>();

    /* renamed from: d */
    private String f3631d = null;

    /* renamed from: e */
    private volatile long f3632e = -1;

    private j() {
        String str = null;
        if (!TextUtils.isEmpty("M-")) {
            str = v.f3695a + a("004Jhmhljkin");
        }
        this.c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.commons.j.1
            {
                j.this = this;
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    j.this.f3632e = SystemClock.elapsedRealtime();
                    j.this.a(false);
                    j.this.c();
                } else if (i2 == 1) {
                    j.this.a(true);
                } else if (i2 == 2) {
                    j.this.a(((Long) message.obj).longValue(), true);
                } else if (i2 == 3) {
                    try {
                        i iVar = (i) message.obj;
                        if (iVar != null) {
                            j.this.b.add(iVar);
                            iVar.a(j.this.f3632e > 0, true, 0L);
                        }
                    } catch (Throwable th) {
                        MobLog.getInstance().d(th);
                    }
                }
                return false;
            }
        });
    }

    public static /* synthetic */ long a(j jVar, long j2) {
        jVar.f3632e = j2;
        return j2;
    }

    public static /* synthetic */ long c(j jVar) {
        return jVar.f3632e;
    }

    public static /* synthetic */ Handler d(j jVar) {
        return jVar.c;
    }

    public static /* synthetic */ String e(j jVar) {
        return jVar.f3631d;
    }

    public static /* synthetic */ String a(j jVar, String str) {
        jVar.f3631d = str;
        return str;
    }

    public void c() {
        ActivityTracker.getInstance(MobSDK.getContext()).addTracker(new ActivityTracker.Tracker() { // from class: com.mob.commons.FBManager$2
            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onDestroyed(Activity activity) {
                if (j.c(j.this) > 0) {
                    onStopped(activity);
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onPaused(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onResumed(Activity activity) {
                try {
                    if (j.c(j.this) == 0) {
                        j.a(j.this, SystemClock.elapsedRealtime());
                        if (j.d(j.this) != null) {
                            j.d(j.this).sendEmptyMessage(1);
                        }
                    }
                    j.a(j.this, activity == null ? null : activity.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onSaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStarted(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStopped(Activity activity) {
                try {
                    if (j.e(j.this) != null) {
                        if (!j.e(j.this).equals(activity == null ? null : activity.toString())) {
                            return;
                        }
                    }
                    if (j.d(j.this) != null) {
                        long elapsedRealtime = j.c(j.this) > 0 ? SystemClock.elapsedRealtime() - j.c(j.this) : 0L;
                        Message message = new Message();
                        message.what = 2;
                        message.obj = Long.valueOf(elapsedRealtime);
                        j.d(j.this).sendMessage(message);
                    }
                    j.a(j.this, 0L);
                    j.a(j.this, (String) null);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public boolean b() {
        return this.f3632e == 0;
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f3630a == null) {
                j jVar2 = new j();
                f3630a = jVar2;
                if (jVar2.c != null) {
                    f3630a.c.sendEmptyMessage(0);
                }
            }
            jVar = f3630a;
        }
        return jVar;
    }

    public void a(i iVar) {
        if (iVar == null) {
            return;
        }
        synchronized (this.b) {
            if (this.b.contains(iVar)) {
                return;
            }
            if (this.c != null) {
                Message message = new Message();
                message.what = 3;
                message.obj = iVar;
                this.c.sendMessage(message);
            }
        }
    }

    public void a(boolean z) {
        if (z) {
            a(true, false, 0L);
        }
    }

    public void a(long j2, boolean z) {
        if (z) {
            a(false, false, j2);
        }
    }

    private void a(boolean z, boolean z2, long j2) {
        synchronized (this.b) {
            Iterator<i> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(z, z2, j2);
            }
        }
    }

    public static String a(String str) {
        return s.a(str, 101);
    }
}
