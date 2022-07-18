package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class yJm {
    private int field_2092ae_Dne = 0;
    private volatile boolean field_2092bf_Dne = false;
    private File field_f62f46e5_bzF;
    private File field_1febfb4b_Qnq;
    private vwN field_37d3e5f_Dne;
    private File field_d102ba32_Dne;
    private File field_d908a4ac_aFZ;
    private File field_540c523a_zGp;
    private int field_21260d_FWm = 0;
    private File field_fd16d933_FWm;
    private volatile Map field_da2182cf_FWm = null;
    private volatile Map field_83b1c1b0_Dne = null;
    private FkP field_3673fc1_Dne;

    static File method_761fc1a_zGp(yJm yJm2) {
        return yJm2.field_d908a4ac_aFZ;
    }

    static File method_e6995b01_FWm(yJm yJm2) {
        return yJm2.field_1febfb4b_Qnq;
    }

    static File method_7f362de9_Qnq(yJm yJm2) {
        return yJm2.field_d102ba32_Dne;
    }

    public boolean method_7a46289e_Dne() {
        return this.field_2092ae_Dne <= 0 && !this.field_2092bf_Dne && this.field_da2182cf_FWm == null;
    }

    public void method_a5b62bab_Dne(Map map) {
        if (this.field_2092bf_Dne) {
            throw new IllegalStateException("Can't save stats while StatsSyncher is busy!");
        }
        this.field_2092ae_Dne = 100;
        this.field_2092bf_Dne = true;
        new wur_0(this, map).start();
    }

    public yJm(vwN vwN2, FkP fkP, File file) {
        this.field_d102ba32_Dne = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + "_unsent.dat");
        this.field_fd16d933_FWm = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + ".dat");
        this.field_d908a4ac_aFZ = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + "_unsent.old");
        this.field_540c523a_zGp = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + ".old");
        this.field_f62f46e5_bzF = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + "_unsent.tmp");
        this.field_1febfb4b_Qnq = new File(file, "stats_" + vwN2.field_569fcf45_Dne.toLowerCase() + ".tmp");
        if (!vwN2.field_569fcf45_Dne.toLowerCase().equals(vwN2.field_569fcf45_Dne)) {
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + "_unsent.dat", this.field_d102ba32_Dne);
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + ".dat", this.field_fd16d933_FWm);
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + "_unsent.old", this.field_d908a4ac_aFZ);
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + ".old", this.field_540c523a_zGp);
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + "_unsent.tmp", this.field_f62f46e5_bzF);
            this.method_c3b4e252_Dne(file, "stats_" + vwN2.field_569fcf45_Dne + ".tmp", this.field_1febfb4b_Qnq);
        }
        this.field_3673fc1_Dne = fkP;
        this.field_37d3e5f_Dne = vwN2;
        if (this.field_d102ba32_Dne.exists()) {
            fkP.method_a5b62bab_Dne(this.method_dbc257b4_Dne(this.field_d102ba32_Dne, this.field_f62f46e5_bzF, this.field_d908a4ac_aFZ));
        }
        this.method_7a46289a_Dne();
    }

    static Map method_7be101e5_Dne(yJm yJm2, File file, File file2, File file3) {
        return yJm2.method_dbc257b4_Dne(file, file2, file3);
    }

    static void method_9381797f_Dne(yJm yJm2, Map map, File file, File file2, File file3) throws IOException {
        yJm2.method_2fcadd90_Dne(map, file, file2, file3);
    }

    static boolean method_ed2dd26d_Dne(yJm yJm2, boolean bl) {
        yJm2.field_2092bf_Dne = bl;
        return yJm2.field_2092bf_Dne;
    }

    private void method_c3b4e252_Dne(File file, String string, File file2) {
        File file3 = new File(file, string);
        if (file3.exists() && !file3.isDirectory() && !file2.exists()) {
            file3.renameTo(file2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void method_5cb0e22c_FWm(Map map) {
        int n = 30;
        while (this.field_2092bf_Dne && --n > 0) {
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.field_2092bf_Dne = true;
        try {
            this.method_2fcadd90_Dne(map, this.field_d102ba32_Dne, this.field_f62f46e5_bzF, this.field_d908a4ac_aFZ);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            this.field_2092bf_Dne = false;
        }
    }

    static Map method_6b25acc0_Dne(yJm yJm2) {
        return yJm2.field_83b1c1b0_Dne;
    }

    public void method_7a46289a_Dne() {
        if (this.field_2092bf_Dne) {
            throw new IllegalStateException("Can't get stats from server while StatsSyncher is busy!");
        }
        this.field_2092ae_Dne = 100;
        this.field_2092bf_Dne = true;
        new iLc(this).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void method_2fcadd90_Dne(Map map, File file, File file2, File file3) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file2, false));){
            printWriter.print(FkP.method_ad305469_Dne(this.field_37d3e5f_Dne.field_569fcf45_Dne, "local", map));
        }
        if (file3.exists()) {
            file3.delete();
        }
        if (file.exists()) {
            file.renameTo(file3);
        }
        file2.renameTo(file);
    }

    static File method_918b6568_aFZ(yJm yJm2) {
        return yJm2.field_f62f46e5_bzF;
    }

    static Map method_feff7f0f_Dne(yJm yJm2, Map map) {
        yJm2.field_83b1c1b0_Dne = map;
        return yJm2.field_83b1c1b0_Dne;
    }

    public void method_7c6f6039_FWm() {
        if (this.field_2092ae_Dne > 0) {
            --this.field_2092ae_Dne;
        }
        if (this.field_21260d_FWm > 0) {
            --this.field_21260d_FWm;
        }
        if (this.field_da2182cf_FWm != null) {
            this.field_3673fc1_Dne.method_139726de_bzF(this.field_da2182cf_FWm);
            this.field_da2182cf_FWm = null;
        }
        if (this.field_83b1c1b0_Dne != null) {
            this.field_3673fc1_Dne.method_5cb0e22c_FWm(this.field_83b1c1b0_Dne);
            this.field_83b1c1b0_Dne = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map method_9beb5d06_Dne(File file) {
        BufferedReader bufferedReader = null;
        try {
            Map map;
            bufferedReader = new BufferedReader(new FileReader(file));
            String string = "";
            StringBuilder stringBuilder = new StringBuilder();
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
            }
            Map map2 = map = FkP.method_924a9319_Dne(stringBuilder.toString());
            return map2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        return null;
    }

    static File method_1d2d810f_bzF(yJm yJm2) {
        return yJm2.field_540c523a_zGp;
    }

    static File method_64dd2d22_Dne(yJm yJm2) {
        return yJm2.field_fd16d933_FWm;
    }

    private Map method_dbc257b4_Dne(File file, File file2, File file3) {
        return file.exists() ? this.method_9beb5d06_Dne(file) : (file3.exists() ? this.method_9beb5d06_Dne(file3) : (file2.exists() ? this.method_9beb5d06_Dne(file2) : null));
    }
}

