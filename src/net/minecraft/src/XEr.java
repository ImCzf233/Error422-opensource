package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XEr
implements YiY {
    protected final File field_d102ba32_Dne;

    @Override
    public void method_abaa98ae_Dne(String string, String string2) {
        File file;
        File file2 = new File(this.field_d102ba32_Dne, string);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            try {
                WkD wkD = VVx.method_2bf75d1a_Dne(new FileInputStream(file));
                WkD wkD2 = wkD.method_2851c945_Dne("Data");
                wkD2.method_abaa98ae_Dne("LevelName", string2);
                VVx.method_b3febbc9_Dne(wkD, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        return false;
    }

    @Override
    public boolean method_47a073d5_bzF(String string) {
        File file = new File(this.field_d102ba32_Dne, string);
        return file.isDirectory();
    }

    protected static boolean method_17d86776_Dne(File[] fileArray) {
        for (int i = 0; i < fileArray.length; ++i) {
            File file = fileArray[i];
            System.out.println("Deleting " + file);
            if (file.isDirectory() && !XEr.method_17d86776_Dne(file.listFiles())) {
                System.out.println("Couldn't delete directory " + file);
                return false;
            }
            if (file.delete()) continue;
            System.out.println("Couldn't delete file " + file);
            return false;
        }
        return true;
    }

    @Override
    public boolean method_2b8cd6f5_Dne(String string, TaY taY) {
        return false;
    }

    @Override
    public xoY method_2860db13_Dne(String string) {
        File file = new File(this.field_d102ba32_Dne, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                WkD wkD = VVx.method_2bf75d1a_Dne(new FileInputStream(file2));
                WkD wkD2 = wkD.method_2851c945_Dne("Data");
                return new xoY(wkD2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file2 = new File(file, "level.dat_old")).exists()) {
            try {
                WkD wkD = VVx.method_2bf75d1a_Dne(new FileInputStream(file2));
                WkD wkD3 = wkD.method_2851c945_Dne("Data");
                return new xoY(wkD3);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean method_110c4dc7_FWm(String string) {
        File file = new File(this.field_d102ba32_Dne, string);
        if (!file.exists()) {
            return true;
        }
        System.out.println("Deleting level " + string);
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Attempt " + i + "...");
            if (XEr.method_17d86776_Dne(file.listFiles())) break;
            System.out.println("Unsuccessful in deleting contents.");
            if (i >= 5) continue;
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    public XEr(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.field_d102ba32_Dne = file;
    }

    @Override
    public iDE method_c5a32f37_Dne(String string, boolean bl) {
        return new yxO(this.field_d102ba32_Dne, string, bl);
    }

    @Override
    public List method_adea226d_Dne() throws Ipl {
        ArrayList<pQP> arrayList = new ArrayList<pQP>();
        for (int i = 0; i < 5; ++i) {
            String string = "World" + (i + 1);
            xoY xoY2 = this.method_2860db13_Dne(string);
            if (xoY2 == null) continue;
            arrayList.add(new pQP(string, "", xoY2.method_a98a0654_aFZ(), xoY2.method_907a9d15_Qnq(), xoY2.method_230878ef_Dne(), false, xoY2.method_907a9d25_Qnq(), xoY2.method_a98a0664_aFZ()));
        }
        return arrayList;
    }
}

