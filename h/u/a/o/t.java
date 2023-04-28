package h.u.a.o;

import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexBean;
import com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean;

/* compiled from: MyContactItemBean.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class t extends BaseIndexPinyinBean {
    public ContactItemBean contactItemBean;
    public a userType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: MyContactItemBean.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a Manager = null;
        public static final a Normal = null;
        public static final a Owner = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }
    }

    public static t convertFromContactItemBean(ContactItemBean contactItemBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean
    public String getBaseIndexPinyin() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexBean
    public String getBaseIndexTag() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexBean, com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.ISuspensionInterface
    public String getSuspensionTag() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean
    public String getTarget() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean
    public boolean isNeedToPinyin() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexBean, com.tencent.qcloud.tuikit.tuicontact.component.indexlib.suspension.ISuspensionInterface
    public boolean isShowSuspension() {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexPinyinBean
    public BaseIndexPinyinBean setBaseIndexPinyin(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.component.indexlib.IndexBar.bean.BaseIndexBean
    public BaseIndexBean setBaseIndexTag(String str) {
    }
}
