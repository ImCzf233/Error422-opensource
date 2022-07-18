package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class McM {
    private final Noo field_36af57e_Dne = new Noo(this, "System Details");
    private final String field_569fcf45_Dne;
    private StackTraceElement[] field_f751effc_Dne;
    private final Throwable field_dccd3c20_Dne;
    private File field_d102ba32_Dne = null;
    private boolean field_2092bf_Dne = true;
    private final List<Noo> field_f27c122c_Dne = new ArrayList();

    public Throwable method_d2942c7f_Dne() {
        return this.field_dccd3c20_Dne;
    }

    public static McM method_948e60df_Dne(Throwable throwable, String string) {
        McM mcM = throwable instanceof kaJ ? ((kaJ)throwable).method_2303de54_Dne() : new McM(string, throwable);
        return mcM;
    }

    public File method_9189e6b3_Dne() {
        return this.field_d102ba32_Dne;
    }

    public void method_c93df0d1_Dne(StringBuilder stringBuilder) {
        if (this.field_f751effc_Dne != null && this.field_f751effc_Dne.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.field_f751effc_Dne) {
                stringBuilder.append("\t").append("at ").append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (Noo noo : this.field_f27c122c_Dne) {
            noo.method_c93df0d1_Dne(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.field_36af57e_Dne.method_c93df0d1_Dne(stringBuilder);
    }

    private static String method_c6f17a40_aFZ() {
        String[] stringArray = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!"};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    private void method_7a46289a_Dne() {
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Minecraft Version", new vgL(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Operating System", new RlT(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Java Version", new stH(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Java VM Version", new zgx(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Memory", new VUG(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("JVM Flags", new DhS(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("AABB Pool Size", new Hdu(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("Suspicious classes", new nzx_0(this));
        this.field_36af57e_Dne.method_2aeeb7ad_Dne("IntCache", new zxR(this));
    }

    public Noo method_284dc627_Dne(String string) {
        return this.method_424da062_Dne(string, 1);
    }

    public Noo method_230483dd_Dne() {
        return this.field_36af57e_Dne;
    }

    public String method_d1f1ed87_FWm() {
        StringBuilder stringBuilder = new StringBuilder();
        this.method_c93df0d1_Dne(stringBuilder);
        return stringBuilder.toString();
    }

    public String method_eecad346_Dne() {
        return this.field_569fcf45_Dne;
    }

    public McM(String string, Throwable throwable) {
        this.field_f751effc_Dne = new StackTraceElement[0];
        this.field_569fcf45_Dne = string;
        this.field_dccd3c20_Dne = throwable;
        this.method_7a46289a_Dne();
    }

    public String method_4a7b1d9f_Qnq() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(McM.method_c6f17a40_aFZ());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.field_569fcf45_Dne);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.method_6859cdb9_bzF());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.method_c93df0d1_Dne(stringBuilder);
        return stringBuilder.toString();
    }

    public boolean method_7c2f2c69_Dne(File file, dLs dLs2) {
        if (this.field_d102ba32_Dne != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.method_4a7b1d9f_Qnq());
            fileWriter.close();
            this.field_d102ba32_Dne = file;
            return true;
        }
        catch (Throwable throwable) {
            dLs2.method_13eaee12_FWm("Could not save crash report to " + file, throwable);
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String method_6859cdb9_bzF() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        String string = this.field_dccd3c20_Dne.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            this.field_dccd3c20_Dne.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        finally {
            try {
                if (stringWriter != null) {
                    stringWriter.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            }
            catch (IOException iOException) {}
        }
        return string;
    }

    public Noo method_424da062_Dne(String string, int n) {
        Noo noo = new Noo(this, string);
        if (this.field_2092bf_Dne) {
            int n2 = noo.method_ce7f5d9c_Dne(n);
            StackTraceElement[] stackTraceElementArray = this.field_dccd3c20_Dne.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            if (stackTraceElementArray != null && stackTraceElementArray.length - n2 < stackTraceElementArray.length) {
                stackTraceElement = stackTraceElementArray[stackTraceElementArray.length - n2];
                if (stackTraceElementArray.length + 1 - n2 < stackTraceElementArray.length) {
                    stackTraceElement2 = stackTraceElementArray[stackTraceElementArray.length + 1 - n2];
                }
            }
            this.field_2092bf_Dne = noo.method_1a58e7de_Dne(stackTraceElement, stackTraceElement2);
            if (n2 > 0 && !this.field_f27c122c_Dne.isEmpty()) {
                Noo noo2 = (Noo)this.field_f27c122c_Dne.get(this.field_f27c122c_Dne.size() - 1);
                noo2.method_ce7f5da9_Dne(n2);
            } else if (stackTraceElementArray != null && stackTraceElementArray.length >= n2) {
                this.field_f751effc_Dne = new StackTraceElement[stackTraceElementArray.length - n2];
                System.arraycopy(stackTraceElementArray, 0, this.field_f751effc_Dne, 0, this.field_f751effc_Dne.length);
            } else {
                this.field_2092bf_Dne = false;
            }
        }
        this.field_f27c122c_Dne.add(noo);
        return noo;
    }
}

