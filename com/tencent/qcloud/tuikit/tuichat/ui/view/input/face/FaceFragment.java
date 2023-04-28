package com.tencent.qcloud.tuikit.tuichat.ui.view.input.face;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.tencent.qcloud.tuikit.tuichat.component.face.ChatFace;
import com.tencent.qcloud.tuikit.tuichat.component.face.CustomFace;
import com.tencent.qcloud.tuikit.tuichat.component.face.Emoji;
import com.tencent.qcloud.tuikit.tuichat.component.face.EmojiIndicatorView;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceGroup;
import com.tencent.qcloud.tuikit.tuichat.component.face.RecentEmojiManager;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.BaseInputFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FaceFragment extends BaseInputFragment {
    public ArrayList<View> ViewPagerItems;
    public LinearLayout faceGroup;
    public List<FaceGroup> faceGroups;
    public EmojiIndicatorView faceIndicator;
    public ViewPager faceViewPager;
    public OnEmojiClickListener listener;
    public int mCurrentGroupIndex;
    public FaceGroupIcon mCurrentSelected;
    public RecentEmojiManager recentManager;
    public ArrayList<Emoji> recentlyEmojiList;
    public boolean showCustomFace;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ FaceFragment this$0;
        public final /* synthetic */ FaceGroup val$group;

        public AnonymousClass1(FaceFragment faceFragment, FaceGroup faceGroup) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ViewPager.OnPageChangeListener {
        public int oldPosition;
        public final /* synthetic */ FaceFragment this$0;

        public AnonymousClass2(FaceFragment faceFragment) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.view.input.face.FaceFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ FaceFragment this$0;
        public final /* synthetic */ int val$columns;
        public final /* synthetic */ int val$rows;
        public final /* synthetic */ List val$subList;

        public AnonymousClass3(FaceFragment faceFragment, List list, int i2, int i3) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class FaceGVAdapter extends BaseAdapter {
        public final List<ChatFace> list;
        public final Context mContext;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class ViewHolder {
            public ImageView iv;
            public final /* synthetic */ FaceGVAdapter this$0;

            public ViewHolder(FaceGVAdapter faceGVAdapter) {
            }
        }

        public FaceGVAdapter(List<ChatFace> list, Context context) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class FaceVPAdapter extends PagerAdapter {
        public final /* synthetic */ FaceFragment this$0;
        public List<View> views;

        public FaceVPAdapter(FaceFragment faceFragment, List<View> list) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(View view, int i2, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(View view, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnEmojiClickListener {
        void onCustomFaceClick(int i2, CustomFace customFace);

        void onEmojiClick(Emoji emoji);

        void onEmojiDelete();
    }

    public int getPagerCount(ArrayList<? extends ChatFace> arrayList, int i2, int i3) {
    }

    public View getViewPagerItem(int i2, ArrayList<? extends ChatFace> arrayList, int i3, int i4) {
    }

    public void initViewPager(ArrayList<? extends ChatFace> arrayList, int i2, int i3) {
    }

    public void initViews() {
    }

    public void intiIndicator(ArrayList<? extends ChatFace> arrayList, int i2, int i3) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    public void setListener(OnEmojiClickListener onEmojiClickListener) {
    }

    public void setShowCustomFace(boolean z) {
    }
}
