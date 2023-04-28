package cn.sharesdk.framework;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class InnerShareParams {
    public static final String ACTIVITY = "activity";
    public static final String ADDRESS = "address";
    public static final String AUTHOR = "author";
    public static final String COMMENT = "comment";
    public static final String CONTENT_TYPE = "contentType";
    public static final String CUSTOM_FLAG = "customFlag";
    public static final String DOUYIN_MIX_FILE = "douyin_mix_file";
    public static final String EXECUTE_URL = "executeUrl";
    public static final String EXT_INFO = "extInfo";
    public static final String FILE_IMAGE = "file_image";
    public static final String FILE_PATH = "filePath";
    public static final String FILE_STICKER = "file_sticker";
    public static final String FILE_VIDEO = "file_video";
    public static final String GROPU_ID = "groupID";
    public static final String HASHTAG = "HASHTAG";
    public static final String HASHTAGS = "HASHTAGS";
    public static final String HIDDEN = "hidden";
    public static final String IMAGE_ARRAY = "imageArray";
    public static final String IMAGE_DATA = "imageData";
    public static final String IMAGE_FILE_PROVIDER_PATH = "image_provider_path";
    public static final String IMAGE_LIST = "imageList";
    public static final String IMAGE_PATH = "imagePath";
    public static final String IMAGE_URI_LIST = "imageUriList";
    public static final String IMAGE_URL = "imageUrl";
    public static final String IMAGE_URL_LIST = "imageUrlList";
    public static final String INSTALL_URL = "installUrl";
    public static final String IS_FAMILY = "isFamily";
    public static final String IS_FRIEND = "isFriend";
    public static final String IS_LOG_EVEN = "isLogEven";
    public static final String IS_PUBLIC = "isPublic";
    public static final String IS_SHARE_TENCENT_WEIBO = "isShareTencentWeibo";
    public static final String KAKAO_CUSTOM_TEMPLATE = "kaokao_custom_template";
    public static final String KAKAO_CUSTOM_TEMPLATEID = "kakao_custom_templateid";
    public static final String KAKAO_TEMPLATE_ADDBUTTON_MOBILEWEBURL = "kaokao_template_button_mobileweburl";
    public static final String KAKAO_TEMPLATE_ADDBUTTON_TITLE = "kakao_template_button_title";
    public static final String KAKAO_TEMPLATE_ADDBUTTON_WEBURL = "kakao_template_button_weburl";
    public static final String KAKAO_TEMPLATE_COMMENTCOUNT = "kakao_template_commentcount";
    public static final String KAKAO_TEMPLATE_DISCOUNTPRICE = "kakao_template_discountprice";
    public static final String KAKAO_TEMPLATE_DISCOUNTRATE = "kakao_template_discountrate";
    public static final String KAKAO_TEMPLATE_LIKECOUNT = "kakao_template_likecount";
    public static final String KAKAO_TEMPLATE_MOBILEWEBURL = "kakao_template_mobileweburl";
    public static final String KAKAO_TEMPLATE_PRODUCTNAME = "kakao_template_productname";
    public static final String KAKAO_TEMPLATE_REGULARPRICE = "kaokao_template_regularprice";
    public static final String KAKAO_TEMPLATE_SHARECOUNT = "kakao_template_sharecount";
    public static final String KAKAO_TEMPLATE_WEBURL = "kakao_template_weburl";
    public static final String LATITUDE = "latitude";
    public static final String LC_CREATE_AT = "lc_create_at";
    public static final String LC_DISPLAY_NAME = "lc_display_name";
    public static final String LC_IMAGE = "lc_image";
    public static final String LC_OBJECT_TYPE = "lc_object_type";
    public static final String LC_SUMMARY = "lc_summary";
    public static final String LC_URL = "lc_url";
    public static final String LINKEDIN_DESCRIPTION = "linkedinDescription";
    public static final String LONGITUDE = "longitude";
    public static final String LOOPSHARE_PARAMS_MOBID = "loopshare_params_mobid";
    public static final String MUSIC_URL = "musicUrl";
    public static final String NOTEBOOK = "notebook";
    public static final String QQ_MINI_PROGRAM_APPID = "mini_program_appid";
    public static final String QQ_MINI_PROGRAM_PATH = "mini_program_path";
    public static final String QQ_MINI_PROGRAM_TYPE = "mini_program_type";
    public static final String QUOTE = "QUOTE";
    public static final String SAFETY_LEVEL = "safetyLevel";
    public static final String SCENCE = "scene";
    public static final String SHARE_TO_PUBLISH = "shareToPublish";
    public static final String SHARE_TYPE = "shareType";
    public static final String SITE = "site";
    public static final String SITE_URL = "siteUrl";
    public static final String STACK = "stack";
    public static final String SUBREDDIT = "sr";
    public static final String TAGS = "tags";
    public static final String TAG_POSITION = "douyin_tag_position";
    public static final String TEXT = "text";
    public static final String TITLE = "title";
    public static final String TITLE_URL = "titleUrl";
    public static final String URL = "url";
    public static final String VENUE_DESCRIPTION = "venueDescription";
    public static final String VENUE_NAME = "venueName";
    public static final String VIDEO_ARRAY = "videoArray";
    public static final String VIDEO_PATH_OASIS = "video_path_oasis";
    public static final String VIDEO_URI = "video_uri";
    public static final String VIDEO_URI_OASIS = "video_uri_oasis";
    public static final String VIDEO_URL = "video_url";
    public static final String WX_MINIPROGRAM_MINIPROGRAM_TYPE = "wxMiniProgramType";
    public static final String WX_MINIPROGRAM_PATH = "wxPath";
    public static final String WX_MINIPROGRAM_USER_NAME = "wxUserName";
    public static final String WX_MINIPROGRAM_WITH_SHARETICKET = "wxWithShareTicket";
    public static final String WX_RESERVED = "wx_reserved";
    public static final String WX_SCENE = "wx_scene";
    public static final String WX_TEMPLATEID = "wx_templateid";
    private HashMap<String, Object> params;

    public InnerShareParams() {
    }

    public <T> T get(String str, Class<T> cls) {
    }

    public Activity getActivity() {
    }

    public String getAddress() {
    }

    public String getAuthor() {
    }

    public String getComment() {
    }

    public int getContentType() {
    }

    public String[] getCustomFlag() {
    }

    public String[] getDYMixFileArray() {
    }

    public boolean getDouyinShareToPublish() {
    }

    public String getExtInfo() {
    }

    public File getFileImage() {
    }

    public String getFilePath() {
    }

    public File getFileVideo() {
    }

    public String getGroupId() {
    }

    public String getHashtag() {
    }

    public String[] getHashtags() {
    }

    public int getHidden() {
    }

    public String[] getImageArray() {
    }

    public Bitmap getImageData() {
    }

    public String getImageFileProviderPath() {
    }

    public String getImagePath() {
    }

    public List<Uri> getImageUriList() {
    }

    public String getImageUrl() {
    }

    public List<String> getImageUrlList() {
    }

    public String getKakaoAddbuttonMobileweburl() {
    }

    public String getKakaoAddbuttonTitle() {
    }

    public String getKakaoAddbuttonWeburl() {
    }

    public int getKakaoCommentcount() {
    }

    public HashMap<String, String> getKakaoCustomTemplate() {
    }

    public String getKakaoCustomTemplateId() {
    }

    public int getKakaoDiscountprice() {
    }

    public int getKakaoDiscountrate() {
    }

    public int getKakaoLikecount() {
    }

    public String getKakaoMobileweburl() {
    }

    public int getKakaoRegularprice() {
    }

    public int getKakaoSharecount() {
    }

    public String getKakaoTemplateProductname() {
    }

    public String getKakaoWebUrl() {
    }

    public float getLatitude() {
    }

    public String getLcCreateAt() {
    }

    public String getLcDisplayName() {
    }

    public JSONObject getLcImage() {
    }

    public String getLcObjectType() {
    }

    public String getLcSummary() {
    }

    public String getLcUrl() {
    }

    public String getLinkedinDsscription() {
    }

    public float getLongitude() {
    }

    public HashMap<String, Object> getLoopshareCustomParams() {
    }

    public String getMusicUrl() {
    }

    public String getNotebook() {
    }

    public boolean getOpenCustomEven() {
    }

    public String getQQMiniProgramAppid() {
    }

    public String getQQMiniProgramPath() {
    }

    public String getQQMiniProgramType() {
    }

    public String getQuote() {
    }

    public int getSafetyLevel() {
    }

    public int getScence() {
    }

    public int getShareType() {
    }

    public String getSite() {
    }

    public String getSiteUrl() {
    }

    public String getStack() {
    }

    public File getStickerFile() {
    }

    public String getSubreddit() {
    }

    public int getTagPosition() {
    }

    public String[] getTags() {
    }

    public String getText() {
    }

    public String getTitle() {
    }

    public String getTitleUrl() {
    }

    public String getUrl() {
    }

    public String getVenueDescription() {
    }

    public String getVenueName() {
    }

    public String[] getVideoPathArray() {
    }

    public String getVideoPathOasis() {
    }

    public Uri getVideoUri() {
    }

    public Uri getVideoUriOasis() {
    }

    public String getVideoUrl() {
    }

    public int getWxMiniProgramType() {
    }

    public String getWxPath() {
    }

    public String getWxReserved() {
    }

    public String getWxTemplateid() {
    }

    public String getWxUserName() {
    }

    public boolean getWxWithShareTicket() {
    }

    public boolean isFamily() {
    }

    public boolean isFriend() {
    }

    public boolean isPublic() {
    }

    public boolean isShareTencentWeibo() {
    }

    public void set(String str, Object obj) {
    }

    public void setActivity(Activity activity) {
    }

    public void setAddress(String str) {
    }

    public void setAuthor(String str) {
    }

    public void setComment(String str) {
    }

    public void setContentType(int i2) {
    }

    public void setCustomFlag(String[] strArr) {
    }

    public void setDYMixFileArray(String[] strArr) {
    }

    public void setDouyinShareToPublish(boolean z) {
    }

    public void setExtInfo(String str) {
    }

    public void setFamily(boolean z) {
    }

    public void setFileImage(File file) {
    }

    public void setFilePath(String str) {
    }

    public void setFileSticker(File file) {
    }

    public void setFileVideo(File file) {
    }

    public void setFriend(boolean z) {
    }

    public void setGroupId(String str) {
    }

    public void setHashtag(String str) {
    }

    public void setHashtags(String[] strArr) {
    }

    public void setHidden(int i2) {
    }

    public void setImageArray(String[] strArr) {
    }

    public void setImageData(Bitmap bitmap) {
    }

    public void setImageFileProviderPath(String str) {
    }

    public void setImagePath(String str) {
    }

    public void setImageUriList(List<Uri> list) {
    }

    public void setImageUrl(String str) {
    }

    public void setImageUrlList(List<String> list) {
    }

    public void setKakaoAddbuttonMobileweburl(String str) {
    }

    public void setKakaoAddbuttonTitle(String str) {
    }

    public void setKakaoAddbuttonWeburl(String str) {
    }

    public void setKakaoCommentcount(int i2) {
    }

    public void setKakaoCustomTemplate(HashMap<String, String> hashMap) {
    }

    public void setKakaoCustomTemplateId(String str) {
    }

    public void setKakaoDiscountprice(int i2) {
    }

    public void setKakaoDiscountrate(int i2) {
    }

    public void setKakaoLikecount(int i2) {
    }

    public void setKakaoMobileWebUrl(String str) {
    }

    public void setKakaoProductname(String str) {
    }

    public void setKakaoRegularprice(int i2) {
    }

    public void setKakaoSharecount(int i2) {
    }

    public void setKakaoWebUrl(String str) {
    }

    public void setLatitude(float f2) {
    }

    public void setLcCreateAt(String str) {
    }

    public void setLcDisplayName(String str) {
    }

    public void setLcImage(JSONObject jSONObject) {
    }

    public void setLcObjectType(String str) {
    }

    public void setLcSummary(String str) {
    }

    public void setLcUrl(String str) {
    }

    public void setLinkedinDescription(String str) {
    }

    public void setLongitude(float f2) {
    }

    public void setLoopshareCustomParams(HashMap<String, Object> hashMap) {
    }

    public void setMusicUrl(String str) {
    }

    public void setNotebook(String str) {
    }

    public void setOpenCustomEven(boolean z) {
    }

    public void setPublic(boolean z) {
    }

    public void setQQMiniProgramAppid(String str) {
    }

    public void setQQMiniProgramPath(String str) {
    }

    public void setQQMiniProgramType(String str) {
    }

    public void setQuote(String str) {
    }

    public void setSafetyLevel(int i2) {
    }

    public void setScence(int i2) {
    }

    public void setShareTencentWeibo(boolean z) {
    }

    public void setShareType(int i2) {
    }

    public void setSite(String str) {
    }

    public void setSiteUrl(String str) {
    }

    public void setStack(String str) {
    }

    public void setSubreddit(String str) {
    }

    public void setTagPosition(int i2) {
    }

    public void setTags(String[] strArr) {
    }

    public void setText(String str) {
    }

    public void setTitle(String str) {
    }

    public void setTitleUrl(String str) {
    }

    public void setUrl(String str) {
    }

    public void setVenueDescription(String str) {
    }

    public void setVenueName(String str) {
    }

    public void setVideoPathArray(String[] strArr) {
    }

    public void setVideoPathOasis(String str) {
    }

    public void setVideoUri(Uri uri) {
    }

    public void setVideoUriOasis(Uri uri) {
    }

    public void setVideoUrl(String str) {
    }

    public void setWxMiniProgramType(int i2) {
    }

    public void setWxPath(String str) {
    }

    public void setWxReserved(String str) {
    }

    public void setWxTemplateid(String str) {
    }

    public void setWxUserName(String str) {
    }

    public void setWxWithShareTicket(boolean z) {
    }

    public HashMap<String, Object> toMap() {
    }

    public String toString() {
    }

    public InnerShareParams(HashMap<String, Object> hashMap) {
    }

    public InnerShareParams(String str) {
    }
}
