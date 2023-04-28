package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    public static final String LOG_TAG = "SearchView";
    public static final PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    public final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    public final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    public View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    public final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    public final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    public SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    public CursorAdapter mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    public View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private UpdatableTouchDelegate mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    public final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* renamed from: androidx.appcompat.widget.SearchView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass1(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements TextWatcher {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass10(SearchView searchView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass2(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements View.OnFocusChangeListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass3(SearchView searchView) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements View.OnLayoutChangeListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass4(SearchView searchView) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass5(SearchView searchView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements View.OnKeyListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass6(SearchView searchView) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements TextView.OnEditorActionListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass7(SearchView searchView) {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass8(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ SearchView this$0;

        public AnonymousClass9(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnCloseListener {
        boolean onClose();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i2);

        boolean onSuggestionSelect(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class PreQAutoCompleteTextViewReflector {
        private Method mDoAfterTextChanged;
        private Method mDoBeforeTextChanged;
        private Method mEnsureImeVisible;

        private static void preApi29Check() {
        }

        public void doAfterTextChanged(AutoCompleteTextView autoCompleteTextView) {
        }

        public void doBeforeTextChanged(AutoCompleteTextView autoCompleteTextView) {
        }

        public void ensureImeVisible(AutoCompleteTextView autoCompleteTextView) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public boolean isIconified;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        public final Runnable mRunShowSoftInputIfNecessary;
        private SearchView mSearchView;
        private int mThreshold;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ SearchAutoComplete this$0;

            public AnonymousClass1(SearchAutoComplete searchAutoComplete) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public SearchAutoComplete(Context context) {
        }

        private int getSearchViewTextMinWidthDp() {
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
        }

        public void ensureImeVisible() {
        }

        public boolean isEmpty() {
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        }

        @Override // android.view.View
        public void onFinishInflate() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
        }

        public void setSearchView(SearchView searchView) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
        }

        public void showSoftInputIfNecessary() {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class UpdatableTouchDelegate extends TouchDelegate {
        private final Rect mActualBounds;
        private boolean mDelegateTargeted;
        private final View mDelegateView;
        private final int mSlop;
        private final Rect mSlopBounds;
        private final Rect mTargetBounds;

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }

        public void setBounds(Rect rect, Rect rect2) {
        }
    }

    public SearchView(@NonNull Context context) {
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i2, String str4) {
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i2, String str) {
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
    }

    private void dismissSuggestions() {
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
    }

    private int getPreferredHeight() {
    }

    private int getPreferredWidth() {
    }

    private boolean hasVoiceSearch() {
    }

    public static boolean isLandscapeMode(Context context) {
    }

    private boolean isSubmitAreaEnabled() {
    }

    private void launchIntent(Intent intent) {
    }

    private boolean launchSuggestion(int i2, int i3, String str) {
    }

    private void postUpdateFocusedState() {
    }

    private void rewriteQueryFromSuggestion(int i2) {
    }

    private void updateCloseButton() {
    }

    private void updateQueryHint() {
    }

    private void updateSearchAutoComplete() {
    }

    private void updateSubmitArea() {
    }

    private void updateSubmitButton(boolean z) {
    }

    private void updateViewsVisibility(boolean z) {
    }

    private void updateVoiceButton(boolean z) {
    }

    public void adjustDropDownSizeAndPosition() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
    }

    public void forceSuggestionQuery() {
    }

    public int getImeOptions() {
    }

    public int getInputType() {
    }

    public int getMaxWidth() {
    }

    public CharSequence getQuery() {
    }

    @Nullable
    public CharSequence getQueryHint() {
    }

    public int getSuggestionCommitIconResId() {
    }

    public int getSuggestionRowLayout() {
    }

    public CursorAdapter getSuggestionsAdapter() {
    }

    public boolean isIconfiedByDefault() {
    }

    public boolean isIconified() {
    }

    public boolean isQueryRefinementEnabled() {
    }

    public boolean isSubmitButtonEnabled() {
    }

    public void launchQuerySearch(int i2, String str, String str2) {
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
    }

    public void onCloseClicked() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public boolean onItemClicked(int i2, int i3, String str) {
    }

    public boolean onItemSelected(int i2) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void onQueryRefine(CharSequence charSequence) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void onSearchClicked() {
    }

    public void onSubmitQuery() {
    }

    public boolean onSuggestionsKey(View view, int i2, KeyEvent keyEvent) {
    }

    public void onTextChanged(CharSequence charSequence) {
    }

    public void onTextFocusChanged() {
    }

    public void onVoiceClicked() {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z) {
    }

    public void setIconifiedByDefault(boolean z) {
    }

    public void setImeOptions(int i2) {
    }

    public void setInputType(int i2) {
    }

    public void setMaxWidth(int i2) {
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
    }

    public void setQueryRefinementEnabled(boolean z) {
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
    }

    public void setSubmitButtonEnabled(boolean z) {
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
    }

    public void updateFocusedState() {
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    private void setQuery(CharSequence charSequence) {
    }
}
