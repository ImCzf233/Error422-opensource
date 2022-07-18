package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class lJS
extends ocu {
    private Minecraft field_493682ed_Dne;
    private List field_f27c122c_Dne = new ArrayList();

    public void method_ce7f5266_Dne(float f) {
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/particles.png");
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            RDG rDG = (RDG)this.field_f27c122c_Dne.get(i);
            int n = (int)(rDG.field_2e5f16_bzF + (rDG.field_2092a9_Dne - rDG.field_2e5f16_bzF) * (double)f - 4.0);
            int n2 = (int)(rDG.field_267cf0_Qnq + (rDG.field_212608_FWm - rDG.field_267cf0_Qnq) * (double)f - 4.0);
            float f2 = (float)(rDG.field_34225f_ooe + (rDG.field_291868_XHL - rDG.field_34225f_ooe) * (double)f);
            float f3 = (float)(rDG.field_2a9ad1_Zpi + (rDG.field_2f0dd3_div - rDG.field_2a9ad1_Zpi) * (double)f);
            float f4 = (float)(rDG.field_31b811_kGO + (rDG.field_22c5fd_IjH - rDG.field_31b811_kGO) * (double)f);
            float f5 = (float)(rDG.field_36b0a4_udO + (rDG.field_334487_mrb - rDG.field_36b0a4_udO) * (double)f);
            GL11.glColor4f(f3, f4, f5, f2);
            this.method_17d7ea99_FWm(n, n2, 40, 0, 8, 8);
        }
    }

    public lJS(Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
    }

    public void method_7a46289a_Dne() {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            RDG rDG = (RDG)this.field_f27c122c_Dne.get(i);
            rDG.method_7a46289a_Dne();
            rDG.method_af5b4812_Dne(this);
            if (!rDG.field_2092bf_Dne) continue;
            this.field_f27c122c_Dne.remove(i--);
        }
    }
}

