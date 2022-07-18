package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bjV
extends dzN {
    private File field_fd16d933_FWm;
    private File field_d102ba32_Dne;

    @Override
    public void method_8f501fe4_Dne(String string) {
        super.method_8f501fe4_Dne(string);
        this.method_d44b4592_zGp();
    }

    private void method_a98a0660_aFZ() {
        try {
            this.method_4d96e468_FWm().clear();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.field_d102ba32_Dne));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                this.method_4d96e468_FWm().add(string.trim().toLowerCase());
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            this.method_23103f79_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to load operators list: " + exception);
        }
    }

    private void method_b0a28144_div() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.field_fd16d933_FWm, false));
            for (Object obj : this.method_d412ef09_Dne()) {String string = (String) obj;
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            this.method_23103f79_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to save white-list: " + exception);
        }
    }

    private void method_7ad38803_DyG() {
        try {
            this.method_d412ef09_Dne().clear();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.field_fd16d933_FWm));
            String string = "";
            while ((string = bufferedReader.readLine()) != null) {
                this.method_d412ef09_Dne().add(string.trim().toLowerCase());
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            this.method_23103f79_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to load white-list: " + exception);
        }
    }

    public iJs method_23103f79_Dne() {
        return (iJs)super.method_2302cf90_Dne();
    }

    @Override
    public void method_ce7f9d7a_Dne(boolean bl) {
        super.method_ce7f9d7a_Dne(bl);
        this.method_23103f79_Dne().method_5e295ec0_Dne("white-list", bl);
        this.method_23103f79_Dne().method_7a46289a_Dne();
    }

    @Override
    public void method_a9a920ab_Qnq(String string) {
        super.method_a9a920ab_Qnq(string);
        this.method_b0a28144_div();
    }

    @Override
    public void method_47a073d1_bzF(String string) {
        super.method_47a073d1_bzF(string);
        this.method_b0a28144_div();
    }

    private void method_d44b4592_zGp() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.field_d102ba32_Dne, false));
            for (Object obj : this.method_4d96e468_FWm()) {String string = (String) obj;
                printWriter.println(string);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            this.method_23103f79_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to save operators list: " + exception);
        }
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        string = string.trim().toLowerCase();
        return !this.method_7a46289e_Dne() || this.method_110c4dc7_FWm(string) || this.method_d412ef09_Dne().contains(string);
    }

    public bjV(iJs iJs2) {
        super(iJs2);
        this.field_d102ba32_Dne = iJs2.method_fac597a9_Dne("ops.txt");
        this.field_fd16d933_FWm = iJs2.method_fac597a9_Dne("white-list.txt");
        this.field_21260d_FWm = iJs2.method_5ab44f92_Dne("view-distance", 10);
        this.field_2092ae_Dne = iJs2.method_5ab44f92_Dne("max-players", 20);
        this.method_ce7f9d7a_Dne(iJs2.method_5ab48f74_Dne("white-list", false));
        if (!iJs2.method_9feec6c6_Zpi()) {
            this.method_230d8827_Dne().method_ce7f9d7a_Dne(true);
            this.method_f883d846_FWm().method_ce7f9d7a_Dne(true);
        }
        this.method_230d8827_Dne().method_7c6f6039_FWm();
        this.method_230d8827_Dne().method_ae128dc7_bzF();
        this.method_f883d846_FWm().method_7c6f6039_FWm();
        this.method_f883d846_FWm().method_ae128dc7_bzF();
        this.method_a98a0660_aFZ();
        this.method_7ad38803_DyG();
        this.method_d44b4592_zGp();
        if (!this.field_fd16d933_FWm.exists()) {
            this.method_b0a28144_div();
        }
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.method_7ad38803_DyG();
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
        super.method_110c4dc3_FWm(string);
        this.method_d44b4592_zGp();
    }

    @Override
    public jwh_0 method_2302cf90_Dne() {
        return this.method_23103f79_Dne();
    }
}

