package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Gal
extends jte_0 {
    private zVu field_37e98b3_Dne;

    @Override
    public void method_bdc49bcc_Dne(ipD ipD2, double d, double d2, double d3, float f) {
        this.method_5b6e1a63_Dne((SoB)ipD2, d, d2, d3, f);
    }

    public void method_5b6e1a63_Dne(SoB soB, double d, double d2, double d3, float f) {
        zKP zKP2 = zKP.field_8374b848_Dne[soB.method_7a46288d_Dne()];
        if (zKP2 != null && soB.method_ce7f5256_Dne(f) < 1.0f) {
            WAR wAR = WAR.field_36e5ca4_Dne;
            this.method_8f501fe4_Dne("/terrain.png");
            Cit.method_7a46289a_Dne();
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            if (Minecraft.method_907a9d25_Qnq()) {
                GL11.glShadeModel(7425);
            } else {
                GL11.glShadeModel(7424);
            }
            wAR.method_7a46289a_Dne();
            wAR.method_a663d9a5_FWm((float)d - (float)soB.field_267cf5_Qnq + soB.method_117d0e97_FWm(f), (float)d2 - (float)soB.field_2d29f4_aFZ + soB.method_143f92c9_bzF(f), (float)d3 - (float)soB.field_388da6_zGp + soB.method_7ed96eaf_Qnq(f));
            wAR.method_2c2cf7c9_Dne(1, 1, 1);
            if (zKP2 == zKP.field_367483b_Dne && soB.method_ce7f5256_Dne(f) < 0.5f) {
                this.field_37e98b3_Dne.method_70206fb9_Dne(zKP2, soB.field_267cf5_Qnq, soB.field_2d29f4_aFZ, soB.field_388da6_zGp, false);
            } else if (soB.method_7c6f603d_FWm() && !soB.method_7a46289e_Dne()) {
                zKP.field_367483b_Dne.method_a68ac5f6_Dne(((XbN)zKP2).method_230f3f9a_Dne());
                this.field_37e98b3_Dne.method_70206fb9_Dne(zKP.field_367483b_Dne, soB.field_267cf5_Qnq, soB.field_2d29f4_aFZ, soB.field_388da6_zGp, soB.method_ce7f5256_Dne(f) < 0.5f);
                zKP.field_367483b_Dne.method_ae128dc7_bzF();
                wAR.method_a663d9a5_FWm((float)d - (float)soB.field_267cf5_Qnq, (float)d2 - (float)soB.field_2d29f4_aFZ, (float)d3 - (float)soB.field_388da6_zGp);
                this.field_37e98b3_Dne.method_e9b5bb1a_FWm(zKP2, soB.field_267cf5_Qnq, soB.field_2d29f4_aFZ, soB.field_388da6_zGp);
            } else {
                this.field_37e98b3_Dne.method_5632927b_Dne(zKP2, soB.field_267cf5_Qnq, soB.field_2d29f4_aFZ, soB.field_388da6_zGp);
            }
            wAR.method_a663d9a5_FWm(0.0, 0.0, 0.0);
            wAR.method_7a46288d_Dne();
            Cit.method_7c6f6039_FWm();
        }
    }

    @Override
    public void method_83516093_Dne(Qnq qnq) {
        this.field_37e98b3_Dne = new zVu(qnq);
    }
}

