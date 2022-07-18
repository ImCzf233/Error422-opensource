package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class cbQ
extends Panel {
    public cbQ() {
        Minecraft.field_9eb08ffb_Dne.setTitle("\ud83d\ude42");
        this.setBackground(new Color(0));
        this.setLayout(new BorderLayout());
        StringWriter stringWriter = new StringWriter();
        String string = stringWriter.toString();
        String string2 = "";
        String string3 = "                                                                                                    \r\n                                                                                                    \r\n                                                                                                    \r\n   @@@@@@@@@@  @@@@@@@@    @@@@@@@@      @@@@@@    @@@@@@@@          @@@@    @@@@@@      @@@@@@     \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@      @@  @@  @@      @@  @@      @@   \r\n   @@@@@@      @@@@@@@@    @@@@@@@@    @@      @@  @@@@@@@@      @@    @@       @@@@        @@@@   \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@  @@@@@@@@@@    @@@         @@@         \r\n   @@          @@      @@  @@      @@  @@      @@  @@      @@          @@  @@      @@  @@      @@   \r\n   @@@@@@@@@@  @@      @@  @@      @@    @@@@@@    @@      @@          @@  @@@@@@@@@@  @@@@@@@@@@   \r\n                                                                                                    \r\n                                                                                                    ";
        TextArea textArea = new TextArea(string3, 0, 0, 1);
        textArea.setFont(new Font("Monospaced", 0, 12));
        textArea.setForeground(new Color(0xA30000));
        textArea.setBackground(new Color(0));
        this.add((Component)new jfy(), "North");
        this.add((Component)new wJw(80), "East");
        this.add((Component)new wJw(80), "West");
        this.add((Component)new wJw(100), "South");
        this.add((Component)textArea, "Center");
    }

    public cbQ(McM mcM) {
        Serializable serializable;
        this.setBackground(new Color(0));
        this.setLayout(new BorderLayout());
        StringWriter stringWriter = new StringWriter();
        mcM.method_d2942c7f_Dne().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        String string2 = "";
        String string3 = "";
        try {
            string3 = string3 + "Generated " + new SimpleDateFormat().format(new Date()) + "\n";
            string3 = string3 + "\n";
            string3 = string3 + mcM.method_d1f1ed87_FWm();
            string2 = GL11.glGetString(7936);
        }
        catch (Throwable throwable) {
            string3 = string3 + "[failed to get system properties (" + throwable + ")]\n";
        }
        string3 = string3 + "\n\n";
        string3 = string3 + string;
        String string4 = "";
        string4 = string4 + "\n";
        string4 = string4 + "\n";
        if (string.contains("Pixel format not accelerated")) {
            string4 = string4 + "      Bad video card drivers!      \n";
            string4 = string4 + "      -----------------------      \n";
            string4 = string4 + "\n";
            string4 = string4 + "Minecraft was unable to start because it failed to find an accelerated OpenGL mode.\n";
            string4 = string4 + "This can usually be fixed by updating the video card drivers.\n";
            if (string2.toLowerCase().contains("nvidia")) {
                string4 = string4 + "\n";
                string4 = string4 + "You might be able to find drivers for your video card here:\n";
                string4 = string4 + "  http://www.nvidia.com/\n";
            } else if (string2.toLowerCase().contains("ati")) {
                string4 = string4 + "\n";
                string4 = string4 + "You might be able to find drivers for your video card here:\n";
                string4 = string4 + "  http://www.amd.com/\n";
            }
        } else {
            string4 = string4 + "      Minecraft has crashed!      \n";
            string4 = string4 + "      ----------------------      \n";
            string4 = string4 + "\n";
            string4 = string4 + "Minecraft has stopped running because it encountered a problem; " + mcM.method_eecad346_Dne() + "\n\n";
            serializable = mcM.method_9189e6b3_Dne();
            if (serializable == null) {
                mcM.method_7c2f2c69_Dne(new File(new File(Minecraft.method_9189e6b3_Dne(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt"), Minecraft.method_81a5f12e_Dne().method_230e0120_Dne());
                serializable = mcM.method_9189e6b3_Dne();
            }
            if (serializable != null) {
                String string5 = ((File)serializable).getAbsolutePath();
                string4 = string4 + "A full error report has been saved to " + string5 + " - Please include a copy of that file (Not this screen!) if you report this crash to anyone; without it, they will not be able to help fix the crash :(";
                string3 = "Full report at:\n" + string5 + "\nPlease show that file to Mojang, NOT just this screen!\n\n" + string3;
            } else {
                string4 = string4 + "We were unable to save this report to a file.";
            }
            string4 = string4 + "\n";
        }
        string4 = string4 + "\n";
        string4 = string4 + "\n";
        string4 = string4 + "\n";
        string4 = string4 + "--- BEGIN ERROR REPORT " + Integer.toHexString(string4.hashCode()) + " --------\n";
        string4 = string4 + string3;
        string4 = string4 + "--- END ERROR REPORT " + Integer.toHexString(string4.hashCode()) + " ----------\n";
        string4 = string4 + "\n";
        string4 = string4 + "\n";
        serializable = new TextArea(string4, 0, 0, 1);
        ((Component)serializable).setFont(new Font("Monospaced", 0, 12));
        ((Component)serializable).setForeground(new Color(0xA30000));
        ((TextComponent)serializable).setBackground(new Color(0));
        this.add((Component)new jfy(), "North");
        this.add((Component)new wJw(80), "East");
        this.add((Component)new wJw(80), "West");
        this.add((Component)new wJw(100), "South");
        this.add((Component)serializable, "Center");
    }
}

