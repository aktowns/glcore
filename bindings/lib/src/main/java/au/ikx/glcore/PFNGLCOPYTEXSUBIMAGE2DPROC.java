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
 * typedef void (*PFNGLCOPYTEXSUBIMAGE2DPROC)(GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei)
 * }
 */
public class PFNGLCOPYTEXSUBIMAGE2DPROC {

    PFNGLCOPYTEXSUBIMAGE2DPROC() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        glcore.C_INT,
        glcore.C_INT,
        glcore.C_INT,
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

    private static final MethodHandle UP$MH = glcore.upcallHandle(PFNGLCOPYTEXSUBIMAGE2DPROC.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(PFNGLCOPYTEXSUBIMAGE2DPROC.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        try {
             DOWN$MH.invokeExact(funcPtr, target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

