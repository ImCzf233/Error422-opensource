package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class kay
extends dEr {
    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if (!qnq.field_2d2a05_aFZ) {
            zMx zMx2 = new zMx(qnq, (float)n + f, (float)n2 + f2, (float)n3 + f3, nMq);
            qnq.method_94d18be5_FWm(zMx2);
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
            return true;
        }
        return false;
    }

    public kay(int n) {
        super(n);
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        WkD wkD;
        if (nMq.method_a98a0664_aFZ() && (wkD = nMq.method_230886fb_Dne().method_2851c945_Dne("Fireworks")) != null) {
            mbZ mbZ2;
            if (wkD.method_8f501fe8_Dne("Flight")) {
                list.add(KGL.method_39193c_Dne("item.fireworks.flight") + " " + wkD.method_8f501fd0_Dne("Flight"));
            }
            if ((mbZ2 = wkD.method_285baa50_Dne("Explosions")) != null && mbZ2.method_7a46288d_Dne() > 0) {
                for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                    WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
                    ArrayList<String> arrayList = new ArrayList<String>();
                    oGG.method_baef3808_Dne(wkD2, arrayList);
                    if (arrayList.size() <= 0) continue;
                    for (int j = 1; j < arrayList.size(); ++j) {
                        arrayList.set(j, "  " + (String)arrayList.get(j));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }
}

