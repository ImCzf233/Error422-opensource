/*
 * Decompiled with CFR 0.152.
 */
package paulscode.sound;

public class CommandObject {
    public static final int STOP;
    public static final int CHECK_FADE_VOLUMES;
    public static final int MOVE_LISTENER;
    public static final int RAW_DATA_STREAM;
    public String[] stringArgs;
    public static final int NEW_SOURCE;
    public static final int SET_VOLUME;
    public static final int QUEUE_SOUND;
    public int Command;
    public long[] longArgs;
    public static final int NEW_LIBRARY;
    public static final int FEED_RAW_AUDIO_DATA;
    public static final int FADE_OUT_IN;
    public float[] floatArgs;
    public static final int SET_LISTENER_VELOCITY;
    public static final int FADE_OUT;
    public static final int CHANGE_DOPPLER_FACTOR;
    public boolean[] boolArgs;
    public static final int SET_TEMPORARY;
    public static final int SET_POSITION;
    public static final int CULL;
    public static final int SET_LISTENER_ORIENTATION;
    public byte[] buffer;
    public static final int TURN_LISTENER;
    public static final int SET_MASTER_VOLUME;
    public static final int CHANGE_DOPPLER_VELOCITY;
    public static final int DEQUEUE_SOUND;
    public static final int LOAD_DATA;
    public static final int PAUSE;
    public static final int SET_PITCH;
    public static final int ACTIVATE;
    public static final int SET_LISTENER_ANGLE;
    public Class[] classArgs;
    public static final int SET_PRIORITY;
    public static final int REWIND;
    public static final int LOAD_SOUND;
    public static final int PLAY;
    public static final int SET_VELOCITY;
    public static final int SET_DIST_OR_ROLL;
    public static final int UNLOAD_SOUND;
    public static final int SET_LOOPING;
    public static final int REMOVE_SOURCE;
    public Object[] objectArgs;
    public static final int FLUSH;
    public static final int QUICK_PLAY;
    public int[] intArgs;
    public static final int SET_LISTENER_POSITION;
    public static final int INITIALIZE;
    public static final int SET_ATTENUATION;

    public CommandObject(int n, String string, boolean bl) {
        this.Command = n;
        this.boolArgs = new boolean[1];
        this.stringArgs = new String[1];
        this.boolArgs[0] = bl;
        this.stringArgs[0] = string;
    }

    public CommandObject(int n, String string, byte[] byArray) {
        this.Command = n;
        this.stringArgs = new String[1];
        this.stringArgs[0] = string;
        this.buffer = byArray;
    }

    public CommandObject(int n, String string, Object object, long l, long l2) {
        this.Command = n;
        this.stringArgs = new String[1];
        this.stringArgs[0] = string;
        this.objectArgs = new Object[1];
        this.objectArgs[0] = object;
        this.longArgs = new long[2];
        this.longArgs[0] = l;
        this.longArgs[1] = l2;
    }

    public CommandObject(int n, String string, int n2) {
        this.Command = n;
        this.intArgs = new int[1];
        this.stringArgs = new String[1];
        this.intArgs[0] = n2;
        this.stringArgs[0] = string;
    }

    public CommandObject(int n, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Command = n;
        this.floatArgs = new float[6];
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
        this.floatArgs[3] = f4;
        this.floatArgs[4] = f5;
        this.floatArgs[5] = f6;
    }

    static {
        SET_DIST_OR_ROLL = 19;
        UNLOAD_SOUND = 4;
        CULL = 30;
        SET_LISTENER_ANGLE = 37;
        PLAY = 24;
        QUEUE_SOUND = 5;
        SET_LISTENER_POSITION = 35;
        SET_MASTER_VOLUME = 39;
        SET_LOOPING = 17;
        FEED_RAW_AUDIO_DATA = 25;
        PAUSE = 26;
        SET_VELOCITY = 22;
        NEW_LIBRARY = 40;
        SET_PRIORITY = 16;
        MOVE_LISTENER = 34;
        SET_ATTENUATION = 18;
        ACTIVATE = 31;
        REMOVE_SOURCE = 33;
        REWIND = 28;
        SET_VOLUME = 14;
        SET_PITCH = 15;
        CHANGE_DOPPLER_VELOCITY = 21;
        STOP = 27;
        FADE_OUT = 7;
        LOAD_SOUND = 2;
        SET_TEMPORARY = 32;
        NEW_SOURCE = 10;
        CHANGE_DOPPLER_FACTOR = 20;
        FADE_OUT_IN = 8;
        QUICK_PLAY = 12;
        DEQUEUE_SOUND = 6;
        LOAD_DATA = 3;
        FLUSH = 29;
        RAW_DATA_STREAM = 11;
        SET_LISTENER_VELOCITY = 23;
        CHECK_FADE_VOLUMES = 9;
        SET_LISTENER_ORIENTATION = 38;
        SET_POSITION = 13;
        INITIALIZE = 1;
        TURN_LISTENER = 36;
    }

    public CommandObject(int n, float f) {
        this.Command = n;
        this.floatArgs = new float[1];
        this.floatArgs[0] = f;
    }

    public CommandObject(int n, float f, float f2, float f3) {
        this.Command = n;
        this.floatArgs = new float[3];
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
    }

    public CommandObject(int n) {
        this.Command = n;
    }

    public CommandObject(int n, String string, float f) {
        this.Command = n;
        this.floatArgs = new float[1];
        this.stringArgs = new String[1];
        this.floatArgs[0] = f;
        this.stringArgs[0] = string;
    }

    public CommandObject(int n, String string, float f, float f2, float f3) {
        this.Command = n;
        this.floatArgs = new float[3];
        this.stringArgs = new String[1];
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
        this.stringArgs[0] = string;
    }

    public CommandObject(int n, int n2) {
        this.Command = n;
        this.intArgs = new int[1];
        this.intArgs[0] = n2;
    }

    public CommandObject(int n, boolean bl, boolean bl2, boolean bl3, String string, Object object, float f, float f2, float f3, int n2, float f4) {
        this.Command = n;
        this.intArgs = new int[1];
        this.floatArgs = new float[4];
        this.boolArgs = new boolean[3];
        this.stringArgs = new String[1];
        this.objectArgs = new Object[1];
        this.intArgs[0] = n2;
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
        this.floatArgs[3] = f4;
        this.boolArgs[0] = bl;
        this.boolArgs[1] = bl2;
        this.boolArgs[2] = bl3;
        this.stringArgs[0] = string;
        this.objectArgs[0] = object;
    }

    public CommandObject(int n, String string, Object object) {
        this.Command = n;
        this.stringArgs = new String[1];
        this.stringArgs[0] = string;
        this.objectArgs = new Object[1];
        this.objectArgs[0] = object;
    }

    public CommandObject(int n, Object object) {
        this.Command = n;
        this.objectArgs = new Object[1];
        this.objectArgs[0] = object;
    }

    public CommandObject(int n, Object object, boolean bl, String string, float f, float f2, float f3, int n2, float f4) {
        this.Command = n;
        this.intArgs = new int[1];
        this.floatArgs = new float[4];
        this.boolArgs = new boolean[1];
        this.stringArgs = new String[1];
        this.objectArgs = new Object[1];
        this.intArgs[0] = n2;
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
        this.floatArgs[3] = f4;
        this.boolArgs[0] = bl;
        this.stringArgs[0] = string;
        this.objectArgs[0] = object;
    }

    public CommandObject(int n, Class clazz) {
        this.Command = n;
        this.classArgs = new Class[1];
        this.classArgs[0] = clazz;
    }

    public CommandObject(int n, String string) {
        this.Command = n;
        this.stringArgs = new String[1];
        this.stringArgs[0] = string;
    }

    public CommandObject(int n, boolean bl, boolean bl2, boolean bl3, String string, Object object, float f, float f2, float f3, int n2, float f4, boolean bl4) {
        this.Command = n;
        this.intArgs = new int[1];
        this.floatArgs = new float[4];
        this.boolArgs = new boolean[4];
        this.stringArgs = new String[1];
        this.objectArgs = new Object[1];
        this.intArgs[0] = n2;
        this.floatArgs[0] = f;
        this.floatArgs[1] = f2;
        this.floatArgs[2] = f3;
        this.floatArgs[3] = f4;
        this.boolArgs[0] = bl;
        this.boolArgs[1] = bl2;
        this.boolArgs[2] = bl3;
        this.boolArgs[3] = bl4;
        this.stringArgs[0] = string;
        this.objectArgs[0] = object;
    }

    public CommandObject(int n, String string, Object object, long l) {
        this.Command = n;
        this.stringArgs = new String[1];
        this.stringArgs[0] = string;
        this.objectArgs = new Object[1];
        this.objectArgs[0] = object;
        this.longArgs = new long[1];
        this.longArgs[0] = l;
    }

    public CommandObject(int n, String string, String string2) {
        this.Command = n;
        this.stringArgs = new String[2];
        this.stringArgs[0] = string;
        this.stringArgs[1] = string2;
    }
}

