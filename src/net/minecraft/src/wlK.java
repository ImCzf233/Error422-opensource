package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class wlK {
    private final String field_d9a85c6_FWm;
    private final String field_569fcf45_Dne = System.getProperty("user.home");
    private HashMap field_154cc8fd_FWm;
    public File field_d102ba32_Dne;
    private HashMap field_ecf0af5e_Dne = new HashMap();

    public void method_7a46289a_Dne() {
        try {
            mKT cfr_ignored_0 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
            mKT.field_a378b605_Dne.loadSound(((File)this.field_154cc8fd_FWm.get("glitch")).toURL(), "glitch.ogg");
            mKT cfr_ignored_1 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
            mKT.field_a378b605_Dne.loadSound(((File)this.field_154cc8fd_FWm.get("glitch422")).toURL(), "glitch422.ogg");
            mKT cfr_ignored_2 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
            mKT.field_a378b605_Dne.backgroundMusic("bgtheme", ((File)this.field_154cc8fd_FWm.get("theme")).toURL(), "maintheme.ogg", true);
            mKT cfr_ignored_3 = qxi_0.field_493682ed_Dne.field_3788296_Dne;
            mKT.field_a378b605_Dne.backgroundMusic("noise", ((File)this.field_154cc8fd_FWm.get("noise")).toURL(), "tv_noise.ogg", true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public wlK() {
        this.field_154cc8fd_FWm = new HashMap();
        this.field_d102ba32_Dne = new File(System.getProperty("user.home") + "\\422");
        this.field_d9a85c6_FWm = this.field_d102ba32_Dne.getAbsolutePath() + "\\";
        this.field_d102ba32_Dne.mkdir();
        this.field_d102ba32_Dne.deleteOnExit();
        this.field_ecf0af5e_Dne.put("glitch", this.getClass().getResourceAsStream("/sounds/g.ogg"));
        this.field_ecf0af5e_Dne.put("glitch422", this.getClass().getResourceAsStream("/sounds/g422.ogg"));
        this.field_ecf0af5e_Dne.put("theme", this.getClass().getResourceAsStream("/sounds/th.ogg"));
        this.field_ecf0af5e_Dne.put("noise", this.getClass().getResourceAsStream("/sounds/n.ogg"));
        for (Object obj : this.field_ecf0af5e_Dne.entrySet()) { Map.Entry entry = (Map.Entry) obj;
            this.field_154cc8fd_FWm.put(entry.getKey(), new File(String.format("%s%s.ogg", this.field_d9a85c6_FWm, entry.getKey())));
        }
        try {
            for (Object obj : this.field_154cc8fd_FWm.entrySet()) { Map.Entry entry = (Map.Entry) obj;
                ((File)entry.getValue()).deleteOnExit();
                Files.copy((InputStream)this.field_ecf0af5e_Dne.get(entry.getKey()), Paths.get(((File)entry.getValue()).getAbsolutePath(), new String[0]), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        Runtime.getRuntime().addShutdownHook(new yoK(this));
    }
}

