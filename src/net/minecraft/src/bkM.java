package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class bkM {
    private boolean field_2092bf_Dne = true;
    private final zEq field_37e5866_Dne = new zEq();
    private final File field_d102ba32_Dne;

    public Map method_d410254f_Dne() {
        this.method_7a46289a_Dne();
        return this.field_37e5866_Dne;
    }

    public void method_ce7f9d7a_Dne(boolean bl) {
        this.field_2092bf_Dne = bl;
    }

    public void method_a348a101_Dne(eHI eHI2) {
        this.field_37e5866_Dne.method_eddf1072_Dne(eHI2.method_eecad346_Dne(), eHI2);
        this.method_ae128dc7_bzF();
    }

    public bkM(File file) {
        this.field_d102ba32_Dne = file;
    }

    public boolean method_8f501fe8_Dne(String string) {
        if (!this.method_7a46289e_Dne()) {
            return false;
        }
        this.method_7a46289a_Dne();
        return this.field_37e5866_Dne.containsKey(string);
    }

    public void method_7a46289a_Dne() {
        Iterator iterator = this.field_37e5866_Dne.values().iterator();
        while (iterator.hasNext()) {
            eHI eHI2 = (eHI)iterator.next();
            if (!eHI2.method_7a46289e_Dne()) continue;
            iterator.remove();
        }
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092bf_Dne;
    }

    public void method_8f501fe4_Dne(String string) {
        this.field_37e5866_Dne.remove(string);
        this.method_ae128dc7_bzF();
    }

    public void method_7c6f6039_FWm() {
        if (this.field_d102ba32_Dne.isFile()) {
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(this.field_d102ba32_Dne));
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new Error();
            }
            try {
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    eHI eHI2;
                    if (string.startsWith("#") || (eHI2 = eHI.method_2857a3af_Dne(string)) == null) continue;
                    this.field_37e5866_Dne.method_eddf1072_Dne(eHI2.method_eecad346_Dne(), eHI2);
                }
            }
            catch (IOException iOException) {
                jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_13eaee12_FWm("Could not load ban list", iOException);
            }
        }
    }

    public void method_117d59bb_FWm(boolean bl) {
        this.method_7a46289a_Dne();
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.field_d102ba32_Dne, false));
            if (bl) {
                printWriter.println("# Updated " + new SimpleDateFormat().format(new Date()) + " by Minecraft UNKNOWN");
                printWriter.println("# victim name | ban date | banned by | banned until | reason");
                printWriter.println();
            }
            for (Object obj : this.field_37e5866_Dne.values()) {
                printWriter.println(((eHI) obj).method_4a7b1d9f_Qnq());
            }
            printWriter.close();
        }
        catch (IOException iOException) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_13eaee12_FWm("Could not save ban list", iOException);
        }
    }

    public void method_ae128dc7_bzF() {
        this.method_117d59bb_FWm(true);
    }
}

