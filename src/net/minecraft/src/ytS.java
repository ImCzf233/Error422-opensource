package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
public class ytS {
    int field_2e5f1b_bzF;
    int field_2092ae_Dne;
    int field_21260d_FWm;
    int field_2d29f4_aFZ;
    int field_267cf5_Qnq;
    private byte[] field_4039e03_FWm;
    private aHQ field_3730282_Dne = new aHQ();
    public byte[] field_3f1c582_Dne;
    int field_388da6_zGp;

    public int method_907a9d14_Qnq() {
        return this.field_21260d_FWm;
    }

    public int method_117d19dd_FWm(int n) {
        if (this.field_21260d_FWm + n > this.field_2092ae_Dne) {
            return -1;
        }
        this.field_21260d_FWm += n;
        return 0;
    }

    public int method_7a46288d_Dne() {
        this.field_3f1c582_Dne = null;
        return 0;
    }

    public void method_7a46289a_Dne() {
    }

    public int method_75cc9531_FWm(aHQ aHQ2) {
        do {
            int n;
            if ((n = this.method_9c78e170_Dne(aHQ2)) > 0) {
                return 1;
            }
            if (n != 0) continue;
            return 0;
        } while (this.field_267cf5_Qnq != 0);
        this.field_267cf5_Qnq = 1;
        return -1;
    }

    public ytS() {
        this.field_4039e03_FWm = new byte[4];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int method_9c78e170_Dne(aHQ aHQ2) {
        int n = this.field_2e5f1b_bzF;
        int n2 = this.field_21260d_FWm - this.field_2e5f1b_bzF;
        if (this.field_2d29f4_aFZ == 0) {
            if (n2 < 27) {
                return 0;
            }
            if (this.field_3f1c582_Dne[n] != 79 || this.field_3f1c582_Dne[n + 1] != 103 || this.field_3f1c582_Dne[n + 2] != 103 || this.field_3f1c582_Dne[n + 3] != 83) {
                this.field_2d29f4_aFZ = 0;
                this.field_388da6_zGp = 0;
                int n3 = 0;
                for (int i = 0; i < n2 - 1; ++i) {
                    if (this.field_3f1c582_Dne[n + 1 + i] != 79) continue;
                    n3 = n + 1 + i;
                    break;
                }
                if (n3 == 0) {
                    n3 = this.field_21260d_FWm;
                }
                this.field_2e5f1b_bzF = n3;
                return -(n3 - n);
            }
            int n4 = (this.field_3f1c582_Dne[n + 26] & 0xFF) + 27;
            if (n2 < n4) {
                return 0;
            }
            for (int i = 0; i < (this.field_3f1c582_Dne[n + 26] & 0xFF); ++i) {
                this.field_388da6_zGp += this.field_3f1c582_Dne[n + 27 + i] & 0xFF;
            }
            this.field_2d29f4_aFZ = n4;
        }
        if (this.field_388da6_zGp + this.field_2d29f4_aFZ > n2) {
            return 0;
        }
        byte[] byArray = this.field_4039e03_FWm;
        synchronized (this.field_4039e03_FWm) {
            System.arraycopy(this.field_3f1c582_Dne, n + 22, this.field_4039e03_FWm, 0, 4);
            this.field_3f1c582_Dne[n + 22] = 0;
            this.field_3f1c582_Dne[n + 23] = 0;
            this.field_3f1c582_Dne[n + 24] = 0;
            this.field_3f1c582_Dne[n + 25] = 0;
            aHQ aHQ3 = this.field_3730282_Dne;
            aHQ3.field_3f1c582_Dne = this.field_3f1c582_Dne;
            aHQ3.field_2092ae_Dne = n;
            aHQ3.field_21260d_FWm = this.field_2d29f4_aFZ;
            aHQ3.field_4039e03_FWm = this.field_3f1c582_Dne;
            aHQ3.field_2e5f1b_bzF = n + this.field_2d29f4_aFZ;
            aHQ3.field_267cf5_Qnq = this.field_388da6_zGp;
            aHQ3.method_7a46289a_Dne();
            if (this.field_4039e03_FWm[0] != this.field_3f1c582_Dne[n + 22] || this.field_4039e03_FWm[1] != this.field_3f1c582_Dne[n + 23] || this.field_4039e03_FWm[2] != this.field_3f1c582_Dne[n + 24] || this.field_4039e03_FWm[3] != this.field_3f1c582_Dne[n + 25]) {
                System.arraycopy(this.field_4039e03_FWm, 0, this.field_3f1c582_Dne, n + 22, 4);
                this.field_2d29f4_aFZ = 0;
                this.field_388da6_zGp = 0;
                int n5 = 0;
                for (int i = 0; i < n2 - 1; ++i) {
                    if (this.field_3f1c582_Dne[n + 1 + i] != 79) continue;
                    n5 = n + 1 + i;
                    break;
                }
                if (n5 == 0) {
                    n5 = this.field_21260d_FWm;
                }
                this.field_2e5f1b_bzF = n5;
                // ** MonitorExit[var5_9] (shouldn't be in output)
                return -(n5 - n);
            }
            // ** MonitorExit[var5_9] (shouldn't be in output)
            n = this.field_2e5f1b_bzF;
            if (aHQ2 != null) {
                aHQ2.field_3f1c582_Dne = this.field_3f1c582_Dne;
                aHQ2.field_2092ae_Dne = n;
                aHQ2.field_21260d_FWm = this.field_2d29f4_aFZ;
                aHQ2.field_4039e03_FWm = this.field_3f1c582_Dne;
                aHQ2.field_2e5f1b_bzF = n + this.field_2d29f4_aFZ;
                aHQ2.field_267cf5_Qnq = this.field_388da6_zGp;
            }
            this.field_267cf5_Qnq = 0;
            n2 = this.field_2d29f4_aFZ + this.field_388da6_zGp;
            this.field_2e5f1b_bzF += n2;
            this.field_2d29f4_aFZ = 0;
            this.field_388da6_zGp = 0;
            return n2;
        }
    }

    public int method_ae128dba_bzF() {
        return this.field_2e5f1b_bzF;
    }

    public int method_7c6f602c_FWm() {
        this.field_21260d_FWm = 0;
        this.field_2e5f1b_bzF = 0;
        this.field_267cf5_Qnq = 0;
        this.field_2d29f4_aFZ = 0;
        this.field_388da6_zGp = 0;
        return 0;
    }

    public int method_ce7f5d9c_Dne(int n) {
        if (this.field_2e5f1b_bzF != 0) {
            this.field_21260d_FWm -= this.field_2e5f1b_bzF;
            if (this.field_21260d_FWm > 0) {
                System.arraycopy(this.field_3f1c582_Dne, this.field_2e5f1b_bzF, this.field_3f1c582_Dne, 0, this.field_21260d_FWm);
            }
            this.field_2e5f1b_bzF = 0;
        }
        if (n > this.field_2092ae_Dne - this.field_21260d_FWm) {
            int n2 = n + this.field_21260d_FWm + 4096;
            if (this.field_3f1c582_Dne != null) {
                byte[] byArray = new byte[n2];
                System.arraycopy(this.field_3f1c582_Dne, 0, byArray, 0, this.field_3f1c582_Dne.length);
                this.field_3f1c582_Dne = byArray;
            } else {
                this.field_3f1c582_Dne = new byte[n2];
            }
            this.field_2092ae_Dne = n2;
        }
        return this.field_21260d_FWm;
    }
}

