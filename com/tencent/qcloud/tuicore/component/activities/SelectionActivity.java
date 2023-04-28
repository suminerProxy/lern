package com.tencent.qcloud.tuicore.component.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SelectionActivity extends BaseLightActivity {
    private static OnResultReturnListener sOnResultReturnListener;
    private EditText input;
    private int mSelectionType;
    private boolean needConfirm;
    private OnItemClickListener onItemClickListener;
    private boolean returnNow;
    private ArrayList<String> selectList;
    private SelectAdapter selectListAdapter;
    private RecyclerView selectListView;
    private int selectedItem;

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.SelectionActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements OnItemClickListener {
        public final /* synthetic */ SelectionActivity this$0;

        public AnonymousClass1(SelectionActivity selectionActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.activities.SelectionActivity.OnItemClickListener
        public void onClick(int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.SelectionActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ SelectionActivity this$0;

        public AnonymousClass2(SelectionActivity selectionActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.activities.SelectionActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SelectionActivity this$0;

        public AnonymousClass3(SelectionActivity selectionActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnItemClickListener {
        void onClick(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnResultReturnListener {
        void onReturn(Object obj);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class SelectAdapter extends RecyclerView.Adapter<SelectViewHolder> {
        public ArrayList<String> data;
        public int selectedItem;
        public final /* synthetic */ SelectionActivity this$0;

        /* renamed from: com.tencent.qcloud.tuicore.component.activities.SelectionActivity$SelectAdapter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements View.OnClickListener {
            public final /* synthetic */ SelectAdapter this$1;
            public final /* synthetic */ int val$position;

            public AnonymousClass1(SelectAdapter selectAdapter, int i2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class SelectViewHolder extends RecyclerView.ViewHolder {
            public TextView name;
            public ImageView selectedIcon;
            public final /* synthetic */ SelectAdapter this$1;

            public SelectViewHolder(@NonNull SelectAdapter selectAdapter, View view) {
            }
        }

        public SelectAdapter(SelectionActivity selectionActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull SelectViewHolder selectViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ SelectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        public void setData(ArrayList<String> arrayList) {
        }

        public void setSelectedItem(int i2) {
        }

        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull SelectViewHolder selectViewHolder, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public SelectViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class Selection {
        public static final String CONTENT = "content";
        public static final String DEFAULT_SELECT_ITEM_INDEX = "default_select_item_index";
        public static final String INIT_CONTENT = "init_content";
        public static final String LIMIT = "limit";
        public static final String LIST = "list";
        public static final String NEED_CONFIRM = "needConfirm";
        public static final String RETURN_NOW = "returnNow";
        public static final String SELECT_ALL = "select_all";
        public static final String TITLE = "title";
        public static final String TYPE = "type";
        public static final int TYPE_LIST = 2;
        public static final int TYPE_TEXT = 1;
    }

    public static /* synthetic */ int access$002(SelectionActivity selectionActivity, int i2) {
    }

    public static /* synthetic */ SelectAdapter access$100(SelectionActivity selectionActivity) {
    }

    public static /* synthetic */ boolean access$200(SelectionActivity selectionActivity) {
    }

    public static /* synthetic */ void access$300(SelectionActivity selectionActivity) {
    }

    public static /* synthetic */ OnItemClickListener access$400(SelectionActivity selectionActivity) {
    }

    private void echoClick() {
    }

    public static void startListSelection(Context context, Bundle bundle, OnResultReturnListener onResultReturnListener) {
    }

    private static void startSelection(Context context, Bundle bundle, OnResultReturnListener onResultReturnListener) {
    }

    public static void startTextSelection(Context context, Bundle bundle, OnResultReturnListener onResultReturnListener) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }
}
