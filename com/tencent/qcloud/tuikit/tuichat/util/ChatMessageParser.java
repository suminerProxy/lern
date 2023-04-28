package com.tencent.qcloud.tuikit.tuichat.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tencent.imsdk.v2.V2TIMCustomElem;
import com.tencent.imsdk.v2.V2TIMImageElem;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.util.DateTimeUtil;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.TUIChatConstants;
import com.tencent.qcloud.tuikit.tuichat.TUIChatService;
import com.tencent.qcloud.tuikit.tuichat.bean.CallModel;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageCustom;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageFeature;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReactBean;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageRepliesBean;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageTyping;
import com.tencent.qcloud.tuikit.tuichat.bean.ReplyPreviewBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CallingMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.CustomLinkMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.FaceMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.FileMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ImageMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.LocationMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.QuoteMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ReplyMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TextMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TipsMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.VideoMessageBean;
import com.tencent.qcloud.tuikit.tuichat.component.face.FaceManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatMessageParser {
    private static final String TAG = "ChatMessageParser";

    private static TUIMessageBean getCallingMessage(V2TIMMessage v2TIMMessage) {
        String string;
        List<String> list;
        boolean z = !TextUtils.isEmpty(v2TIMMessage.getGroupID());
        CallModel convert2VideoCallData = CallModel.convert2VideoCallData(v2TIMMessage);
        if (convert2VideoCallData == null) {
            return null;
        }
        String displayName = getDisplayName(v2TIMMessage);
        Context appContext = ServiceInitializer.getAppContext();
        switch (convert2VideoCallData.action) {
            case 1:
                if (z) {
                    string = "\"" + displayName + "\"" + appContext.getString(R.string.start_group_call);
                    break;
                } else {
                    string = appContext.getString(R.string.start_call);
                    break;
                }
            case 2:
                string = appContext.getString(z ? R.string.cancle_group_call : R.string.cancle_call);
                break;
            case 3:
                if (z) {
                    string = "\"" + displayName + "\"" + appContext.getString(R.string.reject_group_calls);
                    break;
                } else {
                    string = appContext.getString(R.string.reject_calls);
                    break;
                }
            case 4:
                if (!z || (list = convert2VideoCallData.invitedList) == null || list.size() != 1 || !convert2VideoCallData.invitedList.get(0).equals(v2TIMMessage.getSender())) {
                    StringBuilder sb = new StringBuilder();
                    List<String> list2 = convert2VideoCallData.invitedList;
                    if (list2 != null && list2.size() > 0) {
                        for (String str : convert2VideoCallData.invitedList) {
                            sb.append(str);
                            sb.append("、");
                        }
                        if (sb.length() > 0) {
                            sb.delete(sb.length() - 1, sb.length());
                        }
                    }
                    if (z) {
                        string = "\"" + sb.toString() + "\"" + appContext.getString(R.string.no_response_call);
                        break;
                    } else {
                        string = appContext.getString(R.string.no_response_call);
                        break;
                    }
                } else {
                    string = "\"" + displayName + "\"" + appContext.getString(R.string.no_response_call);
                    break;
                }
            case 5:
                if (!z) {
                    string = appContext.getString(R.string.stop_call_tip) + DateTimeUtil.formatSecondsTo00(convert2VideoCallData.duration);
                    break;
                } else {
                    string = appContext.getString(R.string.stop_group_call);
                    break;
                }
            case 6:
                if (z) {
                    string = "\"" + displayName + "\"" + appContext.getString(R.string.line_busy);
                    break;
                } else {
                    string = appContext.getString(R.string.other_line_busy);
                    break;
                }
            case 7:
                if (z) {
                    string = "\"" + displayName + "\"" + appContext.getString(R.string.accept_call);
                    break;
                } else {
                    string = appContext.getString(R.string.accept_call);
                    break;
                }
            case 8:
                string = appContext.getString(R.string.chat_calling_switch_to_audio);
                break;
            case 9:
                string = appContext.getString(R.string.chat_calling_switch_to_audio_accept);
                break;
            case 10:
                string = appContext.getString(R.string.chat_calling_unknown_invitation);
                break;
            default:
                string = appContext.getString(R.string.invalid_command);
                break;
        }
        if (z) {
            TipsMessageBean tipsMessageBean = new TipsMessageBean();
            tipsMessageBean.setCommonAttribute(v2TIMMessage);
            tipsMessageBean.setText(string);
            tipsMessageBean.setExtra(string);
            return tipsMessageBean;
        }
        CallingMessageBean callingMessageBean = new CallingMessageBean();
        callingMessageBean.setCommonAttribute(v2TIMMessage);
        callingMessageBean.setText(string);
        callingMessageBean.setExtra(string);
        callingMessageBean.setCallType(convert2VideoCallData.callType);
        return callingMessageBean;
    }

    private static String getCustomBusinessId(V2TIMMessage v2TIMMessage) {
        HashMap hashMap;
        try {
            hashMap = (HashMap) new Gson().fromJson(new String(v2TIMMessage.getCustomElem().getData()), (Class<Object>) HashMap.class);
        } catch (JsonSyntaxException unused) {
            TUIChatLog.e(TAG, " getCustomJsonMap error ");
            hashMap = null;
        }
        Object obj = hashMap != null ? hashMap.get(TUIConstants.Message.CUSTOM_BUSINESS_ID_KEY) : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String getDisplayName(V2TIMMessage v2TIMMessage) {
        if (v2TIMMessage == null) {
            return null;
        }
        if (!TextUtils.isEmpty(v2TIMMessage.getNameCard())) {
            return v2TIMMessage.getNameCard();
        }
        if (!TextUtils.isEmpty(v2TIMMessage.getFriendRemark())) {
            return v2TIMMessage.getFriendRemark();
        }
        if (!TextUtils.isEmpty(v2TIMMessage.getNickName())) {
            return v2TIMMessage.getNickName();
        }
        return v2TIMMessage.getSender();
    }

    public static String getDisplayString(V2TIMMessage v2TIMMessage) {
        TUIMessageBean parseMessage;
        String onGetDisplayString;
        String nameCard;
        if (v2TIMMessage == null || (parseMessage = parseMessage(v2TIMMessage)) == null) {
            return null;
        }
        if (parseMessage.getStatus() == 275) {
            if (parseMessage.isSelf()) {
                onGetDisplayString = ServiceInitializer.getAppContext().getString(R.string.revoke_tips_you);
            } else if (parseMessage.isGroup()) {
                if (TextUtils.isEmpty(parseMessage.getNameCard())) {
                    nameCard = parseMessage.getSender();
                } else {
                    nameCard = parseMessage.getNameCard();
                }
                onGetDisplayString = TUIChatConstants.covert2HTMLString(nameCard) + ServiceInitializer.getAppContext().getString(R.string.revoke_tips);
            } else {
                onGetDisplayString = ServiceInitializer.getAppContext().getString(R.string.revoke_tips_other);
            }
        } else {
            onGetDisplayString = parseMessage.onGetDisplayString();
        }
        return FaceManager.emojiJudge(onGetDisplayString);
    }

    public static String getLocalImagePath(TUIMessageBean tUIMessageBean) {
        V2TIMMessage v2TIMMessage;
        V2TIMImageElem imageElem;
        if (tUIMessageBean == null || !tUIMessageBean.isSelf() || (v2TIMMessage = tUIMessageBean.getV2TIMMessage()) == null || v2TIMMessage.getElemType() != 3 || (imageElem = v2TIMMessage.getImageElem()) == null) {
            return null;
        }
        String path = imageElem.getPath();
        if (new File(path).exists()) {
            return path;
        }
        return null;
    }

    public static String getMsgTypeStr(int i2) {
        switch (i2) {
            case 3:
                return ServiceInitializer.getAppContext().getString(R.string.picture_extra);
            case 4:
                return ServiceInitializer.getAppContext().getString(R.string.audio_extra);
            case 5:
                return ServiceInitializer.getAppContext().getString(R.string.video_extra);
            case 6:
                return ServiceInitializer.getAppContext().getString(R.string.file_extra);
            case 7:
                return ServiceInitializer.getAppContext().getString(R.string.location_extra);
            case 8:
                return ServiceInitializer.getAppContext().getString(R.string.custom_emoji);
            default:
                return "";
        }
    }

    public static String getReplyMessageAbstract(TUIMessageBean tUIMessageBean) {
        String extra;
        if (tUIMessageBean != null) {
            if (tUIMessageBean instanceof TextMessageBean) {
                extra = ((TextMessageBean) tUIMessageBean).getText();
            } else if (tUIMessageBean instanceof MergeMessageBean) {
                extra = ((MergeMessageBean) tUIMessageBean).getTitle();
            } else if (tUIMessageBean instanceof FileMessageBean) {
                extra = ((FileMessageBean) tUIMessageBean).getFileName();
            } else if (tUIMessageBean instanceof CustomLinkMessageBean) {
                extra = ((CustomLinkMessageBean) tUIMessageBean).getText();
            } else {
                extra = ((tUIMessageBean instanceof SoundMessageBean) || (tUIMessageBean instanceof ImageMessageBean) || (tUIMessageBean instanceof VideoMessageBean) || (tUIMessageBean instanceof LocationMessageBean) || (tUIMessageBean instanceof FaceMessageBean)) ? "" : tUIMessageBean.getExtra();
            }
            return "" + extra;
        }
        return "";
    }

    public static boolean isFileType(int i2) {
        return i2 == 6;
    }

    public static MessageFeature isSupportTyping(TUIMessageBean tUIMessageBean) {
        String cloudCustomData = tUIMessageBean.getV2TIMMessage().getCloudCustomData();
        if (TextUtils.isEmpty(cloudCustomData)) {
            return null;
        }
        try {
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(cloudCustomData, (Class<Object>) HashMap.class);
            if (hashMap != null) {
                Object obj = hashMap.get(TUIChatConstants.MESSAGE_FEATURE_KEY);
                MessageFeature messageFeature = obj instanceof Map ? (MessageFeature) gson.fromJson(gson.toJson(obj), (Class<Object>) MessageFeature.class) : null;
                if (messageFeature != null) {
                    if (messageFeature.getVersion() > 1) {
                        return null;
                    }
                    return messageFeature;
                }
            }
        } catch (JsonSyntaxException e2) {
            String str = TAG;
            TUIChatLog.e(str, " isSupportTyping exception e = " + e2);
        }
        return null;
    }

    public static boolean isTyping(byte[] bArr) {
        try {
            MessageTyping messageTyping = (MessageTyping) new Gson().fromJson(new String(bArr, "UTF-8"), (Class<Object>) MessageTyping.class);
            if (messageTyping != null && messageTyping.userAction == 14) {
                if (TextUtils.equals(messageTyping.actionParam, "EIMAMSG_InputStatus_Ing")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            TUIChatLog.e(TAG, "parse json error");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean parseCallingMessage(com.tencent.imsdk.v2.V2TIMMessage r6) {
        /*
            com.tencent.imsdk.v2.V2TIMSignalingManager r0 = com.tencent.imsdk.v2.V2TIMManager.getSignalingManager()
            com.tencent.imsdk.v2.V2TIMSignalingInfo r0 = r0.getSignalingInfo(r6)
            r1 = 0
            if (r0 == 0) goto L69
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            java.lang.String r0 = r0.getData()     // Catch: com.google.gson.JsonSyntaxException -> L2b
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            java.lang.Object r0 = r3.fromJson(r0, r4)     // Catch: com.google.gson.JsonSyntaxException -> L2b
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: com.google.gson.JsonSyntaxException -> L2b
            if (r0 == 0) goto L32
            java.lang.String r3 = "businessID"
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.gson.JsonSyntaxException -> L2b
            goto L33
        L2b:
            java.lang.String r0 = com.tencent.qcloud.tuikit.tuichat.util.ChatMessageParser.TAG
            java.lang.String r3 = " get signalingInfoCustomJsonMap error "
            com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog.e(r0, r3)
        L32:
            r0 = r1
        L33:
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L3a
            java.lang.String r0 = (java.lang.String) r0
            goto L42
        L3a:
            boolean r3 = r0 instanceof java.lang.Double
            if (r3 == 0) goto L41
            r2 = r0
            java.lang.Double r2 = (java.lang.Double) r2
        L41:
            r0 = r1
        L42:
            java.lang.String r3 = "av_call"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L64
            double r2 = r2.doubleValue()
            java.lang.Double r0 = com.tencent.qcloud.tuicore.TUIConstants.TUICalling.CALL_TIMEOUT_BUSINESS_ID
            double r4 = r0.doubleValue()
            double r2 = r2 - r4
            double r2 = java.lang.Math.abs(r2)
            r4 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L63
            goto L64
        L63:
            return r1
        L64:
            com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean r6 = getCallingMessage(r6)
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.tuikit.tuichat.util.ChatMessageParser.parseCallingMessage(com.tencent.imsdk.v2.V2TIMMessage):com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean");
    }

    private static TUIMessageBean parseCustomMessage(V2TIMMessage v2TIMMessage) {
        TUIMessageBean parseCallingMessage = parseCallingMessage(v2TIMMessage);
        if (parseCallingMessage == null) {
            parseCallingMessage = parseGroupCreateMessage(v2TIMMessage);
        }
        if (parseCallingMessage == null) {
            parseCallingMessage = parseCustomMessageFromMap(v2TIMMessage);
        }
        if (parseCallingMessage == null) {
            TextMessageBean textMessageBean = new TextMessageBean();
            textMessageBean.setText(ServiceInitializer.getAppContext().getString(R.string.no_support_msg));
            return textMessageBean;
        }
        return parseCallingMessage;
    }

    private static TUIMessageBean parseCustomMessageFromMap(V2TIMMessage v2TIMMessage) {
        Class<? extends TUIMessageBean> messageBeanClass = TUIChatService.getInstance().getMessageBeanClass(getCustomBusinessId(v2TIMMessage));
        if (messageBeanClass != null) {
            try {
                return messageBeanClass.newInstance();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (InstantiationException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static TUIMessageBean parseGroupCreateMessage(V2TIMMessage v2TIMMessage) {
        V2TIMCustomElem customElem = v2TIMMessage.getCustomElem();
        String str = new String(customElem.getData());
        Gson gson = new Gson();
        if (str.equals("group_create")) {
            TipsMessageBean tipsMessageBean = new TipsMessageBean();
            tipsMessageBean.setCommonAttribute(v2TIMMessage);
            tipsMessageBean.setTipType(257);
            String str2 = TUIChatConstants.covert2HTMLString(getDisplayName(v2TIMMessage)) + ServiceInitializer.getAppContext().getString(R.string.create_group);
            tipsMessageBean.setText(str2);
            tipsMessageBean.setExtra(str2);
            return tipsMessageBean;
        } else if (isTyping(customElem.getData())) {
            return null;
        } else {
            TUIChatLog.i(TAG, "custom data:" + str);
            try {
                MessageCustom messageCustom = (MessageCustom) gson.fromJson(str, (Class<Object>) MessageCustom.class);
                if (!TextUtils.isEmpty(messageCustom.businessID) && messageCustom.businessID.equals("group_create")) {
                    TipsMessageBean tipsMessageBean2 = new TipsMessageBean();
                    tipsMessageBean2.setCommonAttribute(v2TIMMessage);
                    tipsMessageBean2.setTipType(257);
                    String str3 = TUIChatConstants.covert2HTMLString(getDisplayName(v2TIMMessage)) + messageCustom.content;
                    tipsMessageBean2.setText(str3);
                    tipsMessageBean2.setExtra(str3);
                    return tipsMessageBean2;
                }
            } catch (Exception e2) {
                TUIChatLog.e(TAG, "invalid json: " + str + ", exception:" + e2);
            }
            return null;
        }
    }

    public static TUIMessageBean parseMessage(V2TIMMessage v2TIMMessage) {
        return parseMessage(v2TIMMessage, false);
    }

    public static List<TUIMessageBean> parseMessageList(List<V2TIMMessage> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            TUIMessageBean parseMessage = parseMessage(list.get(i2));
            if (parseMessage != null) {
                arrayList.add(parseMessage);
            }
        }
        return arrayList;
    }

    public static MessageReactBean parseMessageReact(TUIMessageBean tUIMessageBean) {
        String cloudCustomData = tUIMessageBean.getV2TIMMessage().getCloudCustomData();
        try {
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(cloudCustomData, (Class<Object>) HashMap.class);
            if (hashMap != null) {
                Object obj = hashMap.get(TUIChatConstants.MESSAGE_REACT_KEY);
                MessageReactBean messageReactBean = obj instanceof Map ? (MessageReactBean) gson.fromJson(gson.toJson(obj), (Class<Object>) MessageReactBean.class) : null;
                if (messageReactBean != null) {
                    if (messageReactBean.getVersion() > 1) {
                        return null;
                    }
                    return messageReactBean;
                }
            }
        } catch (JsonSyntaxException unused) {
            TUIChatLog.e(TAG, " getCustomJsonMap error ");
        }
        return null;
    }

    public static MessageRepliesBean parseMessageReplies(TUIMessageBean tUIMessageBean) {
        String cloudCustomData = tUIMessageBean.getV2TIMMessage().getCloudCustomData();
        try {
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(cloudCustomData, (Class<Object>) HashMap.class);
            if (hashMap != null) {
                Object obj = hashMap.get(TUIChatConstants.MESSAGE_REPLIES_KEY);
                MessageRepliesBean messageRepliesBean = obj instanceof Map ? (MessageRepliesBean) gson.fromJson(gson.toJson(obj), (Class<Object>) MessageRepliesBean.class) : null;
                if (messageRepliesBean != null) {
                    if (messageRepliesBean.getVersion() > 1) {
                        return null;
                    }
                    return messageRepliesBean;
                }
            }
        } catch (JsonSyntaxException unused) {
            TUIChatLog.e(TAG, " getCustomJsonMap error ");
        }
        return null;
    }

    private static TUIMessageBean parseReplyMessage(V2TIMMessage v2TIMMessage) {
        String cloudCustomData = v2TIMMessage.getCloudCustomData();
        if (TextUtils.isEmpty(cloudCustomData)) {
            return null;
        }
        try {
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(cloudCustomData, (Class<Object>) HashMap.class);
            if (hashMap != null) {
                Object obj = hashMap.get(TUIChatConstants.MESSAGE_REPLY_KEY);
                ReplyPreviewBean replyPreviewBean = obj instanceof Map ? (ReplyPreviewBean) gson.fromJson(gson.toJson(obj), (Class<Object>) ReplyPreviewBean.class) : null;
                if (replyPreviewBean == null || replyPreviewBean.getVersion() > 1) {
                    return null;
                }
                if (TextUtils.isEmpty(replyPreviewBean.getMessageRootID())) {
                    return new QuoteMessageBean(replyPreviewBean);
                }
                return new ReplyMessageBean(replyPreviewBean);
            }
        } catch (JsonSyntaxException unused) {
            TUIChatLog.e(TAG, " getCustomJsonMap error ");
        }
        return null;
    }

    public static TUIMessageBean parseMessage(V2TIMMessage v2TIMMessage, boolean z) {
        if (v2TIMMessage == null) {
            return null;
        }
        if (v2TIMMessage.getStatus() != 4 && v2TIMMessage.getElemType() != 0) {
            r0 = z ? null : parseReplyMessage(v2TIMMessage);
            if (r0 == null) {
                switch (v2TIMMessage.getElemType()) {
                    case 1:
                        r0 = new TextMessageBean();
                        break;
                    case 2:
                        r0 = parseCustomMessage(v2TIMMessage);
                        break;
                    case 3:
                        r0 = new ImageMessageBean();
                        break;
                    case 4:
                        r0 = new SoundMessageBean();
                        break;
                    case 5:
                        r0 = new VideoMessageBean();
                        break;
                    case 6:
                        r0 = new FileMessageBean();
                        break;
                    case 7:
                        r0 = new LocationMessageBean();
                        break;
                    case 8:
                        r0 = new FaceMessageBean();
                        break;
                    case 9:
                        r0 = new TipsMessageBean();
                        break;
                    case 10:
                        r0 = new MergeMessageBean();
                        break;
                }
            }
            if (r0 != null) {
                r0.setCommonAttribute(v2TIMMessage);
                r0.onProcessMessage(v2TIMMessage);
            }
        }
        return r0;
    }
}
