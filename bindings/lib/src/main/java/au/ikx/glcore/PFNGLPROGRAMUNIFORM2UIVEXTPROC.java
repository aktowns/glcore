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
 * typedef void (*PFNGLPROGRAMUNIFORM2UIVEXTPROC)(GLuint, GLint, GLsizei, const GLuint *)
 * }
 */
public class PFNGLPROGRAMUNIFORM2UIVEXTPROC {

    PFNGLPROGRAMUNIFORM2UIVEXTPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int program, int location, int count, MemorySegment value);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = glcore.upcallHandle(PFNGLPROGRAMUNIFORM2UIVEXTPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLPROGRAMUNIFORM2UIVEXTPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int program, int location, int count, MemorySegment value) {
        try {
             DOWN$MH.invokeExact(funcPtr, program, location, count, value);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

