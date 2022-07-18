package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;

public class Nvw
extends qVZ {
    private pee_0 field_2025835b_FWm;
    private mHN field_3787699_Dne;
    private final FgE field_3672f68_Dne;
    private pee_0 field_36bb77c_Dne;

    @Override
    protected void method_81183ff7_Dne(pee_0 pee_02) {
        if (pee_02.field_2092bf_Dne) {
            if (pee_02.field_2d29f4_aFZ == 1) {
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            } else if (pee_02.field_2d29f4_aFZ == 0) {
                String string = "MC|AdvCdm";
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeInt(this.field_3672f68_Dne.field_267cf5_Qnq);
                    dataOutputStream.writeInt(this.field_3672f68_Dne.field_2d29f4_aFZ);
                    dataOutputStream.writeInt(this.field_3672f68_Dne.field_388da6_zGp);
                    NER.method_e1033a4c_Dne(this.field_3787699_Dne.method_eecad346_Dne(), dataOutputStream);
                    this.field_493682ed_Dne.method_230f9746_Dne().method_5536af4d_FWm(new FaB(string, byteArrayOutputStream.toByteArray()));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            }
        }
    }

    @Override
    public void method_7a46289a_Dne() {
        irb irb2 = irb.method_2310d392_Dne();
        Keyboard.enableRepeatEvents(true);
        this.field_f27c122c_Dne.clear();
        this.field_36bb77c_Dne = new pee_0(0, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 96 + 12, irb2.method_39193c_Dne("gui.done"));
        this.field_f27c122c_Dne.add(this.field_36bb77c_Dne);
        this.field_2025835b_FWm = new pee_0(1, this.field_21260d_FWm / 2 - 100, this.field_2e5f1b_bzF / 4 + 120 + 12, irb2.method_39193c_Dne("gui.cancel"));
        this.field_f27c122c_Dne.add(this.field_2025835b_FWm);
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, this.field_21260d_FWm / 2 - 150, 60, 300, 20);
        this.field_3787699_Dne.method_87b738a3_aFZ(Short.MAX_VALUE);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_3672f68_Dne.method_d1f1ed87_FWm());
        this.field_36bb77c_Dne.field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().trim().length() > 0;
    }

    public Nvw(FgE fgE) {
        this.field_3672f68_Dne = fgE;
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        super.method_2c2cf7c9_Dne(n, n2, n3);
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        irb irb2 = irb.method_2310d392_Dne();
        this.method_a98a0660_aFZ();
        this.method_32faf66d_Dne(this.field_3791671_Dne, irb2.method_39193c_Dne("advMode.setCommand"), this.field_21260d_FWm / 2, this.field_2e5f1b_bzF / 4 - 60 + 20, 0xFFFFFF);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("advMode.command"), this.field_21260d_FWm / 2 - 150, 47, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("advMode.nearestPlayer"), this.field_21260d_FWm / 2 - 150, 97, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("advMode.randomPlayer"), this.field_21260d_FWm / 2 - 150, 108, 0xA0A0A0);
        this.method_67d6d54c_FWm(this.field_3791671_Dne, irb2.method_39193c_Dne("advMode.allPlayers"), this.field_21260d_FWm / 2 - 150, 119, 0xA0A0A0);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_3787699_Dne.method_16a1044_Dne(c, n);
        boolean bl = this.field_36bb77c_Dne.field_2092bf_Dne = this.field_3787699_Dne.method_eecad346_Dne().trim().length() > 0;
        if (n != 28 && c != '\r') {
            if (n == 1) {
                this.method_81183ff7_Dne(this.field_2025835b_FWm);
            }
        } else {
            this.method_81183ff7_Dne(this.field_36bb77c_Dne);
        }
    }
}

