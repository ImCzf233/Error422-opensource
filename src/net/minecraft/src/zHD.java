package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import net.minecraft.client.Minecraft;

public class zHD
extends jwh_0 {
    private boolean field_21261e_FWm;
    private liB field_3787ca7_Dne;
    private final mrb field_37916af_Dne;
    private final Minecraft field_493682ed_Dne;
    private final dLs field_37472c1_Dne = new WQU("Minecraft-Server", " [SERVER]", new File(Minecraft.method_9189e6b3_Dne(), "output-server.log").getAbsolutePath());
    private TWE field_36d508a_Dne;
    private boolean field_2092bf_Dne = false;

    @Override
    public boolean method_7ad38807_DyG() {
        return true;
    }

    @Override
    public void method_5e5571e_h_() {
        boolean bl = this.field_2092bf_Dne;
        this.field_2092bf_Dne = this.field_3787ca7_Dne.method_7a46289e_Dne();
        if (!bl && this.field_2092bf_Dne) {
            this.field_37472c1_Dne.method_8f501fe4_Dne("Saving and pausing game...");
            this.method_230ea953_Dne().method_7c6f6039_FWm();
            this.method_ce7f9d7a_Dne(false);
        }
        if (!this.field_2092bf_Dne) {
            super.method_5e5571e_h_();
        }
    }

    public zHD(Minecraft minecraft, String string, String string2, mrb mrb2) {
        super(new File(Minecraft.method_9189e6b3_Dne(), "saves"));
        this.method_8b6b620e_div(minecraft.field_37d3e5f_Dne.field_569fcf45_Dne);
        this.method_156b6138_IjH(string);
        this.method_80c536c2_mrb(string2);
        this.method_117d59bb_FWm(minecraft.method_7a46289e_Dne());
        this.method_143fdded_bzF(mrb2.method_7a46289e_Dne());
        this.method_143f9e1c_bzF(256);
        this.method_a456a56f_Dne(new Rfd(this));
        this.field_493682ed_Dne = minecraft;
        this.field_37916af_Dne = mrb2;
        try {
            this.field_3787ca7_Dne = new liB(this);
        }
        catch (IOException iOException) {
            throw new Error();
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        if (this.field_36d508a_Dne != null) {
            this.field_36d508a_Dne.interrupt();
            this.field_36d508a_Dne = null;
        }
    }

    @Override
    protected File method_9189e6b3_Dne() {
        return this.field_493682ed_Dne.field_d102ba32_Dne;
    }

    public boolean method_59ee19d_c_() {
        return this.field_21261e_FWm;
    }

    @Override
    public String method_9f2c7597_Dne(XHL xHL, boolean bl) {
        try {
            String string = this.field_3787ca7_Dne.method_eecad346_Dne();
            this.method_230e0120_Dne().method_8f501fe4_Dne("Started on " + string);
            this.field_21261e_FWm = true;
            this.field_36d508a_Dne = new TWE(this.method_a8d4a4de_kGO(), string);
            this.field_36d508a_Dne.start();
            this.method_230ea953_Dne().method_8d1afe0b_Dne(xHL);
            this.method_230ea953_Dne().method_117d59bb_FWm(bl);
            return string;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public boolean method_a98a0664_aFZ() {
        return Minecraft.method_81a5f12e_Dne().method_a98a0664_aFZ();
    }

    public liB method_23120b06_Dne() {
        return this.field_3787ca7_Dne;
    }

    @Override
    public void method_8d1afe0b_Dne(XHL xHL) {
        this.method_230ea953_Dne().method_8d1afe0b_Dne(xHL);
    }

    @Override
    public int method_7a46288d_Dne() {
        return this.field_493682ed_Dne.field_3758af7_Dne.field_20b857_DyG;
    }

    @Override
    public dLs method_230e0120_Dne() {
        return this.field_37472c1_Dne;
    }

    @Override
    public boolean method_ae128dcb_bzF() {
        return this.field_37916af_Dne.method_7c6f603d_FWm();
    }

    @Override
    public McM method_f78f98ea_Dne(McM mcM) {
        mcM = super.method_f78f98ea_Dne(mcM);
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Type", new xZO(this));
        mcM.method_230483dd_Dne().method_2aeeb7ad_Dne("Is Modded", new Aha(this));
        return mcM;
    }

    @Override
    public void method_a5de08f2_Dne(evf evf2) {
        super.method_a5de08f2_Dne(evf2);
        evf2.method_5e295ec0_Dne("snooper_partner", this.field_493682ed_Dne.method_230f1196_Dne().method_eecad346_Dne());
    }

    @Override
    protected void method_7bd29e30_Dne(McM mcM) {
        this.field_493682ed_Dne.method_552651f1_FWm(mcM);
    }

    @Override
    public boolean method_907a9d25_Qnq() {
        return false;
    }

    @Override
    public boolean method_7c6f603d_FWm() {
        return false;
    }

    @Override
    public void method_7c6f6039_FWm() {
        super.method_7c6f6039_FWm();
        if (this.field_36d508a_Dne != null) {
            this.field_36d508a_Dne.interrupt();
            this.field_36d508a_Dne = null;
        }
    }

    @Override
    public NuQ method_230496c1_Dne() {
        return this.method_23120b06_Dne();
    }

    @Override
    protected void method_6d325d82_Dne(String string, String string2, long l, kGO kGO2, String string3) {
        this.method_bbfe582a_aFZ(string);
        this.field_836263a8_Dne = new RAN[3];
        this.field_7a46ee0f_Dne = new long[this.field_836263a8_Dne.length][100];
        iDE iDE2 = this.method_23096ac2_Dne().method_c5a32f37_Dne(string, true);
        for (int i = 0; i < this.field_836263a8_Dne.length; ++i) {
            int n = 0;
            if (i == 1) {
                n = -1;
            }
            if (i == 2) {
                n = 1;
            }
            this.field_836263a8_Dne[i] = i == 0 ? (this.method_baa39406_kGO() ? new Kqb(this, iDE2, string2, n, this.field_365731d_Dne, this.method_230e0120_Dne()) : new RAN(this, iDE2, string2, n, this.field_37916af_Dne, this.field_365731d_Dne, this.method_230e0120_Dne())) : new jgd(this, iDE2, string2, n, this.field_37916af_Dne, this.field_836263a8_Dne[0], this.field_365731d_Dne, this.method_230e0120_Dne());
            this.field_836263a8_Dne[i].method_755f9a60_Dne(new vSE(this, this.field_836263a8_Dne[i]));
            this.method_230ea953_Dne().method_c229f287_Dne(this.field_836263a8_Dne);
        }
        this.method_117d19ea_FWm(this.method_7a46288d_Dne());
        this.method_7ad38803_DyG();
    }

    @Override
    public XHL method_230878ef_Dne() {
        return this.field_37916af_Dne.method_230878ef_Dne();
    }

    @Override
    protected boolean method_7a46289e_Dne() {
        this.field_37472c1_Dne.method_8f501fe4_Dne("Starting integrated minecraft server version UNKNOWN");
        this.method_7ed9b9d3_Qnq(false);
        this.method_87b77874_aFZ(true);
        this.method_b51e1f82_zGp(true);
        this.method_df9e2b31_DyG(true);
        this.method_63ae5a10_div(true);
        this.field_37472c1_Dne.method_8f501fe4_Dne("Generating keypair");
        this.method_a7eb5b90_Dne(Mjb.method_7af00974_Dne());
        this.method_6d325d82_Dne(this.method_c6f17a40_aFZ(), this.method_87e11f27_XHL(), this.field_37916af_Dne.method_7a46288e_Dne(), this.field_37916af_Dne.method_23111898_Dne(), this.field_37916af_Dne.method_eecad346_Dne());
        this.method_e5ec840c_Zpi(this.method_c50868a8_mrb() + " - " + this.field_836263a8_Dne[0].method_231798c9_Dne().method_eecad346_Dne());
        return true;
    }
}

