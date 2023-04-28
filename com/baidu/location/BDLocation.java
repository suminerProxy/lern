package com.baidu.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.location.Address;
import com.baidu.location.e.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class BDLocation implements Parcelable {
    public static final String BDLOCATION_BD09LL_TO_GCJ02 = "bd09ll2gcj";
    public static final String BDLOCATION_BD09_TO_GCJ02 = "bd092gcj";
    public static final String BDLOCATION_GCJ02_TO_BD09 = "bd09";
    public static final String BDLOCATION_GCJ02_TO_BD09LL = "bd09ll";
    public static final String BDLOCATION_WGS84_TO_GCJ02 = "gps2gcj";
    public static final Parcelable.Creator<BDLocation> CREATOR = new a();
    public static final int GPS_ACCURACY_BAD = 3;
    public static final int GPS_ACCURACY_GOOD = 1;
    public static final int GPS_ACCURACY_MID = 2;
    public static final int GPS_ACCURACY_UNKNOWN = 0;
    public static final int GPS_RECTIFY_INDOOR = 1;
    public static final int GPS_RECTIFY_NONE = 0;
    public static final int GPS_RECTIFY_OUTDOOR = 2;
    public static final int INDOOR_LOCATION_NEARBY_SURPPORT_TRUE = 2;
    public static final int INDOOR_LOCATION_SOURCE_BLUETOOTH = 4;
    public static final int INDOOR_LOCATION_SOURCE_MAGNETIC = 2;
    public static final int INDOOR_LOCATION_SOURCE_SMALLCELLSTATION = 8;
    public static final int INDOOR_LOCATION_SOURCE_UNKNOWN = 0;
    public static final int INDOOR_LOCATION_SOURCE_WIFI = 1;
    public static final int INDOOR_LOCATION_SURPPORT_FALSE = 0;
    public static final int INDOOR_LOCATION_SURPPORT_TRUE = 1;
    public static final int INDOOR_NETWORK_STATE_HIGH = 2;
    public static final int INDOOR_NETWORK_STATE_LOW = 0;
    public static final int INDOOR_NETWORK_STATE_MIDDLE = 1;
    public static final int LOCATION_WHERE_IN_CN = 1;
    public static final int LOCATION_WHERE_OUT_CN = 0;
    public static final int LOCATION_WHERE_UNKNOW = 2;
    public static final int MOCK_GPS_PROBABILITY_HIGH = 3;
    public static final int MOCK_GPS_PROBABILITY_LOW = 1;
    public static final int MOCK_GPS_PROBABILITY_MIDDLE = 2;
    public static final int MOCK_GPS_PROBABILITY_UNKNOW = -1;
    public static final int MOCK_GPS_PROBABILITY_ZERO = 0;
    public static final int OPERATORS_TYPE_MOBILE = 1;
    public static final int OPERATORS_TYPE_TELECOMU = 3;
    public static final int OPERATORS_TYPE_UNICOM = 2;
    public static final int OPERATORS_TYPE_UNKONW = 0;
    public static final int TypeCacheLocation = 65;
    public static final int TypeCriteriaException = 62;
    public static final int TypeGpsLocation = 61;
    public static final int TypeNetWorkException = 63;
    public static final int TypeNetWorkLocation = 161;
    public static final int TypeNone = 0;
    public static final int TypeOffLineLocation = 66;
    public static final int TypeOffLineLocationFail = 67;
    public static final int TypeOffLineLocationNetworkFail = 68;
    public static final int TypeServerCheckKeyError = 505;
    public static final int TypeServerDecryptError = 162;
    public static final int TypeServerError = 167;
    public static final int USER_INDDOR_TRUE = 1;
    public static final int USER_INDOOR_FALSE = 0;
    public static final int USER_INDOOR_UNKNOW = -1;
    private int A;
    private int B;
    private String C;
    private int D;
    private String E;
    private int F;
    private int G;
    private int H;
    private int I;
    private String J;
    private String K;
    private String L;
    private List<Poi> M;
    private String N;
    private String O;
    private String P;
    private Bundle Q;
    private int R;
    private int S;
    private long T;
    private String U;
    private double V;
    private double W;
    private boolean X;
    private PoiRegion Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private int f1092a;
    private double aa;
    private int ab;
    private int ac;
    private BDLocation ad;
    private String b;
    private double c;

    /* renamed from: d  reason: collision with root package name */
    private double f1093d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1094e;

    /* renamed from: f  reason: collision with root package name */
    private double f1095f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1096g;

    /* renamed from: h  reason: collision with root package name */
    private float f1097h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1098i;

    /* renamed from: j  reason: collision with root package name */
    private float f1099j;

    /* renamed from: k  reason: collision with root package name */
    private String f1100k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1101l;

    /* renamed from: m  reason: collision with root package name */
    private int f1102m;

    /* renamed from: n  reason: collision with root package name */
    private float f1103n;

    /* renamed from: o  reason: collision with root package name */
    private String f1104o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1105p;
    private String q;
    private String r;
    private String s;
    private String t;
    private boolean u;
    private Address v;
    private String w;
    private String x;
    private String y;
    private boolean z;

    public BDLocation() {
        this.f1092a = 0;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.f1093d = Double.MIN_VALUE;
        this.f1094e = false;
        this.f1095f = Double.MIN_VALUE;
        this.f1096g = false;
        this.f1097h = 0.0f;
        this.f1098i = false;
        this.f1099j = 0.0f;
        this.f1101l = false;
        this.f1102m = -1;
        this.f1103n = -1.0f;
        this.f1104o = null;
        this.f1105p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = new Address.Builder().build();
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = false;
        this.A = 0;
        this.B = 1;
        this.C = null;
        this.E = "";
        this.F = -1;
        this.G = 0;
        this.H = 2;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = new Bundle();
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        this.U = null;
        this.V = Double.MIN_VALUE;
        this.W = Double.MIN_VALUE;
        this.X = false;
        this.Y = null;
        this.Z = -1.0f;
        this.aa = -1.0d;
        this.ab = 0;
        this.ac = -1;
    }

    private BDLocation(Parcel parcel) {
        this.f1092a = 0;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.f1093d = Double.MIN_VALUE;
        this.f1094e = false;
        this.f1095f = Double.MIN_VALUE;
        this.f1096g = false;
        this.f1097h = 0.0f;
        this.f1098i = false;
        this.f1099j = 0.0f;
        this.f1101l = false;
        this.f1102m = -1;
        this.f1103n = -1.0f;
        this.f1104o = null;
        this.f1105p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = new Address.Builder().build();
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = false;
        this.A = 0;
        this.B = 1;
        this.C = null;
        this.E = "";
        this.F = -1;
        this.G = 0;
        this.H = 2;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = new Bundle();
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        this.U = null;
        this.V = Double.MIN_VALUE;
        this.W = Double.MIN_VALUE;
        this.X = false;
        this.Y = null;
        this.Z = -1.0f;
        this.aa = -1.0d;
        this.ab = 0;
        this.ac = -1;
        this.f1092a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readDouble();
        this.f1093d = parcel.readDouble();
        this.f1095f = parcel.readDouble();
        this.f1097h = parcel.readFloat();
        this.f1099j = parcel.readFloat();
        this.f1100k = parcel.readString();
        this.f1102m = parcel.readInt();
        this.f1103n = parcel.readFloat();
        this.w = parcel.readString();
        this.A = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.C = parcel.readString();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        this.v = new Address.Builder().country(readString7).countryCode(readString8).province(readString).city(readString2).cityCode(readString6).district(readString3).street(readString4).streetNumber(readString5).adcode(readString9).town(parcel.readString()).build();
        boolean[] zArr = new boolean[8];
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.B = parcel.readInt();
        this.N = parcel.readString();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.R = parcel.readInt();
        this.O = parcel.readString();
        this.S = parcel.readInt();
        this.P = parcel.readString();
        this.U = parcel.readString();
        this.T = parcel.readLong();
        this.V = parcel.readDouble();
        this.W = parcel.readDouble();
        this.Z = parcel.readFloat();
        this.aa = parcel.readDouble();
        this.ab = parcel.readInt();
        this.ac = parcel.readInt();
        this.f1104o = parcel.readString();
        try {
            this.ad = (BDLocation) parcel.readParcelable(BDLocation.class.getClassLoader());
        } catch (Exception e2) {
            this.ad = null;
            e2.printStackTrace();
        }
        try {
            parcel.readBooleanArray(zArr);
            this.f1094e = zArr[0];
            this.f1096g = zArr[1];
            this.f1098i = zArr[2];
            this.f1101l = zArr[3];
            this.f1105p = zArr[4];
            this.u = zArr[5];
            this.z = zArr[6];
            this.X = zArr[7];
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            parcel.readList(arrayList, Poi.class.getClassLoader());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.M = null;
        } else {
            this.M = arrayList;
        }
        try {
            this.Q = parcel.readBundle();
        } catch (Exception e4) {
            e4.printStackTrace();
            this.Q = new Bundle();
        }
        try {
            this.Y = (PoiRegion) parcel.readParcelable(PoiRegion.class.getClassLoader());
        } catch (Exception e5) {
            this.Y = null;
            e5.printStackTrace();
        }
    }

    public /* synthetic */ BDLocation(Parcel parcel, a aVar) {
        this(parcel);
    }

    public BDLocation(BDLocation bDLocation) {
        this.f1092a = 0;
        ArrayList arrayList = null;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.f1093d = Double.MIN_VALUE;
        this.f1094e = false;
        this.f1095f = Double.MIN_VALUE;
        this.f1096g = false;
        this.f1097h = 0.0f;
        this.f1098i = false;
        this.f1099j = 0.0f;
        this.f1101l = false;
        this.f1102m = -1;
        this.f1103n = -1.0f;
        this.f1104o = null;
        this.f1105p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = false;
        this.v = new Address.Builder().build();
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = false;
        this.A = 0;
        this.B = 1;
        this.C = null;
        this.E = "";
        this.F = -1;
        this.G = 0;
        this.H = 2;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = new Bundle();
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        this.U = null;
        this.V = Double.MIN_VALUE;
        this.W = Double.MIN_VALUE;
        this.X = false;
        this.Y = null;
        this.Z = -1.0f;
        this.aa = -1.0d;
        this.ab = 0;
        this.ac = -1;
        this.f1092a = bDLocation.f1092a;
        this.b = bDLocation.b;
        this.c = bDLocation.c;
        this.f1093d = bDLocation.f1093d;
        this.f1094e = bDLocation.f1094e;
        this.f1095f = bDLocation.f1095f;
        this.f1096g = bDLocation.f1096g;
        this.f1097h = bDLocation.f1097h;
        this.f1098i = bDLocation.f1098i;
        this.f1099j = bDLocation.f1099j;
        this.f1100k = bDLocation.f1100k;
        this.f1101l = bDLocation.f1101l;
        this.f1102m = bDLocation.f1102m;
        this.f1103n = bDLocation.f1103n;
        this.f1104o = bDLocation.f1104o;
        this.f1105p = bDLocation.f1105p;
        this.q = bDLocation.q;
        this.u = bDLocation.u;
        this.v = new Address.Builder().country(bDLocation.v.country).countryCode(bDLocation.v.countryCode).province(bDLocation.v.province).city(bDLocation.v.city).cityCode(bDLocation.v.cityCode).district(bDLocation.v.district).street(bDLocation.v.street).streetNumber(bDLocation.v.streetNumber).adcode(bDLocation.v.adcode).town(bDLocation.v.town).build();
        this.w = bDLocation.w;
        this.x = bDLocation.x;
        this.y = bDLocation.y;
        this.B = bDLocation.B;
        this.A = bDLocation.A;
        this.z = bDLocation.z;
        this.C = bDLocation.C;
        this.D = bDLocation.D;
        this.E = bDLocation.E;
        this.r = bDLocation.r;
        this.s = bDLocation.s;
        this.t = bDLocation.t;
        this.F = bDLocation.F;
        this.G = bDLocation.G;
        this.H = bDLocation.G;
        this.I = bDLocation.I;
        this.J = bDLocation.J;
        this.K = bDLocation.K;
        this.L = bDLocation.L;
        this.R = bDLocation.R;
        this.P = bDLocation.P;
        this.U = bDLocation.U;
        this.V = bDLocation.V;
        this.W = bDLocation.W;
        this.T = bDLocation.T;
        this.aa = bDLocation.aa;
        this.ab = bDLocation.ab;
        this.ac = bDLocation.ac;
        this.ad = bDLocation.ad;
        this.O = bDLocation.O;
        if (bDLocation.M != null) {
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < bDLocation.M.size(); i2++) {
                Poi poi = bDLocation.M.get(i2);
                arrayList.add(new Poi(poi.getId(), poi.getName(), poi.getRank(), poi.getTags(), poi.getAddr()));
            }
        }
        this.M = arrayList;
        this.N = bDLocation.N;
        this.Q = bDLocation.Q;
        this.S = bDLocation.S;
        this.X = bDLocation.X;
        this.Y = bDLocation.Y;
        this.Z = bDLocation.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x044a A[Catch: Exception -> 0x0172, Error -> 0x0715, TRY_LEAVE, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049b A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b2 A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d1 A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ea A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0503 A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051c A[Catch: Exception -> 0x0172, Error -> 0x0715, TRY_LEAVE, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0600 A[Catch: Exception -> 0x0172, Error -> 0x0715, TRY_LEAVE, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0614 A[Catch: Exception -> 0x0624, Error -> 0x0715, TryCatch #19 {Exception -> 0x0624, blocks: (B:291:0x060e, B:293:0x0614, B:294:0x0620), top: B:393:0x060e }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0620 A[Catch: Exception -> 0x0624, Error -> 0x0715, TRY_LEAVE, TryCatch #19 {Exception -> 0x0624, blocks: (B:291:0x060e, B:293:0x0614, B:294:0x0620), top: B:393:0x060e }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0628 A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x062e A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0639 A[Catch: Exception -> 0x0172, Error -> 0x0715, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0649 A[Catch: Exception -> 0x0172, Error -> 0x0715, TRY_LEAVE, TryCatch #10 {Exception -> 0x0172, blocks: (B:11:0x00da, B:13:0x0132, B:14:0x013b, B:21:0x0162, B:23:0x0166, B:24:0x016d, B:29:0x017b, B:31:0x01aa, B:32:0x01b1, B:35:0x01b9, B:37:0x01c3, B:39:0x01cd, B:40:0x01d0, B:41:0x01d2, B:43:0x01da, B:44:0x01ec, B:46:0x01f2, B:48:0x0210, B:50:0x021b, B:52:0x0221, B:54:0x022a, B:55:0x0237, B:56:0x0239, B:58:0x0241, B:60:0x024d, B:61:0x024f, B:63:0x0257, B:65:0x0265, B:67:0x026d, B:69:0x0275, B:71:0x027d, B:73:0x0285, B:75:0x028d, B:76:0x0294, B:78:0x029c, B:80:0x02a8, B:81:0x02aa, B:88:0x02bc, B:90:0x02c4, B:92:0x02cc, B:94:0x02d4, B:96:0x02dc, B:98:0x02e4, B:100:0x02ec, B:102:0x02f4, B:104:0x02fc, B:106:0x0304, B:108:0x0310, B:110:0x0318, B:112:0x0323, B:114:0x032b, B:116:0x0336, B:118:0x033e, B:120:0x0349, B:122:0x0351, B:124:0x0359, B:126:0x0361, B:205:0x044a, B:212:0x0493, B:214:0x049b, B:216:0x04a7, B:217:0x04aa, B:219:0x04b2, B:221:0x04be, B:222:0x04c9, B:224:0x04d1, B:226:0x04df, B:227:0x04e2, B:229:0x04ea, B:231:0x04f8, B:232:0x04fb, B:234:0x0503, B:236:0x0511, B:237:0x0514, B:239:0x051c, B:246:0x0531, B:249:0x053a, B:250:0x0544, B:285:0x05f8, B:287:0x0600, B:295:0x0624, B:297:0x0628, B:299:0x0631, B:301:0x0639, B:302:0x0641, B:304:0x0649, B:319:0x067f, B:320:0x0682, B:329:0x06b8, B:298:0x062e, B:284:0x05f5, B:203:0x0437, B:211:0x0490, B:339:0x06d0, B:340:0x06d5), top: B:376:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x067a A[Catch: all -> 0x067d, TRY_LEAVE, TryCatch #20 {all -> 0x067d, blocks: (B:307:0x0653, B:309:0x0659, B:311:0x065f, B:313:0x0663, B:315:0x067a), top: B:394:0x0653 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x054c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x068a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BDLocation(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.BDLocation.<init>(java.lang.String):void");
    }

    private void a(Boolean bool) {
        this.u = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.v.adcode;
    }

    public String getAddrStr() {
        return this.v.address;
    }

    public Address getAddress() {
        return this.v;
    }

    public double getAltitude() {
        return this.f1095f;
    }

    public String getBuildingID() {
        return this.x;
    }

    public String getBuildingName() {
        return this.y;
    }

    public String getCity() {
        return this.v.city;
    }

    public String getCityCode() {
        return this.v.cityCode;
    }

    public String getCoorType() {
        return this.f1104o;
    }

    public String getCountry() {
        return this.v.country;
    }

    public String getCountryCode() {
        return this.v.countryCode;
    }

    public long getDelayTime() {
        return this.T;
    }

    @Deprecated
    public float getDerect() {
        return this.f1103n;
    }

    public float getDirection() {
        return this.f1103n;
    }

    public double getDisToRealLocation() {
        return this.aa;
    }

    public String getDistrict() {
        return this.v.district;
    }

    public Location getExtraLocation(String str) {
        Bundle bundle = this.Q;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(str);
            if (parcelable instanceof Location) {
                return (Location) parcelable;
            }
            return null;
        }
        return null;
    }

    public String getFloor() {
        return this.w;
    }

    public double[] getFusionLocInfo(String str) {
        return this.Q.getDoubleArray(str);
    }

    public int getGpsAccuracyStatus() {
        return this.R;
    }

    public float getGpsBiasProb() {
        return this.Z;
    }

    public int getGpsCheckStatus() {
        return this.S;
    }

    public int getIndoorLocationSource() {
        return this.I;
    }

    public int getIndoorLocationSurpport() {
        return this.G;
    }

    public String getIndoorLocationSurpportBuidlingID() {
        return this.K;
    }

    public String getIndoorLocationSurpportBuidlingName() {
        return this.J;
    }

    public int getIndoorNetworkState() {
        return this.H;
    }

    public String getIndoorSurpportPolygon() {
        return this.L;
    }

    public double getLatitude() {
        return this.c;
    }

    public int getLocType() {
        return this.f1092a;
    }

    public String getLocTypeDescription() {
        return this.N;
    }

    public String getLocationDescribe() {
        return this.r;
    }

    public String getLocationID() {
        return this.O;
    }

    public int getLocationWhere() {
        return this.B;
    }

    public double getLongitude() {
        return this.f1093d;
    }

    public int getMockGpsProbability() {
        return this.ac;
    }

    public int getMockGpsStrategy() {
        return this.ab;
    }

    public String getNetworkLocationType() {
        return this.C;
    }

    public double getNrlLat() {
        return this.V;
    }

    public double getNrlLon() {
        return this.W;
    }

    public String getNrlResult() {
        return this.U;
    }

    public int getOperators() {
        return this.D;
    }

    public List<Poi> getPoiList() {
        return this.M;
    }

    public PoiRegion getPoiRegion() {
        return this.Y;
    }

    public String getProvince() {
        return this.v.province;
    }

    public float getRadius() {
        return this.f1099j;
    }

    public BDLocation getReallLocation() {
        if (getMockGpsStrategy() > 0) {
            return this.ad;
        }
        return null;
    }

    public String getRetFields(String str) {
        return this.Q.getString(str);
    }

    public String getRoadLocString() {
        return this.P;
    }

    public int getSatelliteNumber() {
        this.f1101l = true;
        return this.f1102m;
    }

    @Deprecated
    public String getSemaAptag() {
        return this.r;
    }

    public float getSpeed() {
        return this.f1097h;
    }

    public String getStreet() {
        return this.v.street;
    }

    public String getStreetNumber() {
        return this.v.streetNumber;
    }

    public String getTime() {
        return this.b;
    }

    public String getTown() {
        return this.v.town;
    }

    public String getTraffic() {
        return this.f1100k;
    }

    public int getUserIndoorState() {
        return this.F;
    }

    public String getVdrJsonString() {
        Bundle bundle = this.Q;
        if (bundle == null || !bundle.containsKey("vdr")) {
            return null;
        }
        return this.Q.getString("vdr");
    }

    public boolean hasAddr() {
        return this.f1105p;
    }

    public boolean hasAltitude() {
        return this.f1094e;
    }

    public boolean hasRadius() {
        return this.f1098i;
    }

    public boolean hasSateNumber() {
        return this.f1101l;
    }

    public boolean hasSpeed() {
        return this.f1096g;
    }

    public boolean isCellChangeFlag() {
        return this.u;
    }

    public boolean isInIndoorPark() {
        return this.X;
    }

    public boolean isIndoorLocMode() {
        return this.z;
    }

    public boolean isNrlAvailable() {
        return (this.W == Double.MIN_VALUE || this.V == Double.MIN_VALUE) ? false : true;
    }

    public int isParkAvailable() {
        return this.A;
    }

    public void setAddr(Address address) {
        if (address != null) {
            this.v = address;
            this.f1105p = true;
        }
    }

    public void setAddrStr(String str) {
        this.q = str;
        this.f1105p = str != null;
    }

    public void setAltitude(double d2) {
        if (d2 < 9999.0d) {
            this.f1095f = d2;
            this.f1094e = true;
        }
    }

    public void setBuildingID(String str) {
        this.x = str;
    }

    public void setBuildingName(String str) {
        this.y = str;
    }

    public void setCoorType(String str) {
        this.f1104o = str;
    }

    public void setDelayTime(long j2) {
        this.T = j2;
    }

    public void setDirection(float f2) {
        this.f1103n = f2;
    }

    public void setDisToRealLocation(double d2) {
        this.aa = d2;
    }

    public void setExtraLocation(String str, Location location) {
        if (this.Q == null) {
            this.Q = new Bundle();
        }
        this.Q.putParcelable(str, location);
    }

    public void setFloor(String str) {
        this.w = str;
    }

    public void setFusionLocInfo(String str, double[] dArr) {
        if (this.Q == null) {
            this.Q = new Bundle();
        }
        this.Q.putDoubleArray(str, dArr);
    }

    public void setGpsAccuracyStatus(int i2) {
        this.R = i2;
    }

    public void setGpsBiasProb(float f2) {
        this.Z = f2;
    }

    public void setGpsCheckStatus(int i2) {
        this.S = i2;
    }

    public void setIndoorLocMode(boolean z) {
        this.z = z;
    }

    public void setIndoorLocationSource(int i2) {
        this.I = i2;
    }

    public void setIndoorLocationSurpport(int i2) {
        this.G = i2;
    }

    public void setIndoorNetworkState(int i2) {
        this.H = i2;
    }

    public void setIndoorSurpportPolygon(String str) {
        this.L = str;
    }

    public void setIsInIndoorPark(boolean z) {
        this.X = z;
    }

    public void setLatitude(double d2) {
        this.c = d2;
    }

    public void setLocType(int i2) {
        String str;
        this.f1092a = i2;
        if (i2 != 66) {
            if (i2 != 67) {
                if (i2 == 161) {
                    str = "NetWork location successful!";
                } else if (i2 == 162) {
                    str = "NetWork location failed because baidu location service can not decrypt the request query, please check the so file !";
                } else if (i2 == 167) {
                    str = "NetWork location failed because baidu location service can not caculate the location!";
                } else if (i2 != 505) {
                    switch (i2) {
                        case 61:
                            setLocTypeDescription("GPS location successful!");
                            setUserIndoorState(0);
                            return;
                        case 62:
                            str = "Location failed beacuse we can not get any loc information!";
                            break;
                        case 63:
                            break;
                        default:
                            str = "UnKnown!";
                            break;
                    }
                } else {
                    str = "NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !";
                }
            }
            str = "Offline location failed, please check the net (wifi/cell)!";
        } else {
            str = "Offline location successful!";
        }
        setLocTypeDescription(str);
    }

    public void setLocTypeDescription(String str) {
        this.N = str;
    }

    public void setLocationDescribe(String str) {
        this.r = str;
    }

    public void setLocationID(String str) {
        this.O = str;
    }

    public void setLocationWhere(int i2) {
        this.B = i2;
    }

    public void setLongitude(double d2) {
        this.f1093d = d2;
    }

    public void setMockGpsProbability(int i2) {
        this.ac = i2;
    }

    public void setMockGpsStrategy(int i2) {
        this.ab = i2;
    }

    public void setNetworkLocationType(String str) {
        this.C = str;
    }

    public void setNrlData(String str) {
        this.U = str;
    }

    public void setOperators(int i2) {
        this.D = i2;
    }

    public void setParkAvailable(int i2) {
        this.A = i2;
    }

    public void setPoiList(List<Poi> list) {
        this.M = list;
    }

    public void setPoiRegion(PoiRegion poiRegion) {
        this.Y = poiRegion;
    }

    public void setRadius(float f2) {
        this.f1099j = f2;
        this.f1098i = true;
    }

    public void setReallLocation(BDLocation bDLocation) {
        if (getMockGpsStrategy() > 0) {
            this.ad = bDLocation;
        }
    }

    public void setRetFields(String str, String str2) {
        if (this.Q == null) {
            this.Q = new Bundle();
        }
        this.Q.putString(str, str2);
    }

    public void setRoadLocString(float f2, float f3) {
        String format = ((double) f2) > 0.001d ? String.format("%.2f", Float.valueOf(f2)) : "";
        String format2 = ((double) f3) > 0.001d ? String.format("%.2f", Float.valueOf(f3)) : "";
        String str = this.U;
        if (str != null) {
            this.P = String.format(Locale.US, "%s|%s,%s", str, format, format2);
        }
    }

    public void setSatelliteNumber(int i2) {
        this.f1102m = i2;
    }

    public void setSpeed(float f2) {
        this.f1097h = f2;
        this.f1096g = true;
    }

    public void setTime(String str) {
        this.b = str;
        setLocationID(j.a(str));
    }

    public void setTraffic(String str) {
        this.f1100k = str;
    }

    public void setUserIndoorState(int i2) {
        this.F = i2;
    }

    public void setVdrJsonValue(String str) {
        if (this.Q == null) {
            this.Q = new Bundle();
        }
        this.Q.putString("vdr", str);
    }

    public String toString() {
        return "&loctype=" + getLocType() + "&lat=" + getLatitude() + "&lon=" + getLongitude() + "&radius=" + getRadius() + "&biasprob=" + getGpsBiasProb();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1092a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.f1093d);
        parcel.writeDouble(this.f1095f);
        parcel.writeFloat(this.f1097h);
        parcel.writeFloat(this.f1099j);
        parcel.writeString(this.f1100k);
        parcel.writeInt(this.f1102m);
        parcel.writeFloat(this.f1103n);
        parcel.writeString(this.w);
        parcel.writeInt(this.A);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.C);
        parcel.writeString(this.v.province);
        parcel.writeString(this.v.city);
        parcel.writeString(this.v.district);
        parcel.writeString(this.v.street);
        parcel.writeString(this.v.streetNumber);
        parcel.writeString(this.v.cityCode);
        parcel.writeString(this.v.address);
        parcel.writeString(this.v.country);
        parcel.writeString(this.v.countryCode);
        parcel.writeString(this.v.adcode);
        parcel.writeString(this.v.town);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.B);
        parcel.writeString(this.N);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeInt(this.R);
        parcel.writeString(this.O);
        parcel.writeInt(this.S);
        parcel.writeString(this.P);
        parcel.writeString(this.U);
        parcel.writeLong(this.T);
        parcel.writeDouble(this.V);
        parcel.writeDouble(this.W);
        parcel.writeFloat(this.Z);
        parcel.writeDouble(this.aa);
        parcel.writeInt(this.ab);
        parcel.writeInt(this.ac);
        parcel.writeString(this.f1104o);
        parcel.writeParcelable(this.ad, i2);
        parcel.writeBooleanArray(new boolean[]{this.f1094e, this.f1096g, this.f1098i, this.f1101l, this.f1105p, this.u, this.z, this.X});
        parcel.writeList(this.M);
        parcel.writeBundle(this.Q);
        parcel.writeParcelable(this.Y, i2);
    }
}
