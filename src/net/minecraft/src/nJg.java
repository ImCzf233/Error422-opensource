package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class nJg {
    private byte[] field_3f1c582_Dne;
    final Ilk field_368a3e4_Dne;
    public int field_2092ae_Dne;
    public int[] field_4039e0a_FWm;
    public int[] field_3f1c589_Dne;
    public final FiG field_3673728_Dne;
    private int field_2e5f1b_bzF;
    private boolean field_2092bf_Dne;
    private int field_21260d_FWm;

    public byte[] method_fd81468_Dne(NMq nMq) {
        int n;
        int n2;
        int n3;
        if (!this.field_2092bf_Dne) {
            byte[] byArray = new byte[]{2, this.field_368a3e4_Dne.field_212606_FWm};
            this.field_2092bf_Dne = true;
            return byArray;
        }
        if (--this.field_2e5f1b_bzF < 0) {
            this.field_2e5f1b_bzF = 4;
            byte[] byArray = new byte[this.field_368a3e4_Dne.field_83b1c1b0_Dne.size() * 3 + 1];
            byArray[0] = 1;
            n3 = 0;
            for (GHe gHe : this.field_368a3e4_Dne.field_83b1c1b0_Dne.values()) {
                byArray[n3 * 3 + 1] = (byte)(gHe.field_2092a7_Dne << 4 | gHe.field_267cee_Qnq & 0xF);
                byArray[n3 * 3 + 2] = gHe.field_212606_FWm;
                byArray[n3 * 3 + 3] = gHe.field_2e5f14_bzF;
                ++n3;
            }
            int n4 = n2 = !nMq.method_9a443a9d_XHL() ? 1 : 0;
            if (this.field_3f1c582_Dne != null && this.field_3f1c582_Dne.length == byArray.length) {
                for (n = 0; n < byArray.length; ++n) {
                    if (byArray[n] == this.field_3f1c582_Dne[n]) continue;
                    n2 = 0;
                    break;
                }
            } else {
                n2 = 0;
            }
            if (n2 == 0) {
                this.field_3f1c582_Dne = byArray;
                return byArray;
            }
        }
        for (n2 = 0; n2 < 1; ++n2) {
            if (this.field_3f1c589_Dne[n3 = this.field_21260d_FWm++ * 11 % 128] < 0) continue;
            int n5 = this.field_4039e0a_FWm[n3] - this.field_3f1c589_Dne[n3] + 1;
            n = this.field_3f1c589_Dne[n3];
            byte[] byArray = new byte[n5 + 3];
            byArray[0] = 0;
            byArray[1] = (byte)n3;
            byArray[2] = (byte)n;
            for (int i = 0; i < byArray.length - 3; ++i) {
                byArray[i + 3] = this.field_368a3e4_Dne.field_3f1c582_Dne[(i + n) * 128 + n3];
            }
            this.field_4039e0a_FWm[n3] = -1;
            this.field_3f1c589_Dne[n3] = -1;
            return byArray;
        }
        return null;
    }

    public nJg(Ilk ilk, FiG fiG) {
        this.field_368a3e4_Dne = ilk;
        this.field_3f1c589_Dne = new int[128];
        this.field_4039e0a_FWm = new int[128];
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
        this.field_2092bf_Dne = false;
        this.field_3673728_Dne = fiG;
        for (int i = 0; i < this.field_3f1c589_Dne.length; ++i) {
            this.field_3f1c589_Dne[i] = 0;
            this.field_4039e0a_FWm[i] = 127;
        }
    }
}

