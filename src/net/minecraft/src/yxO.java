package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class yxO
implements AAC,
iDE {
    private final File field_d102ba32_Dne;
    private final File field_fd16d933_FWm;
    private final String field_569fcf45_Dne;
    private final long field_2092af_Dne = System.currentTimeMillis();
    private final File field_f62f46e5_bzF;

    @Override
    public File method_fac597a9_Dne(String string) {
        return new File(this.field_f62f46e5_bzF, string + ".dat");
    }

    @Override
    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public WkD method_2851c945_Dne(String string) {
        try {
            File file = new File(this.field_fd16d933_FWm, string + ".dat");
            if (file.exists()) {
                return VVx.method_2bf75d1a_Dne(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to load player data for " + string);
        }
        return null;
    }

    @Override
    public AAC method_22fde908_Dne() {
        return this;
    }

    @Override
    public void method_b34bd92c_Dne(xoY xoY2, WkD wkD) {
        WkD wkD2 = xoY2.method_7dab90f8_Dne(wkD);
        WkD wkD3 = new WkD();
        wkD3.method_58996597_Dne("Data", wkD2);
        try {
            File file = new File(this.field_d102ba32_Dne, "level.dat_new");
            File file2 = new File(this.field_d102ba32_Dne, "level.dat_old");
            File file3 = new File(this.field_d102ba32_Dne, "level.dat");
            VVx.method_b3febbc9_Dne(wkD3, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public WkD method_53e5b684_Dne(FiG fiG) {
        WkD wkD = this.method_2851c945_Dne(fiG.field_bc57ecbf_aFZ);
        if (wkD != null) {
            fiG.method_102200f0_Qnq(wkD);
        }
        return wkD;
    }

    @Override
    public xoY method_231798c9_Dne() {
        File file = new File(this.field_d102ba32_Dne, "level.dat");
        if (file.exists()) {
            try {
                WkD wkD = VVx.method_2bf75d1a_Dne(new FileInputStream(file));
                WkD wkD2 = wkD.method_2851c945_Dne("Data");
                return new xoY(wkD2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file = new File(this.field_d102ba32_Dne, "level.dat_old")).exists()) {
            try {
                WkD wkD = VVx.method_2bf75d1a_Dne(new FileInputStream(file));
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
    public void method_c5e18f65_Dne(xoY xoY2) {
        WkD wkD = xoY2.method_230886fb_Dne();
        WkD wkD2 = new WkD();
        wkD2.method_58996597_Dne("Data", wkD);
        try {
            File file = new File(this.field_d102ba32_Dne, "level.dat_new");
            File file2 = new File(this.field_d102ba32_Dne, "level.dat_old");
            File file3 = new File(this.field_d102ba32_Dne, "level.dat");
            VVx.method_b3febbc9_Dne(wkD2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected File method_9189e6b3_Dne() {
        return this.field_d102ba32_Dne;
    }

    public yxO(File file, String string, boolean bl) {
        this.field_d102ba32_Dne = new File(file, string);
        this.field_d102ba32_Dne.mkdirs();
        this.field_fd16d933_FWm = new File(this.field_d102ba32_Dne, "players");
        this.field_f62f46e5_bzF = new File(this.field_d102ba32_Dne, "data");
        this.field_f62f46e5_bzF.mkdirs();
        this.field_569fcf45_Dne = string;
        if (bl) {
            this.field_fd16d933_FWm.mkdirs();
        }
        this.method_ae128dc7_bzF();
    }

    @Override
    public void method_7a46289a_Dne() {
    }

    private void method_ae128dc7_bzF() {
        try {
            File file = new File(this.field_d102ba32_Dne, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.field_2092af_Dne);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public void method_703284a3_Dne(FiG fiG) {
        try {
            WkD wkD = new WkD();
            fiG.method_7f44880a_bzF(wkD);
            File file = new File(this.field_fd16d933_FWm, fiG.field_bc57ecbf_aFZ + ".dat.tmp");
            File file2 = new File(this.field_fd16d933_FWm, fiG.field_bc57ecbf_aFZ + ".dat");
            VVx.method_b3febbc9_Dne(wkD, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_110c4dc3_FWm("Failed to save player data for " + fiG.field_bc57ecbf_aFZ);
        }
    }

    @Override
    public String[] method_631ac9e9_Dne() {
        String[] stringArray = this.field_fd16d933_FWm.list();
        for (int i = 0; i < stringArray.length; ++i) {
            if (!stringArray[i].endsWith(".dat")) continue;
            stringArray[i] = stringArray[i].substring(0, stringArray[i].length() - 4);
        }
        return stringArray;
    }

    @Override
    public void method_7c6f6039_FWm() throws div {
        try {
            File file = new File(this.field_d102ba32_Dne, "session.lock");
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
                if (dataInputStream.readLong() != this.field_2092af_Dne) {
                    throw new div("The save is being accessed from another location, aborting");
                }
            }
        }
        catch (IOException iOException) {
            throw new div("Failed to check session lock, aborting");
        }
    }

    @Override
    public YHU method_c0b631c6_Dne(Jik jik) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }
}

