package com.tencent.imsdk.manager;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomServerInfo {
    public List<ServerAddress> longconnectionAddressList = new ArrayList();
    public List<ServerAddress> shortconnectionAddressList = new ArrayList();
    public String serverPublicKey = "";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class ServerAddress {
        public String ip = "";
        public int port = 0;
        public boolean isIPv6 = false;
        public boolean isQuic = false;
    }
}
