package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class Nmc
extends LSv {
    final KDD field_368f1c1_Dne;

    @Override
    protected void method_16d0a4b_Dne(int n, boolean bl) {
        if (n < KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne() + KDD.method_57f4bdcb_Dne(this.field_368f1c1_Dne).size()) {
            int n2 = KDD.method_76affcef_Dne(this.field_368f1c1_Dne);
            KDD.method_5f50157a_Dne(this.field_368f1c1_Dne, n);
            etB etB2 = KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne() > n ? KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_9e791b47_Dne(n) : null;
            boolean bl2 = KDD.method_76affcef_Dne(this.field_368f1c1_Dne) >= 0 && KDD.method_76affcef_Dne(this.field_368f1c1_Dne) < this.method_7a46288d_Dne() && (etB2 == null || etB2.field_2092ae_Dne == 61);
            boolean bl3 = KDD.method_76affcef_Dne(this.field_368f1c1_Dne) < KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne();
            KDD.method_73ca193d_Dne((KDD)this.field_368f1c1_Dne).field_2092bf_Dne = bl2;
            KDD.method_50ac047e_FWm((KDD)this.field_368f1c1_Dne).field_2092bf_Dne = bl3;
            KDD.method_b00836b0_bzF((KDD)this.field_368f1c1_Dne).field_2092bf_Dne = bl3;
            if (bl && bl2) {
                KDD.method_5f501587_Dne(this.field_368f1c1_Dne, n);
            } else if (bl3 && qVZ.method_ae128dcb_bzF() && n2 >= 0 && n2 < KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne()) {
                KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_16cca7a_Dne(n2, KDD.method_76affcef_Dne(this.field_368f1c1_Dne));
            }
        }
    }

    @Override
    protected int method_7a46288d_Dne() {
        return KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne() + KDD.method_57f4bdcb_Dne(this.field_368f1c1_Dne).size() + 1;
    }

    @Override
    protected boolean method_ce7f5dad_Dne(int n) {
        return n == KDD.method_76affcef_Dne(this.field_368f1c1_Dne);
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_368f1c1_Dne.method_a98a0660_aFZ();
    }

    public Nmc(KDD kDD) {
        super(kDD.field_493682ed_Dne, kDD.field_21260d_FWm, kDD.field_2e5f1b_bzF, 32, kDD.field_2e5f1b_bzF - 64, 36);
        this.field_368f1c1_Dne = kDD;
    }

    @Override
    protected int method_ae128dba_bzF() {
        return this.method_7a46288d_Dne() * 36;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_48bbfab8_Qnq(int n, int n2, int n3, int n4, WAR wAR) {
        int n5;
        etB etB2 = KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_9e791b47_Dne(n);
        Object object = KDD.method_fc07f5d8_Dne();
        synchronized (object) {
            if (KDD.method_7a46288d_Dne() < 5 && !etB2.field_2092bf_Dne) {
                etB2.field_2092bf_Dne = true;
                etB2.field_2092af_Dne = -2L;
                etB2.field_9e60dbde_Qnq = "";
                etB2.field_c480ca78_bzF = "";
                KDD.method_7c6f602c_FWm();
                new FZs(this, etB2).start();
            }
        }
        boolean bl = etB2.field_2092ae_Dne > 61;
        boolean bl2 = etB2.field_2092ae_Dne < 61;
        boolean bl3 = bl || bl2;
        this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, etB2.field_569fcf45_Dne, n2 + 2, n3 + 1, 0xFFFFFF);
        this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, etB2.field_9e60dbde_Qnq, n2 + 2, n3 + 12, 0x808080);
        this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, etB2.field_c480ca78_bzF, n2 + 215 - this.field_368f1c1_Dne.field_3791671_Dne.method_8f501fd7_Dne(etB2.field_c480ca78_bzF), n3 + 12, 0x808080);
        if (bl3) {
            String string = (Object)((Object)Dne.field_7129e917_aFZ) + etB2.field_bc57ecbf_aFZ;
            this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, string, n2 + 200 - this.field_368f1c1_Dne.field_3791671_Dne.method_8f501fd7_Dne(string), n3 + 1, 0x808080);
        }
        if (!this.field_368f1c1_Dne.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO && !etB2.method_ae128dcb_bzF()) {
            this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, etB2.field_d9a85c6_FWm, n2 + 2, n3 + 12 + 11, 0x303030);
        } else {
            this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, KGL.method_39193c_Dne("selectServer.hiddenAddress"), n2 + 2, n3 + 12 + 11, 0x303030);
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_368f1c1_Dne.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/icons.png");
        int n6 = 0;
        boolean bl4 = false;
        String string = "";
        if (bl3) {
            string = bl ? "Client out of date!" : "Server out of date!";
            n5 = 5;
        } else if (etB2.field_2092bf_Dne && etB2.field_2092af_Dne != -2L) {
            n5 = etB2.field_2092af_Dne < 0L ? 5 : (etB2.field_2092af_Dne < 150L ? 0 : (etB2.field_2092af_Dne < 300L ? 1 : (etB2.field_2092af_Dne < 600L ? 2 : (etB2.field_2092af_Dne < 1000L ? 3 : 4))));
            string = etB2.field_2092af_Dne < 0L ? "(no connection)" : etB2.field_2092af_Dne + "ms";
        } else {
            n6 = 1;
            n5 = (int)(Minecraft.method_7a46288e_Dne() / 100L + (long)(n * 2) & 7L);
            if (n5 > 4) {
                n5 = 8 - n5;
            }
            string = "Polling..";
        }
        this.field_368f1c1_Dne.method_17d7ea99_FWm(n2 + 205, n3, 0 + n6 * 10, 176 + n5 * 8, 10, 8);
        int n7 = 4;
        if (this.field_2d29f4_aFZ >= n2 + 205 - n7 && this.field_388da6_zGp >= n3 - n7 && this.field_2d29f4_aFZ <= n2 + 205 + 10 + n7 && this.field_388da6_zGp <= n3 + 8 + n7) {
            KDD.method_7e12599a_Dne(this.field_368f1c1_Dne, string);
        }
    }

    @Override
    protected void method_8a73475f_Dne(int n, int n2, int n3, int n4, WAR wAR) {
        if (n < KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne()) {
            this.method_48bbfab8_Qnq(n, n2, n3, n4, wAR);
        } else if (n < KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne() + KDD.method_57f4bdcb_Dne(this.field_368f1c1_Dne).size()) {
            this.method_675532a0_FWm(n, n2, n3, n4, wAR);
        } else {
            this.method_c6b164d2_bzF(n, n2, n3, n4, wAR);
        }
    }

    private void method_675532a0_FWm(int n, int n2, int n3, int n4, WAR wAR) {
        jhx jhx2 = (jhx)KDD.method_57f4bdcb_Dne(this.field_368f1c1_Dne).get(n - KDD.method_73c5ac87_Dne(this.field_368f1c1_Dne).method_7a46288d_Dne());
        this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, KGL.method_39193c_Dne("lanServer.title"), n2 + 2, n3 + 1, 0xFFFFFF);
        this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, jhx2.method_eecad346_Dne(), n2 + 2, n3 + 12, 0x808080);
        if (this.field_368f1c1_Dne.field_493682ed_Dne.field_3758af7_Dne.field_36b0ba_udO) {
            this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, KGL.method_39193c_Dne("selectServer.hiddenAddress"), n2 + 2, n3 + 12 + 11, 0x303030);
        } else {
            this.field_368f1c1_Dne.method_67d6d54c_FWm(this.field_368f1c1_Dne.field_3791671_Dne, jhx2.method_d1f1ed87_FWm(), n2 + 2, n3 + 12 + 11, 0x303030);
        }
    }

    private void method_c6b164d2_bzF(int n, int n2, int n3, int n4, WAR wAR) {
        String string;
        this.field_368f1c1_Dne.method_32faf66d_Dne(this.field_368f1c1_Dne.field_3791671_Dne, KGL.method_39193c_Dne("lanServer.scanning"), this.field_368f1c1_Dne.field_21260d_FWm / 2, n3 + 1, 0xFFFFFF);
        switch (KDD.method_5003b0b0_FWm(this.field_368f1c1_Dne) / 3 % 4) {
            default: {
                string = "O o o";
                break;
            }
            case 1: 
            case 3: {
                string = "o O o";
                break;
            }
            case 2: {
                string = "o o O";
            }
        }
        this.field_368f1c1_Dne.method_32faf66d_Dne(this.field_368f1c1_Dne.field_3791671_Dne, string, this.field_368f1c1_Dne.field_21260d_FWm / 2, n3 + 12, 0x808080);
    }
}

