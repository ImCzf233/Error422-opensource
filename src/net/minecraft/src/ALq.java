package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.applet.AppletStub;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class ALq
extends Applet
implements AppletStub {
    final Map field_83b1c1b0_Dne;

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public URL getDocumentBase() {
        try {
            return new URL("http://www.minecraft.net/game/");
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return null;
        }
    }

    @Override
    public void appletResize(int n, int n2) {
    }

    public ALq(Map map) {
        this.field_83b1c1b0_Dne = map;
    }

    @Override
    public String getParameter(String string) {
        if (this.field_83b1c1b0_Dne.containsKey(string)) {
            return (String)this.field_83b1c1b0_Dne.get(string);
        }
        System.err.println("Client asked for parameter: " + string);
        return null;
    }
}

