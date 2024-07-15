// Generated by jextract

package au.ikx.glcore;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef void (*PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC)(GLsizei, const GLint *, GLenum)
 * }
 */
public class PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC {

    PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int count, MemorySegment attribs, int bufferMode);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glcore.C_INT,
        glcore.C_POINTER,
        glcore.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glcore.upcallHandle(PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int count, MemorySegment attribs, int bufferMode) {
        try {
             DOWN$MH.invokeExact(funcPtr, count, attribs, bufferMode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

