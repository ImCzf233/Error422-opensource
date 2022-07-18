package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class uQr {
    private int field_2e5f1b_bzF = 0;
    private int field_21260d_FWm = 0;
    private TreeMap<String, Object> field_36ba99ee_Dne;
    private int field_2092ae_Dne = 0;
    private final iSh field_20309d6d_FWm;
    private int field_2d29f4_aFZ;
    private final List<yQQ> field_f27c122c_Dne = new ArrayList();
    private int field_388da6_zGp = 0;
    private int field_267cf5_Qnq = 0;
    private Qnq field_36c4f18_Dne;
    private List field_6a0474ed_FWm;
    private final iSh field_376d18e_Dne = new iSh(0, 0, 0);

    public void method_7a46289a_Dne() {
        this.field_2d29f4_aFZ = this.field_2e5f1b_bzF;
    }

    public int method_7a46288d_Dne() {
        return this.field_2092ae_Dne;
    }

    public yQQ method_accb02c2_FWm(int n, int n2, int n3) {
        yQQ yQQ2 = null;
        int n4 = Integer.MAX_VALUE;
        for (yQQ yQQ3 : this.field_f27c122c_Dne) {
            int n5 = yQQ3.method_2c2cf7bc_Dne(n, n2, n3);
            n5 = n5 > 256 ? (n5 *= 1000) : yQQ3.method_907a9d14_Qnq();
            if (n5 >= n4) continue;
            yQQ2 = yQQ3;
            n4 = n5;
        }
        return yQQ2;
    }

    public uQr(Qnq qnq) {
        this.field_20309d6d_FWm = new iSh(0, 0, 0);
        this.field_36ba99ee_Dne = new TreeMap();
        this.field_6a0474ed_FWm = new ArrayList();
        this.field_36c4f18_Dne = qnq;
    }

    public uQr() {
        this.field_20309d6d_FWm = new iSh(0, 0, 0);
        this.field_36ba99ee_Dne = new TreeMap();
        this.field_6a0474ed_FWm = new ArrayList();
    }

    public iSh method_23105fed_Dne() {
        return this.field_20309d6d_FWm;
    }

    public void method_c5ec03ee_Dne(yQQ yQQ2) {
        this.field_f27c122c_Dne.add(yQQ2);
        this.field_376d18e_Dne.field_2092ae_Dne += yQQ2.field_2092ae_Dne;
        this.field_376d18e_Dne.field_21260d_FWm += yQQ2.field_21260d_FWm;
        this.field_376d18e_Dne.field_2e5f1b_bzF += yQQ2.field_2e5f1b_bzF;
        this.method_d44b4592_zGp();
        this.field_21260d_FWm = yQQ2.field_388da6_zGp;
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        return this.field_20309d6d_FWm.method_2c2cf7b9_Dne(n, n2, n3) < (float)(this.field_2092ae_Dne * this.field_2092ae_Dne);
    }

    public yQQ method_d9953b41_Dne(int n, int n2, int n3) {
        yQQ yQQ2 = null;
        int n4 = Integer.MAX_VALUE;
        for (yQQ yQQ3 : this.field_f27c122c_Dne) {
            int n5 = yQQ3.method_2c2cf7bc_Dne(n, n2, n3);
            if (n5 >= n4) continue;
            yQQ2 = yQQ3;
            n4 = n5;
        }
        return yQQ2;
    }

    public int method_5ab44f92_Dne(String string, int n) {
        int n2 = this.method_8f501fd7_Dne(string);
        int n3 = geR.method_2c2cf7bc_Dne(n2 + n, -30, 10);
        this.field_36ba99ee_Dne.put(string, n3);
        return n3;
    }

    private boolean method_c6b5263e_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        if (!this.field_36c4f18_Dne.method_73e9b8f9_IjH(n, n2 - 1, n3)) {
            return false;
        }
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n8; k < n8 + n6; ++k) {
                    if (!this.field_36c4f18_Dne.method_6fdef3c4_DyG(i, j, k)) continue;
                    return false;
                }
            }
        }
        return true;
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF - this.field_21260d_FWm;
    }

    public boolean method_8f501fe8_Dne(String string) {
        return this.method_8f501fd7_Dne(string) <= -15;
    }

    private void method_a98a0660_aFZ() {
        boolean bl = false;
        boolean bl2 = this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(50) == 0;
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        while (iterator.hasNext()) {
            yQQ yQQ2 = (yQQ)iterator.next();
            if (bl2) {
                yQQ2.method_7a46289a_Dne();
            }
            if (this.method_a6aca7ce_FWm(yQQ2.field_2092ae_Dne, yQQ2.field_21260d_FWm, yQQ2.field_2e5f1b_bzF) && Math.abs(this.field_2e5f1b_bzF - yQQ2.field_388da6_zGp) <= 1200) continue;
            this.field_376d18e_Dne.field_2092ae_Dne -= yQQ2.field_2092ae_Dne;
            this.field_376d18e_Dne.field_21260d_FWm -= yQQ2.field_21260d_FWm;
            this.field_376d18e_Dne.field_2e5f1b_bzF -= yQQ2.field_2e5f1b_bzF;
            bl = true;
            yQQ2.field_2092bf_Dne = true;
            iterator.remove();
        }
        if (bl) {
            this.method_d44b4592_zGp();
        }
    }

    private void method_7c6f6039_FWm() {
        List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(CDE.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_20309d6d_FWm.field_2092ae_Dne - this.field_2092ae_Dne, this.field_20309d6d_FWm.field_21260d_FWm - 4, this.field_20309d6d_FWm.field_2e5f1b_bzF - this.field_2092ae_Dne, this.field_20309d6d_FWm.field_2092ae_Dne + this.field_2092ae_Dne, this.field_20309d6d_FWm.field_21260d_FWm + 4, this.field_20309d6d_FWm.field_2e5f1b_bzF + this.field_2092ae_Dne));
        this.field_388da6_zGp = list.size();
    }

    public int method_8f501fd7_Dne(String string) {
        Integer n = (Integer)this.field_36ba99ee_Dne.get(string);
        return n != null ? n : 0;
    }

    public List method_adea226d_Dne() {
        return this.field_f27c122c_Dne;
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        Object object;
        this.field_267cf5_Qnq = wkD.method_8f501fd7_Dne("PopSize");
        this.field_2092ae_Dne = wkD.method_8f501fd7_Dne("Radius");
        this.field_388da6_zGp = wkD.method_8f501fd7_Dne("Golems");
        this.field_21260d_FWm = wkD.method_8f501fd7_Dne("Stable");
        this.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("Tick");
        this.field_2d29f4_aFZ = wkD.method_8f501fd7_Dne("MTick");
        this.field_20309d6d_FWm.field_2092ae_Dne = wkD.method_8f501fd7_Dne("CX");
        this.field_20309d6d_FWm.field_21260d_FWm = wkD.method_8f501fd7_Dne("CY");
        this.field_20309d6d_FWm.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("CZ");
        this.field_376d18e_Dne.field_2092ae_Dne = wkD.method_8f501fd7_Dne("ACX");
        this.field_376d18e_Dne.field_21260d_FWm = wkD.method_8f501fd7_Dne("ACY");
        this.field_376d18e_Dne.field_2e5f1b_bzF = wkD.method_8f501fd7_Dne("ACZ");
        mbZ mbZ2 = wkD.method_285baa50_Dne("Doors");
        for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
            WkD wkD2 = (WkD)mbZ2.method_77d0d055_FWm(i);
            object = new yQQ(wkD2.method_8f501fd7_Dne("X"), wkD2.method_8f501fd7_Dne("Y"), wkD2.method_8f501fd7_Dne("Z"), wkD2.method_8f501fd7_Dne("IDX"), wkD2.method_8f501fd7_Dne("IDZ"), wkD2.method_8f501fd7_Dne("TS"));
            this.field_f27c122c_Dne.add((yQQ) object);
        }
        mbZ mbZ3 = wkD.method_285baa50_Dne("Players");
        for (int i = 0; i < mbZ3.method_7a46288d_Dne(); ++i) {
            object = (WkD)mbZ3.method_77d0d055_FWm(i);
            this.field_36ba99ee_Dne.put(((WkD)object).method_39193c_Dne("Name"), ((WkD)object).method_8f501fd7_Dne("S"));
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_f27c122c_Dne.isEmpty();
    }

    public void method_ce7f5da9_Dne(int n) {
        chN chN2;
        int n2;
        this.field_2e5f1b_bzF = n;
        this.method_a98a0660_aFZ();
        this.method_907a9d21_Qnq();
        if (n % 20 == 0) {
            this.method_ae128dc7_bzF();
        }
        if (n % 30 == 0) {
            this.method_7c6f6039_FWm();
        }
        if (this.field_388da6_zGp < (n2 = this.field_267cf5_Qnq / 10) && this.field_f27c122c_Dne.size() > 20 && this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(7000) == 0 && (chN2 = this.method_7e851f02_Dne(geR.method_ce7f5259_Dne(this.field_20309d6d_FWm.field_2092ae_Dne), geR.method_ce7f5259_Dne(this.field_20309d6d_FWm.field_21260d_FWm), geR.method_ce7f5259_Dne(this.field_20309d6d_FWm.field_2e5f1b_bzF), 2, 4, 2)) != null) {
            CDE cDE = new CDE(this.field_36c4f18_Dne);
            cDE.method_2961957_bzF(chN2.field_2092a9_Dne, chN2.field_212608_FWm, chN2.field_2e5f16_bzF);
            this.field_36c4f18_Dne.method_94d18be5_FWm(cDE);
            ++this.field_388da6_zGp;
        }
    }

    private chN method_7e851f02_Dne(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < 10; ++i) {
            int n7;
            int n8;
            int n9 = n + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(16) - 8;
            if (!this.method_2c2cf7cd_Dne(n9, n8 = n2 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(6) - 3, n7 = n3 + this.field_36c4f18_Dne.field_7331eae7_Dne.nextInt(16) - 8) || !this.method_c6b5263e_Dne(n9, n8, n7, n4, n5, n6)) continue;
            return this.field_36c4f18_Dne.method_23186a47_Dne().method_e4505d6c_Dne(n9, n8, n7);
        }
        return null;
    }

    private void method_ae128dc7_bzF() {
        List list = this.field_36c4f18_Dne.method_9314b7e8_Dne(pjB.class, bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.field_20309d6d_FWm.field_2092ae_Dne - this.field_2092ae_Dne, this.field_20309d6d_FWm.field_21260d_FWm - 4, this.field_20309d6d_FWm.field_2e5f1b_bzF - this.field_2092ae_Dne, this.field_20309d6d_FWm.field_2092ae_Dne + this.field_2092ae_Dne, this.field_20309d6d_FWm.field_21260d_FWm + 4, this.field_20309d6d_FWm.field_2e5f1b_bzF + this.field_2092ae_Dne));
        this.field_267cf5_Qnq = list.size();
        if (this.field_267cf5_Qnq == 0) {
            this.field_36ba99ee_Dne.clear();
        }
    }

    public void method_83516093_Dne(Qnq qnq) {
        this.field_36c4f18_Dne = qnq;
    }

    public FUH method_26662ae6_Dne(FUH fUH) {
        double d = Double.MAX_VALUE;
        WaS waS = null;
        for (int i = 0; i < this.field_6a0474ed_FWm.size(); ++i) {
            WaS waS2 = (WaS)this.field_6a0474ed_FWm.get(i);
            double d2 = waS2.field_366ec33_Dne.method_bb7dd80e_Dne(fUH);
            if (!(d2 <= d)) continue;
            waS = waS2;
            d = d2;
        }
        return waS != null ? waS.field_366ec33_Dne : null;
    }

    private void method_907a9d21_Qnq() {
        Iterator iterator = this.field_6a0474ed_FWm.iterator();
        while (iterator.hasNext()) {
            WaS waS = (WaS)iterator.next();
            if (waS.field_366ec33_Dne.method_cd4cb3d9_udO() && Math.abs(this.field_2e5f1b_bzF - waS.field_2092ae_Dne) <= 300) continue;
            iterator.remove();
        }
    }

    public void method_66a36cd8_FWm(WkD wkD) {
        Object object2;
        wkD.method_5ab44f9f_Dne("PopSize", this.field_267cf5_Qnq);
        wkD.method_5ab44f9f_Dne("Radius", this.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("Golems", this.field_388da6_zGp);
        wkD.method_5ab44f9f_Dne("Stable", this.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("Tick", this.field_2e5f1b_bzF);
        wkD.method_5ab44f9f_Dne("MTick", this.field_2d29f4_aFZ);
        wkD.method_5ab44f9f_Dne("CX", this.field_20309d6d_FWm.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("CY", this.field_20309d6d_FWm.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("CZ", this.field_20309d6d_FWm.field_2e5f1b_bzF);
        wkD.method_5ab44f9f_Dne("ACX", this.field_376d18e_Dne.field_2092ae_Dne);
        wkD.method_5ab44f9f_Dne("ACY", this.field_376d18e_Dne.field_21260d_FWm);
        wkD.method_5ab44f9f_Dne("ACZ", this.field_376d18e_Dne.field_2e5f1b_bzF);
        mbZ mbZ2 = new mbZ("Doors");
        for (Object object : this.field_f27c122c_Dne) {
            WkD wkD2 = new WkD("Door");
            wkD2.method_5ab44f9f_Dne("X", ((yQQ)object).field_2092ae_Dne);
            wkD2.method_5ab44f9f_Dne("Y", ((yQQ)object).field_21260d_FWm);
            wkD2.method_5ab44f9f_Dne("Z", ((yQQ)object).field_2e5f1b_bzF);
            wkD2.method_5ab44f9f_Dne("IDX", ((yQQ)object).field_267cf5_Qnq);
            wkD2.method_5ab44f9f_Dne("IDZ", ((yQQ)object).field_2d29f4_aFZ);
            wkD2.method_5ab44f9f_Dne("TS", ((yQQ)object).field_388da6_zGp);
            mbZ2.method_b4ba5ea1_Dne(wkD2);
        }
        wkD.method_58996597_Dne("Doors", mbZ2);
        object2 = new mbZ("Players");
        for (Object obj : this.field_36ba99ee_Dne.keySet()) {String string = (String) obj;
            WkD wkD3 = new WkD(string);
            wkD3.method_abaa98ae_Dne("Name", string);
            wkD3.method_5ab44f9f_Dne("S", (Integer)this.field_36ba99ee_Dne.get(string));
            ((mbZ)object2).method_b4ba5ea1_Dne(wkD3);
        }
        wkD.method_58996597_Dne("Players", (oNe)object2);
    }

    public FiG method_266675db_Dne(FUH fUH) {
        double d = Double.MAX_VALUE;
        FiG fiG = null;
        for (Object obj : this.field_36ba99ee_Dne.keySet()) {String string = (String) obj;
            double d2;
            FiG fiG2;
            if (!this.method_8f501fe8_Dne(string) || (fiG2 = this.field_36c4f18_Dne.method_284a07d1_Dne(string)) == null || !((d2 = fiG2.method_bb7dd80e_Dne(fUH)) <= d)) continue;
            fiG = fiG2;
            d = d2;
        }
        return fiG;
    }

    public boolean method_7c6f603d_FWm() {
        return this.field_2d29f4_aFZ == 0 || this.field_2e5f1b_bzF - this.field_2d29f4_aFZ >= 3600;
    }

    public yQQ method_21921974_bzF(int n, int n2, int n3) {
        yQQ yQQ2;
        if (this.field_20309d6d_FWm.method_2c2cf7b9_Dne(n, n2, n3) > (float)(this.field_2092ae_Dne * this.field_2092ae_Dne)) {
            return null;
        }
        Iterator iterator = this.field_f27c122c_Dne.iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            yQQ2 = (yQQ)iterator.next();
        } while (yQQ2.field_2092ae_Dne != n || yQQ2.field_2e5f1b_bzF != n3 || Math.abs(yQQ2.field_21260d_FWm - n2) > 1);
        return yQQ2;
    }

    private boolean method_a6aca7ce_FWm(int n, int n2, int n3) {
        int n4 = this.field_36c4f18_Dne.method_2c2cf7bc_Dne(n, n2, n3);
        return n4 <= 0 ? false : n4 == zKP.field_ceacd6d_ICU.field_21260d_FWm;
    }

    public void method_117d19ea_FWm(int n) {
        for (Object obj : this.field_36ba99ee_Dne.keySet()) {String string = (String) obj;
            this.method_5ab44f92_Dne(string, n);
        }
    }

    public int method_7c6f602c_FWm() {
        return this.field_f27c122c_Dne.size();
    }

    private void method_d44b4592_zGp() {
        int n = this.field_f27c122c_Dne.size();
        if (n == 0) {
            this.field_20309d6d_FWm.method_2c2cf7c9_Dne(0, 0, 0);
            this.field_2092ae_Dne = 0;
        } else {
            this.field_20309d6d_FWm.method_2c2cf7c9_Dne(this.field_376d18e_Dne.field_2092ae_Dne / n, this.field_376d18e_Dne.field_21260d_FWm / n, this.field_376d18e_Dne.field_2e5f1b_bzF / n);
            int n2 = 0;
            for (yQQ yQQ2 : this.field_f27c122c_Dne) {
                n2 = Math.max(yQQ2.method_2c2cf7bc_Dne(this.field_20309d6d_FWm.field_2092ae_Dne, this.field_20309d6d_FWm.field_21260d_FWm, this.field_20309d6d_FWm.field_2e5f1b_bzF), n2);
            }
            this.field_2092ae_Dne = Math.max(32, (int)Math.sqrt(n2) + 1);
        }
    }

    public int method_907a9d14_Qnq() {
        return this.field_267cf5_Qnq;
    }

    public void method_6f1922ee_Dne(FUH fUH) {
        WaS waS;
        Iterator iterator = this.field_6a0474ed_FWm.iterator();
        do {
            if (!iterator.hasNext()) {
                this.field_6a0474ed_FWm.add(new WaS(this, fUH, this.field_2e5f1b_bzF));
                return;
            }
            waS = (WaS)iterator.next();
        } while (waS.field_366ec33_Dne != fUH);
        waS.field_2092ae_Dne = this.field_2e5f1b_bzF;
    }
}

