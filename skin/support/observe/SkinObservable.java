package skin.support.observe;

import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinObservable {
    private final ArrayList<SkinObserver> observers = new ArrayList<>();

    public synchronized void addObserver(SkinObserver skinObserver) {
        if (skinObserver != null) {
            if (!this.observers.contains(skinObserver)) {
                this.observers.add(skinObserver);
            }
        } else {
            throw new NullPointerException();
        }
    }

    public synchronized int countObservers() {
        return this.observers.size();
    }

    public synchronized void deleteObserver(SkinObserver skinObserver) {
        this.observers.remove(skinObserver);
    }

    public synchronized void deleteObservers() {
        this.observers.clear();
    }

    public void notifyUpdateSkin() {
        notifyUpdateSkin(null);
    }

    public void notifyUpdateSkin(Object obj) {
        SkinObserver[] skinObserverArr;
        synchronized (this) {
            ArrayList<SkinObserver> arrayList = this.observers;
            skinObserverArr = (SkinObserver[]) arrayList.toArray(new SkinObserver[arrayList.size()]);
        }
        for (int length = skinObserverArr.length - 1; length >= 0; length--) {
            skinObserverArr[length].updateSkin(this, obj);
        }
    }
}
