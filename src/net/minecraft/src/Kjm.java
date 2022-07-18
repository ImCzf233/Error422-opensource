package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Kjm
extends XEr {
    @Override
    public void method_7a46289a_Dne() {
        LoG.method_7a46289a_Dne();
    }

    private void method_62d9962c_Dne(File file, File file2, tgc tgc2, int n, int n2, TaY taY) {
        try {
            String string = file2.getName();
            inq_0 inq_02 = new inq_0(file2);
            inq_0 inq_03 = new inq_0(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
            for (int i = 0; i < 32; ++i) {
                int n3;
                for (n3 = 0; n3 < 32; ++n3) {
                    if (!inq_02.method_16cca7e_Dne(i, n3) || inq_03.method_16cca7e_Dne(i, n3)) continue;
                    DataInputStream dataInputStream = inq_02.method_1bd4c347_Dne(i, n3);
                    if (dataInputStream == null) {
                        jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to fetch input stream");
                        continue;
                    }
                    WkD wkD = VVx.method_cd26dcc4_Dne(dataInputStream);
                    dataInputStream.close();
                    WkD wkD2 = wkD.method_2851c945_Dne("Level");
                    exS exS2 = JLG.method_7db220c8_Dne(wkD2);
                    WkD wkD3 = new WkD();
                    WkD wkD4 = new WkD();
                    wkD3.method_58996597_Dne("Level", wkD4);
                    JLG.method_ce7e6247_Dne(exS2, wkD4, tgc2);
                    DataOutputStream dataOutputStream = inq_03.method_e4950984_Dne(i, n3);
                    VVx.method_eee5c69f_Dne(wkD3, dataOutputStream);
                    dataOutputStream.close();
                }
                n3 = (int)Math.round(100.0 * (double)(n * 1024) / (double)(n2 * 1024));
                int n4 = (int)Math.round(100.0 * (double)((i + 1) * 32 + n * 1024) / (double)(n2 * 1024));
                if (n4 <= n3) continue;
                taY.method_ce7f5da9_Dne(n4);
            }
            inq_02.method_7a46289a_Dne();
            inq_03.method_7a46289a_Dne();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void method_8f501fe4_Dne(String string) {
        File file = new File(this.field_d102ba32_Dne, string);
        if (!file.exists()) {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                System.out.println("Warning: Unable to create level.dat_mcr backup");
            } else {
                File file3 = new File(file, "level.dat_mcr");
                if (!file2.renameTo(file3)) {
                    System.out.println("Warning: Unable to create level.dat_mcr backup");
                }
            }
        }
    }

    @Override
    public boolean method_2b8cd6f5_Dne(String string, TaY taY) {
        taY.method_ce7f5da9_Dne(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File file = new File(this.field_d102ba32_Dne, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Scanning folders...");
        this.method_8678b782_Dne(file, arrayList);
        if (file2.exists()) {
            this.method_8678b782_Dne(file2, arrayList2);
        }
        if (file3.exists()) {
            this.method_8678b782_Dne(file3, arrayList3);
        }
        int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_8f501fe4_Dne("Total conversion count is " + n);
        xoY xoY2 = this.method_2860db13_Dne(string);
        tgc tgc2 = null;
        tgc2 = xoY2.method_23111898_Dne() == kGO.field_20315618_FWm ? new yMz(OdI.field_202507d7_FWm, 0.5f, 0.5f) : new tgc(xoY2.method_7a46288e_Dne(), xoY2.method_23111898_Dne());
        this.method_d583bdfe_Dne(new File(file, "region"), arrayList, tgc2, 0, n, taY);
        this.method_d583bdfe_Dne(new File(file2, "region"), arrayList2, new yMz(OdI.field_5bba54c_IjH, 1.0f, 0.0f), arrayList.size(), n, taY);
        this.method_d583bdfe_Dne(new File(file3, "region"), arrayList3, new yMz(OdI.field_74f5ced6_mrb, 0.5f, 0.0f), arrayList.size() + arrayList2.size(), n, taY);
        xoY2.method_7ed97a02_Qnq(19133);
        if (xoY2.method_23111898_Dne() == kGO.field_5e60f900_Qnq) {
            xoY2.method_ad7a5774_Dne(kGO.field_3778a39_Dne);
        }
        this.method_8f501fe4_Dne(string);
        iDE iDE2 = this.method_c5a32f37_Dne(string, false);
        iDE2.method_c5e18f65_Dne(xoY2);
        return true;
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        xoY xoY2 = this.method_2860db13_Dne(string);
        return xoY2 != null && xoY2.method_a98a0653_aFZ() != this.method_7a46288d_Dne();
    }

    public Kjm(File file) {
        super(file);
    }

    private void method_8678b782_Dne(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] fileArray = file2.listFiles(new qRn(this));
        if (fileArray != null) {
            Collections.addAll(collection, fileArray);
        }
    }

    protected int method_7a46288d_Dne() {
        return 19133;
    }

    @Override
    public iDE method_c5a32f37_Dne(String string, boolean bl) {
        return new xXz(this.field_d102ba32_Dne, string, bl);
    }

    private void method_d583bdfe_Dne(File file, Iterable<File> iterable, tgc tgc2, int n, int n2, TaY taY) {
        for (File file2 : iterable) {
            this.method_62d9962c_Dne(file, file2, tgc2, n, n2, taY);
            int n3 = (int)Math.round(100.0 * (double)(++n) / (double)n2);
            taY.method_ce7f5da9_Dne(n3);
        }
    }

    @Override
    public List method_adea226d_Dne() throws Ipl {
        if (this.field_d102ba32_Dne != null && this.field_d102ba32_Dne.exists() && this.field_d102ba32_Dne.isDirectory()) {
            File[] fileArray;
            ArrayList<pQP> arrayList = new ArrayList<pQP>();
            File[] fileArray2 = fileArray = this.field_d102ba32_Dne.listFiles();
            int n = fileArray.length;
            for (int i = 0; i < n; ++i) {
                String string;
                xoY xoY2;
                File file = fileArray2[i];
                if (!file.isDirectory() || (xoY2 = this.method_2860db13_Dne(string = file.getName())) == null || xoY2.method_a98a0653_aFZ() != 19132 && xoY2.method_a98a0653_aFZ() != 19133) continue;
                boolean bl = xoY2.method_a98a0653_aFZ() != this.method_7a46288d_Dne();
                String string2 = xoY2.method_eecad346_Dne();
                if (string2 == null || geR.method_8f501fe8_Dne(string2)) {
                    string2 = string;
                }
                long l = 0L;
                arrayList.add(new pQP(string, string2, xoY2.method_a98a0654_aFZ(), l, xoY2.method_230878ef_Dne(), bl, xoY2.method_907a9d25_Qnq(), xoY2.method_a98a0664_aFZ()));
            }
            return arrayList;
        }
        throw new Ipl("Unable to read or access folder where game worlds are saved!");
    }
}

