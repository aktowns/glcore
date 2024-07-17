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
 * struct __pthread_mutex_s {
 *     int __lock;
 *     unsigned int __count;
 *     int __owner;
 *     unsigned int __nusers;
 *     int __kind;
 *     short __spins;
 *     short __elision;
 *     __pthread_list_t __list;
 * }
 * }
 */
public class __pthread_mutex_s {

    __pthread_mutex_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        STBImage.C_INT.withName("__lock"),
        STBImage.C_INT.withName("__count"),
        STBImage.C_INT.withName("__owner"),
        STBImage.C_INT.withName("__nusers"),
        STBImage.C_INT.withName("__kind"),
        STBImage.C_SHORT.withName("__spins"),
        STBImage.C_SHORT.withName("__elision"),
        __pthread_internal_list.layout().withName("__list")
    ).withName("__pthread_mutex_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt __lock$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__lock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __lock
     * }
     */
    public static final OfInt __lock$layout() {
        return __lock$LAYOUT;
    }

    private static final long __lock$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __lock
     * }
     */
    public static final long __lock$offset() {
        return __lock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __lock
     * }
     */
    public static int __lock(MemorySegment struct) {
        return struct.get(__lock$LAYOUT, __lock$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __lock
     * }
     */
    public static void __lock(MemorySegment struct, int fieldValue) {
        struct.set(__lock$LAYOUT, __lock$OFFSET, fieldValue);
    }

    private static final OfInt __count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __count
     * }
     */
    public static final OfInt __count$layout() {
        return __count$LAYOUT;
    }

    private static final long __count$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __count
     * }
     */
    public static final long __count$offset() {
        return __count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __count
     * }
     */
    public static int __count(MemorySegment struct) {
        return struct.get(__count$LAYOUT, __count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __count
     * }
     */
    public static void __count(MemorySegment struct, int fieldValue) {
        struct.set(__count$LAYOUT, __count$OFFSET, fieldValue);
    }

    private static final OfInt __owner$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__owner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __owner
     * }
     */
    public static final OfInt __owner$layout() {
        return __owner$LAYOUT;
    }

    private static final long __owner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __owner
     * }
     */
    public static final long __owner$offset() {
        return __owner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __owner
     * }
     */
    public static int __owner(MemorySegment struct) {
        return struct.get(__owner$LAYOUT, __owner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __owner
     * }
     */
    public static void __owner(MemorySegment struct, int fieldValue) {
        struct.set(__owner$LAYOUT, __owner$OFFSET, fieldValue);
    }

    private static final OfInt __nusers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__nusers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __nusers
     * }
     */
    public static final OfInt __nusers$layout() {
        return __nusers$LAYOUT;
    }

    private static final long __nusers$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __nusers
     * }
     */
    public static final long __nusers$offset() {
        return __nusers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __nusers
     * }
     */
    public static int __nusers(MemorySegment struct) {
        return struct.get(__nusers$LAYOUT, __nusers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __nusers
     * }
     */
    public static void __nusers(MemorySegment struct, int fieldValue) {
        struct.set(__nusers$LAYOUT, __nusers$OFFSET, fieldValue);
    }

    private static final OfInt __kind$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__kind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __kind
     * }
     */
    public static final OfInt __kind$layout() {
        return __kind$LAYOUT;
    }

    private static final long __kind$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __kind
     * }
     */
    public static final long __kind$offset() {
        return __kind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __kind
     * }
     */
    public static int __kind(MemorySegment struct) {
        return struct.get(__kind$LAYOUT, __kind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __kind
     * }
     */
    public static void __kind(MemorySegment struct, int fieldValue) {
        struct.set(__kind$LAYOUT, __kind$OFFSET, fieldValue);
    }

    private static final OfShort __spins$LAYOUT = (OfShort)$LAYOUT.select(groupElement("__spins"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short __spins
     * }
     */
    public static final OfShort __spins$layout() {
        return __spins$LAYOUT;
    }

    private static final long __spins$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short __spins
     * }
     */
    public static final long __spins$offset() {
        return __spins$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short __spins
     * }
     */
    public static short __spins(MemorySegment struct) {
        return struct.get(__spins$LAYOUT, __spins$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short __spins
     * }
     */
    public static void __spins(MemorySegment struct, short fieldValue) {
        struct.set(__spins$LAYOUT, __spins$OFFSET, fieldValue);
    }

    private static final OfShort __elision$LAYOUT = (OfShort)$LAYOUT.select(groupElement("__elision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short __elision
     * }
     */
    public static final OfShort __elision$layout() {
        return __elision$LAYOUT;
    }

    private static final long __elision$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short __elision
     * }
     */
    public static final long __elision$offset() {
        return __elision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short __elision
     * }
     */
    public static short __elision(MemorySegment struct) {
        return struct.get(__elision$LAYOUT, __elision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short __elision
     * }
     */
    public static void __elision(MemorySegment struct, short fieldValue) {
        struct.set(__elision$LAYOUT, __elision$OFFSET, fieldValue);
    }

    private static final GroupLayout __list$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__list"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __pthread_list_t __list
     * }
     */
    public static final GroupLayout __list$layout() {
        return __list$LAYOUT;
    }

    private static final long __list$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __pthread_list_t __list
     * }
     */
    public static final long __list$offset() {
        return __list$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __pthread_list_t __list
     * }
     */
    public static MemorySegment __list(MemorySegment struct) {
        return struct.asSlice(__list$OFFSET, __list$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __pthread_list_t __list
     * }
     */
    public static void __list(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __list$OFFSET, __list$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

