package com.facebook.drawee.components;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Queue;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DraweeEventTracker {
    private static final int MAX_EVENTS_TO_TRACK = 20;
    private static boolean sEnabled;
    private static final DraweeEventTracker sInstance = null;
    private final Queue<Event> mEventQueue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES = null;
        public static final Event ON_ACTIVITY_START = null;
        public static final Event ON_ACTIVITY_STOP = null;
        public static final Event ON_ATTACH_CONTROLLER = null;
        public static final Event ON_CLEAR_CONTROLLER = null;
        public static final Event ON_CLEAR_HIERARCHY = null;
        public static final Event ON_CLEAR_OLD_CONTROLLER = null;
        public static final Event ON_DATASOURCE_FAILURE = null;
        public static final Event ON_DATASOURCE_FAILURE_INT = null;
        public static final Event ON_DATASOURCE_RESULT = null;
        public static final Event ON_DATASOURCE_RESULT_INT = null;
        public static final Event ON_DATASOURCE_SUBMIT = null;
        public static final Event ON_DETACH_CONTROLLER = null;
        public static final Event ON_DRAWABLE_HIDE = null;
        public static final Event ON_DRAWABLE_SHOW = null;
        public static final Event ON_HOLDER_ATTACH = null;
        public static final Event ON_HOLDER_DETACH = null;
        public static final Event ON_INIT_CONTROLLER = null;
        public static final Event ON_RELEASE_CONTROLLER = null;
        public static final Event ON_RUN_CLEAR_CONTROLLER = null;
        public static final Event ON_SAME_CONTROLLER_SKIPPED = null;
        public static final Event ON_SCHEDULE_CLEAR_CONTROLLER = null;
        public static final Event ON_SET_CONTROLLER = null;
        public static final Event ON_SET_HIERARCHY = null;
        public static final Event ON_SUBMIT_CACHE_HIT = null;

        private Event(String $enum$name, int $enum$ordinal) {
        }

        public static Event valueOf(String name) {
        }

        public static Event[] values() {
        }
    }

    private DraweeEventTracker() {
    }

    public static void disable() {
    }

    public static DraweeEventTracker newInstance() {
    }

    public void recordEvent(Event event) {
    }

    public String toString() {
    }
}
