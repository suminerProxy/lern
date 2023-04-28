package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Action {
        public static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        public static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;
        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        public final Bundle mExtras;
        @Nullable
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        public boolean mShowsUserInterface;
        public CharSequence title;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            public Builder(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
            }

            private void checkContextualActionNullFields() {
            }

            public Builder addExtras(Bundle bundle) {
            }

            public Builder addRemoteInput(RemoteInput remoteInput) {
            }

            public Action build() {
            }

            public Builder extend(Extender extender) {
            }

            public Bundle getExtras() {
            }

            public Builder setAllowGeneratedReplies(boolean z) {
            }

            @NonNull
            public Builder setContextual(boolean z) {
            }

            public Builder setSemanticAction(int i2) {
            }

            public Builder setShowsUserInterface(boolean z) {
            }

            public Builder(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            }

            public Builder(Action action) {
            }

            private Builder(@Nullable IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i2, boolean z2, boolean z3) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface Extender {
            Builder extend(Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public @interface SemanticAction {
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
            }

            private void setFlag(int i2, boolean z) {
            }

            /* renamed from: clone  reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Object m3clone() throws CloneNotSupportedException {
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public Builder extend(Builder builder) {
            }

            @Deprecated
            public CharSequence getCancelLabel() {
            }

            @Deprecated
            public CharSequence getConfirmLabel() {
            }

            public boolean getHintDisplayActionInline() {
            }

            public boolean getHintLaunchesActivity() {
            }

            @Deprecated
            public CharSequence getInProgressLabel() {
            }

            public boolean isAvailableOffline() {
            }

            public WearableExtender setAvailableOffline(boolean z) {
            }

            @Deprecated
            public WearableExtender setCancelLabel(CharSequence charSequence) {
            }

            @Deprecated
            public WearableExtender setConfirmLabel(CharSequence charSequence) {
            }

            public WearableExtender setHintDisplayActionInline(boolean z) {
            }

            public WearableExtender setHintLaunchesActivity(boolean z) {
            }

            @Deprecated
            public WearableExtender setInProgressLabel(CharSequence charSequence) {
            }

            public WearableExtender clone() {
            }

            public WearableExtender(Action action) {
            }
        }

        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        }

        public PendingIntent getActionIntent() {
        }

        public boolean getAllowGeneratedReplies() {
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
        }

        public Bundle getExtras() {
        }

        @Deprecated
        public int getIcon() {
        }

        @Nullable
        public IconCompat getIconCompat() {
        }

        public RemoteInput[] getRemoteInputs() {
        }

        public int getSemanticAction() {
        }

        public boolean getShowsUserInterface() {
        }

        public CharSequence getTitle() {
        }

        public boolean isContextual() {
        }

        public Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
        }

        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i3, boolean z2, boolean z3) {
        }

        public Action(@Nullable IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface BadgeIconType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BigPictureStyle extends Style {
        private Bitmap mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private Bitmap mPicture;

        public BigPictureStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap) {
        }

        public BigPictureStyle bigPicture(Bitmap bitmap) {
        }

        public BigPictureStyle setBigContentTitle(CharSequence charSequence) {
        }

        public BigPictureStyle setSummaryText(CharSequence charSequence) {
        }

        public BigPictureStyle(Builder builder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BigTextStyle extends Style {
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public BigTextStyle bigText(CharSequence charSequence) {
        }

        public BigTextStyle setBigContentTitle(CharSequence charSequence) {
        }

        public BigTextStyle setSummaryText(CharSequence charSequence) {
        }

        public BigTextStyle(Builder builder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        @DimenRes
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            @DimenRes
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;

            private Builder setFlag(int i2, boolean z) {
            }

            @NonNull
            @SuppressLint({"SyntheticAccessor"})
            public BubbleMetadata build() {
            }

            @NonNull
            public Builder setAutoExpandBubble(boolean z) {
            }

            @NonNull
            public Builder setDeleteIntent(@Nullable PendingIntent pendingIntent) {
            }

            @NonNull
            public Builder setDesiredHeight(@Dimension(unit = 0) int i2) {
            }

            @NonNull
            public Builder setDesiredHeightResId(@DimenRes int i2) {
            }

            @NonNull
            public Builder setIcon(@NonNull IconCompat iconCompat) {
            }

            @NonNull
            public Builder setIntent(@NonNull PendingIntent pendingIntent) {
            }

            @NonNull
            public Builder setSuppressNotification(boolean z) {
            }
        }

        public /* synthetic */ BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i2, int i3, int i4, AnonymousClass1 anonymousClass1) {
        }

        @Nullable
        @RequiresApi(29)
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata bubbleMetadata) {
        }

        @Nullable
        @RequiresApi(29)
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata bubbleMetadata) {
        }

        public boolean getAutoExpandBubble() {
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
        }

        @DimenRes
        public int getDesiredHeightResId() {
        }

        @NonNull
        public IconCompat getIcon() {
        }

        @NonNull
        public PendingIntent getIntent() {
        }

        public boolean isNotificationSuppressed() {
        }

        private BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i2, @DimenRes int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList<Action> mActions;
        public boolean mAllowSystemGeneratedContextualActions;
        public int mBadgeIcon;
        public RemoteViews mBigContentView;
        public BubbleMetadata mBubbleMetadata;
        public String mCategory;
        public String mChannelId;
        public boolean mChronometerCountDown;
        public int mColor;
        public boolean mColorized;
        public boolean mColorizedSet;
        public CharSequence mContentInfo;
        public PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public RemoteViews mContentView;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        public Bundle mExtras;
        public PendingIntent mFullScreenIntent;
        public int mGroupAlertBehavior;
        public String mGroupKey;
        public boolean mGroupSummary;
        public RemoteViews mHeadsUpContentView;
        public ArrayList<Action> mInvisibleActions;
        public Bitmap mLargeIcon;
        public boolean mLocalOnly;
        public Notification mNotification;
        public int mNumber;
        @Deprecated
        public ArrayList<String> mPeople;
        public int mPriority;
        public int mProgress;
        public boolean mProgressIndeterminate;
        public int mProgressMax;
        public Notification mPublicVersion;
        public CharSequence[] mRemoteInputHistory;
        public String mShortcutId;
        public boolean mShowWhen;
        public boolean mSilent;
        public String mSortKey;
        public Style mStyle;
        public CharSequence mSubText;
        public RemoteViews mTickerView;
        public long mTimeout;
        public boolean mUseChronometer;
        public int mVisibility;

        public Builder(@NonNull Context context, @NonNull String str) {
        }

        public static CharSequence limitCharSequenceLength(CharSequence charSequence) {
        }

        private Bitmap reduceLargeIconSize(Bitmap bitmap) {
        }

        private void setFlag(int i2, boolean z) {
        }

        public Builder addAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        }

        public Builder addExtras(Bundle bundle) {
        }

        @RequiresApi(21)
        public Builder addInvisibleAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        }

        public Builder addPerson(String str) {
        }

        public Notification build() {
        }

        public Builder extend(Extender extender) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
        }

        public Bundle getExtras() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
        }

        @Deprecated
        public Notification getNotification() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
        }

        @NonNull
        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
        }

        public Builder setAutoCancel(boolean z) {
        }

        public Builder setBadgeIconType(int i2) {
        }

        @NonNull
        public Builder setBubbleMetadata(@Nullable BubbleMetadata bubbleMetadata) {
        }

        public Builder setCategory(String str) {
        }

        public Builder setChannelId(@NonNull String str) {
        }

        @NonNull
        @RequiresApi(24)
        public Builder setChronometerCountDown(boolean z) {
        }

        public Builder setColor(@ColorInt int i2) {
        }

        public Builder setColorized(boolean z) {
        }

        public Builder setContent(RemoteViews remoteViews) {
        }

        public Builder setContentInfo(CharSequence charSequence) {
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
        }

        public Builder setContentText(CharSequence charSequence) {
        }

        public Builder setContentTitle(CharSequence charSequence) {
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
        }

        public Builder setDefaults(int i2) {
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
        }

        public Builder setExtras(Bundle bundle) {
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
        }

        public Builder setGroup(String str) {
        }

        public Builder setGroupAlertBehavior(int i2) {
        }

        public Builder setGroupSummary(boolean z) {
        }

        public Builder setLargeIcon(Bitmap bitmap) {
        }

        public Builder setLights(@ColorInt int i2, int i3, int i4) {
        }

        public Builder setLocalOnly(boolean z) {
        }

        @NonNull
        public Builder setNotificationSilent() {
        }

        public Builder setNumber(int i2) {
        }

        public Builder setOngoing(boolean z) {
        }

        public Builder setOnlyAlertOnce(boolean z) {
        }

        public Builder setPriority(int i2) {
        }

        public Builder setProgress(int i2, int i3, boolean z) {
        }

        public Builder setPublicVersion(Notification notification) {
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
        }

        public Builder setShortcutId(String str) {
        }

        public Builder setShowWhen(boolean z) {
        }

        public Builder setSmallIcon(int i2) {
        }

        public Builder setSortKey(String str) {
        }

        public Builder setSound(Uri uri) {
        }

        public Builder setStyle(Style style) {
        }

        public Builder setSubText(CharSequence charSequence) {
        }

        public Builder setTicker(CharSequence charSequence) {
        }

        public Builder setTimeoutAfter(long j2) {
        }

        public Builder setUsesChronometer(boolean z) {
        }

        public Builder setVibrate(long[] jArr) {
        }

        public Builder setVisibility(int i2) {
        }

        public Builder setWhen(long j2) {
        }

        public Builder addAction(Action action) {
        }

        @RequiresApi(21)
        public Builder addInvisibleAction(Action action) {
        }

        public Builder setSmallIcon(int i2, int i3) {
        }

        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
        }

        public Builder setSound(Uri uri, int i2) {
        }

        @Deprecated
        public Builder(Context context) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z) {
        }

        private RemoteViews generateActionButton(Action action) {
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Extender {
        Builder extend(Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface StreamType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class Style {
        public CharSequence mBigContentTitle;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder mBuilder;
        public CharSequence mSummaryText;
        public boolean mSummaryTextSet;

        private int calculateTopPadding() {
        }

        private static float constrain(float f2, float f3, float f4) {
        }

        private Bitmap createIconWithBackground(int i2, int i3, int i4, int i5) {
        }

        private void hideNormalContent(RemoteViews remoteViews) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(Bundle bundle) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews applyStandardTemplate(boolean z, int i2, boolean z2) {
        }

        public Notification build() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int i2, int i3) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(Bundle bundle) {
        }

        public void setBuilder(Builder builder) {
        }

        public Bitmap createColoredBitmap(IconCompat iconCompat, int i2) {
        }

        private Bitmap createColoredBitmap(int i2, int i3, int i4) {
        }

        private Bitmap createColoredBitmap(IconCompat iconCompat, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        public WearableExtender() {
        }

        @RequiresApi(20)
        private static Notification.Action getActionFromActionCompat(Action action) {
        }

        private void setFlag(int i2, boolean z) {
        }

        public WearableExtender addAction(Action action) {
        }

        public WearableExtender addActions(List<Action> list) {
        }

        @Deprecated
        public WearableExtender addPage(Notification notification) {
        }

        @Deprecated
        public WearableExtender addPages(List<Notification> list) {
        }

        public WearableExtender clearActions() {
        }

        @Deprecated
        public WearableExtender clearPages() {
        }

        /* renamed from: clone  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m4clone() throws CloneNotSupportedException {
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
        }

        public List<Action> getActions() {
        }

        @Deprecated
        public Bitmap getBackground() {
        }

        public String getBridgeTag() {
        }

        public int getContentAction() {
        }

        @Deprecated
        public int getContentIcon() {
        }

        @Deprecated
        public int getContentIconGravity() {
        }

        public boolean getContentIntentAvailableOffline() {
        }

        @Deprecated
        public int getCustomContentHeight() {
        }

        @Deprecated
        public int getCustomSizePreset() {
        }

        public String getDismissalId() {
        }

        @Deprecated
        public PendingIntent getDisplayIntent() {
        }

        @Deprecated
        public int getGravity() {
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
        }

        public boolean getHintContentIntentLaunchesActivity() {
        }

        @Deprecated
        public boolean getHintHideIcon() {
        }

        @Deprecated
        public int getHintScreenTimeout() {
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
        }

        @Deprecated
        public List<Notification> getPages() {
        }

        public boolean getStartScrollBottom() {
        }

        @Deprecated
        public WearableExtender setBackground(Bitmap bitmap) {
        }

        public WearableExtender setBridgeTag(String str) {
        }

        public WearableExtender setContentAction(int i2) {
        }

        @Deprecated
        public WearableExtender setContentIcon(int i2) {
        }

        @Deprecated
        public WearableExtender setContentIconGravity(int i2) {
        }

        public WearableExtender setContentIntentAvailableOffline(boolean z) {
        }

        @Deprecated
        public WearableExtender setCustomContentHeight(int i2) {
        }

        @Deprecated
        public WearableExtender setCustomSizePreset(int i2) {
        }

        public WearableExtender setDismissalId(String str) {
        }

        @Deprecated
        public WearableExtender setDisplayIntent(PendingIntent pendingIntent) {
        }

        @Deprecated
        public WearableExtender setGravity(int i2) {
        }

        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
        }

        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
        }

        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
        }

        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
        }

        @Deprecated
        public WearableExtender setHintScreenTimeout(int i2) {
        }

        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
        }

        public WearableExtender setStartScrollBottom(boolean z) {
        }

        public WearableExtender clone() {
        }

        public WearableExtender(Notification notification) {
        }
    }

    public static Action getAction(Notification notification, int i2) {
    }

    @RequiresApi(20)
    public static Action getActionCompatFromAction(Notification.Action action) {
    }

    public static int getActionCount(Notification notification) {
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
    }

    public static int getBadgeIconType(Notification notification) {
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification) {
    }

    public static String getCategory(Notification notification) {
    }

    public static String getChannelId(Notification notification) {
    }

    @RequiresApi(19)
    public static CharSequence getContentTitle(Notification notification) {
    }

    @Nullable
    public static Bundle getExtras(Notification notification) {
    }

    public static String getGroup(Notification notification) {
    }

    public static int getGroupAlertBehavior(Notification notification) {
    }

    @RequiresApi(21)
    public static List<Action> getInvisibleActions(Notification notification) {
    }

    public static boolean getLocalOnly(Notification notification) {
    }

    public static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
    }

    public static String getShortcutId(Notification notification) {
    }

    public static String getSortKey(Notification notification) {
    }

    public static long getTimeoutAfter(Notification notification) {
    }

    public static boolean isGroupSummary(Notification notification) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class CarExtender implements Extender {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        @Deprecated
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages;
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(String str) {
                }

                public Builder addMessage(String str) {
                }

                public UnreadConversation build() {
                }

                public Builder setLatestTimestamp(long j2) {
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                }
            }

            public UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j2) {
            }

            public long getLatestTimestamp() {
            }

            public String[] getMessages() {
            }

            public String getParticipant() {
            }

            public String[] getParticipants() {
            }

            public PendingIntent getReadPendingIntent() {
            }

            public RemoteInput getRemoteInput() {
            }

            public PendingIntent getReplyPendingIntent() {
            }
        }

        public CarExtender() {
        }

        @RequiresApi(21)
        private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation unreadConversation) {
        }

        @RequiresApi(21)
        private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle bundle) {
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
        }

        @ColorInt
        public int getColor() {
        }

        public Bitmap getLargeIcon() {
        }

        @Deprecated
        public UnreadConversation getUnreadConversation() {
        }

        public CarExtender setColor(@ColorInt int i2) {
        }

        public CarExtender setLargeIcon(Bitmap bitmap) {
        }

        @Deprecated
        public CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
        }

        public CarExtender(Notification notification) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class InboxStyle extends Style {
        private ArrayList<CharSequence> mTexts;

        public InboxStyle() {
        }

        public InboxStyle addLine(CharSequence charSequence) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public InboxStyle setBigContentTitle(CharSequence charSequence) {
        }

        public InboxStyle setSummaryText(CharSequence charSequence) {
        }

        public InboxStyle(Builder builder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        @Nullable
        private CharSequence mConversationTitle;
        @Nullable
        private Boolean mIsGroupConversation;
        private final List<Message> mMessages;
        private Person mUser;

        private MessagingStyle() {
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
        }

        @Nullable
        private Message findLatestIncomingMessage() {
        }

        private boolean hasMessagesWithoutSender() {
        }

        @NonNull
        private TextAppearanceSpan makeFontColorSpan(int i2) {
        }

        private CharSequence makeMessageLine(Message message) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence charSequence, long j2, CharSequence charSequence2) {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        @Nullable
        public CharSequence getConversationTitle() {
        }

        public List<Message> getMessages() {
        }

        public Person getUser() {
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
        }

        public boolean isGroupConversation() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(Bundle bundle) {
        }

        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence) {
        }

        public MessagingStyle setGroupConversation(boolean z) {
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence) {
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class Message {
            public static final String KEY_DATA_MIME_TYPE = "type";
            public static final String KEY_DATA_URI = "uri";
            public static final String KEY_EXTRAS_BUNDLE = "extras";
            public static final String KEY_NOTIFICATION_PERSON = "sender_person";
            public static final String KEY_PERSON = "person";
            public static final String KEY_SENDER = "sender";
            public static final String KEY_TEXT = "text";
            public static final String KEY_TIMESTAMP = "time";
            @Nullable
            private String mDataMimeType;
            @Nullable
            private Uri mDataUri;
            private Bundle mExtras;
            @Nullable
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            public Message(CharSequence charSequence, long j2, @Nullable Person person) {
            }

            @NonNull
            public static Bundle[] getBundleArrayForMessages(List<Message> list) {
            }

            @Nullable
            public static Message getMessageFromBundle(Bundle bundle) {
            }

            @NonNull
            public static List<Message> getMessagesFromBundleArray(Parcelable[] parcelableArr) {
            }

            private Bundle toBundle() {
            }

            @Nullable
            public String getDataMimeType() {
            }

            @Nullable
            public Uri getDataUri() {
            }

            @NonNull
            public Bundle getExtras() {
            }

            @Nullable
            public Person getPerson() {
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
            }

            @NonNull
            public CharSequence getText() {
            }

            public long getTimestamp() {
            }

            public Message setData(String str, Uri uri) {
            }

            @Deprecated
            public Message(CharSequence charSequence, long j2, CharSequence charSequence2) {
            }
        }

        public MessagingStyle(@NonNull Person person) {
        }

        public MessagingStyle addMessage(CharSequence charSequence, long j2, Person person) {
        }

        public MessagingStyle addMessage(Message message) {
        }
    }
}
