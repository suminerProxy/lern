package com.showstartfans.activity.activitys.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.showstartfans.activity.R;
import com.showstartfans.activity.activitys.maintab.newmain.MainNewActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.taihebase.activity.view.LoadImageView;
import h.w.a.e.b.b.s.e;
import h.y.a.k.f;
import h.y.a.m.h;
import h.y.a.m.i;
import h.y.a.m.n;
import h.y.a.n.e0;
import h.y.a.n.i0;
import h.y.a.n.j1;
import h.y.a.n.u0;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AdvertActivity extends BaseNoToolBarActivity implements View.OnClickListener, f {
    private LoadImageView b;
    private FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f6470d;

    /* renamed from: e  reason: collision with root package name */
    private b f6471e;

    /* renamed from: f  reason: collision with root package name */
    private j1 f6472f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdvertActivity f6473a;

        public /* synthetic */ b(AdvertActivity advertActivity, long j2, long j3, a aVar) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }

        private b(AdvertActivity advertActivity, long j2, long j3) {
        }
    }

    private void A(String str) {
        String str2;
        TextView textView = this.f6470d;
        if (TextUtils.isEmpty(str)) {
            str2 = "跳过";
        } else {
            str2 = str + "s 跳过";
        }
        textView.setText(str2);
    }

    private void B() {
        b bVar = this.f6471e;
        if (bVar != null) {
            bVar.cancel();
        }
        this.f6471e = null;
    }

    private void x() {
        String s = u0.L().s();
        if (TextUtils.isEmpty(s)) {
            return;
        }
        i iVar = new i();
        iVar.put("mediaId", s);
        h.k(getCtx().getApplicationContext(), "/app/home/click_ad", iVar, h.u.a.c.o0.b.f19949a);
    }

    private void y() {
        startActivity(new Intent(getCtx(), MainNewActivity.class));
        overridePendingTransition(R.anim.anima_alpha_share_in, R.anim.anima_alpha_share_out);
        finish();
    }

    public static /* synthetic */ void z(n nVar) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
        String s;
        j1 j1Var = new j1(this);
        this.f6472f = j1Var;
        j1Var.setOnHandlerListener(this);
        this.f6471e = new b(this, e.r, 1000L, null);
        if (!TextUtils.isEmpty(u0.L().s())) {
            String str = "file://" + u0.L().e1(s);
            i0.d("广告图片地址===", str);
            e0.C(this.b, str);
        }
        this.f6471e.start();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
        this.f6470d.setOnClickListener(this);
        this.b.setOnClickListener(this);
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
        this.b = (LoadImageView) findViewById(R.id.image_advert);
        this.f6470d = (TextView) findViewById(R.id.txt_jump);
        this.c = (FrameLayout) findViewById(R.id.parent_ad);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != 2131363136) {
            if (id != 2131365951) {
                return;
            }
            B();
            y();
            return;
        }
        x();
        B();
        Intent intent = new Intent(getCtx(), MainNewActivity.class);
        intent.putExtra("fromHomeAdvert", true);
        startActivity(intent);
        overridePendingTransition(R.anim.anima_alpha_share_in, R.anim.anima_alpha_share_out);
        finish();
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        B();
        j1 j1Var = this.f6472f;
        if (j1Var != null) {
            j1Var.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    @Override // h.y.a.k.f
    public void onHandlerMessage(Activity activity, Message message) {
        try {
            if (message != null) {
                int i2 = message.what;
                if (i2 == 1001) {
                    y();
                    return;
                }
                if (i2 == 1002) {
                    A("");
                    B();
                    y();
                    return;
                } else if (i2 == 1003) {
                    Object obj = message.obj;
                    A(obj != null ? (String) obj : "");
                    return;
                } else {
                    return;
                }
            }
            y();
        } catch (Exception e2) {
            e2.printStackTrace();
            y();
        }
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
        return R.layout.activity_advert;
    }
}
