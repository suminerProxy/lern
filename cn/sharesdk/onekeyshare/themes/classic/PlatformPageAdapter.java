package cn.sharesdk.onekeyshare.themes.classic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mob.tools.gui.ViewPagerAdapter;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class PlatformPageAdapter extends ViewPagerAdapter implements View.OnClickListener {
    public static final int DESIGN_BOTTOM_HEIGHT = 52;
    public static final int MIN_CLICK_INTERVAL = 1000;
    public int bottomHeight;
    public int cellHeight;
    public Object[][] cells;
    private long lastClickTime;
    public int lineSize;
    public int logoHeight;
    public int paddingTop;
    private PlatformPage page;
    public int panelHeight;
    public int sepLineWidth;
    private IndicatorView vInd;

    public PlatformPageAdapter(PlatformPage platformPage, ArrayList<Object> arrayList) {
    }

    private View createPanel(Context context) {
    }

    private void refreshPanel(LinearLayout[] linearLayoutArr, Object[] objArr) {
    }

    public abstract void calculateSize(Context context, ArrayList<Object> arrayList);

    public abstract void collectCells(ArrayList<Object> arrayList);

    public int getBottomHeight() {
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public int getCount() {
    }

    public int getPanelHeight() {
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.mob.tools.gui.ViewPagerAdapter
    public void onScreenChange(int i2, int i3) {
    }

    public void setIndicator(IndicatorView indicatorView) {
    }
}
