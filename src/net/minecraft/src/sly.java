package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class sly
implements ZfC {
    private gvF field_3766815_Dne;
    private final boolean field_2092bf_Dne;
    private final List<sAy> field_f27c122c_Dne;
    private gvF field_203033f4_FWm;
    private final byte[] field_3f1c582_Dne = new byte[256];
    private Random field_7331eae7_Dne;
    private final boolean field_21261e_FWm;
    private final byte[] field_4039e03_FWm = new byte[256];
    private final lDk field_377f6b9_Dne;
    private Qnq field_36c4f18_Dne;

    @Override
    public void method_16cca7a_Dne(int n, int n2) {
        for (sAy sAy2 : this.field_f27c122c_Dne) {
            sAy2.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 0;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return true;
    }

    @Override
    public boolean method_16cca7e_Dne(int n, int n2) {
        return true;
    }

    @Override
    public qMV method_e1796070_FWm(int n, int n2) {
        return this.method_90569c11_Dne(n, n2);
    }

    @Override
    public EyB method_2849cfe9_Dne(Qnq qnq, String string, int n, int n2, int n3) {
        if ("Stronghold".equals(string)) {
            for (sAy sAy2 : this.field_f27c122c_Dne) {
                if (!(sAy2 instanceof Khi)) continue;
                return sAy2.method_8bbba33_Dne(qnq, n, n2, n3);
            }
        }
        return null;
    }

    @Override
    public qMV method_90569c11_Dne(int n, int n2) {
        qMV qMV2 = new qMV(this.field_36c4f18_Dne, n, n2);
        for (int i = 0; i < this.field_3f1c582_Dne.length; ++i) {
            int n3 = i >> 4;
            cHy cHy2 = qMV2.method_57027af4_Dne()[n3];
            if (cHy2 == null) {
                qMV2.method_57027af4_Dne()[n3] = cHy2 = new cHy(i, !this.field_36c4f18_Dne.field_3690d00_Dne.field_21261e_FWm);
            }
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    cHy2.method_5972745a_Dne(j, i & 0xF, k, this.field_3f1c582_Dne[i] & 0xFF);
                    cHy2.method_2ee8c479_FWm(j, i & 0xF, k, this.field_4039e03_FWm[i]);
                }
            }
        }
        qMV2.method_7c6f6039_FWm();
        OdI[] odIArray = this.field_36c4f18_Dne.method_2315aa7b_Dne().method_f1decbbd_FWm(null, n * 16, n2 * 16, 16, 16);
        byte[] byArray = qMV2.method_ce7eeb83_Dne();
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)odIArray[i].field_267cf5_Qnq;
        }
        for (sAy sAy2 : this.field_f27c122c_Dne) {
            sAy2.method_8e161084_Dne(this, this.field_36c4f18_Dne, n, n2, null);
        }
        qMV2.method_7c6f6039_FWm();
        return qMV2;
    }

    public sly(Qnq qnq, long l, boolean bl, String string) {
        this.field_f27c122c_Dne = new ArrayList();
        this.field_36c4f18_Dne = qnq;
        this.field_7331eae7_Dne = new Random(l);
        this.field_377f6b9_Dne = lDk.method_285ac762_Dne(string);
        if (bl) {
            Map map = this.field_377f6b9_Dne.method_d410254f_Dne();
            if (map.containsKey("village")) {
                Object object = (Map)map.get("village");
                if (!((Map) object).containsKey("size")) {
                    ((Map) object).put("size", "1");
                }
                this.field_f27c122c_Dne.add(new cXw((Map)object));
            }
            if (map.containsKey("biome_1")) {
                this.field_f27c122c_Dne.add(new tMg((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.field_f27c122c_Dne.add(new Kvh((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.field_f27c122c_Dne.add(new Khi((Map)map.get("stronghold")));
            }
        }
        this.field_2092bf_Dne = this.field_377f6b9_Dne.method_d410254f_Dne().containsKey("decoration");
        if (this.field_377f6b9_Dne.method_d410254f_Dne().containsKey("lake")) {
            this.field_3766815_Dne = new gvF(zKP.field_16319416_DyG.field_21260d_FWm);
        }
        if (this.field_377f6b9_Dne.method_d410254f_Dne().containsKey("lava_lake")) {
            this.field_203033f4_FWm = new gvF(zKP.field_14274117_div.field_21260d_FWm);
        }
        this.field_21261e_FWm = this.field_377f6b9_Dne.method_d410254f_Dne().containsKey("dungeon");
        for (Object object : this.field_377f6b9_Dne.method_adea226d_Dne()) {
            for (int i = ((Jjb)object).method_907a9d14_Qnq(); i < ((Jjb)object).method_907a9d14_Qnq() + ((Jjb)object).method_7a46288d_Dne(); ++i) {
                this.field_3f1c582_Dne[i] = (byte)(((Jjb)object).method_7c6f602c_FWm() & 0xFF);
                this.field_4039e03_FWm[i] = (byte)((Jjb)object).method_ae128dba_bzF();
            }
        }
    }

    @Override
    public List method_c5f979a2_Dne(Icc icc, int n, int n2, int n3) {
        OdI odI = this.field_36c4f18_Dne.method_90477c37_Dne(n, n3);
        return odI == null ? null : odI.method_32fd9ea9_Dne(icc);
    }

    @Override
    public boolean method_5f7a671f_Dne(boolean bl, TaY taY) {
        return true;
    }

    @Override
    public void method_a5c3b570_Dne(ZfC var1, int var2, int var3) {
        int var4 = var2 * 16;
        int var5 = var3 * 16;
        OdI var6 = this.field_36c4f18_Dne.method_90477c37_Dne(var4 + 16, var5 + 16);
        boolean var7 = false;
        this.field_7331eae7_Dne.setSeed(this.field_36c4f18_Dne.method_7a46288e_Dne());
        long var8 = this.field_7331eae7_Dne.nextLong() / 2L * 2L + 1L;
        long var10 = this.field_7331eae7_Dne.nextLong() / 2L * 2L + 1L;
        this.field_7331eae7_Dne.setSeed((long)var2 * var8 + (long)var3 * var10 ^ this.field_36c4f18_Dne.method_7a46288e_Dne());
        Iterator var12 = this.field_f27c122c_Dne.iterator();

        while(var12.hasNext()) {
            sAy var13 = (sAy)var12.next();
            boolean var14 = var13.method_37de1363_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, var2, var3);
            if (var13 instanceof cXw) {
                var7 |= var14;
            }
        }

        int var15;
        int var17;
        int var18;
        if (this.field_3766815_Dne != null && !var7 && this.field_7331eae7_Dne.nextInt(4) == 0) {
            var17 = var4 + this.field_7331eae7_Dne.nextInt(16) + 8;
            var18 = this.field_7331eae7_Dne.nextInt(128);
            var15 = var5 + this.field_7331eae7_Dne.nextInt(16) + 8;
            this.field_3766815_Dne.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, var17, var18, var15);
        }

        if (this.field_203033f4_FWm != null && !var7 && this.field_7331eae7_Dne.nextInt(8) == 0) {
            var17 = var4 + this.field_7331eae7_Dne.nextInt(16) + 8;
            var18 = this.field_7331eae7_Dne.nextInt(this.field_7331eae7_Dne.nextInt(120) + 8);
            var15 = var5 + this.field_7331eae7_Dne.nextInt(16) + 8;
            if (var18 < 63 || this.field_7331eae7_Dne.nextInt(10) == 0) {
                this.field_203033f4_FWm.method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, var17, var18, var15);
            }
        }

        if (this.field_21261e_FWm) {
            for(var17 = 0; var17 < 8; ++var17) {
                var18 = var4 + this.field_7331eae7_Dne.nextInt(16) + 8;
                var15 = this.field_7331eae7_Dne.nextInt(128);
                int var16 = var5 + this.field_7331eae7_Dne.nextInt(16) + 8;
                (new ivB()).method_c3e4cb88_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, var18, var15, var16);
            }
        }

        if (this.field_2092bf_Dne) {
            var6.method_37de135f_Dne(this.field_36c4f18_Dne, this.field_7331eae7_Dne, var4, var5);
        }

    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    @Override
    public String method_eecad346_Dne() {
        return "FlatLevelSource";
    }
}

