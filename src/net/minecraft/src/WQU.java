package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WQU
implements dLs {
    private final String field_569fcf45_Dne;
    private final String field_c480ca78_bzF;
    private final String field_d9a85c6_FWm;
    private final Logger field_91f88e0a_Dne;

    public WQU(String string, String string2, String string3) {
        this.field_91f88e0a_Dne = Logger.getLogger(string);
        this.field_d9a85c6_FWm = string;
        this.field_c480ca78_bzF = string2;
        this.field_569fcf45_Dne = string3;
        this.method_7a46289a_Dne();
    }

    @Override
    public void method_47a073d1_bzF(String string) {
        this.field_91f88e0a_Dne.log(Level.SEVERE, string);
    }

    @Override
    public void method_a9a920ab_Qnq(String string) {
        this.field_91f88e0a_Dne.log(Level.FINE, string);
    }

    static String method_65e205d4_Dne(WQU wQU) {
        return wQU.field_c480ca78_bzF;
    }

    private void method_7a46289a_Dne() {
        Handler handler2;
        this.field_91f88e0a_Dne.setUseParentHandlers(false);
        for (Handler handler : this.field_91f88e0a_Dne.getHandlers()) {
            this.field_91f88e0a_Dne.removeHandler(handler);
        }
        uda_0 uda_02 = new uda_0(this, null);
        handler2 = new ConsoleHandler();
        handler2.setFormatter(uda_02);
        this.field_91f88e0a_Dne.addHandler(handler2);
        try {
            FileHandler fileHandler = new FileHandler(this.field_569fcf45_Dne, true);
            fileHandler.setFormatter(uda_02);
            this.field_91f88e0a_Dne.addHandler(fileHandler);
        }
        catch (Exception exception) {
            this.field_91f88e0a_Dne.log(Level.WARNING, "Failed to log " + this.field_d9a85c6_FWm + " to " + this.field_569fcf45_Dne, exception);
        }
    }

    @Override
    public void method_feb678cd_Dne(String string, Object ... objectArray) {
        this.field_91f88e0a_Dne.log(Level.WARNING, string, objectArray);
    }

    @Override
    public void method_110c4dc3_FWm(String string) {
        this.field_91f88e0a_Dne.log(Level.WARNING, string);
    }

    @Override
    public void method_13eaee12_FWm(String string, Throwable throwable) {
        this.field_91f88e0a_Dne.log(Level.SEVERE, string, throwable);
    }

    @Override
    public void method_37db6a91_Dne(String string, Throwable throwable) {
        this.field_91f88e0a_Dne.log(Level.WARNING, string, throwable);
    }

    @Override
    public void method_8f501fe4_Dne(String string) {
        this.field_91f88e0a_Dne.log(Level.INFO, string);
    }
}

