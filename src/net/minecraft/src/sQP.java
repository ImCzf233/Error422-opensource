package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;

class sQP
implements Runnable {
    final MKS field_369f697_Dne;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block5: {
            try {
                String string = fgp.method_c6f78527_Dne(new URL("http://assets.minecraft.net/1_6_has_been_released.flag"));
                if (string == null || string.length() <= 0) break block5;
                string = string.trim();
                Object object = MKS.method_4cdae120_Dne(this.field_369f697_Dne);
                synchronized (object) {
                    MKS.method_c032c284_Dne(this.field_369f697_Dne, (Object)((Object)Dne.field_35c5c5ba_ATE) + "Notice!" + (Object)((Object)Dne.field_d3fa959_FfS) + " Minecraft 1.6 is available for manual download.");
                    MKS.method_6613af23_FWm(this.field_369f697_Dne, string);
                    MKS.method_d5e1d8e4_Dne(this.field_369f697_Dne, MKS.method_807b0488_Dne(this.field_369f697_Dne).method_8f501fd7_Dne(MKS.method_3f9dbe8e_Dne(this.field_369f697_Dne)));
                    MKS.method_27049d43_FWm(this.field_369f697_Dne, MKS.method_5d5cefc9_FWm(this.field_369f697_Dne).method_8f501fd7_Dne(MKS.field_569fcf45_Dne));
                    int n = Math.max(MKS.method_7a832445_Dne(this.field_369f697_Dne), MKS.method_53d6d806_FWm(this.field_369f697_Dne));
                    MKS.method_2286e851_bzF(this.field_369f697_Dne, (this.field_369f697_Dne.field_21260d_FWm - n) / 2);
                    MKS.method_ad588c2b_Qnq(this.field_369f697_Dne, ((pee_0)MKS.method_d38f3fb5_Dne((MKS)this.field_369f697_Dne).get((int)0)).field_267cf5_Qnq - 24);
                    MKS.method_f21dca2a_aFZ(this.field_369f697_Dne, MKS.method_6c77f338_bzF(this.field_369f697_Dne) + n);
                    MKS.method_45ab5bdc_zGp(this.field_369f697_Dne, MKS.method_fd556c1e_Qnq(this.field_369f697_Dne) + 24);
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    sQP(MKS mKS) {
        this.field_369f697_Dne = mKS;
    }
}

