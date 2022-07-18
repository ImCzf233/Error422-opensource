package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Fso
extends YGc {
    public Fso() {
        super("default", null, "Default", null);
    }

    @Override
    protected void method_7a46289a_Dne() {
        this.field_569fcf45_Dne = "The default look of Minecraft";
    }

    @Override
    protected InputStream method_4040946_FWm(String string) throws FileNotFoundException {
        InputStream inputStream = Fso.class.getResourceAsStream(string);
        if (inputStream == null) {
            throw new FileNotFoundException(string);
        }
        return inputStream;
    }

    @Override
    public boolean method_8f501fe8_Dne(String string) {
        return Fso.class.getResourceAsStream(string) != null;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return true;
    }
}

