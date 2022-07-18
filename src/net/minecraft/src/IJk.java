package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IJk
extends dEr {
    private static final Map field_83b1c1b0_Dne = new LinkedHashMap();
    private HashMap field_ecf0af5e_Dne = new HashMap();
    private gDn field_75bd7f28_bzF;
    private gDn field_202f7d1a_FWm;
    private gDn field_5e5f2002_Qnq;

    public int method_117d19dd_FWm(int n) {
        return yDZ.method_16d0a3e_Dne(n, false);
    }

    public static boolean method_ce7f5dad_Dne(int n) {
        return (n & 0x4000) != 0;
    }

    @Override
    public String method_6194d772_Qnq(NMq nMq) {
        List list;
        if (nMq.method_907a9d14_Qnq() == 0) {
            return KGL.method_39193c_Dne("item.emptyPotion.name").trim();
        }
        String string = "";
        if (IJk.method_ce7f5dad_Dne(nMq.method_907a9d14_Qnq())) {
            string = KGL.method_39193c_Dne("potion.prefix.grenade").trim() + " ";
        }
        if ((list = dEr.field_3682442_Dne.method_c9635692_Dne(nMq)) != null && !list.isEmpty()) {
            String string2 = ((NAx)list.get(0)).method_eecad346_Dne();
            string2 = string2 + ".postfix";
            return string + KGL.method_39193c_Dne(string2).trim();
        }
        String string3 = yDZ.method_2c0e7e17_Dne(nMq.method_907a9d14_Qnq());
        return KGL.method_39193c_Dne(string3).trim() + " " + super.method_6194d772_Qnq(nMq);
    }

    public static gDn method_285881e4_Dne(String string) {
        return string == "potion" ? dEr.field_3682442_Dne.field_75bd7f28_bzF : (string == "potion_splash" ? dEr.field_3682442_Dne.field_202f7d1a_FWm : (string == "potion_contents" ? dEr.field_3682442_Dne.field_5e5f2002_Qnq : null));
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        this.field_75bd7f28_bzF = rbp.method_285881e4_Dne("potion");
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("potion_splash");
        this.field_5e5f2002_Qnq = rbp.method_285881e4_Dne("potion_contents");
    }

    @Override
    public een method_c9acc3b8_Dne(NMq nMq) {
        return een.field_75bd124b_bzF;
    }

    @Override
    public boolean method_55b582da_FWm(NMq nMq) {
        List list = this.method_c9635692_Dne(nMq);
        return list != null && !list.isEmpty();
    }

    @Override
    public void method_d88f4bf4_Dne(int n, JcN jcN, List list) {
        int n2;
        super.method_d88f4bf4_Dne(n, jcN, list);
        if (field_83b1c1b0_Dne.isEmpty()) {
            for (int i = 0; i <= 15; ++i) {
                for (n2 = 0; n2 <= 1; ++n2) {
                    int n3 = n2 == 0 ? i | 0x2000 : i | 0x4000;
                    for (int j = 0; j <= 2; ++j) {
                        List list2;
                        int n4 = n3;
                        if (j != 0) {
                            if (j == 1) {
                                n4 = n3 | 0x20;
                            } else if (j == 2) {
                                n4 = n3 | 0x40;
                            }
                        }
                        if ((list2 = yDZ.method_5fdf889c_Dne(n4, false)) == null || list2.isEmpty()) continue;
                        field_83b1c1b0_Dne.put(list2, n4);
                    }
                }
            }
        }
        Iterator iterator = field_83b1c1b0_Dne.values().iterator();
        while (iterator.hasNext()) {
            n2 = (Integer)iterator.next();
            list.add(new NMq(n, 1, n2));
        }
    }

    public List method_c9635692_Dne(NMq nMq) {
        if (nMq.method_a98a0664_aFZ() && nMq.method_230886fb_Dne().method_8f501fe8_Dne("CustomPotionEffects")) {
            ArrayList<NAx> arrayList = new ArrayList<NAx>();
            mbZ mbZ2 = nMq.method_230886fb_Dne().method_285baa50_Dne("CustomPotionEffects");
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(i);
                arrayList.add(NAx.method_7da6e243_Dne(wkD));
            }
            return arrayList;
        }
        List list = (List)this.field_ecf0af5e_Dne.get(nMq.method_907a9d14_Qnq());
        if (list == null) {
            list = yDZ.method_5fdf889c_Dne(nMq.method_907a9d14_Qnq(), false);
            this.field_ecf0af5e_Dne.put(nMq.method_907a9d14_Qnq(), list);
        }
        return list;
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        return n > 0 ? 0xFFFFFF : this.method_117d19dd_FWm(nMq.method_907a9d14_Qnq());
    }

    public List method_ab0c4d7e_Dne(int n) {
        List list = (List)this.field_ecf0af5e_Dne.get(n);
        if (list == null) {
            list = yDZ.method_5fdf889c_Dne(n, false);
            this.field_ecf0af5e_Dne.put(n, list);
        }
        return list;
    }

    @Override
    public int method_e4cfb2b_a_(NMq nMq) {
        return 32;
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 == 0 ? this.field_5e5f2002_Qnq : super.method_9051f17a_Dne(n, n2);
    }

    @Override
    public gDn method_9e795529_Dne(int n) {
        return IJk.method_ce7f5dad_Dne(n) ? this.field_202f7d1a_FWm : this.field_75bd7f28_bzF;
    }

    @Override
    public NMq method_89e9a565_FWm(NMq nMq, Qnq qnq, FiG fiG) {
        List<NAx> list;
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
            --nMq.field_2092ae_Dne;
        }
        if (!qnq.field_2d2a05_aFZ && (list = this.method_c9635692_Dne(nMq)) != null) {
            for (NAx nAx : list) {
                fiG.method_fe8e2b7b_Qnq(new NAx(nAx));
            }
        }
        if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
            if (nMq.field_2092ae_Dne <= 0) {
                return new NMq(dEr.field_7c27c815_OCU);
            }
            fiG.field_36a059b_Dne.method_7c61cf19_Dne(new NMq(dEr.field_7c27c815_OCU));
        }
        return nMq;
    }

    public IJk(int n) {
        super(n);
        this.method_9e77fc49_Dne(1);
        this.method_21c1eb9a_Dne(true);
        this.method_77cbb00a_FWm(0);
        this.method_829e7ad2_Dne(JcN.field_74f385d5_mrb);
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        if (nMq.method_907a9d14_Qnq() != 0) {
            List<NAx> list2 = dEr.field_3682442_Dne.method_c9635692_Dne(nMq);
            if (list2 != null && !list2.isEmpty()) {
                for (NAx nAx : list2) {
                    String string = KGL.method_39193c_Dne(nAx.method_eecad346_Dne()).trim();
                    if (nAx.method_ae128dba_bzF() > 0) {
                        string = string + " " + KGL.method_39193c_Dne("potion.potency." + nAx.method_ae128dba_bzF()).trim();
                    }
                    if (nAx.method_7c6f602c_FWm() > 20) {
                        string = string + " (" + SXd.method_1ab1893e_Dne(nAx) + ")";
                    }
                    if (SXd.field_83633108_Dne[nAx.method_7a46288d_Dne()].method_ae128dcb_bzF()) {
                        list.add((Object)((Object)Dne.field_a2169639_kGO) + string);
                        continue;
                    }
                    list.add((Object)((Object)Dne.field_140f3afb_div) + string);
                }
            } else {
                String string = KGL.method_39193c_Dne("potion.empty").trim();
                list.add((Object)((Object)Dne.field_140f3afb_div) + string);
            }
        }
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    @Override
    public boolean method_4ddc487f_Dne(NMq nMq, FiG fiG, Qnq qnq, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        return false;
    }

    public boolean method_117d19ee_FWm(int n) {
        List list = this.method_ab0c4d7e_Dne(n);
        if (list != null && !list.isEmpty()) {
            NAx nAx;
            Iterator iterator = list.iterator();
            do {
                if (iterator.hasNext()) continue;
                return false;
            } while (!SXd.field_83633108_Dne[(nAx = (NAx)iterator.next()).method_7a46288d_Dne()].method_7a46289e_Dne());
            return true;
        }
        return false;
    }

    @Override
    public NMq method_d4201764_Dne(NMq nMq, Qnq qnq, FiG fiG) {
        if (IJk.method_ce7f5dad_Dne(nMq.method_907a9d14_Qnq())) {
            if (!fiG.field_37cb681_Dne.field_267d06_Qnq) {
                --nMq.field_2092ae_Dne;
            }
            qnq.method_a36f5f6a_Dne(fiG, "random.bow", 0.5f, 0.4f / (field_7331eae7_Dne.nextFloat() * 0.4f + 0.8f));
            if (!qnq.field_2d2a05_aFZ) {
                qnq.method_94d18be5_FWm(new YgL(qnq, (FUH)fiG, nMq));
            }
            return nMq;
        }
        fiG.method_fd8868e_Dne(nMq, this.method_e4cfb2b_a_(nMq));
        return nMq;
    }
}

