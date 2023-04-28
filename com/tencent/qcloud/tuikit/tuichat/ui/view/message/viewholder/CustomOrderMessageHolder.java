package com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.imageEngine.impl.GlideEngine;
import com.tencent.qcloud.tuicore.util.ScreenUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomOrderMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import h.g.a.p.a;
import h.g.a.p.p.q;
import h.g.a.t.h;
import h.g.a.t.l.p;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomOrderMessageHolder extends MessageContentHolder {
    public static final String TAG = "CustomOrderMessageHolder";
    private TextView contentView;
    private ImageView imageView;
    private TextView priceView;
    private TextView titleView;

    public CustomOrderMessageHolder(View view) {
        super(view);
        this.imageView = (ImageView) view.findViewById(R.id.content_image_iv);
        this.titleView = (TextView) view.findViewById(R.id.order_title);
        this.contentView = (TextView) view.findViewById(R.id.order_description);
        this.priceView = (TextView) view.findViewById(R.id.order_price);
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageBaseHolder
    public int getVariableLayout() {
        return R.layout.custom_order_message_layout;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.MessageContentHolder
    public void layoutVariableViews(TUIMessageBean tUIMessageBean, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        if (tUIMessageBean instanceof CustomOrderMessageBean) {
            CustomOrderMessageBean customOrderMessageBean = (CustomOrderMessageBean) tUIMessageBean;
            String title = customOrderMessageBean.getTitle();
            str2 = customOrderMessageBean.getDescription();
            str3 = customOrderMessageBean.getPrice();
            str4 = customOrderMessageBean.getLink();
            str5 = customOrderMessageBean.getImageUrl();
            str = title;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        GlideEngine.loadCornerImageWithoutPlaceHolder(this.imageView, str5, new h(this) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomOrderMessageHolder.1
            public final /* synthetic */ CustomOrderMessageHolder this$0;

            @Override // h.g.a.t.h
            public boolean onLoadFailed(@Nullable q qVar, Object obj, p pVar, boolean z) {
            }

            @Override // h.g.a.t.h
            public boolean onResourceReady(Object obj, Object obj2, p pVar, a aVar, boolean z) {
            }
        }, ScreenUtil.dip2px(4.0f));
        this.titleView.setText(str);
        this.contentView.setText(str2);
        this.priceView.setText(str3);
        this.msgContentFrame.setClickable(true);
        this.msgContentFrame.setOnClickListener(new View.OnClickListener(this, str4) { // from class: com.tencent.qcloud.tuikit.tuichat.ui.view.message.viewholder.CustomOrderMessageHolder.2
            public final /* synthetic */ CustomOrderMessageHolder this$0;
            public final /* synthetic */ String val$finalLink;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }
}
