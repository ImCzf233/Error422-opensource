package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Nlm {
    private Iey field_3688b4f_Dne = null;
    private int field_2e5f1b_bzF = 800;
    private int field_21260d_FWm = 200;
    private sMa field_37b45e5_Dne;
    private int field_388da6_zGp = 16;
    public int field_2092ae_Dne = 20;
    private List<Iey> field_f27c122c_Dne = null;
    private int field_20b857_DyG = 4;
    private int field_2d29f4_aFZ = 6;
    public double field_212608_FWm = 0.0;
    public double field_2092a9_Dne;
    private int field_267cf5_Qnq = 4;
    private String field_569fcf45_Dne = "Pig";

    public boolean method_ce7f5dad_Dne(int n) {
        if (n == 1 && this.method_2305dd77_Dne().field_2d2a05_aFZ) {
            this.field_2092ae_Dne = this.field_21260d_FWm;
            return true;
        }
        return false;
    }

    public Iey method_230219ae_Dne() {
        return this.field_3688b4f_Dne;
    }

    public abstract int method_7c6f602c_FWm();

    public void method_66a36cd8_FWm(WkD wkD) {
        wkD.method_abaa98ae_Dne("EntityId", this.method_eecad346_Dne());
        wkD.method_5ab47529_Dne("Delay", (short)this.field_2092ae_Dne);
        wkD.method_5ab47529_Dne("MinSpawnDelay", (short)this.field_21260d_FWm);
        wkD.method_5ab47529_Dne("MaxSpawnDelay", (short)this.field_2e5f1b_bzF);
        wkD.method_5ab47529_Dne("SpawnCount", (short)this.field_267cf5_Qnq);
        wkD.method_5ab47529_Dne("MaxNearbyEntities", (short)this.field_2d29f4_aFZ);
        wkD.method_5ab47529_Dne("RequiredPlayerRange", (short)this.field_388da6_zGp);
        wkD.method_5ab47529_Dne("SpawnRange", (short)this.field_20b857_DyG);
        if (this.method_230219ae_Dne() != null) {
            wkD.method_312ec00d_Dne("SpawnData", (WkD)this.method_230219ae_Dne().field_36ef89c_Dne.method_23130705_Dne());
        }
        if (this.method_230219ae_Dne() != null || this.field_f27c122c_Dne != null && this.field_f27c122c_Dne.size() > 0) {
            mbZ mbZ2 = new mbZ();
            if (this.field_f27c122c_Dne != null && this.field_f27c122c_Dne.size() > 0) {
                for (Iey iey : this.field_f27c122c_Dne) {
                    mbZ2.method_b4ba5ea1_Dne(iey.method_230886fb_Dne());
                }
            } else {
                mbZ2.method_b4ba5ea1_Dne(this.method_230219ae_Dne().method_230886fb_Dne());
            }
            wkD.method_58996597_Dne("SpawnPotentials", mbZ2);
        }
    }

    public void method_7a46289a_Dne() {
        if (this.method_7a46289e_Dne()) {
            if (this.method_2305dd77_Dne().field_2d2a05_aFZ) {
                double d = (float)this.method_7a46288d_Dne() + this.method_2305dd77_Dne().field_7331eae7_Dne.nextFloat();
                double d2 = (float)this.method_7c6f602c_FWm() + this.method_2305dd77_Dne().field_7331eae7_Dne.nextFloat();
                double d3 = (float)this.method_ae128dba_bzF() + this.method_2305dd77_Dne().field_7331eae7_Dne.nextFloat();
                this.method_2305dd77_Dne().method_8600ec24_Dne("smoke", d, d2, d3, 0.0, 0.0, 0.0);
                this.method_2305dd77_Dne().method_8600ec24_Dne("flame", d, d2, d3, 0.0, 0.0, 0.0);
                if (this.field_2092ae_Dne > 0) {
                    --this.field_2092ae_Dne;
                }
                this.field_212608_FWm = this.field_2092a9_Dne;
                this.field_2092a9_Dne = (this.field_2092a9_Dne + (double)(1000.0f / ((float)this.field_2092ae_Dne + 200.0f))) % 360.0;
            } else {
                if (this.field_2092ae_Dne == -1) {
                    this.method_7c6f6039_FWm();
                }
                if (this.field_2092ae_Dne > 0) {
                    --this.field_2092ae_Dne;
                    return;
                }
                boolean bl = false;
                for (int i = 0; i < this.field_267cf5_Qnq; ++i) {
                    sMa sMa2 = Klb.method_c1d803b3_Dne(this.method_eecad346_Dne(), this.method_2305dd77_Dne());
                    if (sMa2 == null) {
                        return;
                    }
                    int n = this.method_2305dd77_Dne().method_9314b7e8_Dne(sMa2.getClass(), bSp.method_23186cf1_Dne().method_b4ea3e0c_Dne(this.method_7a46288d_Dne(), this.method_7c6f602c_FWm(), this.method_ae128dba_bzF(), this.method_7a46288d_Dne() + 1, this.method_7c6f602c_FWm() + 1, this.method_ae128dba_bzF() + 1).method_b78565d7_FWm(this.field_20b857_DyG * 2, 4.0, this.field_20b857_DyG * 2)).size();
                    if (n >= this.field_2d29f4_aFZ) {
                        this.method_7c6f6039_FWm();
                        return;
                    }
                    double d = (double)this.method_7a46288d_Dne() + (this.method_2305dd77_Dne().field_7331eae7_Dne.nextDouble() - this.method_2305dd77_Dne().field_7331eae7_Dne.nextDouble()) * (double)this.field_20b857_DyG;
                    double d4 = this.method_7c6f602c_FWm() + this.method_2305dd77_Dne().field_7331eae7_Dne.nextInt(3) - 1;
                    double d5 = (double)this.method_ae128dba_bzF() + (this.method_2305dd77_Dne().field_7331eae7_Dne.nextDouble() - this.method_2305dd77_Dne().field_7331eae7_Dne.nextDouble()) * (double)this.field_20b857_DyG;
                    FUH fUH = sMa2 instanceof FUH ? (FUH)sMa2 : null;
                    sMa2.method_9ce0fc65_FWm(d, d4, d5, this.method_2305dd77_Dne().field_7331eae7_Dne.nextFloat() * 360.0f, 0.0f);
                    if (fUH != null && !fUH.method_af414cf1_cot()) continue;
                    this.method_9a3d50ca_Dne(sMa2);
                    this.method_2305dd77_Dne().method_57aed1c2_Qnq(2004, this.method_7a46288d_Dne(), this.method_7c6f602c_FWm(), this.method_ae128dba_bzF(), 0);
                    if (fUH != null) {
                        fUH.method_9b310ff0_Wwe();
                    }
                    bl = true;
                }
                if (bl) {
                    this.method_7c6f6039_FWm();
                }
            }
        }
    }

    private void method_7c6f6039_FWm() {
        if (this.field_2e5f1b_bzF <= this.field_21260d_FWm) {
            this.field_2092ae_Dne = this.field_21260d_FWm;
        } else {
            int n = this.field_2e5f1b_bzF - this.field_21260d_FWm;
            this.field_2092ae_Dne = this.field_21260d_FWm + this.method_2305dd77_Dne().field_7331eae7_Dne.nextInt(n);
        }
        if (this.field_f27c122c_Dne != null && this.field_f27c122c_Dne.size() > 0) {
            this.method_752f6b0a_Dne((Iey)nGp.method_5a3a1e72_Dne(this.method_2305dd77_Dne().field_7331eae7_Dne, this.field_f27c122c_Dne));
        }
        this.method_ce7f5da9_Dne(1);
    }

    public sMa method_2314d444_Dne() {
        if (this.field_37b45e5_Dne == null) {
            sMa sMa2 = Klb.method_c1d803b3_Dne(this.method_eecad346_Dne(), null);
            this.field_37b45e5_Dne = sMa2 = this.method_9a3d50ca_Dne(sMa2);
        }
        return this.field_37b45e5_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.method_2305dd77_Dne().method_fcf6c807_Dne((double)this.method_7a46288d_Dne() + 0.5, (double)this.method_7c6f602c_FWm() + 0.5, (double)this.method_ae128dba_bzF() + 0.5, this.field_388da6_zGp) != null;
    }

    public abstract void method_ce7f5da9_Dne(int var1);

    public String method_eecad346_Dne() {
        if (this.method_230219ae_Dne() == null) {
            if (this.field_569fcf45_Dne.equals("Minecart")) {
                this.field_569fcf45_Dne = "MinecartRideable";
            }
            return this.field_569fcf45_Dne;
        }
        return this.method_230219ae_Dne().field_569fcf45_Dne;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_569fcf45_Dne = string;
    }

    public void method_8d4fb917_Dne(WkD wkD) {
        this.field_569fcf45_Dne = wkD.method_39193c_Dne("EntityId");
        this.field_2092ae_Dne = wkD.method_8f501fe1_Dne("Delay");
        if (wkD.method_8f501fe8_Dne("SpawnPotentials")) {
            this.field_f27c122c_Dne = new ArrayList();
            mbZ mbZ2 = wkD.method_285baa50_Dne("SpawnPotentials");
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                this.field_f27c122c_Dne.add(new Iey(this, (WkD)mbZ2.method_77d0d055_FWm(i)));
            }
        } else {
            this.field_f27c122c_Dne = null;
        }
        if (wkD.method_8f501fe8_Dne("SpawnData")) {
            this.method_752f6b0a_Dne(new Iey(this, wkD.method_2851c945_Dne("SpawnData"), this.field_569fcf45_Dne));
        } else {
            this.method_752f6b0a_Dne(null);
        }
        if (wkD.method_8f501fe8_Dne("MinSpawnDelay")) {
            this.field_21260d_FWm = wkD.method_8f501fe1_Dne("MinSpawnDelay");
            this.field_2e5f1b_bzF = wkD.method_8f501fe1_Dne("MaxSpawnDelay");
            this.field_267cf5_Qnq = wkD.method_8f501fe1_Dne("SpawnCount");
        }
        if (wkD.method_8f501fe8_Dne("MaxNearbyEntities")) {
            this.field_2d29f4_aFZ = wkD.method_8f501fe1_Dne("MaxNearbyEntities");
            this.field_388da6_zGp = wkD.method_8f501fe1_Dne("RequiredPlayerRange");
        }
        if (wkD.method_8f501fe8_Dne("SpawnRange")) {
            this.field_20b857_DyG = wkD.method_8f501fe1_Dne("SpawnRange");
        }
        if (this.method_2305dd77_Dne() != null && this.method_2305dd77_Dne().field_2d2a05_aFZ) {
            this.field_37b45e5_Dne = null;
        }
    }

    public sMa method_9a3d50ca_Dne(sMa var1) {
        if (this.method_230219ae_Dne() != null) {
            WkD var2 = new WkD();
            var1.method_66a36cdc_FWm(var2);
            Iterator var3 = this.method_230219ae_Dne().field_36ef89c_Dne.method_be5f586d_Dne().iterator();

            while(var3.hasNext()) {
                oNe var4 = (oNe)var3.next();
                var2.method_58996597_Dne(var4.method_eecad346_Dne(), var4.method_23130705_Dne());
            }

            var1.method_102200f0_Qnq(var2);
            if (var1.field_36c4f18_Dne != null) {
                var1.field_36c4f18_Dne.method_94d18be5_FWm(var1);
            }

            WkD var10;
            for(sMa var5 = var1; var2.method_8f501fe8_Dne("Riding"); var2 = var10) {
                var10 = var2.method_2851c945_Dne("Riding");
                sMa var6 = Klb.method_c1d803b3_Dne(var10.method_39193c_Dne("id"), this.method_2305dd77_Dne());
                if (var6 != null) {
                    WkD var7 = new WkD();
                    var6.method_66a36cdc_FWm(var7);
                    Iterator var8 = var10.method_be5f586d_Dne().iterator();

                    while(var8.hasNext()) {
                        oNe var9 = (oNe)var8.next();
                        var7.method_58996597_Dne(var9.method_eecad346_Dne(), var9.method_23130705_Dne());
                    }

                    var6.method_102200f0_Qnq(var7);
                    var6.method_9ce0fc65_FWm(var5.field_2f0dd3_div, var5.field_22c5fd_IjH, var5.field_334487_mrb, var5.field_334489_mrb, var5.field_29186a_XHL);
                    this.method_2305dd77_Dne().method_94d18be5_FWm(var6);
                    var5.method_ad72a713_bzF(var6);
                }

                var5 = var6;
            }
        } else if (var1 instanceof FUH && var1.field_36c4f18_Dne != null) {
            ((FUH)var1).method_80692b1a_ICU();
            this.method_2305dd77_Dne().method_94d18be5_FWm(var1);
        }

        return var1;
    }

    public abstract int method_7a46288d_Dne();

    public abstract Qnq method_2305dd77_Dne();

    public void method_752f6b0a_Dne(Iey iey) {
        this.field_3688b4f_Dne = iey;
    }

    public abstract int method_ae128dba_bzF();
}

