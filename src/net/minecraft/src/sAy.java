package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class sAy
extends Suj {
    protected Map<Object, JhS> field_83b1c1b0_Dne = new HashMap();

    public boolean method_37de1363_Dne(Qnq qnq, Random random, int n, int n2) {
        int n3 = (n << 4) + 8;
        int n4 = (n2 << 4) + 8;
        boolean bl = false;
        for (JhS jhS : this.field_83b1c1b0_Dne.values()) {
            if (!jhS.method_7a46289e_Dne() || !jhS.method_22fefc09_Dne().method_5972745e_Dne(n3, n4, n3 + 15, n4 + 15)) continue;
            jhS.method_f28ef3a0_Dne(qnq, random, new CLK(n3, n4, n3 + 15, n4 + 15));
            bl = true;
        }
        return bl;
    }

    public boolean method_2c2cf7cd_Dne(int n, int n2, int n3) {
        for (JhS jhS : this.field_83b1c1b0_Dne.values()) {
            if (!jhS.method_7a46289e_Dne() || !jhS.method_22fefc09_Dne().method_5972745e_Dne(n, n3, n, n3)) continue;
            for (bvz bvz2 : jhS.method_d9e7d4_Dne()) {
                if (!bvz2.method_22fefc09_Dne().method_2c2cf7cd_Dne(n, n2, n3)) continue;
                return true;
            }
        }
        return false;
    }

    protected List method_c012bed0_a_() {
        return null;
    }

    public EyB method_8bbba33_Dne(Qnq var1, int var2, int var3, int var4) {
        this.field_36c4f18_Dne = var1;
        this.field_7331eae7_Dne.setSeed(var1.method_7a46288e_Dne());
        long var5 = this.field_7331eae7_Dne.nextLong();
        long var7 = this.field_7331eae7_Dne.nextLong();
        long var9 = (long)(var2 >> 4) * var5;
        long var11 = (long)(var4 >> 4) * var7;
        this.field_7331eae7_Dne.setSeed(var9 ^ var11 ^ var1.method_7a46288e_Dne());
        this.method_8632d3da_Dne(var1, var2 >> 4, var4 >> 4, 0, 0, (byte[])null);
        double var13 = Double.MAX_VALUE;
        EyB var15 = null;
        Iterator var16 = this.field_83b1c1b0_Dne.values().iterator();

        EyB var17;
        int var18;
        int var19;
        int var20;
        double var21;
        while(var16.hasNext()) {
            JhS var23 = (JhS)var16.next();
            if (var23.method_7a46289e_Dne()) {
                bvz var24 = (bvz)var23.method_d9e7d4_Dne().get(0);
                var17 = var24.method_23008c9d_Dne();
                var18 = var17.field_2092ae_Dne - var2;
                var19 = var17.field_21260d_FWm - var3;
                var20 = var17.field_2e5f1b_bzF - var4;
                var21 = (double)(var18 + var18 * var19 * var19 + var20 * var20);
                if (var21 < var13) {
                    var13 = var21;
                    var15 = var17;
                }
            }
        }

        if (var15 != null) {
            return var15;
        } else {
            List var26 = this.method_c012bed0_a_();
            if (var26 != null) {
                EyB var27 = null;
                Iterator var25 = var26.iterator();

                while(var25.hasNext()) {
                    var17 = (EyB)var25.next();
                    var18 = var17.field_2092ae_Dne - var2;
                    var19 = var17.field_21260d_FWm - var3;
                    var20 = var17.field_2e5f1b_bzF - var4;
                    var21 = (double)(var18 + var18 * var19 * var19 + var20 * var20);
                    if (var21 < var13) {
                        var13 = var21;
                        var27 = var17;
                    }
                }

                return var27;
            } else {
                return null;
            }
        }
    }

    @Override
    protected void method_8632d3da_Dne(Qnq qnq, int n, int n2, int n3, int n4, byte[] byArray) {
        if (!this.field_83b1c1b0_Dne.containsKey(Sxs.method_16cca6e_Dne(n, n2))) {
            this.field_7331eae7_Dne.nextInt();
            try {
                if (this.method_16cca7e_Dne(n, n2)) {
                    JhS jhS = this.method_90454696_Dne(n, n2);
                    this.field_83b1c1b0_Dne.put(Sxs.method_16cca6e_Dne(n, n2), jhS);
                }
            }
            catch (Throwable throwable) {
                McM mcM = McM.method_948e60df_Dne(throwable, "Exception preparing structure feature");
                Noo noo = mcM.method_284dc627_Dne("Feature being prepared");
                noo.method_2aeeb7ad_Dne("Is feature chunk", new oeZ(this, n, n2));
                noo.method_5e295ec0_Dne("Chunk location", String.format("%d,%d", n, n2));
                noo.method_2aeeb7ad_Dne("Chunk pos hash", new HRL(this, n, n2));
                noo.method_2aeeb7ad_Dne("Structure type", new zNA(this));
                throw new kaJ(mcM);
            }
        }
    }

    protected abstract JhS method_90454696_Dne(int var1, int var2);

    protected abstract boolean method_16cca7e_Dne(int var1, int var2);
}

