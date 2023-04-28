package com.showstartfans.activity.model.actdes;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.model.GroupShowBean;
import com.showstartfans.activity.model.HostBean;
import com.showstartfans.activity.model.ShowCouponLabel;
import com.showstartfans.activity.model.TagBean;
import com.showstartfans.activity.model.VocalConcertDetailPhotoBean;
import com.showstartfans.activity.model.goodsmodel.ShowGoodsBean;
import com.showstartfans.activity.model.pay.TicketBean;
import h.u.a.u.e4.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ActDesBean implements Parcelable {
    public static final Parcelable.Creator<ActDesBean> CREATOR = null;
    private int activityId;
    private int activityLevel;
    private String activityLevelName;
    private String activityName;
    private String activityTag;
    private List<AnnouncementBean> advertising;
    private List<String> album;
    private String avatar;
    private List<VocalConcertDetailPhotoBean> banner;
    private int beginTimeConfirmed;
    public BulletFrameBean bulletFrame;
    private String document;
    private String documentName;
    private String documentNumber;
    private int documentType;
    private h.u.a.u.e4.b down;
    private List<ShowGoodsBean> goodsList;
    private String goodsNum;
    private GroupShowBean group;
    private List<HostBean> host;
    private int isBindHotel;
    private int isShowCollection;
    private List<ShowCouponLabel> labels;
    private int letterCount;
    private List<MusicBean> music;
    private List<AnnouncementBean> notices;
    private List<OtherActivitiesBean> otherActivities;
    private String price;
    private int realName;
    private int realNameValidType;
    public ReserveInfoBean reserveInfo;
    private String sellIdentity;
    private int sellTerminal;
    private String sequence;
    private String serviceTemplateContent;
    private String serviceTemplateEnContent;
    private List<String> serviceTemplates;
    private List<ParticipatingTitleBean> sessionUserInfos;
    private List<Integer> shareActivityIds;
    private String shareAvatar;
    private String shareId;
    private String shareUserName;
    private int shareUserType;
    private long showEndTime;
    private boolean showLetter;
    private boolean showScene;
    private long showStartTime;
    private String showTime;
    private int showTimeType;
    private SiteBean site;
    private String siteName;
    private int squadStatus;
    public ArrayList<TagBean> stylesTopic;
    private String tags;
    private List<TicketBean> ticketPrice;
    private String title;
    private String url;
    private int wantToNum;
    private boolean whetherWantTo;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Parcelable.Creator<ActDesBean> {
        public ActDesBean a(Parcel parcel) {
        }

        public ActDesBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ActDesBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ActDesBean[] newArray(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements b.InterfaceC0364b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f6541a;
        public final /* synthetic */ ActDesBean b;

        public b(ActDesBean actDesBean, TextView textView) {
        }

        @Override // h.u.a.u.e4.b.InterfaceC0364b
        public void a(long j2, int i2, int i3, int i4, int i5, String str, String str2, String str3) {
        }

        @Override // h.u.a.u.e4.b.InterfaceC0364b
        public void onFinish() {
        }
    }

    public ActDesBean() {
    }

    public static /* synthetic */ void a(TextView textView, View view) {
    }

    public static /* synthetic */ h.u.a.u.e4.b access$000(ActDesBean actDesBean) {
    }

    public static /* synthetic */ void access$100(ActDesBean actDesBean, TextView textView) {
    }

    private void goReservation(TextView textView) {
    }

    public boolean checkIfCanPurchase() {
    }

    public boolean checkIfNeedDealReservation() {
    }

    public void clearTimeButton() {
    }

    public void dealSomethingWhenInReservation(TextView textView) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public int getActivityId() {
    }

    public int getActivityLevel() {
    }

    public String getActivityLevelName() {
    }

    public String getActivityName() {
    }

    public String getActivityTag() {
    }

    public List<AnnouncementBean> getAdvertising() {
    }

    public List<String> getAlbum() {
    }

    public String getAvatar() {
    }

    public List<VocalConcertDetailPhotoBean> getBanner() {
    }

    public int getBeginTimeConfirmed() {
    }

    public BulletFrameBean getBulletFrame() {
    }

    public String getDocument() {
    }

    public String getDocumentName() {
    }

    public String getDocumentNumber() {
    }

    public int getDocumentType() {
    }

    public List<ShowGoodsBean> getGoodsList() {
    }

    public String getGoodsNum() {
    }

    public GroupShowBean getGroup() {
    }

    public List<HostBean> getHost() {
    }

    public int getIsBindHotel() {
    }

    public int getIsShowCollection() {
    }

    public List<ShowCouponLabel> getLabels() {
    }

    public int getLetterCount() {
    }

    public List<MusicBean> getMusic() {
    }

    public List<AnnouncementBean> getNotices() {
    }

    public List<OtherActivitiesBean> getOtherActivities() {
    }

    public String getPrice() {
    }

    public int getRealName() {
    }

    public int getRealNameValidType() {
    }

    public ReserveInfoBean getReserveInfo() {
    }

    public String getSellIdentity() {
    }

    public int getSellTerminal() {
    }

    public String getSequence() {
    }

    public String getServiceTemplateContent() {
    }

    public String getServiceTemplateEnContent() {
    }

    public List<String> getServiceTemplates() {
    }

    public List<ParticipatingTitleBean> getSessionUserInfos() {
    }

    public List<Integer> getShareActivityIds() {
    }

    public String getShareAvatar() {
    }

    public String getShareId() {
    }

    public String getShareUserName() {
    }

    public int getShareUserType() {
    }

    public long getShowEndTime() {
    }

    public long getShowStartTime() {
    }

    public String getShowTime() {
    }

    public int getShowTimeType() {
    }

    public SiteBean getSite() {
    }

    public String getSiteName() {
    }

    public int getSquadStatus() {
    }

    public String getTags() {
    }

    public List<TicketBean> getTicketPrice() {
    }

    public String getTitle() {
    }

    public String getUrl() {
    }

    public int getWantToNum() {
    }

    public boolean haveReservation() {
    }

    public boolean isShowLetter() {
    }

    public boolean isShowScene() {
    }

    public boolean isWhetherWantTo() {
    }

    public void setActivityId(int i2) {
    }

    public void setActivityLevel(int i2) {
    }

    public void setActivityLevelName(String str) {
    }

    public void setActivityName(String str) {
    }

    public void setActivityTag(String str) {
    }

    public void setAdvertising(List<AnnouncementBean> list) {
    }

    public void setAlbum(List<String> list) {
    }

    public void setAvatar(String str) {
    }

    public void setBanner(List<VocalConcertDetailPhotoBean> list) {
    }

    public void setBeginTimeConfirmed(int i2) {
    }

    public void setBulletFrame(BulletFrameBean bulletFrameBean) {
    }

    public void setDocument(String str) {
    }

    public void setDocumentName(String str) {
    }

    public void setDocumentNumber(String str) {
    }

    public void setDocumentType(int i2) {
    }

    public void setDown(h.u.a.u.e4.b bVar) {
    }

    public void setGoodsList(List<ShowGoodsBean> list) {
    }

    public void setGoodsNum(String str) {
    }

    public void setGroup(GroupShowBean groupShowBean) {
    }

    public void setHost(List<HostBean> list) {
    }

    public void setIsBindHotel(int i2) {
    }

    public void setIsShowCollection(int i2) {
    }

    public void setLabels(List<ShowCouponLabel> list) {
    }

    public void setLetterCount(int i2) {
    }

    public void setMusic(List<MusicBean> list) {
    }

    public void setNotices(List<AnnouncementBean> list) {
    }

    public void setOtherActivities(List<OtherActivitiesBean> list) {
    }

    public void setPrice(String str) {
    }

    public void setRealName(int i2) {
    }

    public void setRealNameValidType(int i2) {
    }

    public void setReserveInfo(ReserveInfoBean reserveInfoBean) {
    }

    public void setSellIdentity(String str) {
    }

    public void setSellTerminal(int i2) {
    }

    public void setSequence(String str) {
    }

    public void setServiceTemplateContent(String str) {
    }

    public void setServiceTemplateEnContent(String str) {
    }

    public void setServiceTemplates(List<String> list) {
    }

    public void setSessionUserInfos(List<ParticipatingTitleBean> list) {
    }

    public void setShareActivityIds(List<Integer> list) {
    }

    public void setShareAvatar(String str) {
    }

    public void setShareId(String str) {
    }

    public void setShareUserName(String str) {
    }

    public void setShareUserType(int i2) {
    }

    public void setShowEndTime(long j2) {
    }

    public void setShowLetter(boolean z) {
    }

    public void setShowScene(boolean z) {
    }

    public void setShowStartTime(long j2) {
    }

    public void setShowTime(String str) {
    }

    public void setShowTimeType(int i2) {
    }

    public void setSite(SiteBean siteBean) {
    }

    public void setSiteName(String str) {
    }

    public void setSquadStatus(int i2) {
    }

    public void setTags(String str) {
    }

    public void setTicketPrice(List<TicketBean> list) {
    }

    public void setTitle(String str) {
    }

    public void setUrl(String str) {
    }

    public void setWantToNum(int i2) {
    }

    public void setWhetherWantTo(boolean z) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public ActDesBean(Parcel parcel) {
    }
}
