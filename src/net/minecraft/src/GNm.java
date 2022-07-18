package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;

public class GNm {
    private final List field_f27c122c_Dne = new ArrayList();
    private final Minecraft field_493682ed_Dne;

    public void method_7c6f6039_FWm() {
        try {
            Object object2;
            mbZ mbZ2 = new mbZ();
            for (Object object : this.field_f27c122c_Dne) {
                mbZ2.method_b4ba5ea1_Dne(((etB)object).method_230886fb_Dne());
            }
            object2 = new WkD();
            ((WkD)object2).method_58996597_Dne("servers", mbZ2);
            VVx.method_99c38e4e_Dne((WkD)object2, new File(this.field_493682ed_Dne.field_d102ba32_Dne, "servers.dat"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void method_a5b17c94_Dne(etB etB2) {
        this.field_f27c122c_Dne.add(etB2);
    }

    public etB method_9e791b47_Dne(int n) {
        return (etB)this.field_f27c122c_Dne.get(n);
    }

    public static void method_7f053055_FWm(etB etB2) {
        GNm gNm = new GNm(Minecraft.method_81a5f12e_Dne());
        gNm.method_7a46289a_Dne();
        for (int i = 0; i < gNm.method_7a46288d_Dne(); ++i) {
            etB etB3 = gNm.method_9e791b47_Dne(i);
            if (!etB3.field_569fcf45_Dne.equals(etB2.field_569fcf45_Dne) || !etB3.field_d9a85c6_FWm.equals(etB2.field_d9a85c6_FWm)) continue;
            gNm.method_978a18e5_Dne(i, etB2);
            break;
        }
        gNm.method_7c6f6039_FWm();
    }

    public void method_ce7f5da9_Dne(int n) {
        this.field_f27c122c_Dne.remove(n);
    }

    public void method_978a18e5_Dne(int n, etB etB2) {
        this.field_f27c122c_Dne.set(n, etB2);
    }

    public void method_7a46289a_Dne() {
        try {
            WkD wkD = VVx.method_cf3ca772_Dne(new File(this.field_493682ed_Dne.field_d102ba32_Dne, "servers.dat"));
            mbZ mbZ2 = wkD.method_285baa50_Dne("servers");
            this.field_f27c122c_Dne.clear();
            for (int i = 0; i < mbZ2.method_7a46288d_Dne(); ++i) {
                this.field_f27c122c_Dne.add(etB.method_7db20fb5_Dne((WkD)mbZ2.method_77d0d055_FWm(i)));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public GNm(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
        this.method_7a46289a_Dne();
    }

    public void method_16cca7a_Dne(int n, int n2) {
        etB etB2 = this.method_9e791b47_Dne(n);
        this.field_f27c122c_Dne.set(n, this.method_9e791b47_Dne(n2));
        this.field_f27c122c_Dne.set(n2, etB2);
        this.method_7c6f6039_FWm();
    }

    public int method_7a46288d_Dne() {
        return this.field_f27c122c_Dne.size();
    }
}

