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
 * typedef void (*PFNGLPROGRAMUNIFORM3IEXTPROC)(GLuint, GLint, GLint, GLint, GLint)
 * }
 */
public class PFNGLPROGRAMUNIFORM3IEXTPROC {

    PFNGLPROGRAMUNIFORM3IEXTPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int program, int location, int v0, int v1, int v2);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_INT
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glcore.upcallHandle(PFNGLPROGRAMUNIFORM3IEXTPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLPROGRAMUNIFORM3IEXTPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int program, int location, int v0, int v1, int v2) {
        try {
             DOWN$MH.invokeExact(funcPtr, program, location, v0, v1, v2);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

