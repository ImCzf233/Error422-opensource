/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound.libraries;

import paulscode.sound.SoundSystemException;

public class LibraryLWJGLOpenAL$Exception
extends SoundSystemException {
    public static final int INVALID_ENUM;
    public static final int INVALID_VALUE;
    public static final int INVALID_OPERATION;
    public static final int NO_AL_PITCH;
    public static final int OUT_OF_MEMORY;
    public static final int INVALID_NAME;
    public static final int CREATE;
    public static final int LISTENER;

    public LibraryLWJGLOpenAL$Exception(String string) {
        super(string);
    }

    static {
        CREATE = 101;
        LISTENER = 107;
        INVALID_ENUM = 103;
        INVALID_NAME = 102;
        INVALID_OPERATION = 105;
        OUT_OF_MEMORY = 106;
        NO_AL_PITCH = 108;
        INVALID_VALUE = 104;
    }

    public LibraryLWJGLOpenAL$Exception(String string, int n) {
        super(string, n);
    }
}

