package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class qTt
extends qVZ {
    private pee_0 field_2025835b_FWm;
    private pee_0 field_36bb77c_Dne;
    private boolean field_2d2a05_aFZ;
    private final FiG field_3673728_Dne;
    private int field_267cf5_Qnq = 192;
    private bod field_202dd774_FWm;
    private boolean field_267d06_Qnq;
    private bod field_3740b95_Dne;
    private int field_2092ae_Dne;
    private final boolean field_2e5f2c_bzF;
    private String field_569fcf45_Dne = "";
    private int field_2d29f4_aFZ = 192;
    private int field_20b857_DyG;
    private int field_388da6_zGp = 1;
    private pee_0 field_5e552643_Qnq;
    private pee_0 field_75b38569_bzF;
    private mbZ field_378d9a7_Dne;
    private final NMq field_36a761a_Dne;

    private void method_1e23dc1f_FWm(char c, int n) {
        switch (c) {
            case '\u0016': {
                this.method_110c4dc3_FWm(qVZ.method_d1f1ed87_FWm());
                return;
            }
        }
        switch (n) {
            case 14: {
                String string = this.method_eecad346_Dne();
                if (string.length() > 0) {
                    this.method_8f501fe4_Dne(string.substring(0, string.length() - 1));
                }
                return;
            }
            case 28: {
                this.method_110c4dc3_FWm("\n");
                return;
            }
        }
        if (BAQ.method_ce7f4727_Dne(c)) {
            this.method_110c4dc3_FWm(Character.toString(c));
        }
    }

    public qTt(FiG fiG, NMq nMq, boolean bl) {
        this.field_3673728_Dne = fiG;
        this.field_36a761a_Dne = nMq;
        this.field_2e5f2c_bzF = bl;
        if (nMq.method_a98a0664_aFZ()) {
            WkD wkD = nMq.method_230886fb_Dne();
            this.field_378d9a7_Dne = wkD.method_285baa50_Dne("pages");
            if (this.field_378d9a7_Dne != null) {
                this.field_378d9a7_Dne = (mbZ)this.field_378d9a7_Dne.method_23130705_Dne();
                this.field_388da6_zGp = this.field_378d9a7_Dne.method_7a46288d_Dne();
                if (this.field_388da6_zGp < 1) {
                    this.field_388da6_zGp = 1;
                }
            }
        }
        if (this.field_378d9a7_Dne == null && bl) {
            this.field_378d9a7_Dne = new mbZ("pages");
            this.field_378d9a7_Dne.method_b4ba5ea1_Dne(new QNx("1", ""));
            this.field_388da6_zGp = 1;
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        super.method_16a1040_Dne(c, n);
        if (this.field_2e5f2c_bzF) {
            if (this.field_2d2a05_aFZ) {
                this.method_73b1de2d_bzF(c, n);
            } else {
                this.method_1e23dc1f_FWm(c, n);
            }
        }
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/gui/book.png");
        int n3 = (this.field_21260d_FWm - this.field_267cf5_Qnq) / 2;
        int n4 = 2;
        this.method_17d7ea99_FWm(n3, n4, 0, 0, this.field_267cf5_Qnq, this.field_2d29f4_aFZ);
        if (this.field_2d2a05_aFZ) {
            String string = this.field_569fcf45_Dne;
            if (this.field_2e5f2c_bzF) {
                string = this.field_2092ae_Dne / 6 % 2 == 0 ? string + "" + (Object)((Object)Dne.field_36664d1_Dne) + "_" : string + "" + (Object)((Object)Dne.field_140f3afb_div) + "_";
            }
            String string2 = KGL.method_39193c_Dne("book.editTitle");
            int n5 = this.field_3791671_Dne.method_8f501fd7_Dne(string2);
            this.field_3791671_Dne.method_e88b55f3_FWm(string2, n3 + 36 + (116 - n5) / 2, n4 + 16 + 16, 0);
            int n6 = this.field_3791671_Dne.method_8f501fd7_Dne(string);
            this.field_3791671_Dne.method_e88b55f3_FWm(string, n3 + 36 + (116 - n6) / 2, n4 + 48, 0);
            String string3 = String.format(KGL.method_39193c_Dne("book.byAuthor"), this.field_3673728_Dne.field_bc57ecbf_aFZ);
            int n7 = this.field_3791671_Dne.method_8f501fd7_Dne(string3);
            this.field_3791671_Dne.method_e88b55f3_FWm((Object)((Object)Dne.field_5b6ce25_IjH) + string3, n3 + 36 + (116 - n7) / 2, n4 + 48 + 10, 0);
            String string4 = KGL.method_39193c_Dne("book.finalizeWarning");
            this.field_3791671_Dne.method_5ebbb6a4_Dne(string4, n3 + 36, n4 + 80, 116, 0);
        } else {
            String string = String.format(KGL.method_39193c_Dne("book.pageIndicator"), this.field_20b857_DyG + 1, this.field_388da6_zGp);
            String string5 = "";
            if (this.field_378d9a7_Dne != null && this.field_20b857_DyG >= 0 && this.field_20b857_DyG < this.field_378d9a7_Dne.method_7a46288d_Dne()) {
                QNx qNx = (QNx)this.field_378d9a7_Dne.method_77d0d055_FWm(this.field_20b857_DyG);
                string5 = qNx.toString();
            }
            if (this.field_2e5f2c_bzF) {
                string5 = this.field_3791671_Dne.method_7c6f603d_FWm() ? string5 + "_" : (this.field_2092ae_Dne / 6 % 2 == 0 ? string5 + "" + (Object)((Object)Dne.field_36664d1_Dne) + "_" : string5 + "" + (Object)((Object)Dne.field_140f3afb_div) + "_");
            }
            int n8 = this.field_3791671_Dne.method_8f501fd7_Dne(string);
            this.field_3791671_Dne.method_e88b55f3_FWm(string, n3 - n8 + this.field_267cf5_Qnq - 44, n4 + 16, 0);
            this.field_3791671_Dne.method_5ebbb6a4_Dne(string5, n3 + 36, n4 + 16 + 16, 116, 0);
        }
        super.method_2c2cec86_Dne(n, n2, f);
    }

    private void method_8288d6ee_IjH() {
        if (this.field_378d9a7_Dne != null && this.field_378d9a7_Dne.method_7a46288d_Dne() < 50) {
            this.field_378d9a7_Dne.method_b4ba5ea1_Dne(new QNx("" + (this.field_388da6_zGp + 1), ""));
            ++this.field_388da6_zGp;
            this.field_267d06_Qnq = true;
        }
    }

    private void method_110c4dc3_FWm(String string) {
        String string2 = this.method_eecad346_Dne();
        String string3 = string2 + string;
        int n = this.field_3791671_Dne.method_5ab44f92_Dne(string3 + "" + (Object)((Object)Dne.field_36664d1_Dne) + "_", 118);
        if (n <= 118 && string3.length() < 256) {
            this.method_8f501fe4_Dne(string3);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    private void method_ce7f9d7a_Dne(boolean bl) {
        if (this.field_2e5f2c_bzF && this.field_267d06_Qnq && this.field_378d9a7_Dne != null) {
            Object object;
            while (this.field_378d9a7_Dne.method_7a46288d_Dne() > 1) {
                object = (QNx)this.field_378d9a7_Dne.method_77d0d055_FWm(this.field_378d9a7_Dne.method_7a46288d_Dne() - 1);
                if (((QNx)object).field_569fcf45_Dne != null && ((QNx)object).field_569fcf45_Dne.length() != 0) break;
                this.field_378d9a7_Dne.method_9e7d1c94_Dne(this.field_378d9a7_Dne.method_7a46288d_Dne() - 1);
            }
            if (this.field_36a761a_Dne.method_a98a0664_aFZ()) {
                object = this.field_36a761a_Dne.method_230886fb_Dne();
                ((WkD)object).method_58996597_Dne("pages", this.field_378d9a7_Dne);
            } else {
                this.field_36a761a_Dne.method_58996597_Dne("pages", this.field_378d9a7_Dne);
            }
            object = "MC|BEdit";
            if (bl) {
                object = "MC|BSign";
                this.field_36a761a_Dne.method_58996597_Dne("author", new QNx("author", this.field_3673728_Dne.field_bc57ecbf_aFZ));
                this.field_36a761a_Dne.method_58996597_Dne("title", new QNx("title", this.field_569fcf45_Dne.trim()));
                this.field_36a761a_Dne.field_2e5f1b_bzF = dEr.field_68a14cb4_CLK.field_267cf5_Qnq;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                NER.method_dcc5e3d_Dne(this.field_36a761a_Dne, dataOutputStream);
                this.field_493682ed_Dne.method_230f9746_Dne().method_5536af4d_FWm(new FaB((String)object, byteArrayOutputStream.toByteArray()));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void method_8f501fe4_Dne(String string) {
        if (this.field_378d9a7_Dne != null && this.field_20b857_DyG >= 0 && this.field_20b857_DyG < this.field_378d9a7_Dne.method_7a46288d_Dne()) {
            QNx qNx = (QNx)this.field_378d9a7_Dne.method_77d0d055_FWm(this.field_20b857_DyG);
            qNx.field_569fcf45_Dne = string;
            this.field_267d06_Qnq = true;
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        this.field_f27c122c_Dne.clear();
        Keyboard.enableRepeatEvents(true);
        if (this.field_2e5f2c_bzF) {
            this.field_2025835b_FWm = new pee_0(3, this.field_21260d_FWm / 2 - 100, 4 + this.field_2d29f4_aFZ, 98, 20, KGL.method_39193c_Dne("book.signButton"));
            this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
            this.field_36bb77c_Dne = new pee_0(0, this.field_21260d_FWm / 2 + 2, 4 + this.field_2d29f4_aFZ, 98, 20, KGL.method_39193c_Dne("gui.done"));
            this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
            this.field_75b38569_bzF = new pee_0(5, this.field_21260d_FWm / 2 - 100, 4 + this.field_2d29f4_aFZ, 98, 20, KGL.method_39193c_Dne("book.finalizeButton"));
            this.field_f27c122c_Dne.add(this.field_75b38569_bzF);
            this.field_5e552643_Qnq = new pee_0(4, this.field_21260d_FWm / 2 + 2, 4 + this.field_2d29f4_aFZ, 98, 20, KGL.method_39193c_Dne("gui.cancel"));
            this.field_f27c122c_Dne.add(this.field_5e552643_Qnq);
        } else {
            this.field_36bb77c_Dne = new pee_0(0, this.field_21260d_FWm / 2 - 100, 4 + this.field_2d29f4_aFZ, 200, 20, KGL.method_39193c_Dne("gui.done"));
            this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        }
        int n = (this.field_21260d_FWm - this.field_267cf5_Qnq) / 2;
        int n2 = 2;
        this.field_3740b95_Dne = new bod(1, n + 120, n2 + 154, true);
        this.field_f27c122c_Dne.add(this.field_3740b95_Dne);
        this.field_202dd774_FWm = new bod(2, n + 38, n2 + 154, false);
        this.field_f27c122c_Dne.add(this.field_202dd774_FWm);
        this.method_d44b4592_zGp();
    }

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 0) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                this.method_ce7f9d7a_Dne(false);
            } else if (pee_02.field_2d29f4_aFZ == 3 && this.field_2e5f2c_bzF) {
                this.field_2d2a05_aFZ = true;
            } else if (pee_02.field_2d29f4_aFZ == 1) {
                if (this.field_20b857_DyG < this.field_388da6_zGp - 1) {
                    ++this.field_20b857_DyG;
                } else if (this.field_2e5f2c_bzF) {
                    this.method_8288d6ee_IjH();
                    if (this.field_20b857_DyG < this.field_388da6_zGp - 1) {
                        ++this.field_20b857_DyG;
                    }
                }
            } else if (pee_02.field_2d29f4_aFZ == 2) {
                if (this.field_20b857_DyG > 0) {
                    --this.field_20b857_DyG;
                }
            } else if (pee_02.field_2d29f4_aFZ == 5 && this.field_2d2a05_aFZ) {
                this.method_ce7f9d7a_Dne(true);
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            } else if (pee_02.field_2d29f4_aFZ == 4 && this.field_2d2a05_aFZ) {
                this.field_2d2a05_aFZ = false;
            }
            this.method_d44b4592_zGp();
        }
    }

    private String method_eecad346_Dne() {
        if (this.field_378d9a7_Dne != null && this.field_20b857_DyG >= 0 && this.field_20b857_DyG < this.field_378d9a7_Dne.method_7a46288d_Dne()) {
            QNx qNx = (QNx)this.field_378d9a7_Dne.method_77d0d055_FWm(this.field_20b857_DyG);
            return qNx.toString();
        }
        return "";
    }

    private void method_d44b4592_zGp() {
        this.field_3740b95_Dne.field_21261e_FWm = !this.field_2d2a05_aFZ && (this.field_20b857_DyG < this.field_388da6_zGp - 1 || this.field_2e5f2c_bzF);
        this.field_202dd774_FWm.field_21261e_FWm = !this.field_2d2a05_aFZ && this.field_20b857_DyG > 0;
        boolean bl = this.field_36bb77c_Dne.field_21261e_FWm = !this.field_2e5f2c_bzF || !this.field_2d2a05_aFZ;
        if (this.field_2e5f2c_bzF) {
            this.field_2025835b_FWm.field_21261e_FWm = !this.field_2d2a05_aFZ;
            this.field_5e552643_Qnq.field_21261e_FWm = this.field_2d2a05_aFZ;
            this.field_75b38569_bzF.field_21261e_FWm = this.field_2d2a05_aFZ;
            this.field_75b38569_bzF.field_2092bf_Dne = this.field_569fcf45_Dne.trim().length() > 0;
        }
    }

    private void method_73b1de2d_bzF(char c, int n) {
        switch (n) {
            case 14: {
                if (this.field_569fcf45_Dne.length() > 0) {
                    this.field_569fcf45_Dne = this.field_569fcf45_Dne.substring(0, this.field_569fcf45_Dne.length() - 1);
                    this.method_d44b4592_zGp();
                }
                return;
            }
            case 28: {
                if (this.field_569fcf45_Dne.length() > 0) {
                    this.method_ce7f9d7a_Dne(true);
                    this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
                }
                return;
            }
        }
        if (this.field_569fcf45_Dne.length() < 16 && BAQ.method_ce7f4727_Dne(c)) {
            this.field_569fcf45_Dne = this.field_569fcf45_Dne + Character.toString(c);
            this.method_d44b4592_zGp();
            this.field_267d06_Qnq = true;
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        super.method_ae128dc7_bzF();
        ++this.field_2092ae_Dne;
    }
}

