package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ActivityChooserModel extends DataSetObservable {
    public static final String ATTRIBUTE_ACTIVITY = "activity";
    public static final String ATTRIBUTE_TIME = "time";
    public static final String ATTRIBUTE_WEIGHT = "weight";
    public static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    public static final String LOG_TAG = null;
    public static final String TAG_HISTORICAL_RECORD = "historical-record";
    public static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map<String, ActivityChooserModel> sDataModelRegistry = null;
    private static final Object sRegistryLock = null;
    private final List<ActivityResolveInfo> mActivities;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    public boolean mCanReadHistoricalData;
    public final Context mContext;
    private final List<HistoricalRecord> mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    public final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(ActivityResolveInfo activityResolveInfo) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(ActivityResolveInfo activityResolveInfo) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DefaultSorter implements ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final Map<ComponentName, ActivityResolveInfo> mPackageNameToActivityMap;

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j2, float f2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public HistoricalRecord(ComponentName componentName, long j2, float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        public final /* synthetic */ ActivityChooserModel this$0;

        public PersistHistoryAsyncTask(ActivityChooserModel activityChooserModel) {
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Object[] objArr) {
        }

        @Override // android.os.AsyncTask
        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        public Void doInBackground2(Object... objArr) {
        }
    }

    private ActivityChooserModel(Context context, String str) {
    }

    private boolean addHistoricalRecord(HistoricalRecord historicalRecord) {
    }

    private void ensureConsistentState() {
    }

    public static ActivityChooserModel get(Context context, String str) {
    }

    private boolean loadActivitiesIfNeeded() {
    }

    private void persistHistoricalDataIfNeeded() {
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
    }

    private boolean readHistoricalDataIfNeeded() {
    }

    private void readHistoricalDataImpl() {
    }

    private boolean sortActivitiesIfNeeded() {
    }

    public Intent chooseActivity(int i2) {
    }

    public ResolveInfo getActivity(int i2) {
    }

    public int getActivityCount() {
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
    }

    public ResolveInfo getDefaultActivity() {
    }

    public int getHistoryMaxSize() {
    }

    public int getHistorySize() {
    }

    public Intent getIntent() {
    }

    public void setActivitySorter(ActivitySorter activitySorter) {
    }

    public void setDefaultActivity(int i2) {
    }

    public void setHistoryMaxSize(int i2) {
    }

    public void setIntent(Intent intent) {
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onChooseActivityListener) {
    }
}
