// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;
	/* Clone I/O context.  */
// #endif

/* The official definition.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sched_param extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sched_param() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sched_param(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sched_param(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sched_param position(long position) {
        return (sched_param)super.position(position);
    }

    public native int __sched_priority(); public native sched_param __sched_priority(int setter);
  }
