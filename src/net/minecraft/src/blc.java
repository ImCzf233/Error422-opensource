package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import net.minecraft.client.Minecraft;

public class blc
extends qVZ {
    private final qVZ field_37a7e17_Dne;
    private jhn_0 field_377957c_Dne;
    private volatile boolean field_267d06_Qnq = false;
    private volatile String field_569fcf45_Dne = "";
    private volatile boolean field_2e5f2c_bzF = false;
    private final int field_2092ae_Dne = 666;
    private int field_267cf5_Qnq = 0;
    private final Thread field_7709e06c_Dne;
    private volatile String field_d9a85c6_FWm;
    public static final String[] field_f5e54dca_Dne = new String[]{"\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _"};

    public boolean method_907a9d25_Qnq() {
        return this.field_267d06_Qnq;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_2e5f2c_bzF = true;
        this.field_d9a85c6_FWm = string;
        this.field_f27c122c_Dne.clear();
        this.field_f27c122c_Dne.add(new pee_0(666, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, "Back"));
    }

    public blc(Minecraft minecraft, qVZ qVZ2, jhn_0 jhn_02) {
        this.field_f27c122c_Dne = Collections.synchronizedList(new ArrayList());
        this.field_493682ed_Dne = minecraft;
        this.field_37a7e17_Dne = qVZ2;
        this.field_377957c_Dne = jhn_02;
        jhn_02.method_a03136ee_Dne(this);
        this.field_7709e06c_Dne = new Thread(jhn_02);
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_569fcf45_Dne, this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 50, 0xFFFFFF);
        this.method_32faf66d_Dne(this.field_3791671_Dne, "", this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 - 10, 0xFFFFFF);
        if (!this.field_2e5f2c_bzF) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, field_f5e54dca_Dne[this.field_267cf5_Qnq % field_f5e54dca_Dne.length], this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 + 15, 0x808080);
        }
        if (this.field_2e5f2c_bzF) {
            this.method_32faf66d_Dne(this.field_3791671_Dne, this.field_d9a85c6_FWm, this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 2 + 15, 0xFF0000);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == 666) {
            this.field_267d06_Qnq = true;
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this.field_37a7e17_Dne);
        }
        this.field_377957c_Dne.method_81183ff7_Dne(pee_02);
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_267cf5_Qnq;
        this.field_377957c_Dne.method_7a46289a_Dne();
    }

    public void method_110c4dc3_FWm(String string) {
        this.field_569fcf45_Dne = string;
    }

    public void method_d44b4592_zGp() {
        this.field_7709e06c_Dne.start();
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_377957c_Dne.method_7c6f6039_FWm();
    }

    public Minecraft method_81a5f12e_Dne() {
        return this.field_493682ed_Dne;
    }
}

