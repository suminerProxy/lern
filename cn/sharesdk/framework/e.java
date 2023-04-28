package cn.sharesdk.framework;

import cn.sharesdk.framework.authorize.AuthorizeHelper;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;

/* compiled from: PlatformHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class e implements AuthorizeHelper {

    /* renamed from: a  reason: collision with root package name */
    public Platform f178a;
    private AuthorizeListener b;
    private SSOListener c;

    public e(Platform platform) {
    }

    public void a(SSOListener sSOListener) {
    }

    public int b() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AuthorizeListener getAuthorizeListener() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public Platform getPlatform() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public SSOListener getSSOListener() {
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public cn.sharesdk.framework.authorize.c getSSOProcessor(SSOAuthorizeActivity sSOAuthorizeActivity) {
    }

    public void b(AuthorizeListener authorizeListener) {
    }
}
