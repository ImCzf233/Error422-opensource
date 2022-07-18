package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UPH
extends xZE {
    private long field_2092af_Dne = 0L;
    private int field_2092ae_Dne = 0;

    private static String method_d1f1ed87_FWm() {
        String[] stringArray = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    private String method_a3d922e7_Dne(long l, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(UPH.method_d1f1ed87_FWm());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n / ((float)l / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.method_782bb858_Dne(0, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    private void method_782bb858_Dne(int n, String string, StringBuilder stringBuilder) {
        List list = jwh_0.method_2302cf90_Dne().field_365731d_Dne.method_b6fd6de3_Dne(string);
        if (list != null && list.size() >= 3) {
            for (int i = 1; i < list.size(); ++i) {
                Gup gup = (Gup)list.get(i);
                stringBuilder.append(String.format("[%02d] ", n));
                for (int j = 0; j < n; ++j) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(gup.field_569fcf45_Dne);
                stringBuilder.append(" - ");
                stringBuilder.append(String.format("%.2f", gup.field_2092a9_Dne));
                stringBuilder.append("%/");
                stringBuilder.append(String.format("%.2f", gup.field_212608_FWm));
                stringBuilder.append("%\n");
                if (gup.field_569fcf45_Dne.equals("unspecified")) continue;
                try {
                    this.method_782bb858_Dne(n + 1, string + "." + gup.field_569fcf45_Dne, stringBuilder);
                    continue;
                }
                catch (Exception exception) {
                    stringBuilder.append("[[ EXCEPTION " + exception + " ]]");
                }
            }
        }
    }

    @Override
    public int method_7a46288d_Dne() {
        return 3;
    }

    @Override
    public void method_4036a99a_Dne(gnI gnI2, String[] stringArray) {
        if (stringArray.length == 1) {
            if (stringArray[0].equals("start")) {
                UPH.method_7424c4e2_Dne(gnI2, "commands.debug.start", new Object[0]);
                jwh_0.method_2302cf90_Dne().method_9a443a99_XHL();
                this.field_2092af_Dne = System.currentTimeMillis();
                this.field_2092ae_Dne = jwh_0.method_2302cf90_Dne().method_8288d6e1_IjH();
                return;
            }
            if (stringArray[0].equals("stop")) {
                if (!jwh_0.method_2302cf90_Dne().field_365731d_Dne.field_2092bf_Dne) {
                    throw new WoB("commands.debug.notStarted", new Object[0]);
                }
                long l = System.currentTimeMillis();
                int n = jwh_0.method_2302cf90_Dne().method_8288d6e1_IjH();
                long l2 = l - this.field_2092af_Dne;
                int n2 = n - this.field_2092ae_Dne;
                this.method_16d3ed9_Dne(l2, n2);
                jwh_0.method_2302cf90_Dne().field_365731d_Dne.field_2092bf_Dne = false;
                UPH.method_7424c4e2_Dne(gnI2, "commands.debug.stop", Float.valueOf((float)l2 / 1000.0f), n2);
                return;
            }
        }
        throw new fxw_0("commands.debug.usage", new Object[0]);
    }

    @Override
    public List method_cac7816d_Dne(gnI gnI2, String[] stringArray) {
        return stringArray.length == 1 ? UPH.method_80180c4d_Dne(stringArray, "start", "stop") : null;
    }

    @Override
    public String method_eecad346_Dne() {
        return "debug";
    }

    private void method_16d3ed9_Dne(long l, int n) {
        File file = new File(jwh_0.method_2302cf90_Dne().method_fac597a9_Dne("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.method_a3d922e7_Dne(l, n));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            jwh_0.method_2302cf90_Dne().method_230e0120_Dne().method_13eaee12_FWm("Could not save profiler results to " + file, throwable);
        }
    }
}

