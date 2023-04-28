package com.tencent.qcloud.tuikit.tuisearch;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUISearchService extends ServiceInitializer implements ITUISearchService {
    public static final String TAG = TUISearchService.class.getSimpleName();

    private void initExtension() {
        TUICore.registerExtension(TUIConstants.TUIConversation.EXTENSION_SEARCH, this);
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public void init(Context context) {
        initExtension();
    }

    @Override // com.tencent.qcloud.tuikit.tuisearch.ITUISearchService, com.tencent.qcloud.tuicore.interfaces.ITUIExtension
    public Map<String, Object> onGetExtensionInfo(String str, Map<String, Object> map) {
        Context context;
        HashMap hashMap = new HashMap();
        if (map != null && (context = (Context) map.get("context")) != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.search_bar_layout, (ViewGroup) null);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.qcloud.tuikit.tuisearch.TUISearchService.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TUICore.startActivity("SearchMainActivity", new Bundle());
                }
            });
            hashMap.put(TUIConstants.TUIConversation.SEARCH_VIEW, inflate);
        }
        return hashMap;
    }
}
