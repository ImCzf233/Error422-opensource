package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class fTB
extends pam {
    private RPI field_36c4e01_Dne;

    public void method_834d493c_Dne(RPI rPI) {
        this.field_36c4e01_Dne = rPI;
    }

    @Override
    public boolean method_6e3a6b6a_Dne(int n, NMq nMq) {
        return true;
    }

    public fTB() {
        super("container.enderchest", false, 27);
    }

    public void method_b2658362_Dne(mbZ mbZ2) {
        int n;
        for (n = 0; n < this.method_907a9d14_Qnq(); ++n) {
            this.method_6e3a6b66_Dne(n, null);
        }
        for (n = 0; n < mbZ2.method_7a46288d_Dne(); ++n) {
            WkD wkD = (WkD)mbZ2.method_77d0d055_FWm(n);
            int n2 = wkD.method_8f501fd0_Dne("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.method_907a9d14_Qnq()) continue;
            this.method_6e3a6b66_Dne(n2, NMq.method_7da70e76_Dne(wkD));
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        if (this.field_36c4e01_Dne != null) {
            this.field_36c4e01_Dne.method_ae128dc7_bzF();
        }
        super.method_ae128dc7_bzF();
        this.field_36c4e01_Dne = null;
    }

    @Override
    public void method_5f36e9f_i_() {
        if (this.field_36c4e01_Dne != null) {
            this.field_36c4e01_Dne.method_7c6f6039_FWm();
        }
        super.method_5f36e9f_i_();
    }

    public mbZ method_23126806_Dne() {
        mbZ mbZ2 = new mbZ("EnderItems");
        for (int i = 0; i < this.method_907a9d14_Qnq(); ++i) {
            NMq nMq = this.method_9e6e1a08_Dne(i);
            if (nMq == null) continue;
            WkD wkD = new WkD();
            wkD.method_5ab43558_Dne("Slot", (byte)i);
            nMq.method_7dab90f8_Dne(wkD);
            mbZ2.method_b4ba5ea1_Dne(wkD);
        }
        return mbZ2;
    }

    @Override
    public boolean method_703284a7_Dne(FiG fiG) {
        return this.field_36c4e01_Dne != null && !this.field_36c4e01_Dne.method_703284a7_Dne(fiG) ? false : super.method_703284a7_Dne(fiG);
    }
}

