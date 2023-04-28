package com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.qcloud.tuicore.component.CustomLinearLayoutManager;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.helper.IIndexBarDataHelper;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class IndexBar extends View {
    public static String[] INDEX_STRING;
    private static final String TAG = null;
    private boolean isNeedRealIndex;
    private boolean isSourceDatasAlreadySorted;
    private IIndexBarDataHelper mDataHelper;
    private int mGapHeight;
    private int mHeaderViewCount;
    private int mHeight;
    private List<String> mIndexDatas;
    private CustomLinearLayoutManager mLayoutManager;
    private onIndexPressedListener mOnIndexPressedListener;
    private Paint mPaint;
    private int mPressedBackground;
    private TextView mPressedShowTextView;
    private List<? extends BaseIndexPinyinBean> mSourceDatas;
    private int mWidth;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements onIndexPressedListener {
        public final /* synthetic */ IndexBar this$0;

        public AnonymousClass1(IndexBar indexBar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar.onIndexPressedListener
        public void onIndexPressed(int i2, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.widget.IndexBar.onIndexPressedListener
        public void onMotionEventEnd() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface onIndexPressedListener {
        void onIndexPressed(int i2, String str);

        void onMotionEventEnd();
    }

    public IndexBar(Context context) {
    }

    public static /* synthetic */ TextView access$000(IndexBar indexBar) {
    }

    public static /* synthetic */ CustomLinearLayoutManager access$100(IndexBar indexBar) {
    }

    public static /* synthetic */ int access$200(IndexBar indexBar, String str) {
    }

    private void computeGapHeight() {
    }

    private int getPosByTag(String str) {
    }

    private void init(Context context, AttributeSet attributeSet, int i2) {
    }

    private void initIndexDatas() {
    }

    private void initSourceDatas() {
    }

    private void sortData() {
    }

    public IIndexBarDataHelper getDataHelper() {
    }

    public int getHeaderViewCount() {
    }

    public onIndexPressedListener getOnIndexPressedListener() {
    }

    public boolean isSourceDatasAlreadySorted() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    public IndexBar setDataHelper(IIndexBarDataHelper iIndexBarDataHelper) {
    }

    public IndexBar setHeaderViewCount(int i2) {
    }

    public IndexBar setLayoutManager(CustomLinearLayoutManager customLinearLayoutManager) {
    }

    public IndexBar setNeedRealIndex(boolean z) {
    }

    public void setOnIndexPressedListener(onIndexPressedListener onindexpressedlistener) {
    }

    public IndexBar setPressedShowTextView(TextView textView) {
    }

    public IndexBar setSourceDatas(List<? extends BaseIndexPinyinBean> list) {
    }

    public IndexBar setSourceDatasAlreadySorted(boolean z) {
    }

    public IndexBar(Context context, AttributeSet attributeSet) {
    }

    public IndexBar(Context context, AttributeSet attributeSet, int i2) {
    }
}
