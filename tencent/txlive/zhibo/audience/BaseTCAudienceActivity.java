package tencent.txlive.zhibo.audience;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mobile.auth.BuildConfig;
import com.opensource.svgaplayer.SVGAImageView;
import com.showstartfans.activity.model.GoodsLiveBean;
import com.showstartfans.activity.model.LiveRoomDetailBean;
import com.showstartfans.activity.model.LiveStartPLayInfoBean;
import com.showstartfans.activity.receiver.NetConnectionReceiver;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import com.tencent.android.tpush.common.Constants;
import com.tencent.rtmp.ui.TXCloudVideoView;
import h.y.a.k.f;
import h.y.a.n.j1;
import h.y.a.p.w.a;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.room.IMLVBLiveRoomListener;
import tencent.txlive.room.MLVBLiveRoom;
import tencent.txlive.room.roomutil.commondef.AnchorInfo;
import tencent.txlive.room.roomutil.commondef.AudienceInfo;
import tencent.txlive.zhibo.msg.TCChatEntity;
import tencent.txlive.zhibo.msg.TCSimpleUserInfo;
import tencent.txlive.zhibo.ui.ErrorDialogFragment;
import tencent.txlive.zhibo.widget.TCControllerFloat;
import tencent.txlive.zhibo.widget.TCSwipeAnimationController;
import tencent.txlive.zhibo.widget.danku.DanmuMgr;
import tencent.txlive.zhibo.widget.video.TCVideoViewMgr;

/* compiled from: BaseTCAudienceActivity.kt */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ã\u0002B\u0005¢\u0006\u0002\u0010\u0004J\n\u0010Ñ\u0001\u001a\u00030Ò\u0001H\u0016J\b\u0010Ó\u0001\u001a\u00030Ò\u0001J\n\u0010Ô\u0001\u001a\u00030Ò\u0001H\u0016J\u001c\u0010Õ\u0001\u001a\u00030Ò\u00012\u0007\u0010Ö\u0001\u001a\u00020 2\t\u0010×\u0001\u001a\u0004\u0018\u00010\u0014J\n\u0010Ø\u0001\u001a\u00030Ò\u0001H\u0002J\n\u0010Ù\u0001\u001a\u00030Ò\u0001H\u0016J\n\u0010Ú\u0001\u001a\u00030Ò\u0001H\u0016J\b\u0010Û\u0001\u001a\u00030Ò\u0001J\b\u0010Ü\u0001\u001a\u00030Ò\u0001J\u0011\u0010Ý\u0001\u001a\u00030Ò\u00012\u0007\u0010Þ\u0001\u001a\u00020\bJ\u0012\u0010ß\u0001\u001a\u00030Ò\u00012\b\u0010Ã\u0001\u001a\u00030Ä\u0001J\u0011\u0010à\u0001\u001a\u00030Ò\u00012\u0007\u0010á\u0001\u001a\u00020\bJ\u0014\u0010â\u0001\u001a\u00030Ò\u00012\b\u0010ã\u0001\u001a\u00030ä\u0001H\u0016J\u0011\u0010å\u0001\u001a\u00030Ò\u00012\u0007\u0010æ\u0001\u001a\u00020\bJ\u001f\u0010ç\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u00012\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010ë\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u0014\u0010ì\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u001d\u0010í\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u00012\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0014J\u001d\u0010î\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u00012\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0014J\u0014\u0010ï\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u001d\u0010ð\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u00012\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0014J\u001d\u0010ñ\u0001\u001a\u00030Ò\u00012\b\u0010è\u0001\u001a\u00030é\u00012\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0014J\b\u0010ò\u0001\u001a\u00030Ò\u0001J\n\u0010ó\u0001\u001a\u00030Ò\u0001H\u0014J\n\u0010ô\u0001\u001a\u00030Ò\u0001H\u0014J\n\u0010õ\u0001\u001a\u00030Ò\u0001H\u0014J\u0013\u0010ö\u0001\u001a\u00030Ò\u00012\u0007\u0010÷\u0001\u001a\u00020\bH\u0016J\u0007\u0010ø\u0001\u001a\u00020\bJ\u0014\u0010ù\u0001\u001a\u00030Ò\u00012\b\u0010ú\u0001\u001a\u00030û\u0001H\u0016J\u001e\u0010ü\u0001\u001a\u00030Ò\u00012\u0007\u0010ý\u0001\u001a\u00020\u00142\t\u0010þ\u0001\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010ÿ\u0001\u001a\u00030Ò\u00012\b\u0010ú\u0001\u001a\u00030û\u0001H\u0016J\u0013\u0010\u0080\u0002\u001a\u00030Ò\u00012\u0007\u0010ú\u0001\u001a\u00020 H\u0016J\n\u0010\u0081\u0002\u001a\u00030Ò\u0001H\u0016J\u0016\u0010\u0082\u0002\u001a\u00030Ò\u00012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u0002H\u0016J\u0016\u0010\u0085\u0002\u001a\u00030Ò\u00012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u0002H\u0016J\u0016\u0010\u0086\u0002\u001a\u00030Ò\u00012\n\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0088\u0002H\u0016J\u0016\u0010\u0089\u0002\u001a\u00030Ò\u00012\n\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0088\u0002H\u0016J\n\u0010\u008a\u0002\u001a\u00030Ò\u0001H\u0016J\n\u0010\u008b\u0002\u001a\u00030Ò\u0001H\u0016J\u0016\u0010\u008c\u0002\u001a\u00030Ò\u00012\n\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008e\u0002H\u0014J\u0015\u0010\u008f\u0002\u001a\u00030Ò\u00012\t\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J*\u0010\u0091\u0002\u001a\u00030Ò\u00012\u0007\u0010\u0092\u0002\u001a\u00020 2\t\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u00142\n\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u008e\u0002H\u0016J\n\u0010\u0095\u0002\u001a\u00030Ò\u0001H\u0016J\u001c\u0010\u0096\u0002\u001a\u00030Ò\u00012\u0007\u0010ý\u0001\u001a\u00020\u00142\u0007\u0010\u0097\u0002\u001a\u00020 H\u0016J\"\u0010\u0098\u0002\u001a\u00030Ò\u00012\n\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u009a\u00022\n\u0010×\u0001\u001a\u0005\u0018\u00010\u009b\u0002H\u0016J\n\u0010\u009c\u0002\u001a\u00030Ò\u0001H\u0016J\n\u0010\u009d\u0002\u001a\u00030Ò\u0001H\u0016J\u0015\u0010\u009e\u0002\u001a\u00030Ò\u00012\t\u0010ý\u0001\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u009f\u0002\u001a\u00030Ò\u0001H\u0016J \u0010 \u0002\u001a\u00030Ò\u00012\t\u0010ý\u0001\u001a\u0004\u0018\u00010\u00142\t\u0010þ\u0001\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010¡\u0002\u001a\u00030Ò\u0001H\u0016J\n\u0010¢\u0002\u001a\u00030Ò\u0001H\u0016J)\u0010£\u0002\u001a\u00030Ò\u00012\t\u0010ý\u0001\u001a\u0004\u0018\u00010\u00142\u0007\u0010Ö\u0001\u001a\u00020 2\t\u0010¤\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010¥\u0002\u001a\u00030Ò\u00012\u0007\u0010ý\u0001\u001a\u00020\u00142\u0007\u0010¦\u0002\u001a\u00020 H\u0016J\u0016\u0010§\u0002\u001a\u00030Ò\u00012\n\u0010¨\u0002\u001a\u0005\u0018\u00010©\u0002H\u0014J\n\u0010ª\u0002\u001a\u00030Ò\u0001H\u0014J\n\u0010«\u0002\u001a\u00030Ò\u0001H\u0016J\n\u0010¬\u0002\u001a\u00030Ò\u0001H\u0016J\u0016\u0010\u00ad\u0002\u001a\u00030Ò\u00012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u0002H\u0016JU\u0010®\u0002\u001a\u00030Ò\u00012\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010°\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010±\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010²\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010³\u0002\u001a\u0004\u0018\u00010\u00142\u0007\u0010´\u0002\u001a\u00020 2\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0014H\u0016JU\u0010¶\u0002\u001a\u00030Ò\u00012\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010°\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010±\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010²\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010³\u0002\u001a\u0004\u0018\u00010\u00142\u0007\u0010´\u0002\u001a\u00020 2\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0014H\u0016JJ\u0010·\u0002\u001a\u00030Ò\u00012\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010°\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010±\u0002\u001a\u0004\u0018\u00010\u00142\t\u0010²\u0002\u001a\u0004\u0018\u00010\u00142\u0007\u0010´\u0002\u001a\u00020 2\t\u0010µ\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J!\u0010¸\u0002\u001a\u00030Ò\u00012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u00022\t\u0010¹\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010º\u0002\u001a\u00030Ò\u00012\n\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u0002H\u0016J\n\u0010»\u0002\u001a\u00030Ò\u0001H\u0014J\u0015\u0010¼\u0002\u001a\u00030Ò\u00012\t\u0010¯\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010½\u0002\u001a\u00030Ò\u0001H\u0016J\u0013\u0010¾\u0002\u001a\u00030Ò\u00012\u0007\u0010¿\u0002\u001a\u00020\bH\u0016J\u001e\u0010À\u0002\u001a\u00030Ò\u00012\u0007\u0010Á\u0002\u001a\u00020 2\t\u0010Â\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010Ã\u0002\u001a\u00030Ò\u0001J\b\u0010Ä\u0002\u001a\u00030Ò\u0001J\n\u0010Å\u0002\u001a\u00030Ò\u0001H\u0002J\u0015\u0010Æ\u0002\u001a\u00030Ò\u00012\t\u0010¤\u0002\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010Ç\u0002\u001a\u00030Ò\u0001H\u0016J\b\u0010È\u0002\u001a\u00030Ò\u0001J\u0014\u0010É\u0002\u001a\u00030Ò\u00012\n\u0010Ê\u0002\u001a\u0005\u0018\u00010Ë\u0002J\t\u0010Ì\u0002\u001a\u00020 H\u0014J\n\u0010Í\u0002\u001a\u00030Ò\u0001H\u0002J\u0013\u0010Î\u0002\u001a\u00030Ò\u00012\u0007\u0010Ï\u0002\u001a\u00020\bH\u0016J\u0011\u0010Ð\u0002\u001a\u00030Ò\u00012\u0007\u0010Ñ\u0002\u001a\u00020\u0014J\t\u0010Ò\u0002\u001a\u00020\bH\u0016J\u0011\u0010Ó\u0002\u001a\u00030Ò\u00012\u0007\u0010Ô\u0002\u001a\u00020\bJ\b\u0010Õ\u0002\u001a\u00030Ò\u0001J\u001a\u0010Ö\u0002\u001a\u00030Ò\u00012\u0007\u0010×\u0002\u001a\u00020\b2\u0007\u0010Ø\u0002\u001a\u00020\u0014J\b\u0010Ù\u0002\u001a\u00030Ò\u0001J\u001c\u0010Ú\u0002\u001a\u00030Ò\u00012\u0007\u0010Û\u0002\u001a\u00020 2\u0007\u0010Ü\u0002\u001a\u00020 H\u0016J\n\u0010Ý\u0002\u001a\u00030Ò\u0001H\u0016J*\u0010Þ\u0002\u001a\u00030Ò\u00012\t\u0010ß\u0002\u001a\u0004\u0018\u00010\u00142\n\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u00012\t\b\u0002\u0010Ô\u0002\u001a\u00020\bJ\n\u0010à\u0002\u001a\u00030Ò\u0001H\u0016J\b\u0010á\u0002\u001a\u00030Ò\u0001J\n\u0010â\u0002\u001a\u00030Ò\u0001H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\n\"\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0016\"\u0004\bM\u0010\u0018R\u001a\u0010N\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0016\"\u0004\bP\u0010\u0018R\u001a\u0010Q\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\n\"\u0004\bS\u0010\fR\u001a\u0010T\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\"\"\u0004\bV\u0010$R\u001a\u0010W\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\n\"\u0004\bY\u0010\fR\u001a\u0010Z\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\n\"\u0004\b\\\u0010\fR\u0014\u0010]\u001a\b\u0018\u00010^R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010*\u001a\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u001c\u0010g\u001a\u0004\u0018\u00010hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\"\"\u0004\bo\u0010$R\u001a\u0010p\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0016\"\u0004\br\u0010\u0018R\u001a\u0010s\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0016\"\u0004\bu\u0010\u0018R\u001a\u0010v\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\n\"\u0004\bx\u0010\fR\u001c\u0010y\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0016\"\u0004\b{\u0010\u0018R \u0010|\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0012\n\u0003\u0010\u0081\u0001\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0082\u0001\u001a\u00020\u0014X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0016\"\u0005\b\u0084\u0001\u0010\u0018R\u001d\u0010\u0085\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\n\"\u0005\b\u0087\u0001\u0010\fR\"\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\"\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\"\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0012\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010¢\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010\n\"\u0005\b¤\u0001\u0010\fR\u001d\u0010¥\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010\n\"\u0005\b§\u0001\u0010\fR\"\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001d\u0010®\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\n\"\u0005\b°\u0001\u0010\fR \u0010±\u0001\u001a\u00030²\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\"\u0010·\u0001\u001a\u0005\u0018\u00010¸\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001f\u0010½\u0001\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u00109\"\u0005\b¿\u0001\u0010;R\u001f\u0010À\u0001\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010?\"\u0005\bÂ\u0001\u0010AR \u0010Ã\u0001\u001a\u00030Ä\u0001X\u0086.¢\u0006\u0012\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u001d\u0010É\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010\n\"\u0005\bË\u0001\u0010\fR\u001d\u0010Ì\u0001\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010\n\"\u0005\bÎ\u0001\u0010\fR\u0012\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ä\u0002"}, d2 = {"Ltencent/txlive/zhibo/audience/BaseTCAudienceActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Ltencent/txlive/room/IMLVBLiveRoomListener;", "Lcom/taihebase/activity/listener/OnHandlerListener;", "()V", "DISMISS_CONTROL_VIEW_TIMER", "Ljava/util/Timer;", "calClickToast", "", "getCalClickToast", "()Z", "setCalClickToast", "(Z)V", "callRatio", "getCallRatio", "setCallRatio", "currentFloatMode", "getCurrentFloatMode", "setCurrentFloatMode", "currentUserId", "", "getCurrentUserId", "()Ljava/lang/String;", "setCurrentUserId", "(Ljava/lang/String;)V", "danmuMgr", "Ltencent/txlive/zhibo/widget/danku/DanmuMgr;", "getDanmuMgr", "()Ltencent/txlive/zhibo/widget/danku/DanmuMgr;", "setDanmuMgr", "(Ltencent/txlive/zhibo/widget/danku/DanmuMgr;)V", "dp220", "", "getDp220", "()I", "setDp220", "(I)V", "floatWindow", "Ltencent/txlive/zhibo/widget/TCControllerFloat;", "getFloatWindow", "()Ltencent/txlive/zhibo/widget/TCControllerFloat;", "floatWindow$delegate", "Lkotlin/Lazy;", "handler", "Lcom/taihebase/activity/utils/WeakHandler;", "getHandler", "()Lcom/taihebase/activity/utils/WeakHandler;", "setHandler", "(Lcom/taihebase/activity/utils/WeakHandler;)V", "isShowWiFiTips", "setShowWiFiTips", "joinRoomNum", "getJoinRoomNum", "setJoinRoomNum", "liveDialog", "Landroid/widget/LinearLayout;", "getLiveDialog", "()Landroid/widget/LinearLayout;", "setLiveDialog", "(Landroid/widget/LinearLayout;)V", "liveDialogStr", "Landroid/widget/TextView;", "getLiveDialogStr", "()Landroid/widget/TextView;", "setLiveDialogStr", "(Landroid/widget/TextView;)V", "liveDialogSvg", "Lcom/opensource/svgaplayer/SVGAImageView;", "getLiveDialogSvg", "()Lcom/opensource/svgaplayer/SVGAImageView;", "setLiveDialogSvg", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", "liveGiftHave", "getLiveGiftHave", "setLiveGiftHave", "livePayTips", "getLivePayTips", "setLivePayTips", "livePayUrl", "getLivePayUrl", "setLivePayUrl", "livePushRatio", "getLivePushRatio", "setLivePushRatio", "loadingCount", "getLoadingCount", "setLoadingCount", "loginIM", "getLoginIM", "setLoginIM", "mAuthorized", "getMAuthorized", "setMAuthorized", "mDismissControlViewTimerTask", "Ltencent/txlive/zhibo/audience/BaseTCAudienceActivity$DismissControlViewTimerTask;", "mErrorDialog", "Ltencent/txlive/zhibo/ui/ErrorDialogFragment;", "getMErrorDialog", "()Ltencent/txlive/zhibo/ui/ErrorDialogFragment;", "mErrorDialog$delegate", "mLiveEventId", "getMLiveEventId", "setMLiveEventId", "mLiveRoom", "Ltencent/txlive/room/MLVBLiveRoom;", "getMLiveRoom", "()Ltencent/txlive/room/MLVBLiveRoom;", "setMLiveRoom", "(Ltencent/txlive/room/MLVBLiveRoom;)V", "mLiveStatus", "getMLiveStatus", "setMLiveStatus", "mLiveThemeId", "getMLiveThemeId", "setMLiveThemeId", "mMixedPlayUrl", "getMMixedPlayUrl", "setMMixedPlayUrl", "mPlaying", "getMPlaying", "setMPlaying", "mPusherId", "getMPusherId", "setMPusherId", "mPusherType", "getMPusherType", "()Ljava/lang/Integer;", "setMPusherType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mRoomId", "getMRoomId", "setMRoomId", "mRoomMute", "getMRoomMute", "setMRoomMute", "mTCSwipeAnimationController", "Ltencent/txlive/zhibo/widget/TCSwipeAnimationController;", "getMTCSwipeAnimationController", "()Ltencent/txlive/zhibo/widget/TCSwipeAnimationController;", "setMTCSwipeAnimationController", "(Ltencent/txlive/zhibo/widget/TCSwipeAnimationController;)V", "mVideoViewMgr", "Ltencent/txlive/zhibo/widget/video/TCVideoViewMgr;", "getMVideoViewMgr", "()Ltencent/txlive/zhibo/widget/video/TCVideoViewMgr;", "setMVideoViewMgr", "(Ltencent/txlive/zhibo/widget/video/TCVideoViewMgr;)V", "mWindowManager", "Landroid/view/WindowManager;", "getMWindowManager", "()Landroid/view/WindowManager;", "setMWindowManager", "(Landroid/view/WindowManager;)V", "mWindowParams", "Landroid/view/WindowManager$LayoutParams;", "getMWindowParams", "()Landroid/view/WindowManager$LayoutParams;", "setMWindowParams", "(Landroid/view/WindowManager$LayoutParams;)V", "netWorkChangeReceiver", "Lcom/showstartfans/activity/receiver/NetConnectionReceiver;", "onNewIn", "getOnNewIn", "setOnNewIn", "openDanKu", "getOpenDanKu", "setOpenDanKu", "roomInfo", "Lcom/showstartfans/activity/model/LiveRoomDetailBean;", "getRoomInfo", "()Lcom/showstartfans/activity/model/LiveRoomDetailBean;", "setRoomInfo", "(Lcom/showstartfans/activity/model/LiveRoomDetailBean;)V", "saveCountDownTips", "getSaveCountDownTips", "setSaveCountDownTips", "seeLiveTime", "", "getSeeLiveTime", "()J", "setSeeLiveTime", "(J)V", "startPLayInfoBean", "Lcom/showstartfans/activity/model/LiveStartPLayInfoBean;", "getStartPLayInfoBean", "()Lcom/showstartfans/activity/model/LiveStartPLayInfoBean;", "setStartPLayInfoBean", "(Lcom/showstartfans/activity/model/LiveStartPLayInfoBean;)V", "toast", "getToast", "setToast", "toastStr", "getToastStr", "setToastStr", "txCloudVideoView", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "getTxCloudVideoView", "()Lcom/tencent/rtmp/ui/TXCloudVideoView;", "setTxCloudVideoView", "(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V", "verticalScreen", "getVerticalScreen", "setVerticalScreen", "videoPause", "getVideoPause", "setVideoPause", "wifiDialog", "Lcom/taihebase/activity/widget/dialog/DefaultDialog;", "backLive", "", "bindRoomListener", "cancelDismissControlViewTimer", "changeLiveStatus", "liveStatus", "msg", "destroyFloatWindow", "destroyRest", "dismissControlView", "dismissLiveDialog", "dismissLiveDialogNone", "dismissToast", "isStatus", "enterRoom", "finish", "force", "getFirstFrame", "bitmap", "Landroid/graphics/Bitmap;", "gotoScreenFullscreen", "horizontal", "handleALLBanMsg", "userInfo", "Ltencent/txlive/zhibo/msg/TCSimpleUserInfo;", "text", "handleAudienceJoinMsg", "handleAudienceQuitMsg", "handleDanmuMsg", "handleGiftMsg", "handlePraiseMsg", "handleTextMsg", "handleTextMsgGift", "hideWifiDialog", "initData", "initListener", "initView", "isAllBanMsg", "allBan", "liveSupport", "notifyGiftMsg", "entity", "Ltencent/txlive/zhibo/msg/TCChatEntity;", "notifyLiveHot", "groupId", "hotNum", "notifyMsg", "notifyOnlineMember", "onActivityNew", "onAnchorEnter", "anchorInfo", "Ltencent/txlive/room/roomutil/commondef/AnchorInfo;", "onAnchorExit", "onAudienceEnter", "audienceInfo", "Ltencent/txlive/room/roomutil/commondef/AudienceInfo;", "onAudienceExit", "onBeginPlay", "onConnectSuccess", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDebugLog", BuildConfig.FLAVOR_type, "onError", "errorCode", "errMsg", "extraInfo", "onFirstFrame", "onGroupBanChange", "forbidStatus", "onHandlerMessage", "activity", "Landroid/app/Activity;", "Landroid/os/Message;", "onImDisconnected", "onKickoutJoinAnchor", "onLiveActivityChange", "onLiveEnd", "onLiveHot", "onLivePausePlay", "onLiveResumePlay", "onLiveStatusChange", "changeMsg", "onMemberOnlineChange", "onlineNum", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onPlayEnd", "onPlayLoading", "onQuitRoomPK", "onRecvRoomCustomGiftMsg", "roomID", "userID", Oauth2AccessToken.KEY_SCREEN_NAME, "userAvatar", Constants.MQTT_STATISTISC_MSGTYPE_KEY, "userRole", "message", "onRecvRoomCustomMsg", "onRecvRoomTextMsg", "onRequestJoinAnchor", "reason", "onRequestRoomPK", "onResume", "onRoomDestroy", "onStartPlay", "onVideoResolving", "HorizontalScreen", "onWarning", "warningCode", "warningMsg", "onlyClosePush", "onlyExitRoom", "openFloatWindow", "overLiveStatus", "refreshPlayLive", "replayLive", "sendGift", "bean", "Lcom/showstartfans/activity/model/GoodsLiveBean;", "setContentViewRes", "setLiveBgImg", "setShowFloat", "show", "showErrorAndQuit", "errorMsg", "showFloatPreDialog", "showLiveDialog", "pauseStatus", "showLiveDialogBy", "showToast", "canClick", "string", "showWiFiDialog", "slideFloatWindowPoi", "x", "y", "startDismissControlViewTimer", "startPlay", "playUrl", "startTime", "stopPlay", "stopTime", "DismissControlViewTimerTask", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class BaseTCAudienceActivity extends BaseNoToolBarActivity implements IMLVBLiveRoomListener, f {
    @Nullable
    private Timer DISMISS_CONTROL_VIEW_TIMER;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean calClickToast;
    private boolean callRatio;
    private boolean currentFloatMode;
    @Nullable
    private String currentUserId;
    @Nullable
    private DanmuMgr danmuMgr;
    private int dp220;
    @NotNull
    private final Lazy floatWindow$delegate;
    @Nullable
    private j1 handler;
    private boolean isShowWiFiTips;
    private int joinRoomNum;
    @Nullable
    private LinearLayout liveDialog;
    @Nullable
    private TextView liveDialogStr;
    @Nullable
    private SVGAImageView liveDialogSvg;
    private boolean liveGiftHave;
    @NotNull
    private String livePayTips;
    @NotNull
    private String livePayUrl;
    private boolean livePushRatio;
    private int loadingCount;
    private boolean loginIM;
    private boolean mAuthorized;
    @Nullable
    private DismissControlViewTimerTask mDismissControlViewTimerTask;
    @NotNull
    private final Lazy mErrorDialog$delegate;
    @NotNull
    private String mLiveEventId;
    @Nullable
    private MLVBLiveRoom mLiveRoom;
    private int mLiveStatus;
    @NotNull
    private String mLiveThemeId;
    @NotNull
    private String mMixedPlayUrl;
    private boolean mPlaying;
    @Nullable
    private String mPusherId;
    @Nullable
    private Integer mPusherType;
    @NotNull
    private String mRoomId;
    private boolean mRoomMute;
    @Nullable
    private TCSwipeAnimationController mTCSwipeAnimationController;
    @Nullable
    private TCVideoViewMgr mVideoViewMgr;
    @Nullable
    private WindowManager mWindowManager;
    @Nullable
    private WindowManager.LayoutParams mWindowParams;
    @Nullable
    private NetConnectionReceiver netWorkChangeReceiver;
    private boolean onNewIn;
    private boolean openDanKu;
    @Nullable
    private LiveRoomDetailBean roomInfo;
    private boolean saveCountDownTips;
    private long seeLiveTime;
    @Nullable
    private LiveStartPLayInfoBean startPLayInfoBean;
    @Nullable
    private LinearLayout toast;
    @Nullable
    private TextView toastStr;
    public TXCloudVideoView txCloudVideoView;
    private boolean verticalScreen;
    private boolean videoPause;
    @Nullable
    private a wifiDialog;

    /* compiled from: BaseTCAudienceActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Ltencent/txlive/zhibo/audience/BaseTCAudienceActivity$DismissControlViewTimerTask;", "Ljava/util/TimerTask;", "(Ltencent/txlive/zhibo/audience/BaseTCAudienceActivity;)V", "run", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class DismissControlViewTimerTask extends TimerTask {
        public final /* synthetic */ BaseTCAudienceActivity this$0;

        public DismissControlViewTimerTask(BaseTCAudienceActivity baseTCAudienceActivity) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    public static /* synthetic */ void A(BaseTCAudienceActivity baseTCAudienceActivity, TXCloudVideoView tXCloudVideoView) {
    }

    public static /* synthetic */ void B(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    public static /* synthetic */ void C(BaseTCAudienceActivity baseTCAudienceActivity, Bitmap bitmap) {
    }

    public static /* synthetic */ void D(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    public static /* synthetic */ void E(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity access$getCtx(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    private final void destroyFloatWindow() {
    }

    /* renamed from: enterRoom$lambda-1  reason: not valid java name */
    private static final void m1674enterRoom$lambda1(BaseTCAudienceActivity baseTCAudienceActivity, TXCloudVideoView tXCloudVideoView) {
    }

    private final ErrorDialogFragment getMErrorDialog() {
    }

    /* renamed from: initListener$lambda-0  reason: not valid java name */
    private static final void m1675initListener$lambda0(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    /* renamed from: onNewIntent$lambda-7  reason: not valid java name */
    private static final void m1676onNewIntent$lambda7(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    private final void openFloatWindow() {
    }

    private final void setLiveBgImg() {
    }

    /* renamed from: setLiveBgImg$lambda-11  reason: not valid java name */
    private static final void m1677setLiveBgImg$lambda11(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    /* renamed from: setLiveBgImg$lambda-11$lambda-10  reason: not valid java name */
    private static final void m1678setLiveBgImg$lambda11$lambda10(BaseTCAudienceActivity baseTCAudienceActivity, Bitmap bitmap) {
    }

    /* renamed from: setLiveBgImg$lambda-11$lambda-10$lambda-9  reason: not valid java name */
    private static final void m1679setLiveBgImg$lambda11$lambda10$lambda9(Bitmap bitmap, BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    /* renamed from: showFloatPreDialog$lambda-17  reason: not valid java name */
    private static final void m1680showFloatPreDialog$lambda17(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    /* renamed from: showFloatPreDialog$lambda-17$lambda-16  reason: not valid java name */
    private static final void m1681showFloatPreDialog$lambda17$lambda16(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    /* renamed from: showWiFiDialog$lambda-13  reason: not valid java name */
    private static final void m1682showWiFiDialog$lambda13(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    public static /* synthetic */ void startPlay$default(BaseTCAudienceActivity baseTCAudienceActivity, String str, TXCloudVideoView tXCloudVideoView, boolean z, int i2, Object obj) {
    }

    public static /* synthetic */ void w(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    public static /* synthetic */ void x(Bitmap bitmap, BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    public static /* synthetic */ void y(BaseTCAudienceActivity baseTCAudienceActivity, View view) {
    }

    public static /* synthetic */ void z(BaseTCAudienceActivity baseTCAudienceActivity) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public void backLive() {
    }

    public final void bindRoomListener() {
    }

    public void cancelDismissControlViewTimer() {
    }

    public final void changeLiveStatus(int i2, @Nullable String str) {
    }

    public void destroyRest() {
    }

    public void dismissControlView() {
    }

    public final void dismissLiveDialog() {
    }

    public final void dismissLiveDialogNone() {
    }

    public final void dismissToast(boolean z) {
    }

    public final void enterRoom(@NotNull TXCloudVideoView tXCloudVideoView) {
    }

    public final void finish(boolean z) {
    }

    public final boolean getCalClickToast() {
    }

    public final boolean getCallRatio() {
    }

    public final boolean getCurrentFloatMode() {
    }

    @Nullable
    public final String getCurrentUserId() {
    }

    @Nullable
    public final DanmuMgr getDanmuMgr() {
    }

    public final int getDp220() {
    }

    public void getFirstFrame(@NotNull Bitmap bitmap) {
    }

    @NotNull
    public final TCControllerFloat getFloatWindow() {
    }

    @Nullable
    public final j1 getHandler() {
    }

    public final int getJoinRoomNum() {
    }

    @Nullable
    public final LinearLayout getLiveDialog() {
    }

    @Nullable
    public final TextView getLiveDialogStr() {
    }

    @Nullable
    public final SVGAImageView getLiveDialogSvg() {
    }

    public final boolean getLiveGiftHave() {
    }

    @NotNull
    public final String getLivePayTips() {
    }

    @NotNull
    public final String getLivePayUrl() {
    }

    public final boolean getLivePushRatio() {
    }

    public final int getLoadingCount() {
    }

    public final boolean getLoginIM() {
    }

    public final boolean getMAuthorized() {
    }

    @NotNull
    public final String getMLiveEventId() {
    }

    @Nullable
    public final MLVBLiveRoom getMLiveRoom() {
    }

    public final int getMLiveStatus() {
    }

    @NotNull
    public final String getMLiveThemeId() {
    }

    @NotNull
    public final String getMMixedPlayUrl() {
    }

    public final boolean getMPlaying() {
    }

    @Nullable
    public final String getMPusherId() {
    }

    @Nullable
    public final Integer getMPusherType() {
    }

    @NotNull
    public final String getMRoomId() {
    }

    public final boolean getMRoomMute() {
    }

    @Nullable
    public final TCSwipeAnimationController getMTCSwipeAnimationController() {
    }

    @Nullable
    public final TCVideoViewMgr getMVideoViewMgr() {
    }

    @Nullable
    public final WindowManager getMWindowManager() {
    }

    @Nullable
    public final WindowManager.LayoutParams getMWindowParams() {
    }

    public final boolean getOnNewIn() {
    }

    public final boolean getOpenDanKu() {
    }

    @Nullable
    public final LiveRoomDetailBean getRoomInfo() {
    }

    public final boolean getSaveCountDownTips() {
    }

    public final long getSeeLiveTime() {
    }

    @Nullable
    public final LiveStartPLayInfoBean getStartPLayInfoBean() {
    }

    @Nullable
    public final LinearLayout getToast() {
    }

    @Nullable
    public final TextView getToastStr() {
    }

    @NotNull
    public final TXCloudVideoView getTxCloudVideoView() {
    }

    public final boolean getVerticalScreen() {
    }

    public final boolean getVideoPause() {
    }

    public final void gotoScreenFullscreen(boolean z) {
    }

    public void handleALLBanMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo, @Nullable String str) {
    }

    public void handleAudienceJoinMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo) {
    }

    public void handleAudienceQuitMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo) {
    }

    public final void handleDanmuMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo, @Nullable String str) {
    }

    public final void handleGiftMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo, @Nullable String str) {
    }

    public void handlePraiseMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo) {
    }

    public final void handleTextMsg(@NotNull TCSimpleUserInfo tCSimpleUserInfo, @Nullable String str) {
    }

    public final void handleTextMsgGift(@NotNull TCSimpleUserInfo tCSimpleUserInfo, @Nullable String str) {
    }

    public final void hideWifiDialog() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    public void isAllBanMsg(boolean z) {
    }

    public final boolean isShowWiFiTips() {
    }

    public final boolean liveSupport() {
    }

    public void notifyGiftMsg(@NotNull TCChatEntity tCChatEntity) {
    }

    public void notifyLiveHot(@NotNull String str, @Nullable String str2) {
    }

    public void notifyMsg(@NotNull TCChatEntity tCChatEntity) {
    }

    public void notifyOnlineMember(int i2) {
    }

    public void onActivityNew() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onAnchorEnter(@Nullable AnchorInfo anchorInfo) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onAnchorExit(@Nullable AnchorInfo anchorInfo) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onAudienceEnter(@Nullable AudienceInfo audienceInfo) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onAudienceExit(@Nullable AudienceInfo audienceInfo) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onBeginPlay() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onConnectSuccess() {
    }

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onDebugLog(@Nullable String str) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onError(int i2, @Nullable String str, @Nullable Bundle bundle) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onFirstFrame() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onGroupBanChange(@NotNull String str, int i2) {
    }

    @Override // h.y.a.k.f
    public void onHandlerMessage(@Nullable Activity activity, @Nullable Message message) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onImDisconnected() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onKickoutJoinAnchor() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onLiveActivityChange(@Nullable String str) {
    }

    public void onLiveEnd() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onLiveHot(@Nullable String str, @Nullable String str2) {
    }

    public void onLivePausePlay() {
    }

    public void onLiveResumePlay() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onLiveStatusChange(@Nullable String str, int i2, @Nullable String str2) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onMemberOnlineChange(@NotNull String str, int i2) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onPlayEnd() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onPlayLoading() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onQuitRoomPK(@Nullable AnchorInfo anchorInfo) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRecvRoomCustomGiftMsg(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i2, @Nullable String str6) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRecvRoomCustomMsg(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i2, @Nullable String str6) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRecvRoomTextMsg(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable String str5) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRequestJoinAnchor(@Nullable AnchorInfo anchorInfo, @Nullable String str) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRequestRoomPK(@Nullable AnchorInfo anchorInfo) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onRoomDestroy(@Nullable String str) {
    }

    public void onStartPlay() {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onVideoResolving(boolean z) {
    }

    @Override // tencent.txlive.room.IMLVBLiveRoomListener
    public void onWarning(int i2, @Nullable String str) {
    }

    public final void onlyClosePush() {
    }

    public final void onlyExitRoom() {
    }

    public void overLiveStatus(@Nullable String str) {
    }

    public void refreshPlayLive() {
    }

    public final void replayLive() {
    }

    public final void sendGift(@Nullable GoodsLiveBean goodsLiveBean) {
    }

    public final void setCalClickToast(boolean z) {
    }

    public final void setCallRatio(boolean z) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public final void setCurrentFloatMode(boolean z) {
    }

    public final void setCurrentUserId(@Nullable String str) {
    }

    public final void setDanmuMgr(@Nullable DanmuMgr danmuMgr) {
    }

    public final void setDp220(int i2) {
    }

    public final void setHandler(@Nullable j1 j1Var) {
    }

    public final void setJoinRoomNum(int i2) {
    }

    public final void setLiveDialog(@Nullable LinearLayout linearLayout) {
    }

    public final void setLiveDialogStr(@Nullable TextView textView) {
    }

    public final void setLiveDialogSvg(@Nullable SVGAImageView sVGAImageView) {
    }

    public final void setLiveGiftHave(boolean z) {
    }

    public final void setLivePayTips(@NotNull String str) {
    }

    public final void setLivePayUrl(@NotNull String str) {
    }

    public final void setLivePushRatio(boolean z) {
    }

    public final void setLoadingCount(int i2) {
    }

    public final void setLoginIM(boolean z) {
    }

    public final void setMAuthorized(boolean z) {
    }

    public final void setMLiveEventId(@NotNull String str) {
    }

    public final void setMLiveRoom(@Nullable MLVBLiveRoom mLVBLiveRoom) {
    }

    public final void setMLiveStatus(int i2) {
    }

    public final void setMLiveThemeId(@NotNull String str) {
    }

    public final void setMMixedPlayUrl(@NotNull String str) {
    }

    public final void setMPlaying(boolean z) {
    }

    public final void setMPusherId(@Nullable String str) {
    }

    public final void setMPusherType(@Nullable Integer num) {
    }

    public final void setMRoomId(@NotNull String str) {
    }

    public final void setMRoomMute(boolean z) {
    }

    public final void setMTCSwipeAnimationController(@Nullable TCSwipeAnimationController tCSwipeAnimationController) {
    }

    public final void setMVideoViewMgr(@Nullable TCVideoViewMgr tCVideoViewMgr) {
    }

    public final void setMWindowManager(@Nullable WindowManager windowManager) {
    }

    public final void setMWindowParams(@Nullable WindowManager.LayoutParams layoutParams) {
    }

    public final void setOnNewIn(boolean z) {
    }

    public final void setOpenDanKu(boolean z) {
    }

    public final void setRoomInfo(@Nullable LiveRoomDetailBean liveRoomDetailBean) {
    }

    public final void setSaveCountDownTips(boolean z) {
    }

    public final void setSeeLiveTime(long j2) {
    }

    public void setShowFloat(boolean z) {
    }

    public final void setShowWiFiTips(boolean z) {
    }

    public final void setStartPLayInfoBean(@Nullable LiveStartPLayInfoBean liveStartPLayInfoBean) {
    }

    public final void setToast(@Nullable LinearLayout linearLayout) {
    }

    public final void setToastStr(@Nullable TextView textView) {
    }

    public final void setTxCloudVideoView(@NotNull TXCloudVideoView tXCloudVideoView) {
    }

    public final void setVerticalScreen(boolean z) {
    }

    public final void setVideoPause(boolean z) {
    }

    public final void showErrorAndQuit(@NotNull String str) {
    }

    public boolean showFloatPreDialog() {
    }

    public final void showLiveDialog(boolean z) {
    }

    public final void showLiveDialogBy() {
    }

    public final void showToast(boolean z, @NotNull String str) {
    }

    public final void showWiFiDialog() {
    }

    public void slideFloatWindowPoi(int i2, int i3) {
    }

    public void startDismissControlViewTimer() {
    }

    public final void startPlay(@Nullable String str, @Nullable TXCloudVideoView tXCloudVideoView, boolean z) {
    }

    public void startTime() {
    }

    public final void stopPlay() {
    }

    public void stopTime() {
    }
}
