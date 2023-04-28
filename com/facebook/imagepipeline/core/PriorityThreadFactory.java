package com.facebook.imagepipeline.core;

import android.os.Process;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.cli.HelpFormatter;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PriorityThreadFactory implements ThreadFactory {
    private final boolean mAddThreadNumber;
    private final String mPrefix;
    private final AtomicInteger mThreadNumber;
    private final int mThreadPriority;

    public PriorityThreadFactory(int threadPriority) {
        this(threadPriority, "PriorityThreadFactory", true);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Runnable runnable2 = new Runnable() { // from class: com.facebook.imagepipeline.core.PriorityThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(PriorityThreadFactory.this.mThreadPriority);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.mAddThreadNumber) {
            str = this.mPrefix + HelpFormatter.DEFAULT_OPT_PREFIX + this.mThreadNumber.getAndIncrement();
        } else {
            str = this.mPrefix;
        }
        return new Thread(runnable2, str);
    }

    public PriorityThreadFactory(int threadPriority, String prefix, boolean addThreadNumber) {
        this.mThreadNumber = new AtomicInteger(1);
        this.mThreadPriority = threadPriority;
        this.mPrefix = prefix;
        this.mAddThreadNumber = addThreadNumber;
    }
}
