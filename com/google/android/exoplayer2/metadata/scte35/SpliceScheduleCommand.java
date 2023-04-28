package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = null;
    public final List<Event> events;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SpliceScheduleCommand createFromParcel(Parcel in) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SpliceScheduleCommand[] newArray(int size) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel in) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int size) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        public /* synthetic */ ComponentSplice(int i2, long j2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ComponentSplice access$000(Parcel parcel) {
        }

        public static /* synthetic */ void access$200(ComponentSplice componentSplice, Parcel parcel) {
        }

        private static ComponentSplice createFromParcel(Parcel in) {
        }

        private void writeToParcel(Parcel dest) {
        }

        private ComponentSplice(int componentTag, long utcSpliceTime) {
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, AnonymousClass1 anonymousClass1) {
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray sectionData) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
    }

    private SpliceScheduleCommand(List<Event> events) {
    }

    private SpliceScheduleCommand(Parcel in) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long spliceEventId, boolean spliceEventCancelIndicator, boolean outOfNetworkIndicator, boolean programSpliceFlag, List<ComponentSplice> componentSpliceList, long utcSpliceTime, boolean autoReturn, long breakDurationUs, int uniqueProgramId, int availNum, int availsExpected) {
        }

        public static /* synthetic */ Event access$300(Parcel parcel) {
        }

        public static /* synthetic */ Event access$400(ParsableByteArray parsableByteArray) {
        }

        public static /* synthetic */ void access$500(Event event, Parcel parcel) {
        }

        private static Event createFromParcel(Parcel in) {
        }

        private static Event parseFromSection(ParsableByteArray sectionData) {
        }

        private void writeToParcel(Parcel dest) {
        }

        private Event(Parcel in) {
        }
    }
}
