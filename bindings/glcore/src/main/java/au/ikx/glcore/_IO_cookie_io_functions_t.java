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
 * struct _IO_cookie_io_functions_t {
 *     cookie_read_function_t *read;
 *     cookie_write_function_t *write;
 *     cookie_seek_function_t *seek;
 *     cookie_close_function_t *close;
 * }
 * }
 */
public class _IO_cookie_io_functions_t {

    _IO_cookie_io_functions_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        STBImage.C_POINTER.withName("read"),
        STBImage.C_POINTER.withName("write"),
        STBImage.C_POINTER.withName("seek"),
        STBImage.C_POINTER.withName("close")
    ).withName("_IO_cookie_io_functions_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout read$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("read"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cookie_read_function_t *read
     * }
     */
    public static final AddressLayout read$layout() {
        return read$LAYOUT;
    }

    private static final long read$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cookie_read_function_t *read
     * }
     */
    public static final long read$offset() {
        return read$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cookie_read_function_t *read
     * }
     */
    public static MemorySegment read(MemorySegment struct) {
        return struct.get(read$LAYOUT, read$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cookie_read_function_t *read
     * }
     */
    public static void read(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(read$LAYOUT, read$OFFSET, fieldValue);
    }

    private static final AddressLayout write$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("write"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cookie_write_function_t *write
     * }
     */
    public static final AddressLayout write$layout() {
        return write$LAYOUT;
    }

    private static final long write$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cookie_write_function_t *write
     * }
     */
    public static final long write$offset() {
        return write$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cookie_write_function_t *write
     * }
     */
    public static MemorySegment write(MemorySegment struct) {
        return struct.get(write$LAYOUT, write$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cookie_write_function_t *write
     * }
     */
    public static void write(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(write$LAYOUT, write$OFFSET, fieldValue);
    }

    private static final AddressLayout seek$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("seek"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cookie_seek_function_t *seek
     * }
     */
    public static final AddressLayout seek$layout() {
        return seek$LAYOUT;
    }

    private static final long seek$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cookie_seek_function_t *seek
     * }
     */
    public static final long seek$offset() {
        return seek$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cookie_seek_function_t *seek
     * }
     */
    public static MemorySegment seek(MemorySegment struct) {
        return struct.get(seek$LAYOUT, seek$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cookie_seek_function_t *seek
     * }
     */
    public static void seek(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(seek$LAYOUT, seek$OFFSET, fieldValue);
    }

    private static final AddressLayout close$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("close"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cookie_close_function_t *close
     * }
     */
    public static final AddressLayout close$layout() {
        return close$LAYOUT;
    }

    private static final long close$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cookie_close_function_t *close
     * }
     */
    public static final long close$offset() {
        return close$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cookie_close_function_t *close
     * }
     */
    public static MemorySegment close(MemorySegment struct) {
        return struct.get(close$LAYOUT, close$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cookie_close_function_t *close
     * }
     */
    public static void close(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(close$LAYOUT, close$OFFSET, fieldValue);
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

