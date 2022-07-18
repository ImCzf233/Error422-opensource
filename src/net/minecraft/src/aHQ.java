package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class aHQ {
    public int field_2e5f1b_bzF;
    public int field_21260d_FWm;
    public byte[] field_3f1c582_Dne;
    public int field_2092ae_Dne;
    private static int[] field_3f1c589_Dne = new int[256];
    public byte[] field_4039e03_FWm;
    public int field_267cf5_Qnq;

    int method_7c6f602c_FWm() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 5] & 1;
    }

    public aHQ method_230c90e1_Dne() {
        return this.method_9a22044_Dne(new aHQ());
    }

    static {
        for (int i = 0; i < field_3f1c589_Dne.length; ++i) {
            aHQ.field_3f1c589_Dne[i] = aHQ.method_ce7f5d9c_Dne(i);
        }
    }

    public aHQ method_9a22044_Dne(aHQ aHQ2) {
        byte[] byArray = new byte[this.field_21260d_FWm];
        System.arraycopy(this.field_3f1c582_Dne, this.field_2092ae_Dne, byArray, 0, this.field_21260d_FWm);
        aHQ2.field_21260d_FWm = this.field_21260d_FWm;
        aHQ2.field_3f1c582_Dne = byArray;
        aHQ2.field_2092ae_Dne = 0;
        byArray = new byte[this.field_267cf5_Qnq];
        System.arraycopy(this.field_4039e03_FWm, this.field_2e5f1b_bzF, byArray, 0, this.field_267cf5_Qnq);
        aHQ2.field_267cf5_Qnq = this.field_267cf5_Qnq;
        aHQ2.field_4039e03_FWm = byArray;
        aHQ2.field_2e5f1b_bzF = 0;
        return aHQ2;
    }

    public int method_ae128dba_bzF() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 5] & 2;
    }

    public int method_907a9d14_Qnq() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 5] & 4;
    }

    public long method_7a46288e_Dne() {
        long l = this.field_3f1c582_Dne[this.field_2092ae_Dne + 13] & 0xFF;
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 12] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 11] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 10] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 9] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 8] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 7] & 0xFF);
        l = l << 8 | (long)(this.field_3f1c582_Dne[this.field_2092ae_Dne + 6] & 0xFF);
        return l;
    }

    int method_d44b4585_zGp() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 18] & 0xFF | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 19] & 0xFF) << 8 | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 20] & 0xFF) << 16 | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 21] & 0xFF) << 24;
    }

    void method_7a46289a_Dne() {
        int n;
        int n2 = 0;
        for (n = 0; n < this.field_21260d_FWm; ++n) {
            n2 = n2 << 8 ^ field_3f1c589_Dne[n2 >>> 24 & 0xFF ^ this.field_3f1c582_Dne[this.field_2092ae_Dne + n] & 0xFF];
        }
        for (n = 0; n < this.field_267cf5_Qnq; ++n) {
            n2 = n2 << 8 ^ field_3f1c589_Dne[n2 >>> 24 & 0xFF ^ this.field_4039e03_FWm[this.field_2e5f1b_bzF + n] & 0xFF];
        }
        this.field_3f1c582_Dne[this.field_2092ae_Dne + 22] = (byte)n2;
        this.field_3f1c582_Dne[this.field_2092ae_Dne + 23] = (byte)(n2 >>> 8);
        this.field_3f1c582_Dne[this.field_2092ae_Dne + 24] = (byte)(n2 >>> 16);
        this.field_3f1c582_Dne[this.field_2092ae_Dne + 25] = (byte)(n2 >>> 24);
    }

    private static int method_ce7f5d9c_Dne(int n) {
        int n2 = n << 24;
        for (int i = 0; i < 8; ++i) {
            if ((n2 & Integer.MIN_VALUE) != 0) {
                n2 = n2 << 1 ^ 0x4C11DB7;
                continue;
            }
            n2 <<= 1;
        }
        return n2 & 0xFFFFFFFF;
    }

    public int method_a98a0653_aFZ() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 14] & 0xFF | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 15] & 0xFF) << 8 | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 16] & 0xFF) << 16 | (this.field_3f1c582_Dne[this.field_2092ae_Dne + 17] & 0xFF) << 24;
    }

    int method_7a46288d_Dne() {
        return this.field_3f1c582_Dne[this.field_2092ae_Dne + 4] & 0xFF;
    }
}

