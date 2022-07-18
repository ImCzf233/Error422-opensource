package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.opengl.GL11;

public class VFk
extends Sss {
    private int field_20b857_DyG = 0;
    private LdY field_369e0cb_Dne;
    private YzO field_3701afe_Dne;
    private LdY field_2023acaa_FWm;
    private String field_569fcf45_Dne;

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        int n3;
        Vnr vnr;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/trading.png");
        int n4 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n5 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n4, n5, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        ybO ybO2 = this.field_3701afe_Dne.method_53f50aae_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
        if (ybO2 != null && !ybO2.isEmpty() && (vnr = (Vnr)ybO2.get(n3 = this.field_20b857_DyG)).method_7c6f603d_FWm()) {
            this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/trading.png");
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(2896);
            this.method_17d7ea99_FWm(this.field_2d29f4_aFZ + 83, this.field_388da6_zGp + 21, 212, 0, 28, 21);
            this.method_17d7ea99_FWm(this.field_2d29f4_aFZ + 83, this.field_388da6_zGp + 51, 212, 0, 28, 21);
        }
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        boolean bl = false;
        if (pee_02 == this.field_369e0cb_Dne) {
            ++this.field_20b857_DyG;
            bl = true;
        } else if (pee_02 == this.field_2023acaa_FWm) {
            --this.field_20b857_DyG;
            bl = true;
        }
        if (bl) {
            ((ema)this.field_36bb35e_Dne).method_ce7f5da9_Dne(this.field_20b857_DyG);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(this.field_20b857_DyG);
                this.field_493682ed_Dne.method_230f9746_Dne().method_5536af4d_FWm(new FaB("MC|TrSel", byteArrayOutputStream.toByteArray()));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ybO ybO2 = this.field_3701afe_Dne.method_53f50aae_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
        if (ybO2 != null) {
            this.field_369e0cb_Dne.field_2092bf_Dne = this.field_20b857_DyG < ybO2.size() - 1;
            this.field_2023acaa_FWm.field_2092bf_Dne = this.field_20b857_DyG > 0;
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        super.method_2c2cec86_Dne(n, n2, f);
        ybO ybO2 = this.field_3701afe_Dne.method_53f50aae_Dne(this.field_493682ed_Dne.field_369f6b6_Dne);
        if (ybO2 != null && !ybO2.isEmpty()) {
            int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
            int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
            int n5 = this.field_20b857_DyG;
            Vnr vnr = (Vnr)ybO2.get(n5);
            GL11.glPushMatrix();
            NMq nMq = vnr.method_23040479_Dne();
            NMq nMq2 = vnr.method_f87a5498_FWm();
            NMq nMq3 = vnr.method_22900b26_bzF();
            Cit.method_ae128dc7_bzF();
            GL11.glDisable(2896);
            GL11.glEnable(32826);
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            VFk.field_374e248_Dne.field_2e5f18_bzF = 100.0f;
            field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n3 + 36, n4 + 24);
            field_374e248_Dne.method_f14f8cda_bzF(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq, n3 + 36, n4 + 24);
            if (nMq2 != null) {
                field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq2, n3 + 62, n4 + 24);
                field_374e248_Dne.method_f14f8cda_bzF(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq2, n3 + 62, n4 + 24);
            }
            field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq3, n3 + 120, n4 + 24);
            field_374e248_Dne.method_f14f8cda_bzF(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, nMq3, n3 + 120, n4 + 24);
            VFk.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
            GL11.glDisable(2896);
            if (this.method_c6b5263e_Dne(36, 24, 16, 16, n, n2)) {
                this.method_eb38be35_Dne(nMq, n, n2);
            } else if (nMq2 != null && this.method_c6b5263e_Dne(62, 24, 16, 16, n, n2)) {
                this.method_eb38be35_Dne(nMq2, n, n2);
            } else if (this.method_c6b5263e_Dne(120, 24, 16, 16, n, n2)) {
                this.method_eb38be35_Dne(nMq3, n, n2);
            }
            GL11.glPopMatrix();
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            Cit.method_7c6f6039_FWm();
        }
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        this.field_3791671_Dne.method_e88b55f3_FWm(this.field_569fcf45_Dne, this.field_2092ae_Dne / 2 - this.field_3791671_Dne.method_8f501fd7_Dne(this.field_569fcf45_Dne) / 2, 6, 0x404040);
        this.field_3791671_Dne.method_e88b55f3_FWm(KGL.method_39193c_Dne("container.inventory"), 8, this.field_267cf5_Qnq - 96 + 2, 0x404040);
    }

    public YzO method_2309a95d_Dne() {
        return this.field_3701afe_Dne;
    }

    public VFk(MOS mOS, YzO yzO, Qnq qnq, String string) {
        super(new ema(mOS, yzO, qnq));
        this.field_3701afe_Dne = yzO;
        this.field_569fcf45_Dne = string != null && string.length() >= 1 ? string : KGL.method_39193c_Dne("entity.Villager.name");
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        int n = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n2 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.field_369e0cb_Dne = new LdY(1, n + 120 + 27, n2 + 24 - 1, true);
        this.field_f27c122c_Dne.add(this.field_369e0cb_Dne);
        this.field_2023acaa_FWm = new LdY(2, n + 36 - 19, n2 + 24 - 1, false);
        this.field_f27c122c_Dne.add(this.field_2023acaa_FWm);
        this.field_369e0cb_Dne.field_2092bf_Dne = false;
        this.field_2023acaa_FWm.field_2092bf_Dne = false;
    }
}

