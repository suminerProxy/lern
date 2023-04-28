package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AlertController {
    public ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final View.OnClickListener mButtonHandler;
    private final int mButtonIconDimen;
    public Button mButtonNegative;
    private Drawable mButtonNegativeIcon;
    public Message mButtonNegativeMessage;
    private CharSequence mButtonNegativeText;
    public Button mButtonNeutral;
    private Drawable mButtonNeutralIcon;
    public Message mButtonNeutralMessage;
    private CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    public Button mButtonPositive;
    private Drawable mButtonPositiveIcon;
    public Message mButtonPositiveMessage;
    private CharSequence mButtonPositiveText;
    public int mCheckedItem;
    private final Context mContext;
    private View mCustomTitleView;
    public final AppCompatDialog mDialog;
    public Handler mHandler;
    private Drawable mIcon;
    private int mIconId;
    private ImageView mIconView;
    public int mListItemLayout;
    public int mListLayout;
    public ListView mListView;
    private CharSequence mMessage;
    private TextView mMessageView;
    public int mMultiChoiceItemLayout;
    public NestedScrollView mScrollView;
    private boolean mShowTitle;
    public int mSingleChoiceItemLayout;
    private CharSequence mTitle;
    private TextView mTitleView;
    private View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final Window mWindow;

    /* renamed from: androidx.appcompat.app.AlertController$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ AlertController this$0;

        public AnonymousClass1(AlertController alertController) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        public final /* synthetic */ AlertController this$0;
        public final /* synthetic */ View val$bottom;
        public final /* synthetic */ View val$top;

        public AnonymousClass2(AlertController alertController, View view, View view2) {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ AlertController this$0;
        public final /* synthetic */ View val$bottom;
        public final /* synthetic */ View val$top;

        public AnonymousClass3(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements AbsListView.OnScrollListener {
        public final /* synthetic */ AlertController this$0;
        public final /* synthetic */ View val$bottom;
        public final /* synthetic */ View val$top;

        public AnonymousClass4(AlertController alertController, View view, View view2) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ AlertController this$0;
        public final /* synthetic */ View val$bottom;
        public final /* synthetic */ View val$top;

        public AnonymousClass5(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends ArrayAdapter<CharSequence> {
            public final /* synthetic */ AlertParams this$0;
            public final /* synthetic */ RecycleListView val$listView;

            public AnonymousClass1(AlertParams alertParams, Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 extends CursorAdapter {
            private final int mIsCheckedIndex;
            private final int mLabelIndex;
            public final /* synthetic */ AlertParams this$0;
            public final /* synthetic */ AlertController val$dialog;
            public final /* synthetic */ RecycleListView val$listView;

            public AnonymousClass2(AlertParams alertParams, Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertParams this$0;
            public final /* synthetic */ AlertController val$dialog;

            public AnonymousClass3(AlertParams alertParams, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass4 implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertParams this$0;
            public final /* synthetic */ AlertController val$dialog;
            public final /* synthetic */ RecycleListView val$listView;

            public AnonymousClass4(AlertParams alertParams, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
        }

        private void createListView(AlertController alertController) {
        }

        public void apply(AlertController alertController) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ButtonHandler extends Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private WeakReference<DialogInterface> mDialog;

        public ButtonHandler(DialogInterface dialogInterface) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        public CheckedItemAdapter(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class RecycleListView extends ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(Context context) {
        }

        public void setHasDecor(boolean z, boolean z2) {
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
    }

    public static boolean canTextInput(View view) {
    }

    private void centerButton(Button button) {
    }

    public static void manageScrollIndicators(View view, View view2, View view3) {
    }

    @Nullable
    private ViewGroup resolvePanel(@Nullable View view, @Nullable View view2) {
    }

    private int selectContentView() {
    }

    private void setScrollIndicators(ViewGroup viewGroup, View view, int i2, int i3) {
    }

    private void setupButtons(ViewGroup viewGroup) {
    }

    private void setupContent(ViewGroup viewGroup) {
    }

    private void setupCustomContent(ViewGroup viewGroup) {
    }

    private void setupTitle(ViewGroup viewGroup) {
    }

    private void setupView() {
    }

    private static boolean shouldCenterSingleButton(Context context) {
    }

    public Button getButton(int i2) {
    }

    public int getIconAttributeResId(int i2) {
    }

    public ListView getListView() {
    }

    public void installContent() {
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
    }

    public void setButton(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
    }

    public void setButtonPanelLayoutHint(int i2) {
    }

    public void setCustomTitle(View view) {
    }

    public void setIcon(int i2) {
    }

    public void setMessage(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setView(int i2) {
    }

    public void setView(View view) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setView(View view, int i2, int i3, int i4, int i5) {
    }
}
