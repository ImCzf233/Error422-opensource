package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.opengl.GL11;

public class wiU
extends Sss {
    private TpA field_36dade7_Dne;
    private UwI field_36e3d85_Dne;
    private boolean field_267d06_Qnq;

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2d29f4_aFZ == -2) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        } else if (pee_02.field_2d29f4_aFZ == -1) {
            String string = "MC|Beacon";
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(this.field_36dade7_Dne.method_7a46288d_Dne());
                dataOutputStream.writeInt(this.field_36dade7_Dne.method_7c6f602c_FWm());
                this.field_493682ed_Dne.method_230f9746_Dne().method_5536af4d_FWm(new FaB(string, byteArrayOutputStream.toByteArray()));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        } else if (pee_02 instanceof cES) {
            if (((cES)pee_02).method_7c6f603d_FWm()) {
                return;
            }
            int n = pee_02.field_2d29f4_aFZ;
            int n2 = n & 0xFF;
            int n3 = n >> 8;
            if (n3 < 3) {
                this.field_36dade7_Dne.method_117d19ea_FWm(n2);
            } else {
                this.field_36dade7_Dne.method_143f9e1c_bzF(n2);
            }
            this.field_f27c122c_Dne.clear();
            this.method_7a46289a_Dne();
            this.method_ae128dc7_bzF();
        }
    }

    @Override
    protected void method_2c02b146_Dne(float f, int n, int n2) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/beacon.png");
        int n3 = (this.field_21260d_FWm - this.field_2092ae_Dne) / 2;
        int n4 = (this.field_2e5f1b_bzF - this.field_267cf5_Qnq) / 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_2092ae_Dne, this.field_267cf5_Qnq);
        wiU.field_374e248_Dne.field_2e5f18_bzF = 100.0f;
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, new NMq(dEr.field_86ecf659_Kvh), n3 + 42, n4 + 109);
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, new NMq(dEr.field_141d2e85_div), n3 + 42 + 22, n4 + 109);
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, new NMq(dEr.field_74feeb39_mrb), n3 + 42 + 44, n4 + 109);
        field_374e248_Dne.method_5ae7aca8_FWm(this.field_3791671_Dne, this.field_493682ed_Dne.field_36d36bf_Dne, new NMq(dEr.field_5c4c1af_IjH), n3 + 42 + 66, n4 + 109);
        wiU.field_374e248_Dne.field_2e5f18_bzF = 0.0f;
    }

    @Override
    public void method_7a46289a_Dne() {
        super.method_7a46289a_Dne();
        this.field_36e3d85_Dne = new UwI(this, -1, this.field_2d29f4_aFZ + 164, this.field_388da6_zGp + 107);
        this.field_f27c122c_Dne.add(this.field_36e3d85_Dne);
        this.field_f27c122c_Dne.add(new Uwk(this, -2, this.field_2d29f4_aFZ + 190, this.field_388da6_zGp + 107));
        this.field_267d06_Qnq = true;
        this.field_36e3d85_Dne.field_2092bf_Dne = false;
    }

    @Override
    protected void method_16cca7a_Dne(int n, int n2) {
        Cit.method_7a46289a_Dne();
        this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("tile.beacon.primary"), 62, 10, 0xE0E0E0);
        this.method_32faf66d_Dne(this.field_3791671_Dne, KGL.method_39193c_Dne("tile.beacon.secondary"), 169, 10, 0xE0E0E0);
        for (pee_0 pee_02 : this.field_f27c122c_Dne) {
            if (!pee_02.method_7a46289e_Dne()) continue;
            pee_02.method_1e269659_FWm(n - this.field_2d29f4_aFZ, n2 - this.field_388da6_zGp);
            break;
        }
        Cit.method_ae128dc7_bzF();
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        if (this.field_267d06_Qnq && this.field_36dade7_Dne.method_ae128dba_bzF() >= 0) {
            cES cES2;
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            this.field_267d06_Qnq = false;
            for (n5 = 0; n5 <= 2; ++n5) {
                n4 = TpA.field_2368f0d_Dne[n5].length;
                n3 = n4 * 22 + (n4 - 1) * 2;
                for (n2 = 0; n2 < n4; ++n2) {
                    n = TpA.field_2368f0d_Dne[n5][n2].field_2092ae_Dne;
                    cES2 = new cES(this, n5 << 8 | n, this.field_2d29f4_aFZ + 76 + n2 * 24 - n3 / 2, this.field_388da6_zGp + 22 + n5 * 25, n, n5);
                    this.field_f27c122c_Dne.add(cES2);
                    if (n5 >= this.field_36dade7_Dne.method_ae128dba_bzF()) {
                        cES2.field_2092bf_Dne = false;
                        continue;
                    }
                    if (n != this.field_36dade7_Dne.method_7a46288d_Dne()) continue;
                    cES2.method_ce7f9d7a_Dne(true);
                }
            }
            n5 = 3;
            n4 = TpA.field_2368f0d_Dne[n5].length + 1;
            n3 = n4 * 22 + (n4 - 1) * 2;
            for (n2 = 0; n2 < n4 - 1; ++n2) {
                n = TpA.field_2368f0d_Dne[n5][n2].field_2092ae_Dne;
                cES2 = new cES(this, n5 << 8 | n, this.field_2d29f4_aFZ + 167 + n2 * 24 - n3 / 2, this.field_388da6_zGp + 47, n, n5);
                this.field_f27c122c_Dne.add(cES2);
                if (n5 >= this.field_36dade7_Dne.method_ae128dba_bzF()) {
                    cES2.field_2092bf_Dne = false;
                    continue;
                }
                if (n != this.field_36dade7_Dne.method_7c6f602c_FWm()) continue;
                cES2.method_ce7f9d7a_Dne(true);
            }
            if (this.field_36dade7_Dne.method_7a46288d_Dne() > 0) {
                cES cES3 = new cES(this, n5 << 8 | this.field_36dade7_Dne.method_7a46288d_Dne(), this.field_2d29f4_aFZ + 167 + (n4 - 1) * 24 - n3 / 2, this.field_388da6_zGp + 47, this.field_36dade7_Dne.method_7a46288d_Dne(), n5);
                this.field_f27c122c_Dne.add(cES3);
                if (n5 >= this.field_36dade7_Dne.method_ae128dba_bzF()) {
                    cES3.field_2092bf_Dne = false;
                } else if (this.field_36dade7_Dne.method_7a46288d_Dne() == this.field_36dade7_Dne.method_7c6f602c_FWm()) {
                    cES3.method_ce7f9d7a_Dne(true);
                }
            }
        }
        this.field_36e3d85_Dne.field_2092bf_Dne = this.field_36dade7_Dne.method_9e6e1a08_Dne(0) != null && this.field_36dade7_Dne.method_7a46288d_Dne() > 0;
    }

    public wiU(MOS mOS, TpA tpA) {
        super(new eSp(mOS, tpA));
        this.field_36dade7_Dne = tpA;
        this.field_2092ae_Dne = 230;
        this.field_267cf5_Qnq = 219;
    }
}

