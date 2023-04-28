package com.tencent.cloud.huiyansdkface.normal.net;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BaseResponse<T extends Serializable> implements Serializable {
    public String bizSeqNo;
    public String code;
    public String csrfToken;
    public String ecifNo;
    public String msg;
    public T result;
    public ArrayList<RetList> retList;
    public String status;
    public String submitKey;
    public String transactionTime;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class RetList implements Serializable {
        public String retCode;
        public String retMessage;
    }
}
