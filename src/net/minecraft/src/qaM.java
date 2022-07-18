package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class qaM
extends onZ {
    private FiG field_3673728_Dne;
    private int field_2092ae_Dne;
    private final Jmn field_3691c61_Dne;
    private final YzO field_3701afe_Dne;

    @Override
    public NMq method_9e6e1a08_Dne(int n) {
        if (this.method_7a46289e_Dne()) {
            this.field_2092ae_Dne += Math.min(n, this.method_23040479_Dne().field_2092ae_Dne);
        }
        return super.method_9e6e1a08_Dne(n);
    }

    @Override
    public boolean method_7c61cf19_Dne(NMq nMq) {
        return false;
    }

    @Override
    protected void method_fd8868e_Dne(NMq nMq, int n) {
        this.field_2092ae_Dne += n;
        this.method_55b582d6_FWm(nMq);
    }

    @Override
    protected void method_55b582d6_FWm(NMq nMq) {
        nMq.method_55941bf9_Dne(this.field_3673728_Dne.field_36c4f18_Dne, this.field_3673728_Dne, this.field_2092ae_Dne);
        this.field_2092ae_Dne = 0;
    }

    private boolean method_5f5d7131_Dne(Vnr vnr, NMq nMq, NMq nMq2) {
        NMq nMq3 = vnr.method_23040479_Dne();
        NMq nMq4 = vnr.method_f87a5498_FWm();
        if (nMq != null && nMq.field_2e5f1b_bzF == nMq3.field_2e5f1b_bzF) {
            if (nMq4 != null && nMq2 != null && nMq4.field_2e5f1b_bzF == nMq2.field_2e5f1b_bzF) {
                nMq.field_2092ae_Dne -= nMq3.field_2092ae_Dne;
                nMq2.field_2092ae_Dne -= nMq4.field_2092ae_Dne;
                return true;
            }
            if (nMq4 == null && nMq2 == null) {
                nMq.field_2092ae_Dne -= nMq3.field_2092ae_Dne;
                return true;
            }
        }
        return false;
    }

    @Override
    public void method_672a90ac_Dne(FiG fiG, NMq nMq) {
        NMq nMq2;
        NMq nMq3;
        this.method_55b582d6_FWm(nMq);
        Vnr vnr = this.field_3691c61_Dne.method_23082371_Dne();
        if (vnr != null && (this.method_5f5d7131_Dne(vnr, nMq3 = this.field_3691c61_Dne.method_9e6e1a08_Dne(0), nMq2 = this.field_3691c61_Dne.method_9e6e1a08_Dne(1)) || this.method_5f5d7131_Dne(vnr, nMq2, nMq3))) {
            if (nMq3 != null && nMq3.field_2092ae_Dne <= 0) {
                nMq3 = null;
            }
            if (nMq2 != null && nMq2.field_2092ae_Dne <= 0) {
                nMq2 = null;
            }
            this.field_3691c61_Dne.method_6e3a6b66_Dne(0, nMq3);
            this.field_3691c61_Dne.method_6e3a6b66_Dne(1, nMq2);
            this.field_3701afe_Dne.method_8bda100d_Dne(vnr);
        }
    }

    public qaM(FiG fiG, YzO yzO, Jmn jmn, int n, int n2, int n3) {
        super(jmn, n, n2, n3);
        this.field_3673728_Dne = fiG;
        this.field_3701afe_Dne = yzO;
        this.field_3691c61_Dne = jmn;
    }
}

