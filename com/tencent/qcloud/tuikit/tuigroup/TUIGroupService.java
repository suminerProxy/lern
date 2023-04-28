package com.tencent.qcloud.tuikit.tuigroup;

import android.content.Context;
import com.tencent.imsdk.v2.V2TIMGroupChangeInfo;
import com.tencent.imsdk.v2.V2TIMGroupListener;
import com.tencent.imsdk.v2.V2TIMGroupMemberChangeInfo;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.v2.V2TIMManager;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.TUILogin;
import com.tencent.qcloud.tuikit.tuigroup.interfaces.GroupEventListener;
import com.tencent.qcloud.tuikit.tuigroup.util.TUIGroupUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIGroupService extends ServiceInitializer implements ITUIGroupService {
    public static final String TAG = TUIGroupService.class.getSimpleName();
    private static TUIGroupService instance;
    private final List<WeakReference<GroupEventListener>> groupEventListenerList = new ArrayList();

    public static TUIGroupService getInstance() {
        return instance;
    }

    private void initIMListener() {
        V2TIMManager.getInstance().addGroupListener(new V2TIMGroupListener() { // from class: com.tencent.qcloud.tuikit.tuigroup.TUIGroupService.1
            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onApplicationProcessed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, boolean z, String str2) {
                super.onApplicationProcessed(str, v2TIMGroupMemberInfo, z, str2);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGrantAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
                super.onGrantAdministrator(str, v2TIMGroupMemberInfo, list);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGroupAttributeChanged(String str, Map<String, String> map) {
                super.onGroupAttributeChanged(str, map);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGroupCreated(String str) {
                super.onGroupCreated(str);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGroupDismissed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_DISMISS, hashMap);
                TUIGroupUtils.toastGroupEvent(4, str);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGroupInfoChanged(String str, List<V2TIMGroupChangeInfo> list) {
                for (GroupEventListener groupEventListener : TUIGroupService.this.getGroupEventListenerList()) {
                    groupEventListener.onGroupInfoChanged(str);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                for (V2TIMGroupChangeInfo v2TIMGroupChangeInfo : list) {
                    if (v2TIMGroupChangeInfo.getType() == 1) {
                        hashMap.put("groupName", v2TIMGroupChangeInfo.getValue());
                    } else if (v2TIMGroupChangeInfo.getType() == 4) {
                        hashMap.put(TUIConstants.TUIGroup.GROUP_FACE_URL, v2TIMGroupChangeInfo.getValue());
                    } else if (v2TIMGroupChangeInfo.getType() == 5) {
                        hashMap.put(TUIConstants.TUIGroup.GROUP_OWNER, v2TIMGroupChangeInfo.getValue());
                    } else if (v2TIMGroupChangeInfo.getType() == 3) {
                        hashMap.put(TUIConstants.TUIGroup.GROUP_NOTIFICATION, v2TIMGroupChangeInfo.getValue());
                    } else if (v2TIMGroupChangeInfo.getType() != 2) {
                        return;
                    } else {
                        hashMap.put(TUIConstants.TUIGroup.GROUP_INTRODUCTION, v2TIMGroupChangeInfo.getValue());
                    }
                }
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_INFO_CHANGED, hashMap);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onGroupRecycled(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_GROUP_RECYCLE, hashMap);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onMemberEnter(String str, List<V2TIMGroupMemberInfo> list) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                ArrayList arrayList = new ArrayList();
                for (V2TIMGroupMemberInfo v2TIMGroupMemberInfo : list) {
                    arrayList.add(v2TIMGroupMemberInfo.getUserID());
                }
                hashMap.put(TUIConstants.TUIGroup.GROUP_MEMBER_ID_LIST, arrayList);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_JOIN_GROUP, hashMap);
                if (arrayList.contains(TUILogin.getLoginUser())) {
                    TUIGroupUtils.toastGroupEvent(1, str);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onMemberInfoChanged(String str, List<V2TIMGroupMemberChangeInfo> list) {
                super.onMemberInfoChanged(str, list);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onMemberInvited(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                ArrayList arrayList = new ArrayList();
                for (V2TIMGroupMemberInfo v2TIMGroupMemberInfo2 : list) {
                    arrayList.add(v2TIMGroupMemberInfo2.getUserID());
                }
                hashMap.put(TUIConstants.TUIGroup.GROUP_MEMBER_ID_LIST, arrayList);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_INVITED_GROUP, hashMap);
                if (arrayList.contains(TUILogin.getLoginUser())) {
                    TUIGroupUtils.toastGroupEvent(2, str);
                }
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onMemberKicked(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                ArrayList arrayList = new ArrayList();
                for (V2TIMGroupMemberInfo v2TIMGroupMemberInfo2 : list) {
                    arrayList.add(v2TIMGroupMemberInfo2.getUserID());
                }
                hashMap.put(TUIConstants.TUIGroup.GROUP_MEMBER_ID_LIST, arrayList);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_MEMBER_KICKED_GROUP, hashMap);
                arrayList.contains(TUILogin.getLoginUser());
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onMemberLeave(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
                super.onMemberLeave(str, v2TIMGroupMemberInfo);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onQuitFromGroup(String str) {
                HashMap hashMap = new HashMap();
                hashMap.put("groupId", str);
                TUICore.notifyEvent(TUIConstants.TUIGroup.EVENT_GROUP, TUIConstants.TUIGroup.EVENT_SUB_KEY_EXIT_GROUP, hashMap);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onReceiveJoinApplication(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, String str2) {
                super.onReceiveJoinApplication(str, v2TIMGroupMemberInfo, str2);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onReceiveRESTCustomData(String str, byte[] bArr) {
                super.onReceiveRESTCustomData(str, bArr);
            }

            @Override // com.tencent.imsdk.v2.V2TIMGroupListener
            public void onRevokeAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
                super.onRevokeAdministrator(str, v2TIMGroupMemberInfo, list);
            }
        });
    }

    public void addGroupEventListener(GroupEventListener groupEventListener) {
        if (groupEventListener == null) {
            return;
        }
        for (WeakReference<GroupEventListener> weakReference : this.groupEventListenerList) {
            if (weakReference.get() == groupEventListener) {
                return;
            }
        }
        this.groupEventListenerList.add(new WeakReference<>(groupEventListener));
    }

    public List<GroupEventListener> getGroupEventListenerList() {
        ArrayList arrayList = new ArrayList();
        ListIterator<WeakReference<GroupEventListener>> listIterator = this.groupEventListenerList.listIterator();
        while (listIterator.hasNext()) {
            GroupEventListener groupEventListener = listIterator.next().get();
            if (groupEventListener == null) {
                listIterator.remove();
            } else {
                arrayList.add(groupEventListener);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getLightThemeResId() {
        return R.style.TUIGroupLightTheme;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getLivelyThemeResId() {
        return R.style.TUIGroupLivelyTheme;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public int getSeriousThemeResId() {
        return R.style.TUIGroupSeriousTheme;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public void init(Context context) {
        instance = this;
        initIMListener();
    }

    @Override // com.tencent.qcloud.tuikit.tuigroup.ITUIGroupService, com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map) {
        return null;
    }
}
