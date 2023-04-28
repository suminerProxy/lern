package h.u.a.u.y3.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu;

/* compiled from: CustomChatPopMenu.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a extends ChatPopMenu {

    /* compiled from: CustomChatPopMenu.java */
    /* renamed from: h.u.a.u.y3.r.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0379a extends ChatPopMenu.MenuAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f24927a;

        /* compiled from: CustomChatPopMenu.java */
        /* renamed from: h.u.a.u.y3.r.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class View$OnClickListenerC0380a implements View.OnClickListener {
            public final /* synthetic */ ChatPopMenu.ChatPopMenuAction b;
            public final /* synthetic */ C0379a c;

            public View$OnClickListenerC0380a(C0379a c0379a, ChatPopMenu.ChatPopMenuAction chatPopMenuAction) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public C0379a(a aVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.MenuAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull ChatPopMenu.MenuAdapter.MenuItemViewHolder menuItemViewHolder, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.MenuAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ ChatPopMenu.MenuAdapter.MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.MenuAdapter
        /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
        public void onBindViewHolder2(@NonNull ChatPopMenu.MenuAdapter.MenuItemViewHolder menuItemViewHolder, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu.MenuAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
        public ChatPopMenu.MenuAdapter.MenuItemViewHolder onCreateViewHolder2(@NonNull ViewGroup viewGroup, int i2) {
        }
    }

    /* compiled from: CustomChatPopMenu.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        public Paint f24928a;
        public Path b;
        public View c;

        /* renamed from: d  reason: collision with root package name */
        public int f24929d;

        /* renamed from: e  reason: collision with root package name */
        public float f24930e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f24931f;

        public b(a aVar, View view, int i2, float f2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public a(Context context) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.popmenu.ChatPopMenu
    public void show(View view, int i2) {
    }
}
