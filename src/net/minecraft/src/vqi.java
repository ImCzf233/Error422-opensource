package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
class vqi
extends onZ {
    private FiG field_3673728_Dne;

    public static boolean method_55b582da_FWm(NMq nMq) {
        return nMq != null && (nMq.field_2e5f1b_bzF == dEr.field_3682442_Dne.field_267cf5_Qnq || nMq.field_2e5f1b_bzF == dEr.field_7c27c815_OCU.field_267cf5_Qnq);
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return vqi.method_55b582da_FWm(nMq);
    }

    @Override
    public int method_7a46288d_Dne() {
        return erC.field_2092ae_Dne;
    }

    @Override
    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        if (nMq.field_2e5f1b_bzF == dEr.field_3682442_Dne.field_267cf5_Qnq && nMq.method_907a9d14_Qnq() > 0) {
            this.field_3673728_Dne.method_df3461c5_Dne(qlg.field_d3e673d_FfS, 1);
        }
        super.method_672a90ac_Dne(fiG, nMq);
    }

    public vqi(FiG fiG, MqS mqS, int n, int n2, int n3) {
        super(mqS, n, n2, n3);
        this.field_3673728_Dne = fiG;
    }
}

