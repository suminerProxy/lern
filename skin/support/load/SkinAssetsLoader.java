package skin.support.load;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import skin.support.utils.SkinConstants;
import skin.support.utils.SkinFileUtils;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinAssetsLoader extends SkinSDCardLoader {
    private String copySkinFromAssets(Context context, String str) {
        String absolutePath = new File(SkinFileUtils.getSkinDir(context), str).getAbsolutePath();
        try {
            AssetManager assets = context.getAssets();
            InputStream open = assets.open(SkinConstants.SKIN_DEPLOY_PATH + File.separator + str);
            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            open.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return absolutePath;
    }

    @Override // skin.support.load.SkinSDCardLoader
    public String getSkinPath(Context context, String str) {
        return copySkinFromAssets(context, str);
    }

    @Override // skin.support.load.SkinSDCardLoader, skin.support.SkinCompatManager.SkinLoaderStrategy
    public String getTargetResourceEntryName(Context context, String str, int i2) {
        return null;
    }

    @Override // skin.support.SkinCompatManager.SkinLoaderStrategy
    public int getType() {
        return 0;
    }
}
