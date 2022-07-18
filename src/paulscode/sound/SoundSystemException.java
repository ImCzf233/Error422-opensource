/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

public class SoundSystemException
extends Exception {
    public static final int CLASS_TYPE_MISMATCH;
    public static final int ERROR_NONE;
    private int myType = 1;
    public static final int LIBRARY_TYPE;
    public static final int LIBRARY_NULL;
    public static final int NULL_PARAMETER;
    public static final int UNKNOWN_ERROR;

    public int getType() {
        return this.myType;
    }

    public SoundSystemException(String string, int n) {
        super(string);
        this.myType = n;
    }

    public SoundSystemException(String string) {
        super(string);
    }

    static {
        UNKNOWN_ERROR = 1;
        NULL_PARAMETER = 2;
        LIBRARY_NULL = 4;
        CLASS_TYPE_MISMATCH = 3;
        ERROR_NONE = 0;
        LIBRARY_TYPE = 5;
    }
}

