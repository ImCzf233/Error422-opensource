package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class oGG
extends dEr {
    private gDn field_202f7d1a_FWm;

    public static oNe method_a36c118a_Dne(NMq nMq, String string) {
        WkD wkD;
        if (nMq.method_a98a0664_aFZ() && (wkD = nMq.method_230886fb_Dne().method_2851c945_Dne("Explosion")) != null) {
            return wkD.method_285c494f_Dne(string);
        }
        return null;
    }

    @Override
    public void method_497c81fb_Dne(NMq nMq, FiG fiG, List list, boolean bl) {
        WkD wkD;
        if (nMq.method_a98a0664_aFZ() && (wkD = nMq.method_230886fb_Dne().method_2851c945_Dne("Explosion")) != null) {
            oGG.method_baef3808_Dne(wkD, list);
        }
    }

    @Override
    public gDn method_9051f17a_Dne(int n, int n2) {
        return n2 > 0 ? this.field_202f7d1a_FWm : super.method_9051f17a_Dne(n, n2);
    }

    @Override
    public int method_fd88681_Dne(NMq nMq, int n) {
        if (n != 1) {
            return super.method_fd88681_Dne(nMq, n);
        }
        oNe oNe2 = oGG.method_a36c118a_Dne(nMq, "Colors");
        if (oNe2 == null) {
            return 0x8A8A8A;
        }
        xuY xuY2 = (xuY)oNe2;
        if (xuY2.field_3f1c589_Dne.length == 1) {
            return xuY2.field_3f1c589_Dne[0];
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int n5 : xuY2.field_3f1c589_Dne) {
            n2 += (n5 & 0xFF0000) >> 16;
            n3 += (n5 & 0xFF00) >> 8;
            n4 += (n5 & 0xFF) >> 0;
        }
        return (n2 /= xuY2.field_3f1c589_Dne.length) << 16 | (n3 /= xuY2.field_3f1c589_Dne.length) << 8 | (n4 /= xuY2.field_3f1c589_Dne.length);
    }

    public oGG(int n) {
        super(n);
    }

    @Override
    public void method_845caac7_Dne(Rbp rbp) {
        super.method_845caac7_Dne(rbp);
        this.field_202f7d1a_FWm = rbp.method_285881e4_Dne("fireworksCharge_overlay");
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }

    public static void method_baef3808_Dne(WkD var0, List var1) {
        byte var2 = var0.method_8f501fd0_Dne("Type");
        if (var2 >= 0 && var2 <= 4) {
            var1.add(KGL.method_39193c_Dne("item.fireworksCharge.type." + var2).trim());
        } else {
            var1.add(KGL.method_39193c_Dne("item.fireworksCharge.type").trim());
        }

        int[] var3 = var0.method_5ab3dd80_Dne("Colors");
        int var4;
        int var5;
        if (var3.length > 0) {
            boolean var6 = true;
            String var7 = "";
            int[] var8 = var3;
            int var9 = var3.length;

            for(var4 = 0; var4 < var9; ++var4) {
                var5 = var8[var4];
                if (!var6) {
                    var7 = var7 + ", ";
                }

                var6 = false;
                boolean var10 = false;

                for(int var11 = 0; var11 < 16; ++var11) {
                    if (var5 == AvN.field_3f1c589_Dne[var11]) {
                        var10 = true;
                        var7 = var7 + KGL.method_39193c_Dne("item.fireworksCharge." + AvN.field_f5e54dca_Dne[var11]);
                        break;
                    }
                }

                if (!var10) {
                    var7 = var7 + KGL.method_39193c_Dne("item.fireworksCharge.customColor");
                }
            }

            var1.add(var7);
        }

        int[] var13 = var0.method_5ab3dd80_Dne("FadeColors");
        boolean var15;
        if (var13.length > 0) {
            var15 = true;
            String var14 = KGL.method_39193c_Dne("item.fireworksCharge.fadeTo") + " ";
            int[] var16 = var13;
            var4 = var13.length;

            for(var5 = 0; var5 < var4; ++var5) {
                int var18 = var16[var5];
                if (!var15) {
                    var14 = var14 + ", ";
                }

                var15 = false;
                boolean var19 = false;

                for(int var12 = 0; var12 < 16; ++var12) {
                    if (var18 == AvN.field_3f1c589_Dne[var12]) {
                        var19 = true;
                        var14 = var14 + KGL.method_39193c_Dne("item.fireworksCharge." + AvN.field_f5e54dca_Dne[var12]);
                        break;
                    }
                }

                if (!var19) {
                    var14 = var14 + KGL.method_39193c_Dne("item.fireworksCharge.customColor");
                }
            }

            var1.add(var14);
        }

        var15 = var0.method_110c4dc7_FWm("Trail");
        if (var15) {
            var1.add(KGL.method_39193c_Dne("item.fireworksCharge.trail"));
        }

        boolean var17 = var0.method_110c4dc7_FWm("Flicker");
        if (var17) {
            var1.add(KGL.method_39193c_Dne("item.fireworksCharge.flicker"));
        }

    }
}

